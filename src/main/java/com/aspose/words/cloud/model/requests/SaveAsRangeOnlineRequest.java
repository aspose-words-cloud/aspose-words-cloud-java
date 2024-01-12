/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SaveAsRangeOnlineRequest.java">
 *   Copyright (c) 2024 Aspose.Words for Cloud
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
     * The range start identifier. Identifier examples: id0.0.0, page0.
     */
    private String rangeStartIdentifier;

    /*
     * Parameters of a new document.
     */
    private RangeDocument documentParameters;

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
     * Initializes a new instance of the SaveAsRangeOnlineRequest class.
     *
     * @param byte[] document The document.
     * @param String rangeStartIdentifier The range start identifier. Identifier examples: id0.0.0, page0.
     * @param RangeDocument documentParameters Parameters of a new document.
     * @param String rangeEndIdentifier The range end identifier. Identifier examples: id1.0.0, id0.0.0:end, page1, page1:end, document:end.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password of protected Word document. Use the parameter to pass a password via SDK. SDK encrypts it automatically. We don't recommend to use the parameter to pass a plain password for direct call of API.
     * @param String encryptedPassword Password of protected Word document. Use the parameter to pass an encrypted password for direct calls of API. See SDK code for encyption details.
     */
    public SaveAsRangeOnlineRequest(byte[] document, String rangeStartIdentifier, RangeDocument documentParameters, String rangeEndIdentifier, String loadEncoding, String password, String encryptedPassword) {
        this.document = document;
        this.rangeStartIdentifier = rangeStartIdentifier;
        this.documentParameters = documentParameters;
        this.rangeEndIdentifier = rangeEndIdentifier;
        this.loadEncoding = loadEncoding;
        this.password = password;
        this.encryptedPassword = encryptedPassword;
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
        if (getDocumentParameters() != null) {
            getDocumentParameters().validate();
        }










        // create path and map variables
        String localVarPath = "/words/online/post/range/{rangeStartIdentifier}/{rangeEndIdentifier}/SaveAs";
        localVarPath = apiClient.addParameterToPath(localVarPath, "rangeStartIdentifier", getRangeStartIdentifier());
        localVarPath = apiClient.addParameterToPath(localVarPath, "rangeEndIdentifier", getRangeEndIdentifier());
        localVarPath = localVarPath.replaceAll("//", "/");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        apiClient.addParameterToQuery(localVarQueryParams, "loadEncoding", getLoadEncoding());
        apiClient.addParameterToQuery(localVarQueryParams, "password", getPassword());
        apiClient.addParameterToQuery(localVarQueryParams, "encryptedPassword", getEncryptedPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        List<FileReference> localFilesContentParams = new ArrayList<FileReference>();
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (getDocument() != null) {
            localVarFormParams.put("Document", getDocument());
        }

        if (getDocumentParameters() != null) {
            localVarFormParams.put("DocumentParameters", getDocumentParameters());
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
    public SaveAsRangeOnlineResponse deserializeResponse(ApiClient apiClient, Response response) throws ApiException, MessagingException, IOException {
        MimeMultipart multipart = apiClient.getMultipartFromResponse(response);
        return new SaveAsRangeOnlineResponse(
            (DocumentResponse) apiClient.parseModel(apiClient.findBodyPartInMultipart("Model", multipart), DocumentResponse.class),
            apiClient.parseFilesCollection(apiClient.findBodyPartInMultipart("Document", multipart))
        );
    }
}
