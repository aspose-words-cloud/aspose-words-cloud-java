/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="MoveFileRequest.java">
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
 * Request model for moveFile operation.
 */
public class MoveFileRequest implements RequestIfc {
    /*
     * Destination file path e.g. '/dest.ext'.
     */
    private String destPath;

    /*
     * Source file's path e.g. '/Folder 1/file.ext' or '/Bucket/Folder 1/file.ext'.
     */
    private String srcPath;

    /*
     * Source storage name.
     */
    private String srcStorageName;

    /*
     * Destination storage name.
     */
    private String destStorageName;

    /*
     * File version ID to move.
     */
    private String versionId;

    /*
     * Initializes a new instance of the MoveFileRequest class.
     *
     * @param String destPath Destination file path e.g. '/dest.ext'.
     * @param String srcPath Source file's path e.g. '/Folder 1/file.ext' or '/Bucket/Folder 1/file.ext'.
     * @param String srcStorageName Source storage name.
     * @param String destStorageName Destination storage name.
     * @param String versionId File version ID to move.
     */
    public MoveFileRequest(String destPath, String srcPath, String srcStorageName, String destStorageName, String versionId) {
        this.destPath = destPath;
        this.srcPath = srcPath;
        this.srcStorageName = srcStorageName;
        this.destStorageName = destStorageName;
        this.versionId = versionId;
    }

    /*
     * Gets Destination file path e.g. '/dest.ext'.
     */
    public String getDestPath() {
        return this.destPath;
    }

    /*
     * Sets Destination file path e.g. '/dest.ext'.
     */
    public void setDestPath(String value) {
        this.destPath = value;
    }

    /*
     * Gets Source file's path e.g. '/Folder 1/file.ext' or '/Bucket/Folder 1/file.ext'.
     */
    public String getSrcPath() {
        return this.srcPath;
    }

    /*
     * Sets Source file's path e.g. '/Folder 1/file.ext' or '/Bucket/Folder 1/file.ext'.
     */
    public void setSrcPath(String value) {
        this.srcPath = value;
    }

    /*
     * Gets Source storage name.
     */
    public String getSrcStorageName() {
        return this.srcStorageName;
    }

    /*
     * Sets Source storage name.
     */
    public void setSrcStorageName(String value) {
        this.srcStorageName = value;
    }

    /*
     * Gets Destination storage name.
     */
    public String getDestStorageName() {
        return this.destStorageName;
    }

    /*
     * Sets Destination storage name.
     */
    public void setDestStorageName(String value) {
        this.destStorageName = value;
    }

    /*
     * Gets File version ID to move.
     */
    public String getVersionId() {
        return this.versionId;
    }

    /*
     * Sets File version ID to move.
     */
    public void setVersionId(String value) {
        this.versionId = value;
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
        // verify the required parameter 'DestPath' is set
        if (getDestPath() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'DestPath' when calling moveFile");
        }

        // verify the required parameter 'SrcPath' is set
        if (getSrcPath() == null) {
            throw new ApiException(apiClient.getBadRequestCode(), "Missing the required parameter 'SrcPath' when calling moveFile");
        }

        // create path and map variables
        String localVarPath = "/words/storage/file/move/{srcPath}";
        localVarPath = apiClient.addParameterToPath(localVarPath, "srcPath", getSrcPath());
        localVarPath = localVarPath.replaceAll("//", "/");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        apiClient.addParameterToQuery(localVarQueryParams, "destPath", getDestPath());
        apiClient.addParameterToQuery(localVarQueryParams, "srcStorageName", getSrcStorageName());
        apiClient.addParameterToQuery(localVarQueryParams, "destStorageName", getDestStorageName());
        apiClient.addParameterToQuery(localVarQueryParams, "versionId", getVersionId());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        List<FileReference> localFilesContentParams = new ArrayList<FileReference>();
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

        return apiClient.buildRequest(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarHeaderParams, localVarFormParams, localFilesContentParams, addAuthHeaders, progressRequestListener);
    }

    /*
     * Deserialize response message.
     *
     * @param apiClient ApiClient instance
     * @param response Response instance
     */
    @Override
    public Object deserializeResponse(ApiClient apiClient, Response response) throws ApiException, MessagingException, IOException {
        if (response != null) {
            ResponseBody body = response.body();
            if (body != null) {
                body.close();
            }
        }

        return null;
    }
}
