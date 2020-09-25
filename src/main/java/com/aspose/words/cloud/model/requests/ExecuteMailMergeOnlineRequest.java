/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ExecuteMailMergeOnlineRequest.java">
 *   Copyright (c) 2020 Aspose.Words for Cloud
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
import com.squareup.okhttp.*;
import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

/*
 * Request model for executeMailMergeOnline operation.
 */
public class ExecuteMailMergeOnlineRequest implements RequestIfc {
    /*
     * File with template.
     */
    private byte[] template;

    /*
     * File with mailmerge data.
     */
    private byte[] data;

    /*
     * With regions flag.
     */
    private Boolean withRegions;

    /*
     * Clean up options.
     */
    private String cleanup;

    /*
     * This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not set, "template" will be used instead.
     */
    private String documentFileName;

    /*
     * Initializes a new instance of the ExecuteMailMergeOnlineRequest class.
     *
     * @param byte[] template File with template.
     * @param byte[] data File with mailmerge data.
     * @param Boolean withRegions With regions flag.
     * @param String cleanup Clean up options.
     * @param String documentFileName This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not set, "template" will be used instead.
     */
    public ExecuteMailMergeOnlineRequest(byte[] template, byte[] data, Boolean withRegions, String cleanup, String documentFileName) {
        this.template = template;
        this.data = data;
        this.withRegions = withRegions;
        this.cleanup = cleanup;
        this.documentFileName = documentFileName;
    }

    /*
     * Gets File with template.
     */
    public byte[] getTemplate() {
        return this.template;
    }

    /*
     * Sets File with template.
     */
    public void setTemplate(byte[] value) {
        this.template = value;
    }

    /*
     * Gets File with mailmerge data.
     */
    public byte[] getData() {
        return this.data;
    }

    /*
     * Sets File with mailmerge data.
     */
    public void setData(byte[] value) {
        this.data = value;
    }

    /*
     * Gets With regions flag.
     */
    public Boolean getWithRegions() {
        return this.withRegions;
    }

    /*
     * Sets With regions flag.
     */
    public void setWithRegions(Boolean value) {
        this.withRegions = value;
    }

    /*
     * Gets Clean up options.
     */
    public String getCleanup() {
        return this.cleanup;
    }

    /*
     * Sets Clean up options.
     */
    public void setCleanup(String value) {
        this.cleanup = value;
    }

    /*
     * Gets This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not set, "template" will be used instead.
     */
    public String getDocumentFileName() {
        return this.documentFileName;
    }

    /*
     * Sets This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not set, "template" will be used instead.
     */
    public void setDocumentFileName(String value) {
        this.documentFileName = value;
    }

    /*
     * Creates the http request based on this request model.
     *
     * @param apiClient ApiClient instance
     * @throws ApiException If fail to serialize the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public Request buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException, IOException
    {
        // verify the required parameter 'Template' is set
        if (getTemplate() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'Template' when calling executeMailMergeOnline");
        }

        // verify the required parameter 'Data' is set
        if (getData() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'Data' when calling executeMailMergeOnline");
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/MailMerge";
        localVarPath = localVarPath.replaceAll("//", "/");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        apiClient.addParameterToQuery(localVarQueryParams, "withRegions", getWithRegions());
        apiClient.addParameterToQuery(localVarQueryParams, "cleanup", getCleanup());
        apiClient.addParameterToQuery(localVarQueryParams, "documentFileName", getDocumentFileName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (getTemplate() != null)
            localVarFormParams.put("Template", getTemplate());

        if (getData() != null)
            localVarFormParams.put("Data", getData());

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
        return File.class;
    }
}
