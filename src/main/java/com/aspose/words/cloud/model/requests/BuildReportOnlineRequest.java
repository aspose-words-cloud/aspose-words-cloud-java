/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="BuildReportOnlineRequest.java">
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
 * Request model for buildReportOnline operation.
 */
public class BuildReportOnlineRequest implements RequestIfc {
    /*
     * File with template.
     */
    private byte[] template;

    /*
     * A string providing a data to populate the specified template. The string must be of one of the following types: xml, json, csv.
     */
    private String data;

    /*
     * An object providing a settings of report engine.
     */
    private ReportEngineSettings reportEngineSettings;

    /*
     * The filename of the output document, that will be used when the resulting document has a dynamic field {filename}. If it is not set, the "template" will be used instead.
     */
    private String documentFileName;

    /*
     * Initializes a new instance of the BuildReportOnlineRequest class.
     *
     * @param byte[] template File with template.
     * @param String data A string providing a data to populate the specified template. The string must be of one of the following types: xml, json, csv.
     * @param ReportEngineSettings reportEngineSettings An object providing a settings of report engine.
     * @param String documentFileName The filename of the output document, that will be used when the resulting document has a dynamic field {filename}. If it is not set, the "template" will be used instead.
     */
    public BuildReportOnlineRequest(byte[] template, String data, ReportEngineSettings reportEngineSettings, String documentFileName) {
        this.template = template;
        this.data = data;
        this.reportEngineSettings = reportEngineSettings;
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
     * Gets A string providing a data to populate the specified template. The string must be of one of the following types: xml, json, csv.
     */
    public String getData() {
        return this.data;
    }

    /*
     * Sets A string providing a data to populate the specified template. The string must be of one of the following types: xml, json, csv.
     */
    public void setData(String value) {
        this.data = value;
    }

    /*
     * Gets An object providing a settings of report engine.
     */
    public ReportEngineSettings getReportEngineSettings() {
        return this.reportEngineSettings;
    }

    /*
     * Sets An object providing a settings of report engine.
     */
    public void setReportEngineSettings(ReportEngineSettings value) {
        this.reportEngineSettings = value;
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
    public Request buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException, IOException {
        // verify the required parameter 'Template' is set
        if (getTemplate() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'Template' when calling buildReportOnline");
        }

        // verify the required parameter 'Data' is set
        if (getData() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'Data' when calling buildReportOnline");
        }

        // verify the required parameter 'ReportEngineSettings' is set
        if (getReportEngineSettings() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'ReportEngineSettings' when calling buildReportOnline");
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/buildReport";
        localVarPath = localVarPath.replaceAll("//", "/");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        apiClient.addParameterToQuery(localVarQueryParams, "documentFileName", getDocumentFileName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (getTemplate() != null)
            localVarFormParams.put("Template", getTemplate());

        if (getData() != null)
            localVarFormParams.put("Data", getData());

        if (getReportEngineSettings() != null)
            localVarFormParams.put("ReportEngineSettings", getReportEngineSettings());

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

    /*
     * Deserialize response message.
     *
     * @param apiClient ApiClient instance
     * @param response Response instance
     */
    public File deserializeResponse(ApiClient apiClient, Response response) throws ApiException, MessagingException, IOException {
        return apiClient.downloadFileFromResponse(response);
    }
}
