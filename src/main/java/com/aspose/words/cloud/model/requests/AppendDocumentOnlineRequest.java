/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AppendDocumentOnlineRequest.java">
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
 * Request model for appendDocumentOnline operation.
 */
public class AppendDocumentOnlineRequest implements RequestIfc {
    /*
     * Original document.
     */
    private byte[] document;

    /*
     * <see cref="BaseEntryList"/> with a list of entries to append.
     */
    private BaseEntryList documentList;

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
     * Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
     */
    private String revisionAuthor;

    /*
     * The date and time to use for revisions.
     */
    private String revisionDateTime;

    /*
     * Initializes a new instance of the AppendDocumentOnlineRequest class.
     *
     * @param byte[] document Original document.
     * @param BaseEntryList documentList <see cref="BaseEntryList"/> with a list of entries to append.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password of protected Word document. Use the parameter to pass a password via SDK. SDK encrypts it automatically. We don't recommend to use the parameter to pass a plain password for direct call of API.
     * @param String encryptedPassword Password of protected Word document. Use the parameter to pass an encrypted password for direct calls of API. See SDK code for encyption details.
     * @param Boolean openTypeSupport The value indicates whether OpenType support is on.
     * @param String destFileName Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     * @param String revisionAuthor Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
     * @param String revisionDateTime The date and time to use for revisions.
     */
    public AppendDocumentOnlineRequest(byte[] document, BaseEntryList documentList, String loadEncoding, String password, String encryptedPassword, Boolean openTypeSupport, String destFileName, String revisionAuthor, String revisionDateTime) {
        this.document = document;
        this.documentList = documentList;
        this.loadEncoding = loadEncoding;
        this.password = password;
        this.encryptedPassword = encryptedPassword;
        this.openTypeSupport = openTypeSupport;
        this.destFileName = destFileName;
        this.revisionAuthor = revisionAuthor;
        this.revisionDateTime = revisionDateTime;
    }

    /*
     * Gets Original document.
     */
    public byte[] getDocument() {
        return this.document;
    }

    /*
     * Sets Original document.
     */
    public void setDocument(byte[] value) {
        this.document = value;
    }

    /*
     * Gets <see cref="BaseEntryList"/> with a list of entries to append.
     */
    public BaseEntryList getDocumentList() {
        return this.documentList;
    }

    /*
     * Sets <see cref="BaseEntryList"/> with a list of entries to append.
     */
    public void setDocumentList(BaseEntryList value) {
        this.documentList = value;
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
     * Gets Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
     */
    public String getRevisionAuthor() {
        return this.revisionAuthor;
    }

    /*
     * Sets Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
     */
    public void setRevisionAuthor(String value) {
        this.revisionAuthor = value;
    }

    /*
     * Gets The date and time to use for revisions.
     */
    public String getRevisionDateTime() {
        return this.revisionDateTime;
    }

    /*
     * Sets The date and time to use for revisions.
     */
    public void setRevisionDateTime(String value) {
        this.revisionDateTime = value;
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
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'Document' when calling appendDocumentOnline");
        }

        // verify the required parameter 'DocumentList' is set
        if (getDocumentList() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'DocumentList' when calling appendDocumentOnline");
        }
        if (getDocumentList() != null) {
            getDocumentList().validate();
        }
















        // create path and map variables
        String localVarPath = "/words/online/put/appendDocument";
        localVarPath = localVarPath.replaceAll("//", "/");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        apiClient.addParameterToQuery(localVarQueryParams, "loadEncoding", getLoadEncoding());
        apiClient.addParameterToQuery(localVarQueryParams, "password", getPassword());
        apiClient.addParameterToQuery(localVarQueryParams, "encryptedPassword", getEncryptedPassword());
        apiClient.addParameterToQuery(localVarQueryParams, "openTypeSupport", getOpenTypeSupport());
        apiClient.addParameterToQuery(localVarQueryParams, "destFileName", getDestFileName());
        apiClient.addParameterToQuery(localVarQueryParams, "revisionAuthor", getRevisionAuthor());
        apiClient.addParameterToQuery(localVarQueryParams, "revisionDateTime", getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        List<FileReference> localFilesContentParams = new ArrayList<FileReference>();
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (getDocument() != null) {
            localVarFormParams.put("Document", getDocument());
        }

        if (getDocumentList() != null) {
            getDocumentList().getFilesContent(localFilesContentParams);
            localVarFormParams.put("DocumentList", getDocumentList());
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
    public AppendDocumentOnlineResponse deserializeResponse(ApiClient apiClient, Response response) throws ApiException, MessagingException, IOException {
        MimeMultipart multipart = apiClient.getMultipartFromResponse(response);
        return new AppendDocumentOnlineResponse(
            (DocumentResponse) apiClient.parseModel(apiClient.findBodyPartInMultipart("Model", multipart), DocumentResponse.class),
            apiClient.parseFilesCollection(apiClient.findBodyPartInMultipart("Document", multipart))
        );
    }
}
