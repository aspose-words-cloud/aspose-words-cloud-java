/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SaveAsRangeOnlineRequest.java">
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
 * Request model for saveAsRangeOnline operation.
 */
public class SaveAsRangeOnlineRequest implements RequestIfc {
    /*
     * The document.
     */
    private byte[] document;

    /*
     * The range start identifier.
     */
    private String rangeStartIdentifier;

    /*
     * Parameters of a new document.
     */
    private RangeDocument documentParameters;

    /*
     * The range end identifier.
     */
    private String rangeEndIdentifier;

    /*
     * Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    private String loadEncoding;

    /*
     * Password for opening an encrypted document.
     */
    private String password;

    /*
     * Initializes a new instance of the SaveAsRangeOnlineRequest class.
     *
     * @param byte[] document The document.
     * @param String rangeStartIdentifier The range start identifier.
     * @param RangeDocument documentParameters Parameters of a new document.
     * @param String rangeEndIdentifier The range end identifier.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password for opening an encrypted document.
     */
    public SaveAsRangeOnlineRequest(byte[] document, String rangeStartIdentifier, RangeDocument documentParameters, String rangeEndIdentifier, String loadEncoding, String password) {
        this.document = document;
        this.rangeStartIdentifier = rangeStartIdentifier;
        this.documentParameters = documentParameters;
        this.rangeEndIdentifier = rangeEndIdentifier;
        this.loadEncoding = loadEncoding;
        this.password = password;
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
     * Gets The range start identifier.
     */
    public String getRangeStartIdentifier() {
        return this.rangeStartIdentifier;
    }

    /*
     * Sets The range start identifier.
     */
    public void setRangeStartIdentifier(String value) {
        this.rangeStartIdentifier = value;
    }

    /*
     * Gets Parameters of a new document.
     */
    public RangeDocument getDocumentParameters() {
        return this.documentParameters;
    }

    /*
     * Sets Parameters of a new document.
     */
    public void setDocumentParameters(RangeDocument value) {
        this.documentParameters = value;
    }

    /*
     * Gets The range end identifier.
     */
    public String getRangeEndIdentifier() {
        return this.rangeEndIdentifier;
    }

    /*
     * Sets The range end identifier.
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
     * Creates the http request based on this request model.
     *
     * @param apiClient ApiClient instance
     * @throws ApiException If fail to serialize the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public Request buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException, IOException {
        // verify the required parameter 'Document' is set
        if (getDocument() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'Document' when calling saveAsRangeOnline");
        }

        // verify the required parameter 'RangeStartIdentifier' is set
        if (getRangeStartIdentifier() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'RangeStartIdentifier' when calling saveAsRangeOnline");
        }

        // verify the required parameter 'DocumentParameters' is set
        if (getDocumentParameters() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'DocumentParameters' when calling saveAsRangeOnline");
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/online/post/range/{rangeStartIdentifier}/{rangeEndIdentifier}/SaveAs";
        localVarPath = apiClient.addParameterToPath(localVarPath, "rangeStartIdentifier", getRangeStartIdentifier());
        localVarPath = apiClient.addParameterToPath(localVarPath, "rangeEndIdentifier", getRangeEndIdentifier());
        localVarPath = localVarPath.replaceAll("//", "/");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        apiClient.addParameterToQuery(localVarQueryParams, "loadEncoding", getLoadEncoding());
        apiClient.addParameterToQuery(localVarQueryParams, "password", getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (getDocument() != null)
            localVarFormParams.put("Document", getDocument());

        if (getDocumentParameters() != null)
            localVarFormParams.put("DocumentParameters", getDocumentParameters());

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
        return SaveAsRangeOnlineResponse.class;
    }

    /*
     * Deserialize response message.
     *
     * @param apiClient ApiClient instance
     * @param response Response instance
     */
    public SaveAsRangeOnlineResponse deserializeResponse(ApiClient apiClient, Response response) throws ApiException, MessagingException, IOException {
        MimeMultipart multipart = apiClient.getMultipartFromResponse(response);
        return new SaveAsRangeOnlineResponse(
            (DocumentResponse) apiClient.parseModel(multipart.getBodyPart(0), DocumentResponse.class),
            apiClient.parseDocument(multipart.getBodyPart(1))
        );
    }
}
