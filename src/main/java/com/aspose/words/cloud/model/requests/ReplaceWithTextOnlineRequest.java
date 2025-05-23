/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ReplaceWithTextOnlineRequest.java">
 *   Copyright (c) 2025 Aspose.Words for Cloud
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
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMultipart;
import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

/*
 * Request model for replaceWithTextOnline operation.
 */
public class ReplaceWithTextOnlineRequest implements RequestIfc {
    /*
     * The document.
     */
    private byte[] document;

    /*
     * The range start identifier. Identifier examples: id0.0.0, page0.
     */
    private String rangeStartIdentifier;

    /*
     * Model with text for replacement.
     */
    private ReplaceRange rangeText;

    /*
     * The range end identifier. Identifier examples: id1.0.0, id0.0.0:end, page1, page1:end, document:end.
     */
    private String rangeEndIdentifier;

    /*
     * Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    private String loadEncoding;

    /*
     * Password of protected Word document. Use the parameter to pass a password via SDK. SDK encrypts it automatically. We don't recommend to use the parameter to pass a plain password for direct call of API.
     */
    private String password;

    /*
     * Password of protected Word document. Use the parameter to pass an encrypted password for direct calls of API. See SDK code for encyption details.
     */
    private String encryptedPassword;

    /*
     * The value indicates whether OpenType support is on.
     */
    private Boolean openTypeSupport;

    /*
     * Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    private String destFileName;

    /*
     * Initializes a new instance of the ReplaceWithTextOnlineRequest class.
     *
     * @param byte[] document The document.
     * @param String rangeStartIdentifier The range start identifier. Identifier examples: id0.0.0, page0.
     * @param ReplaceRange rangeText Model with text for replacement.
     * @param String rangeEndIdentifier The range end identifier. Identifier examples: id1.0.0, id0.0.0:end, page1, page1:end, document:end.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password of protected Word document. Use the parameter to pass a password via SDK. SDK encrypts it automatically. We don't recommend to use the parameter to pass a plain password for direct call of API.
     * @param String encryptedPassword Password of protected Word document. Use the parameter to pass an encrypted password for direct calls of API. See SDK code for encyption details.
     * @param Boolean openTypeSupport The value indicates whether OpenType support is on.
     * @param String destFileName Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    public ReplaceWithTextOnlineRequest(byte[] document, String rangeStartIdentifier, ReplaceRange rangeText, String rangeEndIdentifier, String loadEncoding, String password, String encryptedPassword, Boolean openTypeSupport, String destFileName) {
        this.document = document;
        this.rangeStartIdentifier = rangeStartIdentifier;
        this.rangeText = rangeText;
        this.rangeEndIdentifier = rangeEndIdentifier;
        this.loadEncoding = loadEncoding;
        this.password = password;
        this.encryptedPassword = encryptedPassword;
        this.openTypeSupport = openTypeSupport;
        this.destFileName = destFileName;
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
     * Gets The range start identifier. Identifier examples: id0.0.0, page0.
     */
    public String getRangeStartIdentifier() {
        return this.rangeStartIdentifier;
    }

    /*
     * Sets The range start identifier. Identifier examples: id0.0.0, page0.
     */
    public void setRangeStartIdentifier(String value) {
        this.rangeStartIdentifier = value;
    }

    /*
     * Gets Model with text for replacement.
     */
    public ReplaceRange getRangeText() {
        return this.rangeText;
    }

    /*
     * Sets Model with text for replacement.
     */
    public void setRangeText(ReplaceRange value) {
        this.rangeText = value;
    }

    /*
     * Gets The range end identifier. Identifier examples: id1.0.0, id0.0.0:end, page1, page1:end, document:end.
     */
    public String getRangeEndIdentifier() {
        return this.rangeEndIdentifier;
    }

