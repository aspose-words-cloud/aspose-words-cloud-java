/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Words for Cloud
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

package com.aspose.words.cloud.model;

import java.util.Objects;
import java.util.Arrays;
import com.aspose.words.cloud.model.DocumentProperties;
import com.aspose.words.cloud.model.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents Words document DTO.
 */
@ApiModel(description = "Represents Words document DTO.")

public class Document {
  @SerializedName("Links")
  private List<Link> links = null;

  @SerializedName("FileName")
  private String fileName = null;

  /**
   * Gets the original format of the document.
   */
  @JsonAdapter(SourceFormatEnum.Adapter.class)
  public enum SourceFormatEnum {
    UNKNOWN("Unknown"),
    
    DOC("Doc"),
    
    DOT("Dot"),
    
    DOCPREWORD60("DocPreWord60"),
    
    DOCX("Docx"),
    
    DOCM("Docm"),
    
    DOTX("Dotx"),
    
    DOTM("Dotm"),
    
    FLATOPC("FlatOpc"),
    
    RTF("Rtf"),
    
    WORDML("WordML"),
    
    HTML("Html"),
    
    MHTML("Mhtml"),
    
    EPUB("Epub"),
    
    TEXT("Text"),
    
    ODT("Odt"),
    
    OTT("Ott"),
    
    PDF("Pdf"),
    
    XPS("Xps"),
    
    TIFF("Tiff"),
    
    SVG("Svg");

    private String value;

    SourceFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceFormatEnum fromValue(String text) {
      for (SourceFormatEnum b : SourceFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SourceFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SourceFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("SourceFormat")
  private SourceFormatEnum sourceFormat = null;

  @SerializedName("IsEncrypted")
  private Boolean isEncrypted = null;

  @SerializedName("IsSigned")
  private Boolean isSigned = null;

  @SerializedName("DocumentProperties")
  private DocumentProperties documentProperties = null;

  public Document links(List<Link> links) {
    this.links = links;
    return this;
  }

  public Document addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Link>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * A list of links that originate from this document.
   * @return links
  **/
  @ApiModelProperty(value = "A list of links that originate from this document.")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public Document fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Gets the name of the file.
   * @return fileName
  **/
  @ApiModelProperty(value = "Gets the name of the file.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Document sourceFormat(SourceFormatEnum sourceFormat) {
    this.sourceFormat = sourceFormat;
    return this;
  }

   /**
   * Gets the original format of the document.
   * @return sourceFormat
  **/
  @ApiModelProperty(required = true, value = "Gets the original format of the document.")
  public SourceFormatEnum getSourceFormat() {
    return sourceFormat;
  }

  public void setSourceFormat(SourceFormatEnum sourceFormat) {
    this.sourceFormat = sourceFormat;
  }

  public Document isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }

   /**
   * Returns true if the document is encrypted and requires a password to open. 
   * @return isEncrypted
  **/
  @ApiModelProperty(required = true, value = "Returns true if the document is encrypted and requires a password to open. ")
  public Boolean isisIsEncrypted() {
    return isEncrypted;
  }

  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }

  public Document isSigned(Boolean isSigned) {
    this.isSigned = isSigned;
    return this;
  }

   /**
   * Returns true if the document contains a digital signature. This property merely informs that a  digital signature is present on a document, but it does not specify whether the signature is valid or not. 
   * @return isSigned
  **/
  @ApiModelProperty(required = true, value = "Returns true if the document contains a digital signature. This property merely informs that a  digital signature is present on a document, but it does not specify whether the signature is valid or not. ")
  public Boolean isisIsSigned() {
    return isSigned;
  }

  public void setIsSigned(Boolean isSigned) {
    this.isSigned = isSigned;
  }

  public Document documentProperties(DocumentProperties documentProperties) {
    this.documentProperties = documentProperties;
    return this;
  }

   /**
   * Returns document properties.
   * @return documentProperties
  **/
  @ApiModelProperty(value = "Returns document properties.")
  public DocumentProperties getDocumentProperties() {
    return documentProperties;
  }

  public void setDocumentProperties(DocumentProperties documentProperties) {
    this.documentProperties = documentProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.links, document.links) &&
        Objects.equals(this.fileName, document.fileName) &&
        Objects.equals(this.sourceFormat, document.sourceFormat) &&
        Objects.equals(this.isEncrypted, document.isEncrypted) &&
        Objects.equals(this.isSigned, document.isSigned) &&
        Objects.equals(this.documentProperties, document.documentProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, fileName, sourceFormat, isEncrypted, isSigned, documentProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    sourceFormat: ").append(toIndentedString(sourceFormat)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    isSigned: ").append(toIndentedString(isSigned)).append("\n");
    sb.append("    documentProperties: ").append(toIndentedString(documentProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

