/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetDocumentStatisticsRequest.java">
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
 * Request model for getDocumentStatistics operation.
 */
public class GetDocumentStatisticsRequest implements RequestIfc {
    /*
     * The filename of the input document.
     */
    private String name;

    /*
     * Original document folder.
     */
    private String folder;

    /*
     * Original document storage.
     */
    private String storage;

    /*
     * Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    private String loadEncoding;

    /*
     * Password for opening an encrypted document.
     */
    private String password;

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
     * Initializes a new instance of the GetDocumentStatisticsRequest class.
     *
     * @param String name The filename of the input document.
     * @param String folder Original document folder.
     * @param String storage Original document storage.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password for opening an encrypted document.
     * @param Boolean includeComments The flag indicating whether to include comments from the WordCount. The default value is "false".
     * @param Boolean includeFootnotes The flag indicating whether to include footnotes from the WordCount. The default value is "false".
     * @param Boolean includeTextInShapes The flag indicating whether to include shape's text from the WordCount. The default value is "false".
     */
    public GetDocumentStatisticsRequest(String name, String folder, String storage, String loadEncoding, String password, Boolean includeComments, Boolean includeFootnotes, Boolean includeTextInShapes) {
        this.name = name;
        this.folder = folder;
        this.storage = storage;
        this.loadEncoding = loadEncoding;
        this.password = password;
        this.includeComments = includeComments;
        this.includeFootnotes = includeFootnotes;
        this.includeTextInShapes = includeTextInShapes;
    }

    /*
     * Gets The filename of the input document.
     */
    public String getName() {
        return this.name;
    }

    /*
     * Sets The filename of the input document.
     */
    public void setName(String value) {
        this.name = value;
    }

    /*
     * Gets Original document folder.
     */
    public String getFolder() {
        return this.folder;
    }

    /*
     * Sets Original document folder.
     */
    public void setFolder(String value) {
        this.folder = value;
    }

    /*
     * Gets Original document storage.
     */
    public String getStorage() {
        return this.storage;
    }

    /*
     * Sets Original document storage.
     */
    public void setStorage(String value) {
        this.storage = value;
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
    public Request buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException, IOException {
        // verify the required parameter 'Name' is set
        if (getName() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'Name' when calling getDocumentStatistics");
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/statistics";
        localVarPath = apiClient.addParameterToPath(localVarPath, "name", getName());
        localVarPath = localVarPath.replaceAll("//", "/");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        apiClient.addParameterToQuery(localVarQueryParams, "folder", getFolder());
        apiClient.addParameterToQuery(localVarQueryParams, "storage", getStorage());
        apiClient.addParameterToQuery(localVarQueryParams, "loadEncoding", getLoadEncoding());
        apiClient.addParameterToQuery(localVarQueryParams, "password", getPassword());
        apiClient.addParameterToQuery(localVarQueryParams, "includeComments", getIncludeComments());
        apiClient.addParameterToQuery(localVarQueryParams, "includeFootnotes", getIncludeFootnotes());
        apiClient.addParameterToQuery(localVarQueryParams, "includeTextInShapes", getIncludeTextInShapes());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();

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

        return apiClient.buildRequest(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, addAuthHeaders, progressRequestListener);
    }

    /*
     * Gets response type for this request.
     */
    public Type getResponseType() {
        return StatDataResponse.class;
    }

    /*
     * Deserialize response message.
     *
     * @param apiClient ApiClient instance
     * @param response Response instance
     */
    public StatDataResponse deserializeResponse(ApiClient apiClient, Response response) throws ApiException, MessagingException, IOException {
        return (StatDataResponse)apiClient.deserialize(response, StatDataResponse.class);
    }
}
