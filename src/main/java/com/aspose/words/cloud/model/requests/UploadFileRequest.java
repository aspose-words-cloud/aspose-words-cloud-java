/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="UploadFileRequest.java">
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
 * Request model for uploadFile operation.
 */
public class UploadFileRequest implements RequestIfc {
    /*
     * File to upload.
     */
    private byte[] fileContent;

    /*
     * Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext
     * If the content is multipart and path does not contains the file name it tries to get them from filename parameter
     * from Content-Disposition header.
     */
    private String path;

    /*
     * Storage name.
     */
    private String storageName;

    /*
     * Initializes a new instance of the UploadFileRequest class.
     *
     * @param byte[] fileContent File to upload.
     * @param String path Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext If the content is multipart and path does not contains the file name it tries to get them from filename parameter from Content-Disposition header.
     * @param String storageName Storage name.
     */
    public UploadFileRequest(byte[] fileContent, String path, String storageName) {
        this.fileContent = fileContent;
        this.path = path;
        this.storageName = storageName;
    }

    /*
     * Gets File to upload.
     */
    public byte[] getFileContent() {
        return this.fileContent;
    }

    /*
     * Sets File to upload.
     */
    public void setFileContent(byte[] value) {
        this.fileContent = value;
    }

    /*
     * Gets Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext If the content is multipart and path does not contains the file name it tries to get them from filename parameter from Content-Disposition header.
     */
    public String getPath() {
        return this.path;
    }

    /*
     * Sets Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext If the content is multipart and path does not contains the file name it tries to get them from filename parameter from Content-Disposition header.
     */
    public void setPath(String value) {
        this.path = value;
    }

    /*
     * Gets Storage name.
     */
    public String getStorageName() {
        return this.storageName;
    }

    /*
     * Sets Storage name.
     */
    public void setStorageName(String value) {
        this.storageName = value;
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
        // verify the required parameter 'FileContent' is set
        if (getFileContent() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'FileContent' when calling uploadFile");
        }

        // verify the required parameter 'Path' is set
        if (getPath() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'Path' when calling uploadFile");
        }

        // create path and map variables
        String localVarPath = "/words/storage/file/{path}";
        localVarPath = apiClient.addParameterToPath(localVarPath, "path", getPath());
        localVarPath = localVarPath.replaceAll("//", "/");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        apiClient.addParameterToQuery(localVarQueryParams, "storageName", getStorageName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        List<FileReference> localFilesContentParams = new ArrayList<FileReference>();
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (getFileContent() != null) {
            localVarFormParams.put("FileContent", getFileContent());
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
    public FilesUploadResult deserializeResponse(ApiClient apiClient, Response response) throws ApiException, MessagingException, IOException {
        return (FilesUploadResult) apiClient.deserialize(response, FilesUploadResult.class);
    }
}
