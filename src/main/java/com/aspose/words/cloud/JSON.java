/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="JSON.java">
 *   Copyright (c) 2023 Aspose.Words for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

package com.aspose.words.cloud;

import com.aspose.words.cloud.model.ModelIfc;
import com.google.gson.*;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.gsonfire.GsonFireBuilder;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.format.DateTimeFormatter;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class JSON {
    private Gson gson;
    private boolean isLenientOnJson = false;
    private DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();
    private ModelAdapterFactory modelAdapterFactory = new ModelAdapterFactory();

    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder();
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    public JSON() {
        gson = createGson()
            .registerTypeAdapter(Date.class, dateTypeAdapter)
            .registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter)
            .registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter)
            .registerTypeAdapter(LocalDate.class, localDateTypeAdapter)
            .registerTypeAdapter(byte[].class, byteArrayAdapter)
            .registerTypeAdapterFactory(modelAdapterFactory)
            .create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     * @return JSON
     */
    public JSON setGson(Gson gson) {
        this.gson = gson;
        return this;
    }

    public JSON setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
        return this;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } 
            else {
                return gson.fromJson(body, returnType);
            }
        } 
        catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class))
                return (T) body;
            else throw e;
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } 
            else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } 
            else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length() - 5) + "Z";
                    }
                    String timeStampString;
                    if (date.indexOf('(') == -1) {
                        timeStampString = date.replace('T', ' ');
                    } 
                    else {
                        timeStampString = new Timestamp(Long.valueOf(date.substring(date.indexOf("(") + 1, date.indexOf(")") - 1))).toString();
                    }
                    Integer index = timeStampString.indexOf(" ");
                    String dateString = timeStampString.substring(0, index);
                    String[] timeString = timeStampString.substring(index + 1).split(":");
                    String[] val = dateString.split("-");
                    return OffsetDateTime.of(Integer.valueOf(val[0]),
                            Integer.valueOf(val[1]),
                            Integer.valueOf(val[2]),
                            Integer.valueOf(timeString[0]),
                            Integer.valueOf(timeString[1]),
                            0,
                            0,
                            ZoneOffset.UTC);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } 
            else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public JSON setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {
        }

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } 
            else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } 
                else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } 
                    catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {
        }

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } 
            else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } 
                else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } 
                        catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } 
            catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static class ModelAdapterFactory implements TypeAdapterFactory {
        private final String typeFieldName = "$type";
        private final static Map< String, Class<?> > TypesMap = new HashMap< String, Class<?> >() {
            {
                put("ApiError, _", com.aspose.words.cloud.model.ApiError.class);
                put("AvailableFontsResponse, _", com.aspose.words.cloud.model.AvailableFontsResponse.class);
                put("BmpSaveOptionsData, _", com.aspose.words.cloud.model.BmpSaveOptionsData.class);
                put("Bookmark, _", com.aspose.words.cloud.model.Bookmark.class);
                put("BookmarkData, _", com.aspose.words.cloud.model.BookmarkData.class);
                put("BookmarkInsert, _", com.aspose.words.cloud.model.BookmarkInsert.class);
                put("BookmarkResponse, _", com.aspose.words.cloud.model.BookmarkResponse.class);
                put("Bookmarks, _", com.aspose.words.cloud.model.Bookmarks.class);
                put("BookmarksOutlineLevelData, _", com.aspose.words.cloud.model.BookmarksOutlineLevelData.class);
                put("BookmarksResponse, _", com.aspose.words.cloud.model.BookmarksResponse.class);
                put("Border, _", com.aspose.words.cloud.model.Border.class);
                put("BorderResponse, _", com.aspose.words.cloud.model.BorderResponse.class);
                put("BordersCollection, _", com.aspose.words.cloud.model.BordersCollection.class);
                put("BordersResponse, _", com.aspose.words.cloud.model.BordersResponse.class);
                put("ClassificationResponse, _", com.aspose.words.cloud.model.ClassificationResponse.class);
                put("ClassificationResult, _", com.aspose.words.cloud.model.ClassificationResult.class);
                put("Comment, _", com.aspose.words.cloud.model.Comment.class);
                put("CommentInsert, _", com.aspose.words.cloud.model.CommentInsert.class);
                put("CommentLink, _", com.aspose.words.cloud.model.CommentLink.class);
                put("CommentResponse, _", com.aspose.words.cloud.model.CommentResponse.class);
                put("CommentsCollection, _", com.aspose.words.cloud.model.CommentsCollection.class);
                put("CommentsResponse, _", com.aspose.words.cloud.model.CommentsResponse.class);
                put("CommentUpdate, _", com.aspose.words.cloud.model.CommentUpdate.class);
                put("CompareData, _", com.aspose.words.cloud.model.CompareData.class);
                put("CompareOptions, _", com.aspose.words.cloud.model.CompareOptions.class);
                put("CompressOptions, _", com.aspose.words.cloud.model.CompressOptions.class);
                put("CompressResponse, _", com.aspose.words.cloud.model.CompressResponse.class);
                put("CsvDataLoadOptions, _", com.aspose.words.cloud.model.CsvDataLoadOptions.class);
                put("CustomXmlPart, _", com.aspose.words.cloud.model.CustomXmlPart.class);
                put("CustomXmlPartInsert, _", com.aspose.words.cloud.model.CustomXmlPartInsert.class);
                put("CustomXmlPartLink, _", com.aspose.words.cloud.model.CustomXmlPartLink.class);
                put("CustomXmlPartResponse, _", com.aspose.words.cloud.model.CustomXmlPartResponse.class);
                put("CustomXmlPartsCollection, _", com.aspose.words.cloud.model.CustomXmlPartsCollection.class);
                put("CustomXmlPartsResponse, _", com.aspose.words.cloud.model.CustomXmlPartsResponse.class);
                put("CustomXmlPartUpdate, _", com.aspose.words.cloud.model.CustomXmlPartUpdate.class);
                put("DocmSaveOptionsData, _", com.aspose.words.cloud.model.DocmSaveOptionsData.class);
                put("DocSaveOptionsData, _", com.aspose.words.cloud.model.DocSaveOptionsData.class);
                put("Document, _", com.aspose.words.cloud.model.Document.class);
                put("DocumentEntry, _", com.aspose.words.cloud.model.DocumentEntry.class);
                put("DocumentEntryList, _", com.aspose.words.cloud.model.DocumentEntryList.class);
                put("DocumentPosition, _", com.aspose.words.cloud.model.DocumentPosition.class);
                put("DocumentProperties, _", com.aspose.words.cloud.model.DocumentProperties.class);
                put("DocumentPropertiesResponse, _", com.aspose.words.cloud.model.DocumentPropertiesResponse.class);
                put("DocumentProperty, _", com.aspose.words.cloud.model.DocumentProperty.class);
                put("DocumentPropertyCreateOrUpdate, _", com.aspose.words.cloud.model.DocumentPropertyCreateOrUpdate.class);
                put("DocumentPropertyResponse, _", com.aspose.words.cloud.model.DocumentPropertyResponse.class);
                put("DocumentResponse, _", com.aspose.words.cloud.model.DocumentResponse.class);
                put("DocumentStatData, _", com.aspose.words.cloud.model.DocumentStatData.class);
                put("DocxSaveOptionsData, _", com.aspose.words.cloud.model.DocxSaveOptionsData.class);
                put("DotmSaveOptionsData, _", com.aspose.words.cloud.model.DotmSaveOptionsData.class);
                put("DotSaveOptionsData, _", com.aspose.words.cloud.model.DotSaveOptionsData.class);
                put("DotxSaveOptionsData, _", com.aspose.words.cloud.model.DotxSaveOptionsData.class);
                put("DownsampleOptionsData, _", com.aspose.words.cloud.model.DownsampleOptionsData.class);
                put("DrawingObject, _", com.aspose.words.cloud.model.DrawingObject.class);
                put("DrawingObjectCollection, _", com.aspose.words.cloud.model.DrawingObjectCollection.class);
                put("DrawingObjectInsert, _", com.aspose.words.cloud.model.DrawingObjectInsert.class);
                put("DrawingObjectLink, _", com.aspose.words.cloud.model.DrawingObjectLink.class);
                put("DrawingObjectResponse, _", com.aspose.words.cloud.model.DrawingObjectResponse.class);
                put("DrawingObjectsResponse, _", com.aspose.words.cloud.model.DrawingObjectsResponse.class);
                put("DrawingObjectUpdate, _", com.aspose.words.cloud.model.DrawingObjectUpdate.class);
                put("EmfSaveOptionsData, _", com.aspose.words.cloud.model.EmfSaveOptionsData.class);
                put("EpubSaveOptionsData, _", com.aspose.words.cloud.model.EpubSaveOptionsData.class);
                put("Error, _", com.aspose.words.cloud.model.Error.class);
                put("ErrorDetails, _", com.aspose.words.cloud.model.ErrorDetails.class);
                put("Field, _", com.aspose.words.cloud.model.Field.class);
                put("FieldCollection, _", com.aspose.words.cloud.model.FieldCollection.class);
                put("FieldInsert, _", com.aspose.words.cloud.model.FieldInsert.class);
                put("FieldLink, _", com.aspose.words.cloud.model.FieldLink.class);
                put("FieldNames, _", com.aspose.words.cloud.model.FieldNames.class);
                put("FieldNamesResponse, _", com.aspose.words.cloud.model.FieldNamesResponse.class);
                put("FieldOptions, _", com.aspose.words.cloud.model.FieldOptions.class);
                put("FieldResponse, _", com.aspose.words.cloud.model.FieldResponse.class);
                put("FieldsResponse, _", com.aspose.words.cloud.model.FieldsResponse.class);
                put("FieldUpdate, _", com.aspose.words.cloud.model.FieldUpdate.class);
                put("FileLink, _", com.aspose.words.cloud.model.FileLink.class);
                put("FilesList, _", com.aspose.words.cloud.model.FilesList.class);
                put("FilesUploadResult, _", com.aspose.words.cloud.model.FilesUploadResult.class);
                put("FlatOpcMacroSaveOptionsData, _", com.aspose.words.cloud.model.FlatOpcMacroSaveOptionsData.class);
                put("FlatOpcSaveOptionsData, _", com.aspose.words.cloud.model.FlatOpcSaveOptionsData.class);
                put("FlatOpcTemplateMacroSaveOptionsData, _", com.aspose.words.cloud.model.FlatOpcTemplateMacroSaveOptionsData.class);
                put("FlatOpcTemplateSaveOptionsData, _", com.aspose.words.cloud.model.FlatOpcTemplateSaveOptionsData.class);
                put("Font, _", com.aspose.words.cloud.model.Font.class);
                put("FontDto, _", com.aspose.words.cloud.model.FontDto.class);
                put("FontInfo, _", com.aspose.words.cloud.model.FontInfo.class);
                put("FontResponse, _", com.aspose.words.cloud.model.FontResponse.class);
                put("Footnote, _", com.aspose.words.cloud.model.Footnote.class);
                put("FootnoteCollection, _", com.aspose.words.cloud.model.FootnoteCollection.class);
                put("FootnoteInsert, _", com.aspose.words.cloud.model.FootnoteInsert.class);
                put("FootnoteLink, _", com.aspose.words.cloud.model.FootnoteLink.class);
                put("FootnoteResponse, _", com.aspose.words.cloud.model.FootnoteResponse.class);
                put("FootnotesResponse, _", com.aspose.words.cloud.model.FootnotesResponse.class);
                put("FootnotesStatData, _", com.aspose.words.cloud.model.FootnotesStatData.class);
                put("FootnoteUpdate, _", com.aspose.words.cloud.model.FootnoteUpdate.class);
                put("FormFieldCheckbox, _", com.aspose.words.cloud.model.FormFieldCheckbox.class);
                put("FormFieldCollection, _", com.aspose.words.cloud.model.FormFieldCollection.class);
                put("FormFieldDropDown, _", com.aspose.words.cloud.model.FormFieldDropDown.class);
                put("FormFieldResponse, _", com.aspose.words.cloud.model.FormFieldResponse.class);
                put("FormFieldsResponse, _", com.aspose.words.cloud.model.FormFieldsResponse.class);
                put("FormFieldTextInput, _", com.aspose.words.cloud.model.FormFieldTextInput.class);
                put("GifSaveOptionsData, _", com.aspose.words.cloud.model.GifSaveOptionsData.class);
                put("HeaderFooter, _", com.aspose.words.cloud.model.HeaderFooter.class);
                put("HeaderFooterLink, _", com.aspose.words.cloud.model.HeaderFooterLink.class);
                put("HeaderFooterLinkCollection, _", com.aspose.words.cloud.model.HeaderFooterLinkCollection.class);
                put("HeaderFooterResponse, _", com.aspose.words.cloud.model.HeaderFooterResponse.class);
                put("HeaderFootersResponse, _", com.aspose.words.cloud.model.HeaderFootersResponse.class);
                put("HtmlFixedSaveOptionsData, _", com.aspose.words.cloud.model.HtmlFixedSaveOptionsData.class);
                put("HtmlSaveOptionsData, _", com.aspose.words.cloud.model.HtmlSaveOptionsData.class);
                put("Hyperlink, _", com.aspose.words.cloud.model.Hyperlink.class);
                put("HyperlinkResponse, _", com.aspose.words.cloud.model.HyperlinkResponse.class);
                put("Hyperlinks, _", com.aspose.words.cloud.model.Hyperlinks.class);
                put("HyperlinksResponse, _", com.aspose.words.cloud.model.HyperlinksResponse.class);
                put("ImageEntry, _", com.aspose.words.cloud.model.ImageEntry.class);
                put("ImageEntryList, _", com.aspose.words.cloud.model.ImageEntryList.class);
                put("InfoAdditionalItem, _", com.aspose.words.cloud.model.InfoAdditionalItem.class);
                put("InfoResponse, _", com.aspose.words.cloud.model.InfoResponse.class);
                put("JpegSaveOptionsData, _", com.aspose.words.cloud.model.JpegSaveOptionsData.class);
                put("JsonDataLoadOptions, _", com.aspose.words.cloud.model.JsonDataLoadOptions.class);
                put("Link, _", com.aspose.words.cloud.model.Link.class);
                put("LinkElement, _", com.aspose.words.cloud.model.LinkElement.class);
                put("ListFormat, _", com.aspose.words.cloud.model.ListFormat.class);
                put("ListFormatUpdate, _", com.aspose.words.cloud.model.ListFormatUpdate.class);
                put("ListInfo, _", com.aspose.words.cloud.model.ListInfo.class);
                put("ListInsert, _", com.aspose.words.cloud.model.ListInsert.class);
                put("ListLevel, _", com.aspose.words.cloud.model.ListLevel.class);
                put("ListLevels, _", com.aspose.words.cloud.model.ListLevels.class);
                put("ListLevelUpdate, _", com.aspose.words.cloud.model.ListLevelUpdate.class);
                put("ListResponse, _", com.aspose.words.cloud.model.ListResponse.class);
                put("Lists, _", com.aspose.words.cloud.model.Lists.class);
                put("ListsResponse, _", com.aspose.words.cloud.model.ListsResponse.class);
                put("ListUpdate, _", com.aspose.words.cloud.model.ListUpdate.class);
                put("LoadWebDocumentData, _", com.aspose.words.cloud.model.LoadWebDocumentData.class);
                put("MarkdownSaveOptionsData, _", com.aspose.words.cloud.model.MarkdownSaveOptionsData.class);
                put("MetafileRenderingOptionsData, _", com.aspose.words.cloud.model.MetafileRenderingOptionsData.class);
                put("MhtmlSaveOptionsData, _", com.aspose.words.cloud.model.MhtmlSaveOptionsData.class);
                put("ModificationOperationResult, _", com.aspose.words.cloud.model.ModificationOperationResult.class);
                put("NewDocumentPosition, _", com.aspose.words.cloud.model.NewDocumentPosition.class);
                put("NodeLink, _", com.aspose.words.cloud.model.NodeLink.class);
                put("OdtSaveOptionsData, _", com.aspose.words.cloud.model.OdtSaveOptionsData.class);
                put("OfficeMathLink, _", com.aspose.words.cloud.model.OfficeMathLink.class);
                put("OfficeMathObject, _", com.aspose.words.cloud.model.OfficeMathObject.class);
                put("OfficeMathObjectResponse, _", com.aspose.words.cloud.model.OfficeMathObjectResponse.class);
                put("OfficeMathObjectsCollection, _", com.aspose.words.cloud.model.OfficeMathObjectsCollection.class);
                put("OfficeMathObjectsResponse, _", com.aspose.words.cloud.model.OfficeMathObjectsResponse.class);
                put("OpenXpsSaveOptionsData, _", com.aspose.words.cloud.model.OpenXpsSaveOptionsData.class);
                put("OptimizationOptions, _", com.aspose.words.cloud.model.OptimizationOptions.class);
                put("OttSaveOptionsData, _", com.aspose.words.cloud.model.OttSaveOptionsData.class);
                put("OutlineOptionsData, _", com.aspose.words.cloud.model.OutlineOptionsData.class);
                put("PageNumber, _", com.aspose.words.cloud.model.PageNumber.class);
                put("PageSetup, _", com.aspose.words.cloud.model.PageSetup.class);
                put("PageStatData, _", com.aspose.words.cloud.model.PageStatData.class);
                put("Paragraph, _", com.aspose.words.cloud.model.Paragraph.class);
                put("ParagraphFormat, _", com.aspose.words.cloud.model.ParagraphFormat.class);
                put("ParagraphFormatResponse, _", com.aspose.words.cloud.model.ParagraphFormatResponse.class);
                put("ParagraphFormatUpdate, _", com.aspose.words.cloud.model.ParagraphFormatUpdate.class);
                put("ParagraphInsert, _", com.aspose.words.cloud.model.ParagraphInsert.class);
                put("ParagraphLink, _", com.aspose.words.cloud.model.ParagraphLink.class);
                put("ParagraphLinkCollection, _", com.aspose.words.cloud.model.ParagraphLinkCollection.class);
                put("ParagraphLinkCollectionResponse, _", com.aspose.words.cloud.model.ParagraphLinkCollectionResponse.class);
                put("ParagraphListFormatResponse, _", com.aspose.words.cloud.model.ParagraphListFormatResponse.class);
                put("ParagraphResponse, _", com.aspose.words.cloud.model.ParagraphResponse.class);
                put("PclSaveOptionsData, _", com.aspose.words.cloud.model.PclSaveOptionsData.class);
                put("PdfDigitalSignatureDetailsData, _", com.aspose.words.cloud.model.PdfDigitalSignatureDetailsData.class);
                put("PdfEncryptionDetailsData, _", com.aspose.words.cloud.model.PdfEncryptionDetailsData.class);
                put("PdfSaveOptionsData, _", com.aspose.words.cloud.model.PdfSaveOptionsData.class);
                put("PngSaveOptionsData, _", com.aspose.words.cloud.model.PngSaveOptionsData.class);
                put("PreferredWidth, _", com.aspose.words.cloud.model.PreferredWidth.class);
                put("ProtectionData, _", com.aspose.words.cloud.model.ProtectionData.class);
                put("ProtectionDataResponse, _", com.aspose.words.cloud.model.ProtectionDataResponse.class);
                put("ProtectionRequest, _", com.aspose.words.cloud.model.ProtectionRequest.class);
                put("PsSaveOptionsData, _", com.aspose.words.cloud.model.PsSaveOptionsData.class);
                put("PublicKeyResponse, _", com.aspose.words.cloud.model.PublicKeyResponse.class);
                put("RangeDocument, _", com.aspose.words.cloud.model.RangeDocument.class);
                put("RangeDocumentDto, _", com.aspose.words.cloud.model.RangeDocumentDto.class);
                put("RangeTextResponse, _", com.aspose.words.cloud.model.RangeTextResponse.class);
                put("ReplaceRange, _", com.aspose.words.cloud.model.ReplaceRange.class);
                put("ReplaceRangeDto, _", com.aspose.words.cloud.model.ReplaceRangeDto.class);
                put("ReplaceTextParameters, _", com.aspose.words.cloud.model.ReplaceTextParameters.class);
                put("ReplaceTextResponse, _", com.aspose.words.cloud.model.ReplaceTextResponse.class);
                put("ReportEngineSettings, _", com.aspose.words.cloud.model.ReportEngineSettings.class);
                put("RevisionsModificationResponse, _", com.aspose.words.cloud.model.RevisionsModificationResponse.class);
                put("RtfSaveOptionsData, _", com.aspose.words.cloud.model.RtfSaveOptionsData.class);
                put("Run, _", com.aspose.words.cloud.model.Run.class);
                put("RunInsert, _", com.aspose.words.cloud.model.RunInsert.class);
                put("RunLink, _", com.aspose.words.cloud.model.RunLink.class);
                put("RunResponse, _", com.aspose.words.cloud.model.RunResponse.class);
                put("Runs, _", com.aspose.words.cloud.model.Runs.class);
                put("RunsResponse, _", com.aspose.words.cloud.model.RunsResponse.class);
                put("RunUpdate, _", com.aspose.words.cloud.model.RunUpdate.class);
                put("SaveResponse, _", com.aspose.words.cloud.model.SaveResponse.class);
                put("SaveResult, _", com.aspose.words.cloud.model.SaveResult.class);
                put("SearchResponse, _", com.aspose.words.cloud.model.SearchResponse.class);
                put("SearchResult, _", com.aspose.words.cloud.model.SearchResult.class);
                put("SearchResultsCollection, _", com.aspose.words.cloud.model.SearchResultsCollection.class);
                put("Section, _", com.aspose.words.cloud.model.Section.class);
                put("SectionLink, _", com.aspose.words.cloud.model.SectionLink.class);
                put("SectionLinkCollection, _", com.aspose.words.cloud.model.SectionLinkCollection.class);
                put("SectionLinkCollectionResponse, _", com.aspose.words.cloud.model.SectionLinkCollectionResponse.class);
                put("SectionPageSetupResponse, _", com.aspose.words.cloud.model.SectionPageSetupResponse.class);
                put("SectionResponse, _", com.aspose.words.cloud.model.SectionResponse.class);
                put("Shading, _", com.aspose.words.cloud.model.Shading.class);
                put("SplitDocumentResponse, _", com.aspose.words.cloud.model.SplitDocumentResponse.class);
                put("SplitDocumentResult, _", com.aspose.words.cloud.model.SplitDocumentResult.class);
                put("StatDataResponse, _", com.aspose.words.cloud.model.StatDataResponse.class);
                put("StorageFile, _", com.aspose.words.cloud.model.StorageFile.class);
                put("StoryChildNodes, _", com.aspose.words.cloud.model.StoryChildNodes.class);
                put("StructuredDocumentTag, _", com.aspose.words.cloud.model.StructuredDocumentTag.class);
                put("StructuredDocumentTagCollection, _", com.aspose.words.cloud.model.StructuredDocumentTagCollection.class);
                put("StructuredDocumentTagInsert, _", com.aspose.words.cloud.model.StructuredDocumentTagInsert.class);
                put("StructuredDocumentTagListItem, _", com.aspose.words.cloud.model.StructuredDocumentTagListItem.class);
                put("StructuredDocumentTagResponse, _", com.aspose.words.cloud.model.StructuredDocumentTagResponse.class);
                put("StructuredDocumentTagsResponse, _", com.aspose.words.cloud.model.StructuredDocumentTagsResponse.class);
                put("StructuredDocumentTagUpdate, _", com.aspose.words.cloud.model.StructuredDocumentTagUpdate.class);
                put("Style, _", com.aspose.words.cloud.model.Style.class);
                put("StyleApply, _", com.aspose.words.cloud.model.StyleApply.class);
                put("StyleCopy, _", com.aspose.words.cloud.model.StyleCopy.class);
                put("StyleInsert, _", com.aspose.words.cloud.model.StyleInsert.class);
                put("StyleResponse, _", com.aspose.words.cloud.model.StyleResponse.class);
                put("StylesResponse, _", com.aspose.words.cloud.model.StylesResponse.class);
                put("StyleUpdate, _", com.aspose.words.cloud.model.StyleUpdate.class);
                put("SvgSaveOptionsData, _", com.aspose.words.cloud.model.SvgSaveOptionsData.class);
                put("Table, _", com.aspose.words.cloud.model.Table.class);
                put("TableCell, _", com.aspose.words.cloud.model.TableCell.class);
                put("TableCellFormat, _", com.aspose.words.cloud.model.TableCellFormat.class);
                put("TableCellFormatDto, _", com.aspose.words.cloud.model.TableCellFormatDto.class);
                put("TableCellFormatResponse, _", com.aspose.words.cloud.model.TableCellFormatResponse.class);
                put("TableCellInsert, _", com.aspose.words.cloud.model.TableCellInsert.class);
                put("TableCellInsertDto, _", com.aspose.words.cloud.model.TableCellInsertDto.class);
                put("TableCellResponse, _", com.aspose.words.cloud.model.TableCellResponse.class);
                put("TableInsert, _", com.aspose.words.cloud.model.TableInsert.class);
                put("TableInsertDto, _", com.aspose.words.cloud.model.TableInsertDto.class);
                put("TableLink, _", com.aspose.words.cloud.model.TableLink.class);
                put("TableLinkCollection, _", com.aspose.words.cloud.model.TableLinkCollection.class);
                put("TableLinkCollectionResponse, _", com.aspose.words.cloud.model.TableLinkCollectionResponse.class);
                put("TableProperties, _", com.aspose.words.cloud.model.TableProperties.class);
                put("TablePropertiesDto, _", com.aspose.words.cloud.model.TablePropertiesDto.class);
                put("TablePropertiesResponse, _", com.aspose.words.cloud.model.TablePropertiesResponse.class);
                put("TableResponse, _", com.aspose.words.cloud.model.TableResponse.class);
                put("TableRow, _", com.aspose.words.cloud.model.TableRow.class);
                put("TableRowFormat, _", com.aspose.words.cloud.model.TableRowFormat.class);
                put("TableRowFormatDto, _", com.aspose.words.cloud.model.TableRowFormatDto.class);
                put("TableRowFormatResponse, _", com.aspose.words.cloud.model.TableRowFormatResponse.class);
                put("TableRowInsert, _", com.aspose.words.cloud.model.TableRowInsert.class);
                put("TableRowInsertDto, _", com.aspose.words.cloud.model.TableRowInsertDto.class);
                put("TableRowResponse, _", com.aspose.words.cloud.model.TableRowResponse.class);
                put("TabStop, _", com.aspose.words.cloud.model.TabStop.class);
                put("TabStopInsert, _", com.aspose.words.cloud.model.TabStopInsert.class);
                put("TabStopsResponse, _", com.aspose.words.cloud.model.TabStopsResponse.class);
                put("TextSaveOptionsData, _", com.aspose.words.cloud.model.TextSaveOptionsData.class);
                put("TiffSaveOptionsData, _", com.aspose.words.cloud.model.TiffSaveOptionsData.class);
                put("TimeZoneInfoData, _", com.aspose.words.cloud.model.TimeZoneInfoData.class);
                put("UserInformation, _", com.aspose.words.cloud.model.UserInformation.class);
                put("WatermarkText, _", com.aspose.words.cloud.model.WatermarkText.class);
                put("WordMLSaveOptionsData, _", com.aspose.words.cloud.model.WordMLSaveOptionsData.class);
                put("WordsApiErrorResponse, _", com.aspose.words.cloud.model.WordsApiErrorResponse.class);
                put("WordsApiLink, _", com.aspose.words.cloud.model.WordsApiLink.class);
                put("WordsResponse, _", com.aspose.words.cloud.model.WordsResponse.class);
                put("XamlFixedSaveOptionsData, _", com.aspose.words.cloud.model.XamlFixedSaveOptionsData.class);
                put("XamlFlowPackSaveOptionsData, _", com.aspose.words.cloud.model.XamlFlowPackSaveOptionsData.class);
                put("XamlFlowSaveOptionsData, _", com.aspose.words.cloud.model.XamlFlowSaveOptionsData.class);
                put("XmlColor, _", com.aspose.words.cloud.model.XmlColor.class);
                put("XmlDataLoadOptions, _", com.aspose.words.cloud.model.XmlDataLoadOptions.class);
                put("XpsSaveOptionsData, _", com.aspose.words.cloud.model.XpsSaveOptionsData.class);

                put("FileReference, _", com.aspose.words.cloud.model.FileReference.class);
            }
        };

        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken == null) {
                return null;
            }

            Class<?> rawType = typeToken.getRawType();
            if (!ModelIfc.class.isAssignableFrom(rawType)) {
                return null;
            }

            final TypeAdapter<JsonElement> jsonElementAdapter = gson.getAdapter(JsonElement.class);
            final Map< String, TypeAdapter<?> > labelToDelegate = new LinkedHashMap<>();
            final Map< Class<?>, TypeAdapter<?> > subtypeToDelegate = new LinkedHashMap<>();
            for (Map.Entry< String, Class<?> > entry : TypesMap.entrySet()) {
                TypeAdapter<?> delegate = gson.getDelegateAdapter(this, TypeToken.get(entry.getValue()));
                labelToDelegate.put(entry.getKey(), delegate);
                subtypeToDelegate.put(entry.getValue(), delegate);
            }

            return new TypeAdapter<T>() {
                @Override public T read(JsonReader in) throws IOException {
                    String typeName;
                    JsonElement jsonElement = jsonElementAdapter.read(in);
                    if (jsonElement.getAsJsonObject().has(typeFieldName)) {
                        typeName = jsonElement.getAsJsonObject().get(typeFieldName).getAsString();
                    }
                    else {
                        typeName = rawType.getSimpleName() + ", _";
                    }

                    if (typeName == null) {
                        throw new JsonParseException("Cannot deserialize " + typeToken.getRawType().getName());
                    }

                    @SuppressWarnings("unchecked") // registration requires that subtype extends T
                    TypeAdapter<T> delegate = (TypeAdapter<T>) labelToDelegate.get(typeName);
                    if (delegate == null) {
                        throw new JsonParseException("Cannot deserialize " + typeToken.getRawType().getName());
                    }
                    return delegate.fromJsonTree(jsonElement);
                }

                @Override public void write(JsonWriter out, T value) throws IOException {
                    Class<?> srcType = value.getClass();
                    @SuppressWarnings("unchecked") // registration requires that subtype extends T
                    TypeAdapter<T> delegate = (TypeAdapter<T>) subtypeToDelegate.get(srcType);
                    if (delegate == null) {
                        throw new JsonParseException("Cannot serialize " + srcType.getName());
                    }
                    JsonObject jsonObject = delegate.toJsonTree(value).getAsJsonObject();
                    jsonElementAdapter.write(out, jsonObject);
                }
            }.nullSafe();
        }
    }

    public JSON setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
        return this;
    }

}
