/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ExecuteMailMergeOnlineRequest.java">
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
     * Field options.
     */
    private FieldOptions options;

    /*
     * The flag indicating whether to execute Mail Merge operation with regions.
     */
    private Boolean withRegions;

    /*
     * The flag indicating whether fields in whole document are updated while executing of a mail merge with regions.
     */
    private Boolean mergeWholeDocument;

    /*
     * The cleanup options.
     */
    private String cleanup;

    /*
     * The filename of the output document, that will be used when the resulting document has a dynamic field {filename}. If it is not set, the "template" will be used instead.
     */
    private String documentFileName;

    /*
     * Initializes a new instance of the ExecuteMailMergeOnlineRequest class.
     *
     * @param byte[] template File with template.
     * @param byte[] data File with mailmerge data.
     * @param FieldOptions options Field options.
     * @param Boolean withRegions The flag indicating whether to execute Mail Merge operation with regions.
     * @param Boolean mergeWholeDocument The flag indicating whether fields in whole document are updated while executing of a mail merge with regions.
     * @param String cleanup The cleanup options.
     * @param String documentFileName The filename of the output document, that will be used when the resulting document has a dynamic field {filename}. If it is not set, the "template" will be used instead.
     */
    public ExecuteMailMergeOnlineRequest(byte[] template, byte[] data, FieldOptions options, Boolean withRegions, Boolean mergeWholeDocument, String cleanup, String documentFileName) {
        this.template = template;
        this.data = data;
        this.options = options;
        this.withRegions = withRegions;
        this.mergeWholeDocument = mergeWholeDocument;
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
     * Gets Field options.
     */
    public FieldOptions getOptions() {
        return this.options;
    }

    /*
     * Sets Field options.
     */
    public void setOptions(FieldOptions value) {
        this.options = value;
    }

    /*
     * Gets The flag indicating whether to execute Mail Merge operation with regions.
     */
    public Boolean getWithRegions() {
        return this.withRegions;
    }

    /*
     * Sets The flag indicating whether to execute Mail Merge operation with regions.
     */
    public void setWithRegions(Boolean value) {
        this.withRegions = value;
    }

    /*
     * Gets The flag indicating whether fields in whole document are updated while executing of a mail merge with regions.
     */
    public Boolean getMergeWholeDocument() {
        return this.mergeWholeDocument;
    }

    /*
     * Sets The flag indicating whether fields in whole document are updated while executing of a mail merge with regions.
     */
    public void setMergeWholeDocument(Boolean value) {
        this.mergeWholeDocument = value;
    }

    /*
     * Gets The cleanup options.
     */
    public String getCleanup() {
        return this.cleanup;
    }

    /*
     * Sets The cleanup options.
     */
    public void setCleanup(String value) {
        this.cleanup = value;
    }

    /*
     * Gets The filename of the output document, that will be used when the resulting document has a dynamic field {filename}. If it is not set, the "template" will be used instead.
     */
    public String getDocumentFileName() {
        return this.documentFileName;
    }

    /*
     * Sets The filename of the output document, that will be used when the resulting document has a dynamic field {filename}. If it is not set, the "template" will be used instead.
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
    @Override
    public Request buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException, IOException {
        // verify the required parameter 'Template' is set
        if (getTemplate() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'Template' when calling executeMailMergeOnline");
        }

        // verify the required parameter 'Data' is set
        if (getData() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'Data' when calling executeMailMergeOnline");
        }
        if (getOptions() != null) {
            getOptions().validate();
        }










        // create path and map variables
        String localVarPath = "/words/MailMerge";
        localVarPath = localVarPath.replaceAll("//", "/");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        apiClient.addParameterToQuery(localVarQueryParams, "withRegions", getWithRegions());
        apiClient.addParameterToQuery(localVarQueryParams, "mergeWholeDocument", getMergeWholeDocument());
        apiClient.addParameterToQuery(localVarQueryParams, "cleanup", getCleanup());
        apiClient.addParameterToQuery(localVarQueryParams, "documentFileName", getDocumentFileName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        List<FileReference> localFilesContentParams = new ArrayList<FileReference>();
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (getTemplate() != null) {
            localVarFormParams.put("Template", getTemplate());
        }

        if (getData() != null) {
            localVarFormParams.put("Data", getData());
        }

        if (getOptions() != null) {
            localVarFormParams.put("Options", getOptions());
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
    public byte[] deserializeResponse(ApiClient apiClient, Response response) throws ApiException, MessagingException, IOException {
        return response.body().bytes();
    }
}
