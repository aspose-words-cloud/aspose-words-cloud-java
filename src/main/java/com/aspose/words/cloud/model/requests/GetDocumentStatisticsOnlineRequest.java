/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetDocumentStatisticsOnlineRequest.java">
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
 * Request model for getDocumentStatisticsOnline operation.
 */
public class GetDocumentStatisticsOnlineRequest implements RequestIfc {
    /*
     * The document.
     */
    private byte[] document;

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
     * The flag indicating whether to include comments from the WordCount. The default value is "false".
     */
    private Boolean includeComments;

    /*
     * The flag indicating whether to include footnotes from the WordCount. The default value is "false".
     */
    private Boolean includeFootnotes;

    /*
     * The flag indicating whether to include shape's text from the WordCount. The default value is "false".
     */
    private Boolean includeTextInShapes;

    /*
     * Initializes a new instance of the GetDocumentStatisticsOnlineRequest class.
     *
     * @param byte[] document The document.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password of protected Word document. Use the parameter to pass a password via SDK. SDK encrypts it automatically. We don't recommend to use the parameter to pass a plain password for direct call of API.
     * @param String encryptedPassword Password of protected Word document. Use the parameter to pass an encrypted password for direct calls of API. See SDK code for encyption details.
     * @param Boolean openTypeSupport The value indicates whether OpenType support is on.
     * @param Boolean includeComments The flag indicating whether to include comments from the WordCount. The default value is "false".
     * @param Boolean includeFootnotes The flag indicating whether to include footnotes from the WordCount. The default value is "false".
     * @param Boolean includeTextInShapes The flag indicating whether to include shape's text from the WordCount. The default value is "false".
     */
    public GetDocumentStatisticsOnlineRequest(byte[] document, String loadEncoding, String password, String encryptedPassword, Boolean openTypeSupport, Boolean includeComments, Boolean includeFootnotes, Boolean includeTextInShapes) {
        this.document = document;
        this.loadEncoding = loadEncoding;
        this.password = password;
        this.encryptedPassword = encryptedPassword;
        this.openTypeSupport = openTypeSupport;
        this.includeComments = includeComments;
        this.includeFootnotes = includeFootnotes;
        this.includeTextInShapes = includeTextInShapes;
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
     * Gets The flag indicating whether to include comments from the WordCount. The default value is "false".
     */
    public Boolean getIncludeComments() {
        return this.includeComments;
    }

    /*
     * Sets The flag indicating whether to include comments from the WordCount. The default value is "false".
     */
    public void setIncludeComments(Boolean value) {
        this.includeComments = value;
    }

    /*
     * Gets The flag indicating whether to include footnotes from the WordCount. The default value is "false".
     */
    public Boolean getIncludeFootnotes() {
        return this.includeFootnotes;
    }

    /*
     * Sets The flag indicating whether to include footnotes from the WordCount. The default value is "false".
     */
    public void setIncludeFootnotes(Boolean value) {
        this.includeFootnotes = value;
    }

    /*
     * Gets The flag indicating whether to include shape's text from the WordCount. The default value is "false".
     */
    public Boolean getIncludeTextInShapes() {
        return this.includeTextInShapes;
    }

    /*
     * Sets The flag indicating whether to include shape's text from the WordCount. The default value is "false".
     */
    public void setIncludeTextInShapes(Boolean value) {
        this.includeTextInShapes = value;
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
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'Document' when calling getDocumentStatisticsOnline");
        }

        // create path and map variables
        String localVarPath = "/words/online/get/statistics";
        localVarPath = localVarPath.replaceAll("//", "/");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        apiClient.addParameterToQuery(localVarQueryParams, "loadEncoding", getLoadEncoding());
        apiClient.addParameterToQuery(localVarQueryParams, "password", getPassword());
        apiClient.addParameterToQuery(localVarQueryParams, "encryptedPassword", getEncryptedPassword());
        apiClient.addParameterToQuery(localVarQueryParams, "openTypeSupport", getOpenTypeSupport());
        apiClient.addParameterToQuery(localVarQueryParams, "includeComments", getIncludeComments());
        apiClient.addParameterToQuery(localVarQueryParams, "includeFootnotes", getIncludeFootnotes());
        apiClient.addParameterToQuery(localVarQueryParams, "includeTextInShapes", getIncludeTextInShapes());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        List<FileReference> localFilesContentParams = new ArrayList<FileReference>();
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (getDocument() != null) {
            localVarFormParams.put("Document", getDocument());
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
    public StatDataResponse deserializeResponse(ApiClient apiClient, Response response) throws ApiException, MessagingException, IOException {
        return (StatDataResponse) apiClient.deserialize(response, StatDataResponse.class);
    }
}
