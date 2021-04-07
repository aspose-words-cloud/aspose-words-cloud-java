/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SaveAsTiffOnlineRequest.java">
 *   Copyright (c) 2021 Aspose.Words for Cloud
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

package com.aspose.words.cloud.model.requests;

import com.aspose.words.cloud.*;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.responses.*;
import com.squareup.okhttp.*;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMultipart;
import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

/*
 * Request model for saveAsTiffOnline operation.
 */
public class SaveAsTiffOnlineRequest implements RequestIfc {
    /*
     * The document.
     */
    private byte[] document;

    /*
     * Tiff save options.
     */
    private TiffSaveOptionsData saveOptions;

    /*
     * Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    private String loadEncoding;

    /*
     * Password for opening an encrypted document.
     */
    private String password;

    /*
     * The flag indicating whether to use antialiasing.
     */
    private Boolean useAntiAliasing;

    /*
     * The flag indicating whether to use high quality.
     */
    private Boolean useHighQualityRendering;

    /*
     * The level of brightness for the generated images.
     */
    private Double imageBrightness;

    /*
     * The color mode for the generated images.
     */
    private String imageColorMode;

    /*
     * The contrast for the generated images.
     */
    private Double imageContrast;

    /*
     * The images numeral format.
     */
    private String numeralFormat;

    /*
     * The number of pages to render.
     */
    private Integer pageCount;

    /*
     * The index of the page to start rendering.
     */
    private Integer pageIndex;

    /*
     * The background image color.
     */
    private String paperColor;

    /*
     * The pixel format of the generated images.
     */
    private String pixelFormat;

    /*
     * The resolution of the generated images.
     */
    private Double resolution;

    /*
     * The zoom factor for the generated images.
     */
    private Double scale;

    /*
     * The compression tipe.
     */
    private String tiffCompression;

    /*
     * The optional dml rendering mode. The default value is Fallback.
     */
    private String dmlRenderingMode;

    /*
     * The optional dml effects rendering mode. The default value is Simplified.
     */
    private String dmlEffectsRenderingMode;

    /*
     * The optional TIFF binarization method. Possible values are: FloydSteinbergDithering, Threshold.
     */
    private String tiffBinarizationMethod;

    /*
     * The flag indicating whether to ZIP the output.
     */
    private Boolean zipOutput;

    /*
     * Folder in filestorage with custom fonts.
     */
    private String fontsLocation;

    /*
     * Initializes a new instance of the SaveAsTiffOnlineRequest class.
     *
     * @param byte[] document The document.
     * @param TiffSaveOptionsData saveOptions Tiff save options.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password for opening an encrypted document.
     * @param Boolean useAntiAliasing The flag indicating whether to use antialiasing.
     * @param Boolean useHighQualityRendering The flag indicating whether to use high quality.
     * @param Double imageBrightness The level of brightness for the generated images.
     * @param String imageColorMode The color mode for the generated images.
     * @param Double imageContrast The contrast for the generated images.
     * @param String numeralFormat The images numeral format.
     * @param Integer pageCount The number of pages to render.
     * @param Integer pageIndex The index of the page to start rendering.
     * @param String paperColor The background image color.
     * @param String pixelFormat The pixel format of the generated images.
     * @param Double resolution The resolution of the generated images.
     * @param Double scale The zoom factor for the generated images.
     * @param String tiffCompression The compression tipe.
     * @param String dmlRenderingMode The optional dml rendering mode. The default value is Fallback.
     * @param String dmlEffectsRenderingMode The optional dml effects rendering mode. The default value is Simplified.
     * @param String tiffBinarizationMethod The optional TIFF binarization method. Possible values are: FloydSteinbergDithering, Threshold.
     * @param Boolean zipOutput The flag indicating whether to ZIP the output.
     * @param String fontsLocation Folder in filestorage with custom fonts.
     */
    public SaveAsTiffOnlineRequest(byte[] document, TiffSaveOptionsData saveOptions, String loadEncoding, String password, Boolean useAntiAliasing, Boolean useHighQualityRendering, Double imageBrightness, String imageColorMode, Double imageContrast, String numeralFormat, Integer pageCount, Integer pageIndex, String paperColor, String pixelFormat, Double resolution, Double scale, String tiffCompression, String dmlRenderingMode, String dmlEffectsRenderingMode, String tiffBinarizationMethod, Boolean zipOutput, String fontsLocation) {
        this.document = document;
        this.saveOptions = saveOptions;
        this.loadEncoding = loadEncoding;
        this.password = password;
        this.useAntiAliasing = useAntiAliasing;
        this.useHighQualityRendering = useHighQualityRendering;
        this.imageBrightness = imageBrightness;
        this.imageColorMode = imageColorMode;
        this.imageContrast = imageContrast;
        this.numeralFormat = numeralFormat;
        this.pageCount = pageCount;
        this.pageIndex = pageIndex;
        this.paperColor = paperColor;
        this.pixelFormat = pixelFormat;
        this.resolution = resolution;
        this.scale = scale;
        this.tiffCompression = tiffCompression;
        this.dmlRenderingMode = dmlRenderingMode;
        this.dmlEffectsRenderingMode = dmlEffectsRenderingMode;
        this.tiffBinarizationMethod = tiffBinarizationMethod;
        this.zipOutput = zipOutput;
        this.fontsLocation = fontsLocation;
    }