    /*
     * Sets The range end identifier. Identifier examples: id1.0.0, id0.0.0:end, page1, page1:end, document:end.
     */
    public void setRangeEndIdentifier(String value) {
        this.rangeEndIdentifier = value;
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
     * Gets Password of protected Word document. Use the parameter to pass a password via SDK. SDK encrypts it automatically. We don't recommend to use the parameter to pass a plain password for direct call of API.
     */
    public String getPassword() {
        return this.password;
    }

    /*
     * Sets Password of protected Word document. Use the parameter to pass a password via SDK. SDK encrypts it automatically. We don't recommend to use the parameter to pass a plain password for direct call of API.
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /*
     * Gets Password of protected Word document. Use the parameter to pass an encrypted password for direct calls of API. See SDK code for encyption details.
     */
    public String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    /*
     * Sets Password of protected Word document. Use the parameter to pass an encrypted password for direct calls of API. See SDK code for encyption details.
     */
    public void setEncryptedPassword(String value) {
        this.encryptedPassword = value;
    }

    /*
     * Gets The value indicates whether OpenType support is on.
     */
    public Boolean getOpenTypeSupport() {
        return this.openTypeSupport;
    }

    /*
     * Sets The value indicates whether OpenType support is on.
     */
    public void setOpenTypeSupport(Boolean value) {
        this.openTypeSupport = value;
    }

    /*
     * Gets Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    public String getDestFileName() {
        return this.destFileName;
    }

    /*
     * Sets Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    public void setDestFileName(String value) {
        this.destFileName = value;
    }


    /*
     * Creates the http request based on this request model.
     *
     * @param apiClient ApiClient instance
     * @throws ApiException If fail to serialize the request body object
     * @throws IOException If fail to serialize the request body object
     */
    @Override
    public Request buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException, IOException {
        // verify the required parameter 'Document' is set
        if (getDocument() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'Document' when calling replaceWithTextOnline");
        }

        // verify the required parameter 'RangeStartIdentifier' is set
        if (getRangeStartIdentifier() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'RangeStartIdentifier' when calling replaceWithTextOnline");
        }

        // verify the required parameter 'RangeText' is set
        if (getRangeText() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'RangeText' when calling replaceWithTextOnline");
        }
        if (getRangeText() != null) {
            getRangeText().validate();
        }














        // create path and map variables
        String localVarPath = "/words/online/post/range/{rangeStartIdentifier}/{rangeEndIdentifier}";
        localVarPath = apiClient.addParameterToPath(localVarPath, "rangeStartIdentifier", getRangeStartIdentifier());
        localVarPath = apiClient.addParameterToPath(localVarPath, "rangeEndIdentifier", getRangeEndIdentifier());
        localVarPath = localVarPath.replaceAll("//", "/");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        apiClient.addParameterToQuery(localVarQueryParams, "loadEncoding", getLoadEncoding());
        apiClient.addParameterToQuery(localVarQueryParams, "password", getPassword());
        apiClient.addParameterToQuery(localVarQueryParams, "encryptedPassword", getEncryptedPassword());
        apiClient.addParameterToQuery(localVarQueryParams, "openTypeSupport", getOpenTypeSupport());
        apiClient.addParameterToQuery(localVarQueryParams, "destFileName", getDestFileName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        List<FileReference> localFilesContentParams = new ArrayList<FileReference>();
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (getDocument() != null) {
            localVarFormParams.put("Document", getDocument());
        }

        if (getRangeText() != null) {
            localVarFormParams.put("RangeText", getRangeText());
        }

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

        return apiClient.buildRequest(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarHeaderParams, localVarFormParams, localFilesContentParams, addAuthHeaders, progressRequestListener);
    }

    /*
     * Deserialize response message.
     *
     * @param apiClient ApiClient instance
     * @param response Response instance
     */
    @Override
    public ReplaceWithTextOnlineResponse deserializeResponse(ApiClient apiClient, Response response) throws ApiException, MessagingException, IOException {
        MimeMultipart multipart = apiClient.getMultipartFromResponse(response);
        return new ReplaceWithTextOnlineResponse(
            (DocumentResponse) apiClient.parseModel(apiClient.findBodyPartInMultipart("Model", multipart), DocumentResponse.class),
            apiClient.parseFilesCollection(apiClient.findBodyPartInMultipart("Document", multipart))
        );
    }
}