    /*
     * Gets The document.
     */
    public byte[] getDocument() {
        return this.document;
    }

    /*
     * Sets The document.
     */
    public void setDocument(byte[] value) {
        this.document = value;
    }

    /*
     * Gets Tiff save options.
     */
    public TiffSaveOptionsData getSaveOptions() {
        return this.saveOptions;
    }

    /*
     * Sets Tiff save options.
     */
    public void setSaveOptions(TiffSaveOptionsData value) {
        this.saveOptions = value;
    }

    /*
     * Gets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public String getLoadEncoding() {
        return this.loadEncoding;
    }

    /*
     * Sets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public void setLoadEncoding(String value) {
        this.loadEncoding = value;
    }

    /*
     * Gets Password for opening an encrypted document.
     */
    public String getPassword() {
        return this.password;
    }

    /*
     * Sets Password for opening an encrypted document.
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /*
     * Gets The flag indicating whether to use antialiasing.
     */
    public Boolean getUseAntiAliasing() {
        return this.useAntiAliasing;
    }

    /*
     * Sets The flag indicating whether to use antialiasing.
     */
    public void setUseAntiAliasing(Boolean value) {
        this.useAntiAliasing = value;
    }

    /*
     * Gets The flag indicating whether to use high quality.
     */
    public Boolean getUseHighQualityRendering() {
        return this.useHighQualityRendering;
    }

    /*
     * Sets The flag indicating whether to use high quality.
     */
    public void setUseHighQualityRendering(Boolean value) {
        this.useHighQualityRendering = value;
    }

    /*
     * Gets The level of brightness for the generated images.
     */
    public Double getImageBrightness() {
        return this.imageBrightness;
    }

    /*
     * Sets The level of brightness for the generated images.
     */
    public void setImageBrightness(Double value) {
        this.imageBrightness = value;
    }

    /*
     * Gets The color mode for the generated images.
     */
    public String getImageColorMode() {
        return this.imageColorMode;
    }

    /*
     * Sets The color mode for the generated images.
     */
    public void setImageColorMode(String value) {
        this.imageColorMode = value;
    }

    /*
     * Gets The contrast for the generated images.
     */
    public Double getImageContrast() {
        return this.imageContrast;
    }

    /*
     * Sets The contrast for the generated images.
     */
    public void setImageContrast(Double value) {
        this.imageContrast = value;
    }

    /*
     * Gets The images numeral format.
     */
    public String getNumeralFormat() {
        return this.numeralFormat;
    }

    /*
     * Sets The images numeral format.
     */
    public void setNumeralFormat(String value) {
        this.numeralFormat = value;
    }

    /*
     * Gets The number of pages to render.
     */
    public Integer getPageCount() {
        return this.pageCount;
    }

    /*
     * Sets The number of pages to render.
     */
    public void setPageCount(Integer value) {
        this.pageCount = value;
    }

    /*
     * Gets The index of the page to start rendering.
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /*
     * Sets The index of the page to start rendering.
     */
    public void setPageIndex(Integer value) {
        this.pageIndex = value;
    }

    /*
     * Gets The background image color.
     */
    public String getPaperColor() {
        return this.paperColor;
    }

    /*
     * Sets The background image color.
     */
    public void setPaperColor(String value) {
        this.paperColor = value;
    }

    /*
     * Gets The pixel format of the generated images.
     */
    public String getPixelFormat() {
        return this.pixelFormat;
    }

    /*
     * Sets The pixel format of the generated images.
     */
    public void setPixelFormat(String value) {
        this.pixelFormat = value;
    }

    /*
     * Gets The resolution of the generated images.
     */
    public Double getResolution() {
        return this.resolution;
    }

    /*
     * Sets The resolution of the generated images.
     */
    public void setResolution(Double value) {
        this.resolution = value;
    }

    /*
     * Gets The zoom factor for the generated images.
     */
    public Double getScale() {
        return this.scale;
    }

    /*
     * Sets The zoom factor for the generated images.
     */
    public void setScale(Double value) {
        this.scale = value;
    }

    /*
     * Gets The compression tipe.
     */
    public String getTiffCompression() {
        return this.tiffCompression;
    }

    /*
     * Sets The compression tipe.
     */
    public void setTiffCompression(String value) {
        this.tiffCompression = value;
    }

    /*
     * Gets The optional dml rendering mode. The default value is Fallback.
     */
    public String getDmlRenderingMode() {
        return this.dmlRenderingMode;
    }

    /*
     * Sets The optional dml rendering mode. The default value is Fallback.
     */
    public void setDmlRenderingMode(String value) {
        this.dmlRenderingMode = value;
    }

    /*
     * Gets The optional dml effects rendering mode. The default value is Simplified.
     */
    public String getDmlEffectsRenderingMode() {
        return this.dmlEffectsRenderingMode;
    }

    /*
     * Sets The optional dml effects rendering mode. The default value is Simplified.
     */
    public void setDmlEffectsRenderingMode(String value) {
        this.dmlEffectsRenderingMode = value;
    }

    /*
     * Gets The optional TIFF binarization method. Possible values are: FloydSteinbergDithering, Threshold.
     */
    public String getTiffBinarizationMethod() {
        return this.tiffBinarizationMethod;
    }

    /*
     * Sets The optional TIFF binarization method. Possible values are: FloydSteinbergDithering, Threshold.
     */
    public void setTiffBinarizationMethod(String value) {
        this.tiffBinarizationMethod = value;
    }

    /*
     * Gets The flag indicating whether to ZIP the output.
     */
    public Boolean getZipOutput() {
        return this.zipOutput;
    }

    /*
     * Sets The flag indicating whether to ZIP the output.
     */
    public void setZipOutput(Boolean value) {
        this.zipOutput = value;
    }

    /*
     * Gets Folder in filestorage with custom fonts.
     */
    public String getFontsLocation() {
        return this.fontsLocation;
    }

    /*
     * Sets Folder in filestorage with custom fonts.
     */
    public void setFontsLocation(String value) {
        this.fontsLocation = value;
    }


    /*
     * Creates the http request based on this request model.
     *
     * @param apiClient ApiClient instance
     * @throws ApiException If fail to serialize the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public Request buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException, IOException {
        // verify the required parameter 'Document' is set
        if (getDocument() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'Document' when calling saveAsTiffOnline");
        }

        // verify the required parameter 'SaveOptions' is set
        if (getSaveOptions() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'SaveOptions' when calling saveAsTiffOnline");
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/online/put/saveAs/tiff";
        localVarPath = localVarPath.replaceAll("//", "/");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        apiClient.addParameterToQuery(localVarQueryParams, "loadEncoding", getLoadEncoding());
        apiClient.addParameterToQuery(localVarQueryParams, "password", getPassword());
        apiClient.addParameterToQuery(localVarQueryParams, "useAntiAliasing", getUseAntiAliasing());
        apiClient.addParameterToQuery(localVarQueryParams, "useHighQualityRendering", getUseHighQualityRendering());
        apiClient.addParameterToQuery(localVarQueryParams, "imageBrightness", getImageBrightness());
        apiClient.addParameterToQuery(localVarQueryParams, "imageColorMode", getImageColorMode());
        apiClient.addParameterToQuery(localVarQueryParams, "imageContrast", getImageContrast());
        apiClient.addParameterToQuery(localVarQueryParams, "numeralFormat", getNumeralFormat());
        apiClient.addParameterToQuery(localVarQueryParams, "pageCount", getPageCount());
        apiClient.addParameterToQuery(localVarQueryParams, "pageIndex", getPageIndex());
        apiClient.addParameterToQuery(localVarQueryParams, "paperColor", getPaperColor());
        apiClient.addParameterToQuery(localVarQueryParams, "pixelFormat", getPixelFormat());
        apiClient.addParameterToQuery(localVarQueryParams, "resolution", getResolution());
        apiClient.addParameterToQuery(localVarQueryParams, "scale", getScale());
        apiClient.addParameterToQuery(localVarQueryParams, "tiffCompression", getTiffCompression());
        apiClient.addParameterToQuery(localVarQueryParams, "dmlRenderingMode", getDmlRenderingMode());
        apiClient.addParameterToQuery(localVarQueryParams, "dmlEffectsRenderingMode", getDmlEffectsRenderingMode());
        apiClient.addParameterToQuery(localVarQueryParams, "tiffBinarizationMethod", getTiffBinarizationMethod());
        apiClient.addParameterToQuery(localVarQueryParams, "zipOutput", getZipOutput());
        apiClient.addParameterToQuery(localVarQueryParams, "fontsLocation", getFontsLocation());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (getDocument() != null)
            localVarFormParams.put("Document", getDocument());

        if (getSaveOptions() != null)
            localVarFormParams.put("SaveOptions", getSaveOptions());

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        return apiClient.buildRequest(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, addAuthHeaders, progressRequestListener);
    }

    /*
     * Gets response type for this request.
     */
    public Type getResponseType() {
        return SaveAsTiffOnlineResponse.class;
    }

    /*
     * Deserialize response message.
     *
     * @param apiClient ApiClient instance
     * @param response Response instance
     */
    public SaveAsTiffOnlineResponse deserializeResponse(ApiClient apiClient, Response response) throws ApiException, MessagingException, IOException {
        MimeMultipart multipart = apiClient.getMultipartFromResponse(response);
        return new SaveAsTiffOnlineResponse(
            (SaveResponse) apiClient.parseModel(multipart.getBodyPart(0), SaveResponse.class),
            apiClient.parseDocument(multipart.getBodyPart(1))
        );
    }
}
