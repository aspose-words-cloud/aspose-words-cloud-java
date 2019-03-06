/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Words for Cloud
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

package com.aspose.words.cloud.api;

import com.aspose.words.cloud.*;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.File;
import java.lang.reflect.Type;
import java.util.*;


public class WordsApi {
    private Integer NotAuth = 401;
    private Integer BadRequest = 400;
    private ApiClient apiClient;

    public WordsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WordsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for acceptAllRevisions
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call acceptAllRevisionsCall(AcceptAllRevisionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/revisions/acceptAll"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call acceptAllRevisionsValidateBeforeCall(AcceptAllRevisionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling acceptAllRevisions");
        }
        

        com.squareup.okhttp.Call call = acceptAllRevisionsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Accept all revisions in document
     * 
     * @return RevisionsModificationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RevisionsModificationResponse acceptAllRevisions(AcceptAllRevisionsRequest request) throws ApiException {
        try {
            ApiResponse<RevisionsModificationResponse> resp = acceptAllRevisionsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<RevisionsModificationResponse> resp = acceptAllRevisionsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Accept all revisions in document
     * 
     * @return ApiResponse&lt;RevisionsModificationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<RevisionsModificationResponse> acceptAllRevisionsWithHttpInfo(AcceptAllRevisionsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = acceptAllRevisionsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<RevisionsModificationResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Accept all revisions in document (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call acceptAllRevisionsAsync(AcceptAllRevisionsRequest request, final ApiCallback<RevisionsModificationResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = acceptAllRevisionsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RevisionsModificationResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for classify
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call classifyCall(ClassifyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getText();

        // create path and map variables
        String localVarPath = "/words/classify";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "bestClassesCount", request.getBestClassesCount());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call classifyValidateBeforeCall(ClassifyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Text' is set
        if (request.getText() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Text' when calling classify");
        }
        

        com.squareup.okhttp.Call call = classifyCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Classify raw text.
     * 
     * @return ClassificationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ClassificationResponse classify(ClassifyRequest request) throws ApiException {
        try {
            ApiResponse<ClassificationResponse> resp = classifyWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<ClassificationResponse> resp = classifyWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Classify raw text.
     * 
     * @return ApiResponse&lt;ClassificationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<ClassificationResponse> classifyWithHttpInfo(ClassifyRequest request) throws ApiException {
        com.squareup.okhttp.Call call = classifyValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ClassificationResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Classify raw text. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call classifyAsync(ClassifyRequest request, final ApiCallback<ClassificationResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = classifyValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ClassificationResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for classifyDocument
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call classifyDocumentCall(ClassifyDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{documentName}/classify"
            .replaceAll("\\{" + "documentName" + "\\}", apiClient.escapeString(request.getDocumentName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "bestClassesCount", request.getBestClassesCount());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "taxonomy", request.getTaxonomy());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call classifyDocumentValidateBeforeCall(ClassifyDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'DocumentName' is set
        if (request.getDocumentName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'DocumentName' when calling classifyDocument");
        }
        

        com.squareup.okhttp.Call call = classifyDocumentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Classify document.
     * 
     * @return ClassificationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ClassificationResponse classifyDocument(ClassifyDocumentRequest request) throws ApiException {
        try {
            ApiResponse<ClassificationResponse> resp = classifyDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<ClassificationResponse> resp = classifyDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Classify document.
     * 
     * @return ApiResponse&lt;ClassificationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<ClassificationResponse> classifyDocumentWithHttpInfo(ClassifyDocumentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = classifyDocumentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ClassificationResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Classify document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call classifyDocumentAsync(ClassifyDocumentRequest request, final ApiCallback<ClassificationResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = classifyDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ClassificationResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createOrUpdateDocumentProperty
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call createOrUpdateDocumentPropertyCall(CreateOrUpdateDocumentPropertyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getProperty();

        // create path and map variables
        String localVarPath = "/words/{name}/documentProperties/{propertyName}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "propertyName" + "\\}", apiClient.escapeString(request.getPropertyName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createOrUpdateDocumentPropertyValidateBeforeCall(CreateOrUpdateDocumentPropertyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling createOrUpdateDocumentProperty");
        }
        
        // verify the required parameter 'PropertyName' is set
        if (request.getPropertyName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'PropertyName' when calling createOrUpdateDocumentProperty");
        }
        
        // verify the required parameter 'Property' is set
        if (request.getProperty() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Property' when calling createOrUpdateDocumentProperty");
        }
        

        com.squareup.okhttp.Call call = createOrUpdateDocumentPropertyCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add new or update existing document property.
     * 
     * @return DocumentPropertyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentPropertyResponse createOrUpdateDocumentProperty(CreateOrUpdateDocumentPropertyRequest request) throws ApiException {
        try {
            ApiResponse<DocumentPropertyResponse> resp = createOrUpdateDocumentPropertyWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<DocumentPropertyResponse> resp = createOrUpdateDocumentPropertyWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Add new or update existing document property.
     * 
     * @return ApiResponse&lt;DocumentPropertyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DocumentPropertyResponse> createOrUpdateDocumentPropertyWithHttpInfo(CreateOrUpdateDocumentPropertyRequest request) throws ApiException {
        com.squareup.okhttp.Call call = createOrUpdateDocumentPropertyValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentPropertyResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add new or update existing document property. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createOrUpdateDocumentPropertyAsync(CreateOrUpdateDocumentPropertyRequest request, final ApiCallback<DocumentPropertyResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createOrUpdateDocumentPropertyValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentPropertyResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteBorder
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteBorderCall(DeleteBorderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/borders/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "nodePath" + "\\}", apiClient.escapeString(request.getNodePath().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteBorderValidateBeforeCall(DeleteBorderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteBorder");
        }
        
        // verify the required parameter 'NodePath' is set
        if (request.getNodePath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'NodePath' when calling deleteBorder");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling deleteBorder");
        }
        

        com.squareup.okhttp.Call call = deleteBorderCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Resets border properties to default values.             
     * &#39;nodePath&#39; should refer to node with cell or row
     * @return BorderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BorderResponse deleteBorder(DeleteBorderRequest request) throws ApiException {
        try {
            ApiResponse<BorderResponse> resp = deleteBorderWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<BorderResponse> resp = deleteBorderWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Resets border properties to default values.             
     * &#39;nodePath&#39; should refer to node with cell or row
     * @return ApiResponse&lt;BorderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<BorderResponse> deleteBorderWithHttpInfo(DeleteBorderRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteBorderValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<BorderResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Resets border properties to default values.              (asynchronously)
     * &#39;nodePath&#39; should refer to node with cell or row
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteBorderAsync(DeleteBorderRequest request, final ApiCallback<BorderResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteBorderValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BorderResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteBorders
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteBordersCall(DeleteBordersRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/borders"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "nodePath" + "\\}", apiClient.escapeString(request.getNodePath().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteBordersValidateBeforeCall(DeleteBordersRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteBorders");
        }
        
        // verify the required parameter 'NodePath' is set
        if (request.getNodePath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'NodePath' when calling deleteBorders");
        }
        

        com.squareup.okhttp.Call call = deleteBordersCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Resets borders properties to default values.             
     * &#39;nodePath&#39; should refer to node with cell or row
     * @return BordersResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BordersResponse deleteBorders(DeleteBordersRequest request) throws ApiException {
        try {
            ApiResponse<BordersResponse> resp = deleteBordersWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<BordersResponse> resp = deleteBordersWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Resets borders properties to default values.             
     * &#39;nodePath&#39; should refer to node with cell or row
     * @return ApiResponse&lt;BordersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<BordersResponse> deleteBordersWithHttpInfo(DeleteBordersRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteBordersValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<BordersResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Resets borders properties to default values.              (asynchronously)
     * &#39;nodePath&#39; should refer to node with cell or row
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteBordersAsync(DeleteBordersRequest request, final ApiCallback<BordersResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteBordersValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BordersResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteComment
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteCommentCall(DeleteCommentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/comments/{commentIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "commentIndex" + "\\}", apiClient.escapeString(request.getCommentIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteCommentValidateBeforeCall(DeleteCommentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteComment");
        }
        
        // verify the required parameter 'CommentIndex' is set
        if (request.getCommentIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'CommentIndex' when calling deleteComment");
        }
        

        com.squareup.okhttp.Call call = deleteCommentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Remove comment from document.
     * 
     * @return AsposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsposeResponse deleteComment(DeleteCommentRequest request) throws ApiException {
        try {
            ApiResponse<AsposeResponse> resp = deleteCommentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<AsposeResponse> resp = deleteCommentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Remove comment from document.
     * 
     * @return ApiResponse&lt;AsposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AsposeResponse> deleteCommentWithHttpInfo(DeleteCommentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteCommentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Remove comment from document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteCommentAsync(DeleteCommentRequest request, final ApiCallback<AsposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteCommentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteDocumentMacros
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteDocumentMacrosCall(DeleteDocumentMacrosRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/macros"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteDocumentMacrosValidateBeforeCall(DeleteDocumentMacrosRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteDocumentMacros");
        }
        

        com.squareup.okhttp.Call call = deleteDocumentMacrosCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Remove macros from document.
     * 
     * @return AsposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsposeResponse deleteDocumentMacros(DeleteDocumentMacrosRequest request) throws ApiException {
        try {
            ApiResponse<AsposeResponse> resp = deleteDocumentMacrosWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<AsposeResponse> resp = deleteDocumentMacrosWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Remove macros from document.
     * 
     * @return ApiResponse&lt;AsposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AsposeResponse> deleteDocumentMacrosWithHttpInfo(DeleteDocumentMacrosRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteDocumentMacrosValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Remove macros from document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteDocumentMacrosAsync(DeleteDocumentMacrosRequest request, final ApiCallback<AsposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteDocumentMacrosValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteDocumentProperty
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteDocumentPropertyCall(DeleteDocumentPropertyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/documentProperties/{propertyName}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "propertyName" + "\\}", apiClient.escapeString(request.getPropertyName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteDocumentPropertyValidateBeforeCall(DeleteDocumentPropertyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteDocumentProperty");
        }
        
        // verify the required parameter 'PropertyName' is set
        if (request.getPropertyName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'PropertyName' when calling deleteDocumentProperty");
        }
        

        com.squareup.okhttp.Call call = deleteDocumentPropertyCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete document property.
     * 
     * @return AsposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsposeResponse deleteDocumentProperty(DeleteDocumentPropertyRequest request) throws ApiException {
        try {
            ApiResponse<AsposeResponse> resp = deleteDocumentPropertyWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<AsposeResponse> resp = deleteDocumentPropertyWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Delete document property.
     * 
     * @return ApiResponse&lt;AsposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AsposeResponse> deleteDocumentPropertyWithHttpInfo(DeleteDocumentPropertyRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteDocumentPropertyValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete document property. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteDocumentPropertyAsync(DeleteDocumentPropertyRequest request, final ApiCallback<AsposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteDocumentPropertyValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteDocumentWatermark
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteDocumentWatermarkCall(DeleteDocumentWatermarkRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/watermark"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteDocumentWatermarkValidateBeforeCall(DeleteDocumentWatermarkRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteDocumentWatermark");
        }
        

        com.squareup.okhttp.Call call = deleteDocumentWatermarkCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete watermark (for deleting last watermark from the document).
     * 
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse deleteDocumentWatermark(DeleteDocumentWatermarkRequest request) throws ApiException {
        try {
            ApiResponse<DocumentResponse> resp = deleteDocumentWatermarkWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<DocumentResponse> resp = deleteDocumentWatermarkWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Delete watermark (for deleting last watermark from the document).
     * 
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DocumentResponse> deleteDocumentWatermarkWithHttpInfo(DeleteDocumentWatermarkRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteDocumentWatermarkValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete watermark (for deleting last watermark from the document). (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteDocumentWatermarkAsync(DeleteDocumentWatermarkRequest request, final ApiCallback<DocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteDocumentWatermarkValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteDrawingObject
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteDrawingObjectCall(DeleteDrawingObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/drawingObjects/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteDrawingObjectValidateBeforeCall(DeleteDrawingObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteDrawingObject");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling deleteDrawingObject");
        }
        

        com.squareup.okhttp.Call call = deleteDrawingObjectCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Removes drawing object from document.
     * 
     * @return AsposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsposeResponse deleteDrawingObject(DeleteDrawingObjectRequest request) throws ApiException {
        try {
            ApiResponse<AsposeResponse> resp = deleteDrawingObjectWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<AsposeResponse> resp = deleteDrawingObjectWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Removes drawing object from document.
     * 
     * @return ApiResponse&lt;AsposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AsposeResponse> deleteDrawingObjectWithHttpInfo(DeleteDrawingObjectRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteDrawingObjectValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Removes drawing object from document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteDrawingObjectAsync(DeleteDrawingObjectRequest request, final ApiCallback<AsposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteDrawingObjectValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteField
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteFieldCall(DeleteFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/fields/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFieldValidateBeforeCall(DeleteFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteField");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling deleteField");
        }
        

        com.squareup.okhttp.Call call = deleteFieldCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete field from document.
     * 
     * @return AsposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsposeResponse deleteField(DeleteFieldRequest request) throws ApiException {
        try {
            ApiResponse<AsposeResponse> resp = deleteFieldWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<AsposeResponse> resp = deleteFieldWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Delete field from document.
     * 
     * @return ApiResponse&lt;AsposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AsposeResponse> deleteFieldWithHttpInfo(DeleteFieldRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteFieldValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete field from document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFieldAsync(DeleteFieldRequest request, final ApiCallback<AsposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteFieldValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteFields
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteFieldsCall(DeleteFieldsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/fields"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFieldsValidateBeforeCall(DeleteFieldsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteFields");
        }
        

        com.squareup.okhttp.Call call = deleteFieldsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Remove fields from section paragraph.
     * 
     * @return AsposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsposeResponse deleteFields(DeleteFieldsRequest request) throws ApiException {
        try {
            ApiResponse<AsposeResponse> resp = deleteFieldsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<AsposeResponse> resp = deleteFieldsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Remove fields from section paragraph.
     * 
     * @return ApiResponse&lt;AsposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AsposeResponse> deleteFieldsWithHttpInfo(DeleteFieldsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteFieldsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Remove fields from section paragraph. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFieldsAsync(DeleteFieldsRequest request, final ApiCallback<AsposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteFieldsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteFootnote
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteFootnoteCall(DeleteFootnoteRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/footnotes/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFootnoteValidateBeforeCall(DeleteFootnoteRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteFootnote");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling deleteFootnote");
        }
        

        com.squareup.okhttp.Call call = deleteFootnoteCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Removes footnote from document.
     * 
     * @return AsposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsposeResponse deleteFootnote(DeleteFootnoteRequest request) throws ApiException {
        try {
            ApiResponse<AsposeResponse> resp = deleteFootnoteWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<AsposeResponse> resp = deleteFootnoteWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Removes footnote from document.
     * 
     * @return ApiResponse&lt;AsposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AsposeResponse> deleteFootnoteWithHttpInfo(DeleteFootnoteRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteFootnoteValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Removes footnote from document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFootnoteAsync(DeleteFootnoteRequest request, final ApiCallback<AsposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteFootnoteValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteFormField
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteFormFieldCall(DeleteFormFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/formfields/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFormFieldValidateBeforeCall(DeleteFormFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteFormField");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling deleteFormField");
        }
        

        com.squareup.okhttp.Call call = deleteFormFieldCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Removes form field from document.
     * 
     * @return AsposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsposeResponse deleteFormField(DeleteFormFieldRequest request) throws ApiException {
        try {
            ApiResponse<AsposeResponse> resp = deleteFormFieldWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<AsposeResponse> resp = deleteFormFieldWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Removes form field from document.
     * 
     * @return ApiResponse&lt;AsposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AsposeResponse> deleteFormFieldWithHttpInfo(DeleteFormFieldRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteFormFieldValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Removes form field from document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFormFieldAsync(DeleteFormFieldRequest request, final ApiCallback<AsposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteFormFieldValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteHeaderFooter
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteHeaderFooterCall(DeleteHeaderFooterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{sectionPath}/headersfooters/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "sectionPath", request.getSectionPath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteHeaderFooterValidateBeforeCall(DeleteHeaderFooterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteHeaderFooter");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling deleteHeaderFooter");
        }
        

        com.squareup.okhttp.Call call = deleteHeaderFooterCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete header/footer from document.
     * 
     * @return AsposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsposeResponse deleteHeaderFooter(DeleteHeaderFooterRequest request) throws ApiException {
        try {
            ApiResponse<AsposeResponse> resp = deleteHeaderFooterWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<AsposeResponse> resp = deleteHeaderFooterWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Delete header/footer from document.
     * 
     * @return ApiResponse&lt;AsposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AsposeResponse> deleteHeaderFooterWithHttpInfo(DeleteHeaderFooterRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteHeaderFooterValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete header/footer from document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteHeaderFooterAsync(DeleteHeaderFooterRequest request, final ApiCallback<AsposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteHeaderFooterValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteHeadersFooters
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteHeadersFootersCall(DeleteHeadersFootersRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{sectionPath}/headersfooters"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "sectionPath", request.getSectionPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "headersFootersTypes", request.getHeadersFootersTypes());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteHeadersFootersValidateBeforeCall(DeleteHeadersFootersRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteHeadersFooters");
        }
        

        com.squareup.okhttp.Call call = deleteHeadersFootersCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete document headers and footers.
     * 
     * @return AsposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsposeResponse deleteHeadersFooters(DeleteHeadersFootersRequest request) throws ApiException {
        try {
            ApiResponse<AsposeResponse> resp = deleteHeadersFootersWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<AsposeResponse> resp = deleteHeadersFootersWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Delete document headers and footers.
     * 
     * @return ApiResponse&lt;AsposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AsposeResponse> deleteHeadersFootersWithHttpInfo(DeleteHeadersFootersRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteHeadersFootersValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete document headers and footers. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteHeadersFootersAsync(DeleteHeadersFootersRequest request, final ApiCallback<AsposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteHeadersFootersValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteOfficeMathObject
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteOfficeMathObjectCall(DeleteOfficeMathObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/OfficeMathObjects/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteOfficeMathObjectValidateBeforeCall(DeleteOfficeMathObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteOfficeMathObject");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling deleteOfficeMathObject");
        }
        

        com.squareup.okhttp.Call call = deleteOfficeMathObjectCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Removes OfficeMath object from document.
     * 
     * @return AsposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsposeResponse deleteOfficeMathObject(DeleteOfficeMathObjectRequest request) throws ApiException {
        try {
            ApiResponse<AsposeResponse> resp = deleteOfficeMathObjectWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<AsposeResponse> resp = deleteOfficeMathObjectWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Removes OfficeMath object from document.
     * 
     * @return ApiResponse&lt;AsposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AsposeResponse> deleteOfficeMathObjectWithHttpInfo(DeleteOfficeMathObjectRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteOfficeMathObjectValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Removes OfficeMath object from document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteOfficeMathObjectAsync(DeleteOfficeMathObjectRequest request, final ApiCallback<AsposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteOfficeMathObjectValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteParagraph
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteParagraphCall(DeleteParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/paragraphs/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteParagraphValidateBeforeCall(DeleteParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteParagraph");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling deleteParagraph");
        }
        

        com.squareup.okhttp.Call call = deleteParagraphCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Remove paragraph from section.
     * 
     * @return AsposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsposeResponse deleteParagraph(DeleteParagraphRequest request) throws ApiException {
        try {
            ApiResponse<AsposeResponse> resp = deleteParagraphWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<AsposeResponse> resp = deleteParagraphWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Remove paragraph from section.
     * 
     * @return ApiResponse&lt;AsposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AsposeResponse> deleteParagraphWithHttpInfo(DeleteParagraphRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteParagraphValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Remove paragraph from section. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteParagraphAsync(DeleteParagraphRequest request, final ApiCallback<AsposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteParagraphValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteRun
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteRunCall(DeleteRunRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{paragraphPath}/runs/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "paragraphPath" + "\\}", apiClient.escapeString(request.getParagraphPath().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteRunValidateBeforeCall(DeleteRunRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteRun");
        }
        
        // verify the required parameter 'ParagraphPath' is set
        if (request.getParagraphPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'ParagraphPath' when calling deleteRun");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling deleteRun");
        }
        

        com.squareup.okhttp.Call call = deleteRunCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Removes run from document.
     * 
     * @return AsposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsposeResponse deleteRun(DeleteRunRequest request) throws ApiException {
        try {
            ApiResponse<AsposeResponse> resp = deleteRunWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<AsposeResponse> resp = deleteRunWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Removes run from document.
     * 
     * @return ApiResponse&lt;AsposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AsposeResponse> deleteRunWithHttpInfo(DeleteRunRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteRunValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Removes run from document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteRunAsync(DeleteRunRequest request, final ApiCallback<AsposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteRunValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteTable
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteTableCall(DeleteTableRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/tables/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteTableValidateBeforeCall(DeleteTableRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteTable");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling deleteTable");
        }
        

        com.squareup.okhttp.Call call = deleteTableCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a table.
     * 
     * @return AsposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsposeResponse deleteTable(DeleteTableRequest request) throws ApiException {
        try {
            ApiResponse<AsposeResponse> resp = deleteTableWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<AsposeResponse> resp = deleteTableWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Delete a table.
     * 
     * @return ApiResponse&lt;AsposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AsposeResponse> deleteTableWithHttpInfo(DeleteTableRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteTableValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a table. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTableAsync(DeleteTableRequest request, final ApiCallback<AsposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteTableValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteTableCell
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteTableCellCall(DeleteTableCellRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{tableRowPath}/cells/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "tableRowPath" + "\\}", apiClient.escapeString(request.getTableRowPath().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteTableCellValidateBeforeCall(DeleteTableCellRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteTableCell");
        }
        
        // verify the required parameter 'TableRowPath' is set
        if (request.getTableRowPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'TableRowPath' when calling deleteTableCell");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling deleteTableCell");
        }
        

        com.squareup.okhttp.Call call = deleteTableCellCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a table cell.
     * 
     * @return AsposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsposeResponse deleteTableCell(DeleteTableCellRequest request) throws ApiException {
        try {
            ApiResponse<AsposeResponse> resp = deleteTableCellWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<AsposeResponse> resp = deleteTableCellWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Delete a table cell.
     * 
     * @return ApiResponse&lt;AsposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AsposeResponse> deleteTableCellWithHttpInfo(DeleteTableCellRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteTableCellValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a table cell. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTableCellAsync(DeleteTableCellRequest request, final ApiCallback<AsposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteTableCellValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteTableRow
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteTableRowCall(DeleteTableRowRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{tablePath}/rows/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "tablePath" + "\\}", apiClient.escapeString(request.getTablePath().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteTableRowValidateBeforeCall(DeleteTableRowRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteTableRow");
        }
        
        // verify the required parameter 'TablePath' is set
        if (request.getTablePath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'TablePath' when calling deleteTableRow");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling deleteTableRow");
        }
        

        com.squareup.okhttp.Call call = deleteTableRowCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a table row.
     * 
     * @return AsposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsposeResponse deleteTableRow(DeleteTableRowRequest request) throws ApiException {
        try {
            ApiResponse<AsposeResponse> resp = deleteTableRowWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<AsposeResponse> resp = deleteTableRowWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Delete a table row.
     * 
     * @return ApiResponse&lt;AsposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AsposeResponse> deleteTableRowWithHttpInfo(DeleteTableRowRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteTableRowValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a table row. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTableRowAsync(DeleteTableRowRequest request, final ApiCallback<AsposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteTableRowValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteUnprotectDocument
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call deleteUnprotectDocumentCall(DeleteUnprotectDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getProtectionRequest();

        // create path and map variables
        String localVarPath = "/words/{name}/protection"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteUnprotectDocumentValidateBeforeCall(DeleteUnprotectDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling deleteUnprotectDocument");
        }
        
        // verify the required parameter 'ProtectionRequest' is set
        if (request.getProtectionRequest() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'ProtectionRequest' when calling deleteUnprotectDocument");
        }
        

        com.squareup.okhttp.Call call = deleteUnprotectDocumentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Unprotect document.
     * 
     * @return ProtectionDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProtectionDataResponse deleteUnprotectDocument(DeleteUnprotectDocumentRequest request) throws ApiException {
        try {
            ApiResponse<ProtectionDataResponse> resp = deleteUnprotectDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<ProtectionDataResponse> resp = deleteUnprotectDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Unprotect document.
     * 
     * @return ApiResponse&lt;ProtectionDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<ProtectionDataResponse> deleteUnprotectDocumentWithHttpInfo(DeleteUnprotectDocumentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteUnprotectDocumentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ProtectionDataResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Unprotect document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteUnprotectDocumentAsync(DeleteUnprotectDocumentRequest request, final ApiCallback<ProtectionDataResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteUnprotectDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProtectionDataResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAvailableFonts
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getAvailableFontsCall(GetAvailableFontsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/fonts/available";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "fontsLocation", request.getFontsLocation());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAvailableFontsValidateBeforeCall(GetAvailableFontsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAvailableFontsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets the list of fonts, available for document processing
     * 
     * @return AvailableFontsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AvailableFontsResponse getAvailableFonts(GetAvailableFontsRequest request) throws ApiException {
        try {
            ApiResponse<AvailableFontsResponse> resp = getAvailableFontsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<AvailableFontsResponse> resp = getAvailableFontsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Gets the list of fonts, available for document processing
     * 
     * @return ApiResponse&lt;AvailableFontsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AvailableFontsResponse> getAvailableFontsWithHttpInfo(GetAvailableFontsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getAvailableFontsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AvailableFontsResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the list of fonts, available for document processing (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAvailableFontsAsync(GetAvailableFontsRequest request, final ApiCallback<AvailableFontsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAvailableFontsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AvailableFontsResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getBorder
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getBorderCall(GetBorderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/borders/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "nodePath" + "\\}", apiClient.escapeString(request.getNodePath().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBorderValidateBeforeCall(GetBorderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getBorder");
        }
        
        // verify the required parameter 'NodePath' is set
        if (request.getNodePath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'NodePath' when calling getBorder");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling getBorder");
        }
        

        com.squareup.okhttp.Call call = getBorderCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return a border.
     * &#39;nodePath&#39; should refer to node with cell or row
     * @return BorderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BorderResponse getBorder(GetBorderRequest request) throws ApiException {
        try {
            ApiResponse<BorderResponse> resp = getBorderWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<BorderResponse> resp = getBorderWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Return a border.
     * &#39;nodePath&#39; should refer to node with cell or row
     * @return ApiResponse&lt;BorderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<BorderResponse> getBorderWithHttpInfo(GetBorderRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getBorderValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<BorderResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return a border. (asynchronously)
     * &#39;nodePath&#39; should refer to node with cell or row
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBorderAsync(GetBorderRequest request, final ApiCallback<BorderResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getBorderValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BorderResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getBorders
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getBordersCall(GetBordersRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/borders"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "nodePath" + "\\}", apiClient.escapeString(request.getNodePath().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBordersValidateBeforeCall(GetBordersRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getBorders");
        }
        
        // verify the required parameter 'NodePath' is set
        if (request.getNodePath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'NodePath' when calling getBorders");
        }
        

        com.squareup.okhttp.Call call = getBordersCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return a collection of borders.
     * &#39;nodePath&#39; should refer to node with cell or row
     * @return BordersResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BordersResponse getBorders(GetBordersRequest request) throws ApiException {
        try {
            ApiResponse<BordersResponse> resp = getBordersWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<BordersResponse> resp = getBordersWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Return a collection of borders.
     * &#39;nodePath&#39; should refer to node with cell or row
     * @return ApiResponse&lt;BordersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<BordersResponse> getBordersWithHttpInfo(GetBordersRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getBordersValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<BordersResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return a collection of borders. (asynchronously)
     * &#39;nodePath&#39; should refer to node with cell or row
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBordersAsync(GetBordersRequest request, final ApiCallback<BordersResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getBordersValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BordersResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getComment
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getCommentCall(GetCommentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/comments/{commentIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "commentIndex" + "\\}", apiClient.escapeString(request.getCommentIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCommentValidateBeforeCall(GetCommentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getComment");
        }
        
        // verify the required parameter 'CommentIndex' is set
        if (request.getCommentIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'CommentIndex' when calling getComment");
        }
        

        com.squareup.okhttp.Call call = getCommentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get comment from document.
     * 
     * @return CommentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommentResponse getComment(GetCommentRequest request) throws ApiException {
        try {
            ApiResponse<CommentResponse> resp = getCommentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<CommentResponse> resp = getCommentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Get comment from document.
     * 
     * @return ApiResponse&lt;CommentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<CommentResponse> getCommentWithHttpInfo(GetCommentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getCommentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<CommentResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get comment from document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCommentAsync(GetCommentRequest request, final ApiCallback<CommentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCommentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommentResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getComments
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getCommentsCall(GetCommentsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/comments"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCommentsValidateBeforeCall(GetCommentsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getComments");
        }
        

        com.squareup.okhttp.Call call = getCommentsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get comments from document.
     * 
     * @return CommentsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommentsResponse getComments(GetCommentsRequest request) throws ApiException {
        try {
            ApiResponse<CommentsResponse> resp = getCommentsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<CommentsResponse> resp = getCommentsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Get comments from document.
     * 
     * @return ApiResponse&lt;CommentsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<CommentsResponse> getCommentsWithHttpInfo(GetCommentsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getCommentsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<CommentsResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get comments from document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCommentsAsync(GetCommentsRequest request, final ApiCallback<CommentsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCommentsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommentsResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocument
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentCall(GetDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{documentName}"
            .replaceAll("\\{" + "documentName" + "\\}", apiClient.escapeString(request.getDocumentName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentValidateBeforeCall(GetDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'DocumentName' is set
        if (request.getDocumentName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'DocumentName' when calling getDocument");
        }
        

        com.squareup.okhttp.Call call = getDocumentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document common info.
     * 
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse getDocument(GetDocumentRequest request) throws ApiException {
        try {
            ApiResponse<DocumentResponse> resp = getDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<DocumentResponse> resp = getDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Read document common info.
     * 
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DocumentResponse> getDocumentWithHttpInfo(GetDocumentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document common info. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentAsync(GetDocumentRequest request, final ApiCallback<DocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentBookmarkByName
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentBookmarkByNameCall(GetDocumentBookmarkByNameRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/bookmarks/{bookmarkName}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "bookmarkName" + "\\}", apiClient.escapeString(request.getBookmarkName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentBookmarkByNameValidateBeforeCall(GetDocumentBookmarkByNameRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentBookmarkByName");
        }
        
        // verify the required parameter 'BookmarkName' is set
        if (request.getBookmarkName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'BookmarkName' when calling getDocumentBookmarkByName");
        }
        

        com.squareup.okhttp.Call call = getDocumentBookmarkByNameCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document bookmark data by its name.
     * 
     * @return BookmarkResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BookmarkResponse getDocumentBookmarkByName(GetDocumentBookmarkByNameRequest request) throws ApiException {
        try {
            ApiResponse<BookmarkResponse> resp = getDocumentBookmarkByNameWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<BookmarkResponse> resp = getDocumentBookmarkByNameWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Read document bookmark data by its name.
     * 
     * @return ApiResponse&lt;BookmarkResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<BookmarkResponse> getDocumentBookmarkByNameWithHttpInfo(GetDocumentBookmarkByNameRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentBookmarkByNameValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<BookmarkResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document bookmark data by its name. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentBookmarkByNameAsync(GetDocumentBookmarkByNameRequest request, final ApiCallback<BookmarkResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentBookmarkByNameValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BookmarkResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentBookmarks
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentBookmarksCall(GetDocumentBookmarksRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/bookmarks"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentBookmarksValidateBeforeCall(GetDocumentBookmarksRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentBookmarks");
        }
        

        com.squareup.okhttp.Call call = getDocumentBookmarksCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document bookmarks common info.
     * 
     * @return BookmarksResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BookmarksResponse getDocumentBookmarks(GetDocumentBookmarksRequest request) throws ApiException {
        try {
            ApiResponse<BookmarksResponse> resp = getDocumentBookmarksWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<BookmarksResponse> resp = getDocumentBookmarksWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Read document bookmarks common info.
     * 
     * @return ApiResponse&lt;BookmarksResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<BookmarksResponse> getDocumentBookmarksWithHttpInfo(GetDocumentBookmarksRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentBookmarksValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<BookmarksResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document bookmarks common info. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentBookmarksAsync(GetDocumentBookmarksRequest request, final ApiCallback<BookmarksResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentBookmarksValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BookmarksResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentDrawingObjectByIndex
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentDrawingObjectByIndexCall(GetDocumentDrawingObjectByIndexRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/drawingObjects/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentDrawingObjectByIndexValidateBeforeCall(GetDocumentDrawingObjectByIndexRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentDrawingObjectByIndex");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling getDocumentDrawingObjectByIndex");
        }
        

        com.squareup.okhttp.Call call = getDocumentDrawingObjectByIndexCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document drawing object common info by its index or convert to format specified.
     * 
     * @return DrawingObjectResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DrawingObjectResponse getDocumentDrawingObjectByIndex(GetDocumentDrawingObjectByIndexRequest request) throws ApiException {
        try {
            ApiResponse<DrawingObjectResponse> resp = getDocumentDrawingObjectByIndexWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<DrawingObjectResponse> resp = getDocumentDrawingObjectByIndexWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Read document drawing object common info by its index or convert to format specified.
     * 
     * @return ApiResponse&lt;DrawingObjectResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DrawingObjectResponse> getDocumentDrawingObjectByIndexWithHttpInfo(GetDocumentDrawingObjectByIndexRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentDrawingObjectByIndexValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DrawingObjectResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document drawing object common info by its index or convert to format specified. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentDrawingObjectByIndexAsync(GetDocumentDrawingObjectByIndexRequest request, final ApiCallback<DrawingObjectResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentDrawingObjectByIndexValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DrawingObjectResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentDrawingObjectImageData
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentDrawingObjectImageDataCall(GetDocumentDrawingObjectImageDataRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/drawingObjects/{index}/imageData"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentDrawingObjectImageDataValidateBeforeCall(GetDocumentDrawingObjectImageDataRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentDrawingObjectImageData");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling getDocumentDrawingObjectImageData");
        }
        

        com.squareup.okhttp.Call call = getDocumentDrawingObjectImageDataCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read drawing object image data.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getDocumentDrawingObjectImageData(GetDocumentDrawingObjectImageDataRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = getDocumentDrawingObjectImageDataWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = getDocumentDrawingObjectImageDataWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Read drawing object image data.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> getDocumentDrawingObjectImageDataWithHttpInfo(GetDocumentDrawingObjectImageDataRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentDrawingObjectImageDataValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read drawing object image data. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentDrawingObjectImageDataAsync(GetDocumentDrawingObjectImageDataRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentDrawingObjectImageDataValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentDrawingObjectOleData
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentDrawingObjectOleDataCall(GetDocumentDrawingObjectOleDataRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/drawingObjects/{index}/oleData"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentDrawingObjectOleDataValidateBeforeCall(GetDocumentDrawingObjectOleDataRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentDrawingObjectOleData");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling getDocumentDrawingObjectOleData");
        }
        

        com.squareup.okhttp.Call call = getDocumentDrawingObjectOleDataCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get drawing object OLE data.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getDocumentDrawingObjectOleData(GetDocumentDrawingObjectOleDataRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = getDocumentDrawingObjectOleDataWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = getDocumentDrawingObjectOleDataWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Get drawing object OLE data.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> getDocumentDrawingObjectOleDataWithHttpInfo(GetDocumentDrawingObjectOleDataRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentDrawingObjectOleDataValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get drawing object OLE data. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentDrawingObjectOleDataAsync(GetDocumentDrawingObjectOleDataRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentDrawingObjectOleDataValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentDrawingObjects
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentDrawingObjectsCall(GetDocumentDrawingObjectsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/drawingObjects"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentDrawingObjectsValidateBeforeCall(GetDocumentDrawingObjectsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentDrawingObjects");
        }
        

        com.squareup.okhttp.Call call = getDocumentDrawingObjectsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document drawing objects common info.
     * 
     * @return DrawingObjectsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DrawingObjectsResponse getDocumentDrawingObjects(GetDocumentDrawingObjectsRequest request) throws ApiException {
        try {
            ApiResponse<DrawingObjectsResponse> resp = getDocumentDrawingObjectsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<DrawingObjectsResponse> resp = getDocumentDrawingObjectsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Read document drawing objects common info.
     * 
     * @return ApiResponse&lt;DrawingObjectsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DrawingObjectsResponse> getDocumentDrawingObjectsWithHttpInfo(GetDocumentDrawingObjectsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentDrawingObjectsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DrawingObjectsResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document drawing objects common info. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentDrawingObjectsAsync(GetDocumentDrawingObjectsRequest request, final ApiCallback<DrawingObjectsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentDrawingObjectsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DrawingObjectsResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentFieldNames
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentFieldNamesCall(GetDocumentFieldNamesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/mailMergeFieldNames"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "useNonMergeFields", request.getUseNonMergeFields());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentFieldNamesValidateBeforeCall(GetDocumentFieldNamesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentFieldNames");
        }
        

        com.squareup.okhttp.Call call = getDocumentFieldNamesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document field names.
     * 
     * @return FieldNamesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FieldNamesResponse getDocumentFieldNames(GetDocumentFieldNamesRequest request) throws ApiException {
        try {
            ApiResponse<FieldNamesResponse> resp = getDocumentFieldNamesWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<FieldNamesResponse> resp = getDocumentFieldNamesWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Read document field names.
     * 
     * @return ApiResponse&lt;FieldNamesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<FieldNamesResponse> getDocumentFieldNamesWithHttpInfo(GetDocumentFieldNamesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentFieldNamesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<FieldNamesResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document field names. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentFieldNamesAsync(GetDocumentFieldNamesRequest request, final ApiCallback<FieldNamesResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentFieldNamesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FieldNamesResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentHyperlinkByIndex
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentHyperlinkByIndexCall(GetDocumentHyperlinkByIndexRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/hyperlinks/{hyperlinkIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "hyperlinkIndex" + "\\}", apiClient.escapeString(request.getHyperlinkIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentHyperlinkByIndexValidateBeforeCall(GetDocumentHyperlinkByIndexRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentHyperlinkByIndex");
        }
        
        // verify the required parameter 'HyperlinkIndex' is set
        if (request.getHyperlinkIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'HyperlinkIndex' when calling getDocumentHyperlinkByIndex");
        }
        

        com.squareup.okhttp.Call call = getDocumentHyperlinkByIndexCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document hyperlink by its index.
     * 
     * @return HyperlinkResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HyperlinkResponse getDocumentHyperlinkByIndex(GetDocumentHyperlinkByIndexRequest request) throws ApiException {
        try {
            ApiResponse<HyperlinkResponse> resp = getDocumentHyperlinkByIndexWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<HyperlinkResponse> resp = getDocumentHyperlinkByIndexWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Read document hyperlink by its index.
     * 
     * @return ApiResponse&lt;HyperlinkResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<HyperlinkResponse> getDocumentHyperlinkByIndexWithHttpInfo(GetDocumentHyperlinkByIndexRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentHyperlinkByIndexValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<HyperlinkResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document hyperlink by its index. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentHyperlinkByIndexAsync(GetDocumentHyperlinkByIndexRequest request, final ApiCallback<HyperlinkResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentHyperlinkByIndexValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HyperlinkResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentHyperlinks
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentHyperlinksCall(GetDocumentHyperlinksRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/hyperlinks"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentHyperlinksValidateBeforeCall(GetDocumentHyperlinksRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentHyperlinks");
        }
        

        com.squareup.okhttp.Call call = getDocumentHyperlinksCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document hyperlinks common info.
     * 
     * @return HyperlinksResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HyperlinksResponse getDocumentHyperlinks(GetDocumentHyperlinksRequest request) throws ApiException {
        try {
            ApiResponse<HyperlinksResponse> resp = getDocumentHyperlinksWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<HyperlinksResponse> resp = getDocumentHyperlinksWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Read document hyperlinks common info.
     * 
     * @return ApiResponse&lt;HyperlinksResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<HyperlinksResponse> getDocumentHyperlinksWithHttpInfo(GetDocumentHyperlinksRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentHyperlinksValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<HyperlinksResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document hyperlinks common info. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentHyperlinksAsync(GetDocumentHyperlinksRequest request, final ApiCallback<HyperlinksResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentHyperlinksValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HyperlinksResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentParagraph
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentParagraphCall(GetDocumentParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/paragraphs/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentParagraphValidateBeforeCall(GetDocumentParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentParagraph");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling getDocumentParagraph");
        }
        

        com.squareup.okhttp.Call call = getDocumentParagraphCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This resource represents one of the paragraphs contained in the document.
     * 
     * @return ParagraphResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ParagraphResponse getDocumentParagraph(GetDocumentParagraphRequest request) throws ApiException {
        try {
            ApiResponse<ParagraphResponse> resp = getDocumentParagraphWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<ParagraphResponse> resp = getDocumentParagraphWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * This resource represents one of the paragraphs contained in the document.
     * 
     * @return ApiResponse&lt;ParagraphResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<ParagraphResponse> getDocumentParagraphWithHttpInfo(GetDocumentParagraphRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentParagraphValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ParagraphResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * This resource represents one of the paragraphs contained in the document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentParagraphAsync(GetDocumentParagraphRequest request, final ApiCallback<ParagraphResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentParagraphValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ParagraphResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentParagraphFormat
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentParagraphFormatCall(GetDocumentParagraphFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/paragraphs/{index}/format"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentParagraphFormatValidateBeforeCall(GetDocumentParagraphFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentParagraphFormat");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling getDocumentParagraphFormat");
        }
        

        com.squareup.okhttp.Call call = getDocumentParagraphFormatCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Represents all the formatting for a paragraph.
     * 
     * @return ParagraphFormatResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ParagraphFormatResponse getDocumentParagraphFormat(GetDocumentParagraphFormatRequest request) throws ApiException {
        try {
            ApiResponse<ParagraphFormatResponse> resp = getDocumentParagraphFormatWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<ParagraphFormatResponse> resp = getDocumentParagraphFormatWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Represents all the formatting for a paragraph.
     * 
     * @return ApiResponse&lt;ParagraphFormatResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<ParagraphFormatResponse> getDocumentParagraphFormatWithHttpInfo(GetDocumentParagraphFormatRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentParagraphFormatValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ParagraphFormatResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Represents all the formatting for a paragraph. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentParagraphFormatAsync(GetDocumentParagraphFormatRequest request, final ApiCallback<ParagraphFormatResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentParagraphFormatValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ParagraphFormatResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentParagraphRun
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentParagraphRunCall(GetDocumentParagraphRunRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{paragraphPath}/runs/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "paragraphPath" + "\\}", apiClient.escapeString(request.getParagraphPath().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentParagraphRunValidateBeforeCall(GetDocumentParagraphRunRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentParagraphRun");
        }
        
        // verify the required parameter 'ParagraphPath' is set
        if (request.getParagraphPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'ParagraphPath' when calling getDocumentParagraphRun");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling getDocumentParagraphRun");
        }
        

        com.squareup.okhttp.Call call = getDocumentParagraphRunCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This resource represents run of text contained in the document.
     * 
     * @return RunResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RunResponse getDocumentParagraphRun(GetDocumentParagraphRunRequest request) throws ApiException {
        try {
            ApiResponse<RunResponse> resp = getDocumentParagraphRunWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<RunResponse> resp = getDocumentParagraphRunWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * This resource represents run of text contained in the document.
     * 
     * @return ApiResponse&lt;RunResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<RunResponse> getDocumentParagraphRunWithHttpInfo(GetDocumentParagraphRunRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentParagraphRunValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<RunResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * This resource represents run of text contained in the document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentParagraphRunAsync(GetDocumentParagraphRunRequest request, final ApiCallback<RunResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentParagraphRunValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RunResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentParagraphRunFont
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentParagraphRunFontCall(GetDocumentParagraphRunFontRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{paragraphPath}/runs/{index}/font"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "paragraphPath" + "\\}", apiClient.escapeString(request.getParagraphPath().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentParagraphRunFontValidateBeforeCall(GetDocumentParagraphRunFontRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentParagraphRunFont");
        }
        
        // verify the required parameter 'ParagraphPath' is set
        if (request.getParagraphPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'ParagraphPath' when calling getDocumentParagraphRunFont");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling getDocumentParagraphRunFont");
        }
        

        com.squareup.okhttp.Call call = getDocumentParagraphRunFontCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This resource represents font of run.
     * 
     * @return FontResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FontResponse getDocumentParagraphRunFont(GetDocumentParagraphRunFontRequest request) throws ApiException {
        try {
            ApiResponse<FontResponse> resp = getDocumentParagraphRunFontWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<FontResponse> resp = getDocumentParagraphRunFontWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * This resource represents font of run.
     * 
     * @return ApiResponse&lt;FontResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<FontResponse> getDocumentParagraphRunFontWithHttpInfo(GetDocumentParagraphRunFontRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentParagraphRunFontValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<FontResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * This resource represents font of run. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentParagraphRunFontAsync(GetDocumentParagraphRunFontRequest request, final ApiCallback<FontResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentParagraphRunFontValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FontResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentParagraphRuns
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentParagraphRunsCall(GetDocumentParagraphRunsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{paragraphPath}/runs"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "paragraphPath" + "\\}", apiClient.escapeString(request.getParagraphPath().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentParagraphRunsValidateBeforeCall(GetDocumentParagraphRunsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentParagraphRuns");
        }
        
        // verify the required parameter 'ParagraphPath' is set
        if (request.getParagraphPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'ParagraphPath' when calling getDocumentParagraphRuns");
        }
        

        com.squareup.okhttp.Call call = getDocumentParagraphRunsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This resource represents collection of runs in the paragraph.
     * 
     * @return RunsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RunsResponse getDocumentParagraphRuns(GetDocumentParagraphRunsRequest request) throws ApiException {
        try {
            ApiResponse<RunsResponse> resp = getDocumentParagraphRunsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<RunsResponse> resp = getDocumentParagraphRunsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * This resource represents collection of runs in the paragraph.
     * 
     * @return ApiResponse&lt;RunsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<RunsResponse> getDocumentParagraphRunsWithHttpInfo(GetDocumentParagraphRunsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentParagraphRunsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<RunsResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * This resource represents collection of runs in the paragraph. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentParagraphRunsAsync(GetDocumentParagraphRunsRequest request, final ApiCallback<RunsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentParagraphRunsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RunsResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentParagraphs
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentParagraphsCall(GetDocumentParagraphsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/paragraphs"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentParagraphsValidateBeforeCall(GetDocumentParagraphsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentParagraphs");
        }
        

        com.squareup.okhttp.Call call = getDocumentParagraphsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return a list of paragraphs that are contained in the document.
     * 
     * @return ParagraphLinkCollectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ParagraphLinkCollectionResponse getDocumentParagraphs(GetDocumentParagraphsRequest request) throws ApiException {
        try {
            ApiResponse<ParagraphLinkCollectionResponse> resp = getDocumentParagraphsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<ParagraphLinkCollectionResponse> resp = getDocumentParagraphsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Return a list of paragraphs that are contained in the document.
     * 
     * @return ApiResponse&lt;ParagraphLinkCollectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<ParagraphLinkCollectionResponse> getDocumentParagraphsWithHttpInfo(GetDocumentParagraphsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentParagraphsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ParagraphLinkCollectionResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return a list of paragraphs that are contained in the document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentParagraphsAsync(GetDocumentParagraphsRequest request, final ApiCallback<ParagraphLinkCollectionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentParagraphsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ParagraphLinkCollectionResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentProperties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentPropertiesCall(GetDocumentPropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/documentProperties"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentPropertiesValidateBeforeCall(GetDocumentPropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentProperties");
        }
        

        com.squareup.okhttp.Call call = getDocumentPropertiesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document properties info.
     * 
     * @return DocumentPropertiesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentPropertiesResponse getDocumentProperties(GetDocumentPropertiesRequest request) throws ApiException {
        try {
            ApiResponse<DocumentPropertiesResponse> resp = getDocumentPropertiesWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<DocumentPropertiesResponse> resp = getDocumentPropertiesWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Read document properties info.
     * 
     * @return ApiResponse&lt;DocumentPropertiesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DocumentPropertiesResponse> getDocumentPropertiesWithHttpInfo(GetDocumentPropertiesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentPropertiesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentPropertiesResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document properties info. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentPropertiesAsync(GetDocumentPropertiesRequest request, final ApiCallback<DocumentPropertiesResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentPropertiesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentPropertiesResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentProperty
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentPropertyCall(GetDocumentPropertyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/documentProperties/{propertyName}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "propertyName" + "\\}", apiClient.escapeString(request.getPropertyName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentPropertyValidateBeforeCall(GetDocumentPropertyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentProperty");
        }
        
        // verify the required parameter 'PropertyName' is set
        if (request.getPropertyName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'PropertyName' when calling getDocumentProperty");
        }
        

        com.squareup.okhttp.Call call = getDocumentPropertyCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document property info by the property name.
     * 
     * @return DocumentPropertyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentPropertyResponse getDocumentProperty(GetDocumentPropertyRequest request) throws ApiException {
        try {
            ApiResponse<DocumentPropertyResponse> resp = getDocumentPropertyWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<DocumentPropertyResponse> resp = getDocumentPropertyWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Read document property info by the property name.
     * 
     * @return ApiResponse&lt;DocumentPropertyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DocumentPropertyResponse> getDocumentPropertyWithHttpInfo(GetDocumentPropertyRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentPropertyValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentPropertyResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document property info by the property name. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentPropertyAsync(GetDocumentPropertyRequest request, final ApiCallback<DocumentPropertyResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentPropertyValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentPropertyResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentProtection
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentProtectionCall(GetDocumentProtectionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/protection"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentProtectionValidateBeforeCall(GetDocumentProtectionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentProtection");
        }
        

        com.squareup.okhttp.Call call = getDocumentProtectionCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document protection common info.
     * 
     * @return ProtectionDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProtectionDataResponse getDocumentProtection(GetDocumentProtectionRequest request) throws ApiException {
        try {
            ApiResponse<ProtectionDataResponse> resp = getDocumentProtectionWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<ProtectionDataResponse> resp = getDocumentProtectionWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Read document protection common info.
     * 
     * @return ApiResponse&lt;ProtectionDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<ProtectionDataResponse> getDocumentProtectionWithHttpInfo(GetDocumentProtectionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentProtectionValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ProtectionDataResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document protection common info. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentProtectionAsync(GetDocumentProtectionRequest request, final ApiCallback<ProtectionDataResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentProtectionValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProtectionDataResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentStatistics
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentStatisticsCall(GetDocumentStatisticsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/statistics"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "includeComments", request.getIncludeComments());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "includeFootnotes", request.getIncludeFootnotes());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "includeTextInShapes", request.getIncludeTextInShapes());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentStatisticsValidateBeforeCall(GetDocumentStatisticsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentStatistics");
        }
        

        com.squareup.okhttp.Call call = getDocumentStatisticsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document statistics.
     * 
     * @return StatDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StatDataResponse getDocumentStatistics(GetDocumentStatisticsRequest request) throws ApiException {
        try {
            ApiResponse<StatDataResponse> resp = getDocumentStatisticsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<StatDataResponse> resp = getDocumentStatisticsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Read document statistics.
     * 
     * @return ApiResponse&lt;StatDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<StatDataResponse> getDocumentStatisticsWithHttpInfo(GetDocumentStatisticsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentStatisticsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<StatDataResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document statistics. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentStatisticsAsync(GetDocumentStatisticsRequest request, final ApiCallback<StatDataResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentStatisticsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StatDataResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentTextItems
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    private com.squareup.okhttp.Call getDocumentTextItemsCall(GetDocumentTextItemsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/textItems"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentTextItemsValidateBeforeCall(GetDocumentTextItemsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentTextItems");
        }
        

        com.squareup.okhttp.Call call = getDocumentTextItemsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document text items.
     * 
     * @return TextItemsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public TextItemsResponse getDocumentTextItems(GetDocumentTextItemsRequest request) throws ApiException {
        try {
            ApiResponse<TextItemsResponse> resp = getDocumentTextItemsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<TextItemsResponse> resp = getDocumentTextItemsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Read document text items.
     * 
     * @return ApiResponse&lt;TextItemsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    private ApiResponse<TextItemsResponse> getDocumentTextItemsWithHttpInfo(GetDocumentTextItemsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentTextItemsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<TextItemsResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document text items. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call getDocumentTextItemsAsync(GetDocumentTextItemsRequest request, final ApiCallback<TextItemsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentTextItemsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TextItemsResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentWithFormat
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getDocumentWithFormatCall(GetDocumentWithFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getOutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "fontsLocation", request.getFontsLocation());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentWithFormatValidateBeforeCall(GetDocumentWithFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getDocumentWithFormat");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Format' when calling getDocumentWithFormat");
        }
        

        com.squareup.okhttp.Call call = getDocumentWithFormatCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export the document into the specified format.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getDocumentWithFormat(GetDocumentWithFormatRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = getDocumentWithFormatWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = getDocumentWithFormatWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Export the document into the specified format.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> getDocumentWithFormatWithHttpInfo(GetDocumentWithFormatRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentWithFormatValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export the document into the specified format. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentWithFormatAsync(GetDocumentWithFormatRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentWithFormatValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getField
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getFieldCall(GetFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/fields/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFieldValidateBeforeCall(GetFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getField");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling getField");
        }
        

        com.squareup.okhttp.Call call = getFieldCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get field from document.
     * 
     * @return FieldResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FieldResponse getField(GetFieldRequest request) throws ApiException {
        try {
            ApiResponse<FieldResponse> resp = getFieldWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<FieldResponse> resp = getFieldWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Get field from document.
     * 
     * @return ApiResponse&lt;FieldResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<FieldResponse> getFieldWithHttpInfo(GetFieldRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getFieldValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<FieldResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get field from document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFieldAsync(GetFieldRequest request, final ApiCallback<FieldResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFieldValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FieldResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFields
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getFieldsCall(GetFieldsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/fields"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFieldsValidateBeforeCall(GetFieldsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getFields");
        }
        

        com.squareup.okhttp.Call call = getFieldsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get fields from document.
     * 
     * @return FieldsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FieldsResponse getFields(GetFieldsRequest request) throws ApiException {
        try {
            ApiResponse<FieldsResponse> resp = getFieldsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<FieldsResponse> resp = getFieldsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Get fields from document.
     * 
     * @return ApiResponse&lt;FieldsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<FieldsResponse> getFieldsWithHttpInfo(GetFieldsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getFieldsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<FieldsResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get fields from document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFieldsAsync(GetFieldsRequest request, final ApiCallback<FieldsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFieldsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FieldsResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFootnote
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getFootnoteCall(GetFootnoteRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/footnotes/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFootnoteValidateBeforeCall(GetFootnoteRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getFootnote");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling getFootnote");
        }
        

        com.squareup.okhttp.Call call = getFootnoteCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read footnote by index.
     * 
     * @return FootnoteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FootnoteResponse getFootnote(GetFootnoteRequest request) throws ApiException {
        try {
            ApiResponse<FootnoteResponse> resp = getFootnoteWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<FootnoteResponse> resp = getFootnoteWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Read footnote by index.
     * 
     * @return ApiResponse&lt;FootnoteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<FootnoteResponse> getFootnoteWithHttpInfo(GetFootnoteRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getFootnoteValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<FootnoteResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read footnote by index. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFootnoteAsync(GetFootnoteRequest request, final ApiCallback<FootnoteResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFootnoteValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FootnoteResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFootnotes
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getFootnotesCall(GetFootnotesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/footnotes"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFootnotesValidateBeforeCall(GetFootnotesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getFootnotes");
        }
        

        com.squareup.okhttp.Call call = getFootnotesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get footnotes from document.
     * 
     * @return FootnotesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FootnotesResponse getFootnotes(GetFootnotesRequest request) throws ApiException {
        try {
            ApiResponse<FootnotesResponse> resp = getFootnotesWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<FootnotesResponse> resp = getFootnotesWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Get footnotes from document.
     * 
     * @return ApiResponse&lt;FootnotesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<FootnotesResponse> getFootnotesWithHttpInfo(GetFootnotesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getFootnotesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<FootnotesResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get footnotes from document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFootnotesAsync(GetFootnotesRequest request, final ApiCallback<FootnotesResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFootnotesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FootnotesResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFormField
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getFormFieldCall(GetFormFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/formfields/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFormFieldValidateBeforeCall(GetFormFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getFormField");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling getFormField");
        }
        

        com.squareup.okhttp.Call call = getFormFieldCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns representation of an one of the form field.
     * 
     * @return FormFieldResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FormFieldResponse getFormField(GetFormFieldRequest request) throws ApiException {
        try {
            ApiResponse<FormFieldResponse> resp = getFormFieldWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<FormFieldResponse> resp = getFormFieldWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Returns representation of an one of the form field.
     * 
     * @return ApiResponse&lt;FormFieldResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<FormFieldResponse> getFormFieldWithHttpInfo(GetFormFieldRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getFormFieldValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<FormFieldResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns representation of an one of the form field. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFormFieldAsync(GetFormFieldRequest request, final ApiCallback<FormFieldResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFormFieldValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FormFieldResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFormFields
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getFormFieldsCall(GetFormFieldsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/formfields"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFormFieldsValidateBeforeCall(GetFormFieldsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getFormFields");
        }
        

        com.squareup.okhttp.Call call = getFormFieldsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get form fields from document.
     * 
     * @return FormFieldsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FormFieldsResponse getFormFields(GetFormFieldsRequest request) throws ApiException {
        try {
            ApiResponse<FormFieldsResponse> resp = getFormFieldsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<FormFieldsResponse> resp = getFormFieldsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Get form fields from document.
     * 
     * @return ApiResponse&lt;FormFieldsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<FormFieldsResponse> getFormFieldsWithHttpInfo(GetFormFieldsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getFormFieldsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<FormFieldsResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get form fields from document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFormFieldsAsync(GetFormFieldsRequest request, final ApiCallback<FormFieldsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFormFieldsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FormFieldsResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getHeaderFooter
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getHeaderFooterCall(GetHeaderFooterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/headersfooters/{headerFooterIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "headerFooterIndex" + "\\}", apiClient.escapeString(request.getHeaderFooterIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "filterByType", request.getFilterByType());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getHeaderFooterValidateBeforeCall(GetHeaderFooterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getHeaderFooter");
        }
        
        // verify the required parameter 'HeaderFooterIndex' is set
        if (request.getHeaderFooterIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'HeaderFooterIndex' when calling getHeaderFooter");
        }
        

        com.squareup.okhttp.Call call = getHeaderFooterCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return a header/footer that is contained in the document.
     * 
     * @return HeaderFooterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HeaderFooterResponse getHeaderFooter(GetHeaderFooterRequest request) throws ApiException {
        try {
            ApiResponse<HeaderFooterResponse> resp = getHeaderFooterWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<HeaderFooterResponse> resp = getHeaderFooterWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Return a header/footer that is contained in the document.
     * 
     * @return ApiResponse&lt;HeaderFooterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<HeaderFooterResponse> getHeaderFooterWithHttpInfo(GetHeaderFooterRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getHeaderFooterValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<HeaderFooterResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return a header/footer that is contained in the document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getHeaderFooterAsync(GetHeaderFooterRequest request, final ApiCallback<HeaderFooterResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getHeaderFooterValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HeaderFooterResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getHeaderFooterOfSection
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getHeaderFooterOfSectionCall(GetHeaderFooterOfSectionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/sections/{sectionIndex}/headersfooters/{headerFooterIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "headerFooterIndex" + "\\}", apiClient.escapeString(request.getHeaderFooterIndex().toString()))
            .replaceAll("\\{" + "sectionIndex" + "\\}", apiClient.escapeString(request.getSectionIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "filterByType", request.getFilterByType());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getHeaderFooterOfSectionValidateBeforeCall(GetHeaderFooterOfSectionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getHeaderFooterOfSection");
        }
        
        // verify the required parameter 'HeaderFooterIndex' is set
        if (request.getHeaderFooterIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'HeaderFooterIndex' when calling getHeaderFooterOfSection");
        }
        
        // verify the required parameter 'SectionIndex' is set
        if (request.getSectionIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'SectionIndex' when calling getHeaderFooterOfSection");
        }
        

        com.squareup.okhttp.Call call = getHeaderFooterOfSectionCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return a header/footer that is contained in the document.
     * 
     * @return HeaderFooterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HeaderFooterResponse getHeaderFooterOfSection(GetHeaderFooterOfSectionRequest request) throws ApiException {
        try {
            ApiResponse<HeaderFooterResponse> resp = getHeaderFooterOfSectionWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<HeaderFooterResponse> resp = getHeaderFooterOfSectionWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Return a header/footer that is contained in the document.
     * 
     * @return ApiResponse&lt;HeaderFooterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<HeaderFooterResponse> getHeaderFooterOfSectionWithHttpInfo(GetHeaderFooterOfSectionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getHeaderFooterOfSectionValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<HeaderFooterResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return a header/footer that is contained in the document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getHeaderFooterOfSectionAsync(GetHeaderFooterOfSectionRequest request, final ApiCallback<HeaderFooterResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getHeaderFooterOfSectionValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HeaderFooterResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getHeaderFooters
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getHeaderFootersCall(GetHeaderFootersRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{sectionPath}/headersfooters"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "sectionPath", request.getSectionPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "filterByType", request.getFilterByType());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getHeaderFootersValidateBeforeCall(GetHeaderFootersRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getHeaderFooters");
        }
        

        com.squareup.okhttp.Call call = getHeaderFootersCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return a list of header/footers that are contained in the document.
     * 
     * @return HeaderFootersResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HeaderFootersResponse getHeaderFooters(GetHeaderFootersRequest request) throws ApiException {
        try {
            ApiResponse<HeaderFootersResponse> resp = getHeaderFootersWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<HeaderFootersResponse> resp = getHeaderFootersWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Return a list of header/footers that are contained in the document.
     * 
     * @return ApiResponse&lt;HeaderFootersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<HeaderFootersResponse> getHeaderFootersWithHttpInfo(GetHeaderFootersRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getHeaderFootersValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<HeaderFootersResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return a list of header/footers that are contained in the document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getHeaderFootersAsync(GetHeaderFootersRequest request, final ApiCallback<HeaderFootersResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getHeaderFootersValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HeaderFootersResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOfficeMathObject
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getOfficeMathObjectCall(GetOfficeMathObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/OfficeMathObjects/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getOfficeMathObjectValidateBeforeCall(GetOfficeMathObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getOfficeMathObject");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling getOfficeMathObject");
        }
        

        com.squareup.okhttp.Call call = getOfficeMathObjectCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read OfficeMath object by index.
     * 
     * @return OfficeMathObjectResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OfficeMathObjectResponse getOfficeMathObject(GetOfficeMathObjectRequest request) throws ApiException {
        try {
            ApiResponse<OfficeMathObjectResponse> resp = getOfficeMathObjectWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<OfficeMathObjectResponse> resp = getOfficeMathObjectWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Read OfficeMath object by index.
     * 
     * @return ApiResponse&lt;OfficeMathObjectResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<OfficeMathObjectResponse> getOfficeMathObjectWithHttpInfo(GetOfficeMathObjectRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getOfficeMathObjectValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<OfficeMathObjectResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read OfficeMath object by index. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOfficeMathObjectAsync(GetOfficeMathObjectRequest request, final ApiCallback<OfficeMathObjectResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getOfficeMathObjectValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OfficeMathObjectResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOfficeMathObjects
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getOfficeMathObjectsCall(GetOfficeMathObjectsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/OfficeMathObjects"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getOfficeMathObjectsValidateBeforeCall(GetOfficeMathObjectsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getOfficeMathObjects");
        }
        

        com.squareup.okhttp.Call call = getOfficeMathObjectsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get OfficeMath objects from document.
     * 
     * @return OfficeMathObjectsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OfficeMathObjectsResponse getOfficeMathObjects(GetOfficeMathObjectsRequest request) throws ApiException {
        try {
            ApiResponse<OfficeMathObjectsResponse> resp = getOfficeMathObjectsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<OfficeMathObjectsResponse> resp = getOfficeMathObjectsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Get OfficeMath objects from document.
     * 
     * @return ApiResponse&lt;OfficeMathObjectsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<OfficeMathObjectsResponse> getOfficeMathObjectsWithHttpInfo(GetOfficeMathObjectsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getOfficeMathObjectsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<OfficeMathObjectsResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get OfficeMath objects from document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOfficeMathObjectsAsync(GetOfficeMathObjectsRequest request, final ApiCallback<OfficeMathObjectsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getOfficeMathObjectsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OfficeMathObjectsResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSection
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getSectionCall(GetSectionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/sections/{sectionIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "sectionIndex" + "\\}", apiClient.escapeString(request.getSectionIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSectionValidateBeforeCall(GetSectionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getSection");
        }
        
        // verify the required parameter 'SectionIndex' is set
        if (request.getSectionIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'SectionIndex' when calling getSection");
        }
        

        com.squareup.okhttp.Call call = getSectionCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get document section by index.
     * 
     * @return SectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SectionResponse getSection(GetSectionRequest request) throws ApiException {
        try {
            ApiResponse<SectionResponse> resp = getSectionWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<SectionResponse> resp = getSectionWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Get document section by index.
     * 
     * @return ApiResponse&lt;SectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<SectionResponse> getSectionWithHttpInfo(GetSectionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSectionValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SectionResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get document section by index. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSectionAsync(GetSectionRequest request, final ApiCallback<SectionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSectionValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SectionResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSectionPageSetup
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getSectionPageSetupCall(GetSectionPageSetupRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/sections/{sectionIndex}/pageSetup"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "sectionIndex" + "\\}", apiClient.escapeString(request.getSectionIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSectionPageSetupValidateBeforeCall(GetSectionPageSetupRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getSectionPageSetup");
        }
        
        // verify the required parameter 'SectionIndex' is set
        if (request.getSectionIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'SectionIndex' when calling getSectionPageSetup");
        }
        

        com.squareup.okhttp.Call call = getSectionPageSetupCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get page setup of section.
     * 
     * @return SectionPageSetupResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SectionPageSetupResponse getSectionPageSetup(GetSectionPageSetupRequest request) throws ApiException {
        try {
            ApiResponse<SectionPageSetupResponse> resp = getSectionPageSetupWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<SectionPageSetupResponse> resp = getSectionPageSetupWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Get page setup of section.
     * 
     * @return ApiResponse&lt;SectionPageSetupResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<SectionPageSetupResponse> getSectionPageSetupWithHttpInfo(GetSectionPageSetupRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSectionPageSetupValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SectionPageSetupResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get page setup of section. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSectionPageSetupAsync(GetSectionPageSetupRequest request, final ApiCallback<SectionPageSetupResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSectionPageSetupValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SectionPageSetupResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSections
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getSectionsCall(GetSectionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/sections"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSectionsValidateBeforeCall(GetSectionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getSections");
        }
        

        com.squareup.okhttp.Call call = getSectionsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return a list of sections that are contained in the document.
     * 
     * @return SectionLinkCollectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SectionLinkCollectionResponse getSections(GetSectionsRequest request) throws ApiException {
        try {
            ApiResponse<SectionLinkCollectionResponse> resp = getSectionsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<SectionLinkCollectionResponse> resp = getSectionsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Return a list of sections that are contained in the document.
     * 
     * @return ApiResponse&lt;SectionLinkCollectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<SectionLinkCollectionResponse> getSectionsWithHttpInfo(GetSectionsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSectionsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SectionLinkCollectionResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return a list of sections that are contained in the document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSectionsAsync(GetSectionsRequest request, final ApiCallback<SectionLinkCollectionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSectionsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SectionLinkCollectionResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTable
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getTableCall(GetTableRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/tables/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTableValidateBeforeCall(GetTableRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getTable");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling getTable");
        }
        

        com.squareup.okhttp.Call call = getTableCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return a table.
     * 
     * @return TableResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TableResponse getTable(GetTableRequest request) throws ApiException {
        try {
            ApiResponse<TableResponse> resp = getTableWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<TableResponse> resp = getTableWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Return a table.
     * 
     * @return ApiResponse&lt;TableResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<TableResponse> getTableWithHttpInfo(GetTableRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getTableValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<TableResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return a table. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTableAsync(GetTableRequest request, final ApiCallback<TableResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTableValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TableResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTableCell
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getTableCellCall(GetTableCellRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{tableRowPath}/cells/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "tableRowPath" + "\\}", apiClient.escapeString(request.getTableRowPath().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTableCellValidateBeforeCall(GetTableCellRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getTableCell");
        }
        
        // verify the required parameter 'TableRowPath' is set
        if (request.getTableRowPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'TableRowPath' when calling getTableCell");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling getTableCell");
        }
        

        com.squareup.okhttp.Call call = getTableCellCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return a table cell.
     * 
     * @return TableCellResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TableCellResponse getTableCell(GetTableCellRequest request) throws ApiException {
        try {
            ApiResponse<TableCellResponse> resp = getTableCellWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<TableCellResponse> resp = getTableCellWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Return a table cell.
     * 
     * @return ApiResponse&lt;TableCellResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<TableCellResponse> getTableCellWithHttpInfo(GetTableCellRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getTableCellValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<TableCellResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return a table cell. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTableCellAsync(GetTableCellRequest request, final ApiCallback<TableCellResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTableCellValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TableCellResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTableCellFormat
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getTableCellFormatCall(GetTableCellFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{tableRowPath}/cells/{index}/cellformat"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "tableRowPath" + "\\}", apiClient.escapeString(request.getTableRowPath().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTableCellFormatValidateBeforeCall(GetTableCellFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getTableCellFormat");
        }
        
        // verify the required parameter 'TableRowPath' is set
        if (request.getTableRowPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'TableRowPath' when calling getTableCellFormat");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling getTableCellFormat");
        }
        

        com.squareup.okhttp.Call call = getTableCellFormatCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return a table cell format.
     * 
     * @return TableCellFormatResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TableCellFormatResponse getTableCellFormat(GetTableCellFormatRequest request) throws ApiException {
        try {
            ApiResponse<TableCellFormatResponse> resp = getTableCellFormatWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<TableCellFormatResponse> resp = getTableCellFormatWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Return a table cell format.
     * 
     * @return ApiResponse&lt;TableCellFormatResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<TableCellFormatResponse> getTableCellFormatWithHttpInfo(GetTableCellFormatRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getTableCellFormatValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<TableCellFormatResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return a table cell format. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTableCellFormatAsync(GetTableCellFormatRequest request, final ApiCallback<TableCellFormatResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTableCellFormatValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TableCellFormatResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTableProperties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getTablePropertiesCall(GetTablePropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/tables/{index}/properties"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTablePropertiesValidateBeforeCall(GetTablePropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getTableProperties");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling getTableProperties");
        }
        

        com.squareup.okhttp.Call call = getTablePropertiesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return a table properties.
     * 
     * @return TablePropertiesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TablePropertiesResponse getTableProperties(GetTablePropertiesRequest request) throws ApiException {
        try {
            ApiResponse<TablePropertiesResponse> resp = getTablePropertiesWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<TablePropertiesResponse> resp = getTablePropertiesWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Return a table properties.
     * 
     * @return ApiResponse&lt;TablePropertiesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<TablePropertiesResponse> getTablePropertiesWithHttpInfo(GetTablePropertiesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getTablePropertiesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<TablePropertiesResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return a table properties. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTablePropertiesAsync(GetTablePropertiesRequest request, final ApiCallback<TablePropertiesResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTablePropertiesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TablePropertiesResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTableRow
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getTableRowCall(GetTableRowRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{tablePath}/rows/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "tablePath" + "\\}", apiClient.escapeString(request.getTablePath().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTableRowValidateBeforeCall(GetTableRowRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getTableRow");
        }
        
        // verify the required parameter 'TablePath' is set
        if (request.getTablePath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'TablePath' when calling getTableRow");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling getTableRow");
        }
        

        com.squareup.okhttp.Call call = getTableRowCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return a table row.
     * 
     * @return TableRowResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TableRowResponse getTableRow(GetTableRowRequest request) throws ApiException {
        try {
            ApiResponse<TableRowResponse> resp = getTableRowWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<TableRowResponse> resp = getTableRowWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Return a table row.
     * 
     * @return ApiResponse&lt;TableRowResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<TableRowResponse> getTableRowWithHttpInfo(GetTableRowRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getTableRowValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<TableRowResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return a table row. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTableRowAsync(GetTableRowRequest request, final ApiCallback<TableRowResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTableRowValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TableRowResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTableRowFormat
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getTableRowFormatCall(GetTableRowFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{tablePath}/rows/{index}/rowformat"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "tablePath" + "\\}", apiClient.escapeString(request.getTablePath().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTableRowFormatValidateBeforeCall(GetTableRowFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getTableRowFormat");
        }
        
        // verify the required parameter 'TablePath' is set
        if (request.getTablePath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'TablePath' when calling getTableRowFormat");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling getTableRowFormat");
        }
        

        com.squareup.okhttp.Call call = getTableRowFormatCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return a table row format.
     * 
     * @return TableRowFormatResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TableRowFormatResponse getTableRowFormat(GetTableRowFormatRequest request) throws ApiException {
        try {
            ApiResponse<TableRowFormatResponse> resp = getTableRowFormatWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<TableRowFormatResponse> resp = getTableRowFormatWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Return a table row format.
     * 
     * @return ApiResponse&lt;TableRowFormatResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<TableRowFormatResponse> getTableRowFormatWithHttpInfo(GetTableRowFormatRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getTableRowFormatValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<TableRowFormatResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return a table row format. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTableRowFormatAsync(GetTableRowFormatRequest request, final ApiCallback<TableRowFormatResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTableRowFormatValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TableRowFormatResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTables
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getTablesCall(GetTablesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/tables"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTablesValidateBeforeCall(GetTablesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling getTables");
        }
        

        com.squareup.okhttp.Call call = getTablesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return a list of tables that are contained in the document.
     * 
     * @return TableLinkCollectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TableLinkCollectionResponse getTables(GetTablesRequest request) throws ApiException {
        try {
            ApiResponse<TableLinkCollectionResponse> resp = getTablesWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<TableLinkCollectionResponse> resp = getTablesWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Return a list of tables that are contained in the document.
     * 
     * @return ApiResponse&lt;TableLinkCollectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<TableLinkCollectionResponse> getTablesWithHttpInfo(GetTablesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getTablesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<TableLinkCollectionResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return a list of tables that are contained in the document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTablesAsync(GetTablesRequest request, final ApiCallback<TableLinkCollectionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTablesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TableLinkCollectionResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for insertTable
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call insertTableCall(InsertTableRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getTable();

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/tables"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertTableValidateBeforeCall(InsertTableRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling insertTable");
        }
        

        com.squareup.okhttp.Call call = insertTableCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Adds table to document, returns added table&#39;s data.             
     * 
     * @return TableResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TableResponse insertTable(InsertTableRequest request) throws ApiException {
        try {
            ApiResponse<TableResponse> resp = insertTableWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<TableResponse> resp = insertTableWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Adds table to document, returns added table&#39;s data.             
     * 
     * @return ApiResponse&lt;TableResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<TableResponse> insertTableWithHttpInfo(InsertTableRequest request) throws ApiException {
        com.squareup.okhttp.Call call = insertTableValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<TableResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds table to document, returns added table&#39;s data.              (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call insertTableAsync(InsertTableRequest request, final ApiCallback<TableResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = insertTableValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TableResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for insertTableCell
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call insertTableCellCall(InsertTableCellRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getCell();

        // create path and map variables
        String localVarPath = "/words/{name}/{tableRowPath}/cells"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "tableRowPath" + "\\}", apiClient.escapeString(request.getTableRowPath().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertTableCellValidateBeforeCall(InsertTableCellRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling insertTableCell");
        }
        
        // verify the required parameter 'TableRowPath' is set
        if (request.getTableRowPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'TableRowPath' when calling insertTableCell");
        }
        

        com.squareup.okhttp.Call call = insertTableCellCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Adds table cell to table, returns added cell&#39;s data.             
     * 
     * @return TableCellResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TableCellResponse insertTableCell(InsertTableCellRequest request) throws ApiException {
        try {
            ApiResponse<TableCellResponse> resp = insertTableCellWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<TableCellResponse> resp = insertTableCellWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Adds table cell to table, returns added cell&#39;s data.             
     * 
     * @return ApiResponse&lt;TableCellResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<TableCellResponse> insertTableCellWithHttpInfo(InsertTableCellRequest request) throws ApiException {
        com.squareup.okhttp.Call call = insertTableCellValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<TableCellResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds table cell to table, returns added cell&#39;s data.              (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call insertTableCellAsync(InsertTableCellRequest request, final ApiCallback<TableCellResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = insertTableCellValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TableCellResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for insertTableRow
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call insertTableRowCall(InsertTableRowRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getRow();

        // create path and map variables
        String localVarPath = "/words/{name}/{tablePath}/rows"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "tablePath" + "\\}", apiClient.escapeString(request.getTablePath().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insertTableRowValidateBeforeCall(InsertTableRowRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling insertTableRow");
        }
        
        // verify the required parameter 'TablePath' is set
        if (request.getTablePath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'TablePath' when calling insertTableRow");
        }
        

        com.squareup.okhttp.Call call = insertTableRowCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Adds table row to table, returns added row&#39;s data.             
     * 
     * @return TableRowResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TableRowResponse insertTableRow(InsertTableRowRequest request) throws ApiException {
        try {
            ApiResponse<TableRowResponse> resp = insertTableRowWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<TableRowResponse> resp = insertTableRowWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Adds table row to table, returns added row&#39;s data.             
     * 
     * @return ApiResponse&lt;TableRowResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<TableRowResponse> insertTableRowWithHttpInfo(InsertTableRowRequest request) throws ApiException {
        com.squareup.okhttp.Call call = insertTableRowValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<TableRowResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds table row to table, returns added row&#39;s data.              (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call insertTableRowAsync(InsertTableRowRequest request, final ApiCallback<TableRowResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = insertTableRowValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TableRowResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postAppendDocument
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postAppendDocumentCall(PostAppendDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getDocumentList();

        // create path and map variables
        String localVarPath = "/words/{name}/appendDocument"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postAppendDocumentValidateBeforeCall(PostAppendDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postAppendDocument");
        }
        
        // verify the required parameter 'DocumentList' is set
        if (request.getDocumentList() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'DocumentList' when calling postAppendDocument");
        }
        

        com.squareup.okhttp.Call call = postAppendDocumentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Append documents to original document.
     * 
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse postAppendDocument(PostAppendDocumentRequest request) throws ApiException {
        try {
            ApiResponse<DocumentResponse> resp = postAppendDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<DocumentResponse> resp = postAppendDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Append documents to original document.
     * 
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DocumentResponse> postAppendDocumentWithHttpInfo(PostAppendDocumentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postAppendDocumentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Append documents to original document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postAppendDocumentAsync(PostAppendDocumentRequest request, final ApiCallback<DocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postAppendDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postChangeDocumentProtection
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postChangeDocumentProtectionCall(PostChangeDocumentProtectionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getProtectionRequest();

        // create path and map variables
        String localVarPath = "/words/{name}/protection"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postChangeDocumentProtectionValidateBeforeCall(PostChangeDocumentProtectionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postChangeDocumentProtection");
        }
        
        // verify the required parameter 'ProtectionRequest' is set
        if (request.getProtectionRequest() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'ProtectionRequest' when calling postChangeDocumentProtection");
        }
        

        com.squareup.okhttp.Call call = postChangeDocumentProtectionCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Change document protection.
     * 
     * @return ProtectionDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProtectionDataResponse postChangeDocumentProtection(PostChangeDocumentProtectionRequest request) throws ApiException {
        try {
            ApiResponse<ProtectionDataResponse> resp = postChangeDocumentProtectionWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<ProtectionDataResponse> resp = postChangeDocumentProtectionWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Change document protection.
     * 
     * @return ApiResponse&lt;ProtectionDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<ProtectionDataResponse> postChangeDocumentProtectionWithHttpInfo(PostChangeDocumentProtectionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postChangeDocumentProtectionValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ProtectionDataResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Change document protection. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postChangeDocumentProtectionAsync(PostChangeDocumentProtectionRequest request, final ApiCallback<ProtectionDataResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postChangeDocumentProtectionValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProtectionDataResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postComment
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postCommentCall(PostCommentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getComment();

        // create path and map variables
        String localVarPath = "/words/{name}/comments/{commentIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "commentIndex" + "\\}", apiClient.escapeString(request.getCommentIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postCommentValidateBeforeCall(PostCommentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postComment");
        }
        
        // verify the required parameter 'CommentIndex' is set
        if (request.getCommentIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'CommentIndex' when calling postComment");
        }
        
        // verify the required parameter 'Comment' is set
        if (request.getComment() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Comment' when calling postComment");
        }
        

        com.squareup.okhttp.Call call = postCommentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates the comment, returns updated comment&#39;s data.
     * 
     * @return CommentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommentResponse postComment(PostCommentRequest request) throws ApiException {
        try {
            ApiResponse<CommentResponse> resp = postCommentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<CommentResponse> resp = postCommentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates the comment, returns updated comment&#39;s data.
     * 
     * @return ApiResponse&lt;CommentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<CommentResponse> postCommentWithHttpInfo(PostCommentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postCommentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<CommentResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates the comment, returns updated comment&#39;s data. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postCommentAsync(PostCommentRequest request, final ApiCallback<CommentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postCommentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommentResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postCompareDocument
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postCompareDocumentCall(PostCompareDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getCompareData();

        // create path and map variables
        String localVarPath = "/words/{name}/compareDocument"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postCompareDocumentValidateBeforeCall(PostCompareDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postCompareDocument");
        }
        
        // verify the required parameter 'CompareData' is set
        if (request.getCompareData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'CompareData' when calling postCompareDocument");
        }
        

        com.squareup.okhttp.Call call = postCompareDocumentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Compare document with original document.
     * 
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse postCompareDocument(PostCompareDocumentRequest request) throws ApiException {
        try {
            ApiResponse<DocumentResponse> resp = postCompareDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<DocumentResponse> resp = postCompareDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Compare document with original document.
     * 
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DocumentResponse> postCompareDocumentWithHttpInfo(PostCompareDocumentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postCompareDocumentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Compare document with original document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postCompareDocumentAsync(PostCompareDocumentRequest request, final ApiCallback<DocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postCompareDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDocumentExecuteMailMerge
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postDocumentExecuteMailMergeCall(PostDocumentExecuteMailMergeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/executeMailMerge"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "withRegions", request.getWithRegions());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "mailMergeDataFile", request.getMailMergeDataFile());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "cleanup", request.getCleanup());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "useWholeParagraphAsRegion", request.getUseWholeParagraphAsRegion());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getData() != null)
          localVarFormParams.put("Data", request.getData());

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDocumentExecuteMailMergeValidateBeforeCall(PostDocumentExecuteMailMergeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postDocumentExecuteMailMerge");
        }
        

        com.squareup.okhttp.Call call = postDocumentExecuteMailMergeCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Execute document mail merge operation.
     * 
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse postDocumentExecuteMailMerge(PostDocumentExecuteMailMergeRequest request) throws ApiException {
        try {
            ApiResponse<DocumentResponse> resp = postDocumentExecuteMailMergeWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<DocumentResponse> resp = postDocumentExecuteMailMergeWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Execute document mail merge operation.
     * 
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DocumentResponse> postDocumentExecuteMailMergeWithHttpInfo(PostDocumentExecuteMailMergeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDocumentExecuteMailMergeValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Execute document mail merge operation. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDocumentExecuteMailMergeAsync(PostDocumentExecuteMailMergeRequest request, final ApiCallback<DocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postDocumentExecuteMailMergeValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDocumentParagraphFormat
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postDocumentParagraphFormatCall(PostDocumentParagraphFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getDto();

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/paragraphs/{index}/format"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "nodePath" + "\\}", apiClient.escapeString(request.getNodePath().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDocumentParagraphFormatValidateBeforeCall(PostDocumentParagraphFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postDocumentParagraphFormat");
        }
        
        // verify the required parameter 'Dto' is set
        if (request.getDto() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Dto' when calling postDocumentParagraphFormat");
        }
        
        // verify the required parameter 'NodePath' is set
        if (request.getNodePath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'NodePath' when calling postDocumentParagraphFormat");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling postDocumentParagraphFormat");
        }
        

        com.squareup.okhttp.Call call = postDocumentParagraphFormatCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates paragrpaph format properties, returns updated format properties.
     * 
     * @return ParagraphFormatResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ParagraphFormatResponse postDocumentParagraphFormat(PostDocumentParagraphFormatRequest request) throws ApiException {
        try {
            ApiResponse<ParagraphFormatResponse> resp = postDocumentParagraphFormatWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<ParagraphFormatResponse> resp = postDocumentParagraphFormatWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates paragrpaph format properties, returns updated format properties.
     * 
     * @return ApiResponse&lt;ParagraphFormatResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<ParagraphFormatResponse> postDocumentParagraphFormatWithHttpInfo(PostDocumentParagraphFormatRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDocumentParagraphFormatValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ParagraphFormatResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates paragrpaph format properties, returns updated format properties. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDocumentParagraphFormatAsync(PostDocumentParagraphFormatRequest request, final ApiCallback<ParagraphFormatResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postDocumentParagraphFormatValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ParagraphFormatResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDocumentParagraphRunFont
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postDocumentParagraphRunFontCall(PostDocumentParagraphRunFontRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getFontDto();

        // create path and map variables
        String localVarPath = "/words/{name}/{paragraphPath}/runs/{index}/font"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "paragraphPath" + "\\}", apiClient.escapeString(request.getParagraphPath().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDocumentParagraphRunFontValidateBeforeCall(PostDocumentParagraphRunFontRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postDocumentParagraphRunFont");
        }
        
        // verify the required parameter 'FontDto' is set
        if (request.getFontDto() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'FontDto' when calling postDocumentParagraphRunFont");
        }
        
        // verify the required parameter 'ParagraphPath' is set
        if (request.getParagraphPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'ParagraphPath' when calling postDocumentParagraphRunFont");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling postDocumentParagraphRunFont");
        }
        

        com.squareup.okhttp.Call call = postDocumentParagraphRunFontCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates font properties, returns updated font data.
     * 
     * @return FontResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FontResponse postDocumentParagraphRunFont(PostDocumentParagraphRunFontRequest request) throws ApiException {
        try {
            ApiResponse<FontResponse> resp = postDocumentParagraphRunFontWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<FontResponse> resp = postDocumentParagraphRunFontWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates font properties, returns updated font data.
     * 
     * @return ApiResponse&lt;FontResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<FontResponse> postDocumentParagraphRunFontWithHttpInfo(PostDocumentParagraphRunFontRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDocumentParagraphRunFontValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<FontResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates font properties, returns updated font data. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDocumentParagraphRunFontAsync(PostDocumentParagraphRunFontRequest request, final ApiCallback<FontResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postDocumentParagraphRunFontValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FontResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDocumentSaveAs
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postDocumentSaveAsCall(PostDocumentSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSaveOptionsData();

        // create path and map variables
        String localVarPath = "/words/{name}/saveAs"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "fontsLocation", request.getFontsLocation());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDocumentSaveAsValidateBeforeCall(PostDocumentSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postDocumentSaveAs");
        }
        
        // verify the required parameter 'SaveOptionsData' is set
        if (request.getSaveOptionsData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'SaveOptionsData' when calling postDocumentSaveAs");
        }
        

        com.squareup.okhttp.Call call = postDocumentSaveAsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Convert document to destination format with detailed settings and save result to storage.
     * 
     * @return SaveResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SaveResponse postDocumentSaveAs(PostDocumentSaveAsRequest request) throws ApiException {
        try {
            ApiResponse<SaveResponse> resp = postDocumentSaveAsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<SaveResponse> resp = postDocumentSaveAsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Convert document to destination format with detailed settings and save result to storage.
     * 
     * @return ApiResponse&lt;SaveResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<SaveResponse> postDocumentSaveAsWithHttpInfo(PostDocumentSaveAsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDocumentSaveAsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SaveResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Convert document to destination format with detailed settings and save result to storage. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDocumentSaveAsAsync(PostDocumentSaveAsRequest request, final ApiCallback<SaveResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postDocumentSaveAsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaveResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDrawingObject
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postDrawingObjectCall(PostDrawingObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/drawingObjects/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getDrawingObject() != null)
          localVarFormParams.put("DrawingObject", request.getDrawingObject());
if (request.getImageFile() != null)
          localVarFormParams.put("ImageFile", request.getImageFile());

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDrawingObjectValidateBeforeCall(PostDrawingObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postDrawingObject");
        }
        
        // verify the required parameter 'DrawingObject' is set
        if (request.getDrawingObject() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'DrawingObject' when calling postDrawingObject");
        }
        
        // verify the required parameter 'ImageFile' is set
        if (request.getImageFile() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'ImageFile' when calling postDrawingObject");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling postDrawingObject");
        }
        

        com.squareup.okhttp.Call call = postDrawingObjectCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates drawing object, returns updated  drawing object&#39;s data.
     * 
     * @return DrawingObjectResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DrawingObjectResponse postDrawingObject(PostDrawingObjectRequest request) throws ApiException {
        try {
            ApiResponse<DrawingObjectResponse> resp = postDrawingObjectWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<DrawingObjectResponse> resp = postDrawingObjectWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates drawing object, returns updated  drawing object&#39;s data.
     * 
     * @return ApiResponse&lt;DrawingObjectResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DrawingObjectResponse> postDrawingObjectWithHttpInfo(PostDrawingObjectRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postDrawingObjectValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DrawingObjectResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates drawing object, returns updated  drawing object&#39;s data. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDrawingObjectAsync(PostDrawingObjectRequest request, final ApiCallback<DrawingObjectResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postDrawingObjectValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DrawingObjectResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postExecuteTemplate
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postExecuteTemplateCall(PostExecuteTemplateRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/executeTemplate"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "cleanup", request.getCleanup());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "useWholeParagraphAsRegion", request.getUseWholeParagraphAsRegion());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "withRegions", request.getWithRegions());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getData() != null)
          localVarFormParams.put("Data", request.getData());

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postExecuteTemplateValidateBeforeCall(PostExecuteTemplateRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postExecuteTemplate");
        }
        
        // verify the required parameter 'Data' is set
        if (request.getData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Data' when calling postExecuteTemplate");
        }
        

        com.squareup.okhttp.Call call = postExecuteTemplateCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Populate document template with data.
     * 
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse postExecuteTemplate(PostExecuteTemplateRequest request) throws ApiException {
        try {
            ApiResponse<DocumentResponse> resp = postExecuteTemplateWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<DocumentResponse> resp = postExecuteTemplateWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Populate document template with data.
     * 
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DocumentResponse> postExecuteTemplateWithHttpInfo(PostExecuteTemplateRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postExecuteTemplateValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Populate document template with data. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postExecuteTemplateAsync(PostExecuteTemplateRequest request, final ApiCallback<DocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postExecuteTemplateValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postField
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postFieldCall(PostFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getField();

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/fields/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postFieldValidateBeforeCall(PostFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postField");
        }
        
        // verify the required parameter 'Field' is set
        if (request.getField() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Field' when calling postField");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling postField");
        }
        

        com.squareup.okhttp.Call call = postFieldCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates field&#39;s properties, returns updated field&#39;s data.
     * 
     * @return FieldResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FieldResponse postField(PostFieldRequest request) throws ApiException {
        try {
            ApiResponse<FieldResponse> resp = postFieldWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<FieldResponse> resp = postFieldWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates field&#39;s properties, returns updated field&#39;s data.
     * 
     * @return ApiResponse&lt;FieldResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<FieldResponse> postFieldWithHttpInfo(PostFieldRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postFieldValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<FieldResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates field&#39;s properties, returns updated field&#39;s data. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postFieldAsync(PostFieldRequest request, final ApiCallback<FieldResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postFieldValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FieldResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postFootnote
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postFootnoteCall(PostFootnoteRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getFootnoteDto();

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/footnotes/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postFootnoteValidateBeforeCall(PostFootnoteRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postFootnote");
        }
        
        // verify the required parameter 'FootnoteDto' is set
        if (request.getFootnoteDto() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'FootnoteDto' when calling postFootnote");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling postFootnote");
        }
        

        com.squareup.okhttp.Call call = postFootnoteCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates footnote&#39;s properties, returns updated run&#39;s data.
     * 
     * @return FootnoteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FootnoteResponse postFootnote(PostFootnoteRequest request) throws ApiException {
        try {
            ApiResponse<FootnoteResponse> resp = postFootnoteWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<FootnoteResponse> resp = postFootnoteWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates footnote&#39;s properties, returns updated run&#39;s data.
     * 
     * @return ApiResponse&lt;FootnoteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<FootnoteResponse> postFootnoteWithHttpInfo(PostFootnoteRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postFootnoteValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<FootnoteResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates footnote&#39;s properties, returns updated run&#39;s data. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postFootnoteAsync(PostFootnoteRequest request, final ApiCallback<FootnoteResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postFootnoteValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FootnoteResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postFormField
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postFormFieldCall(PostFormFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getFormField();

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/formfields/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postFormFieldValidateBeforeCall(PostFormFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postFormField");
        }
        
        // verify the required parameter 'FormField' is set
        if (request.getFormField() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'FormField' when calling postFormField");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling postFormField");
        }
        

        com.squareup.okhttp.Call call = postFormFieldCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates properties of form field, returns updated form field.
     * 
     * @return FormFieldResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FormFieldResponse postFormField(PostFormFieldRequest request) throws ApiException {
        try {
            ApiResponse<FormFieldResponse> resp = postFormFieldWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<FormFieldResponse> resp = postFormFieldWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates properties of form field, returns updated form field.
     * 
     * @return ApiResponse&lt;FormFieldResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<FormFieldResponse> postFormFieldWithHttpInfo(PostFormFieldRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postFormFieldValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<FormFieldResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates properties of form field, returns updated form field. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postFormFieldAsync(PostFormFieldRequest request, final ApiCallback<FormFieldResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postFormFieldValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FormFieldResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postInsertDocumentWatermarkImage
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postInsertDocumentWatermarkImageCall(PostInsertDocumentWatermarkImageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/watermark/insertImage"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "rotationAngle", request.getRotationAngle());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "image", request.getImage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getImageFile() != null)
          localVarFormParams.put("ImageFile", request.getImageFile());

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postInsertDocumentWatermarkImageValidateBeforeCall(PostInsertDocumentWatermarkImageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postInsertDocumentWatermarkImage");
        }
        

        com.squareup.okhttp.Call call = postInsertDocumentWatermarkImageCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insert document watermark image.
     * 
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse postInsertDocumentWatermarkImage(PostInsertDocumentWatermarkImageRequest request) throws ApiException {
        try {
            ApiResponse<DocumentResponse> resp = postInsertDocumentWatermarkImageWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<DocumentResponse> resp = postInsertDocumentWatermarkImageWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Insert document watermark image.
     * 
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DocumentResponse> postInsertDocumentWatermarkImageWithHttpInfo(PostInsertDocumentWatermarkImageRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postInsertDocumentWatermarkImageValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insert document watermark image. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postInsertDocumentWatermarkImageAsync(PostInsertDocumentWatermarkImageRequest request, final ApiCallback<DocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postInsertDocumentWatermarkImageValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postInsertDocumentWatermarkText
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postInsertDocumentWatermarkTextCall(PostInsertDocumentWatermarkTextRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getWatermarkText();

        // create path and map variables
        String localVarPath = "/words/{name}/watermark/insertText"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postInsertDocumentWatermarkTextValidateBeforeCall(PostInsertDocumentWatermarkTextRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postInsertDocumentWatermarkText");
        }
        
        // verify the required parameter 'WatermarkText' is set
        if (request.getWatermarkText() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'WatermarkText' when calling postInsertDocumentWatermarkText");
        }
        

        com.squareup.okhttp.Call call = postInsertDocumentWatermarkTextCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insert document watermark text.
     * 
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse postInsertDocumentWatermarkText(PostInsertDocumentWatermarkTextRequest request) throws ApiException {
        try {
            ApiResponse<DocumentResponse> resp = postInsertDocumentWatermarkTextWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<DocumentResponse> resp = postInsertDocumentWatermarkTextWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Insert document watermark text.
     * 
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DocumentResponse> postInsertDocumentWatermarkTextWithHttpInfo(PostInsertDocumentWatermarkTextRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postInsertDocumentWatermarkTextValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insert document watermark text. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postInsertDocumentWatermarkTextAsync(PostInsertDocumentWatermarkTextRequest request, final ApiCallback<DocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postInsertDocumentWatermarkTextValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postInsertPageNumbers
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postInsertPageNumbersCall(PostInsertPageNumbersRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getPageNumber();

        // create path and map variables
        String localVarPath = "/words/{name}/insertPageNumbers"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postInsertPageNumbersValidateBeforeCall(PostInsertPageNumbersRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postInsertPageNumbers");
        }
        
        // verify the required parameter 'PageNumber' is set
        if (request.getPageNumber() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'PageNumber' when calling postInsertPageNumbers");
        }
        

        com.squareup.okhttp.Call call = postInsertPageNumbersCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insert document page numbers.
     * 
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse postInsertPageNumbers(PostInsertPageNumbersRequest request) throws ApiException {
        try {
            ApiResponse<DocumentResponse> resp = postInsertPageNumbersWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<DocumentResponse> resp = postInsertPageNumbersWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Insert document page numbers.
     * 
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DocumentResponse> postInsertPageNumbersWithHttpInfo(PostInsertPageNumbersRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postInsertPageNumbersValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insert document page numbers. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postInsertPageNumbersAsync(PostInsertPageNumbersRequest request, final ApiCallback<DocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postInsertPageNumbersValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postLoadWebDocument
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postLoadWebDocumentCall(PostLoadWebDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getData();

        // create path and map variables
        String localVarPath = "/words/loadWebDocument";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postLoadWebDocumentValidateBeforeCall(PostLoadWebDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Data' is set
        if (request.getData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Data' when calling postLoadWebDocument");
        }
        

        com.squareup.okhttp.Call call = postLoadWebDocumentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Loads new document from web into the file with any supported format of data.
     * 
     * @return SaveResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SaveResponse postLoadWebDocument(PostLoadWebDocumentRequest request) throws ApiException {
        try {
            ApiResponse<SaveResponse> resp = postLoadWebDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<SaveResponse> resp = postLoadWebDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Loads new document from web into the file with any supported format of data.
     * 
     * @return ApiResponse&lt;SaveResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<SaveResponse> postLoadWebDocumentWithHttpInfo(PostLoadWebDocumentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postLoadWebDocumentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SaveResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Loads new document from web into the file with any supported format of data. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLoadWebDocumentAsync(PostLoadWebDocumentRequest request, final ApiCallback<SaveResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postLoadWebDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaveResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postReplaceText
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postReplaceTextCall(PostReplaceTextRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getReplaceText();

        // create path and map variables
        String localVarPath = "/words/{name}/replaceText"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postReplaceTextValidateBeforeCall(PostReplaceTextRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postReplaceText");
        }
        
        // verify the required parameter 'ReplaceText' is set
        if (request.getReplaceText() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'ReplaceText' when calling postReplaceText");
        }
        

        com.squareup.okhttp.Call call = postReplaceTextCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Replace document text.
     * 
     * @return ReplaceTextResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ReplaceTextResponse postReplaceText(PostReplaceTextRequest request) throws ApiException {
        try {
            ApiResponse<ReplaceTextResponse> resp = postReplaceTextWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<ReplaceTextResponse> resp = postReplaceTextWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Replace document text.
     * 
     * @return ApiResponse&lt;ReplaceTextResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<ReplaceTextResponse> postReplaceTextWithHttpInfo(PostReplaceTextRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postReplaceTextValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ReplaceTextResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Replace document text. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postReplaceTextAsync(PostReplaceTextRequest request, final ApiCallback<ReplaceTextResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postReplaceTextValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ReplaceTextResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postRun
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postRunCall(PostRunRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getRun();

        // create path and map variables
        String localVarPath = "/words/{name}/{paragraphPath}/runs/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "paragraphPath" + "\\}", apiClient.escapeString(request.getParagraphPath().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postRunValidateBeforeCall(PostRunRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postRun");
        }
        
        // verify the required parameter 'Run' is set
        if (request.getRun() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Run' when calling postRun");
        }
        
        // verify the required parameter 'ParagraphPath' is set
        if (request.getParagraphPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'ParagraphPath' when calling postRun");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling postRun");
        }
        

        com.squareup.okhttp.Call call = postRunCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates run&#39;s properties, returns updated run&#39;s data.
     * 
     * @return RunResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RunResponse postRun(PostRunRequest request) throws ApiException {
        try {
            ApiResponse<RunResponse> resp = postRunWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<RunResponse> resp = postRunWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates run&#39;s properties, returns updated run&#39;s data.
     * 
     * @return ApiResponse&lt;RunResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<RunResponse> postRunWithHttpInfo(PostRunRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postRunValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<RunResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates run&#39;s properties, returns updated run&#39;s data. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postRunAsync(PostRunRequest request, final ApiCallback<RunResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postRunValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RunResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postSplitDocument
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postSplitDocumentCall(PostSplitDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/split"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "from", request.getFrom());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "to", request.getTo());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "zipOutput", request.getZipOutput());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "fontsLocation", request.getFontsLocation());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postSplitDocumentValidateBeforeCall(PostSplitDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postSplitDocument");
        }
        

        com.squareup.okhttp.Call call = postSplitDocumentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Split document.
     * 
     * @return SplitDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SplitDocumentResponse postSplitDocument(PostSplitDocumentRequest request) throws ApiException {
        try {
            ApiResponse<SplitDocumentResponse> resp = postSplitDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<SplitDocumentResponse> resp = postSplitDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Split document.
     * 
     * @return ApiResponse&lt;SplitDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<SplitDocumentResponse> postSplitDocumentWithHttpInfo(PostSplitDocumentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSplitDocumentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SplitDocumentResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Split document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSplitDocumentAsync(PostSplitDocumentRequest request, final ApiCallback<SplitDocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSplitDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SplitDocumentResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postUpdateDocumentBookmark
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postUpdateDocumentBookmarkCall(PostUpdateDocumentBookmarkRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getBookmarkData();

        // create path and map variables
        String localVarPath = "/words/{name}/bookmarks/{bookmarkName}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "bookmarkName" + "\\}", apiClient.escapeString(request.getBookmarkName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postUpdateDocumentBookmarkValidateBeforeCall(PostUpdateDocumentBookmarkRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postUpdateDocumentBookmark");
        }
        
        // verify the required parameter 'BookmarkData' is set
        if (request.getBookmarkData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'BookmarkData' when calling postUpdateDocumentBookmark");
        }
        
        // verify the required parameter 'BookmarkName' is set
        if (request.getBookmarkName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'BookmarkName' when calling postUpdateDocumentBookmark");
        }
        

        com.squareup.okhttp.Call call = postUpdateDocumentBookmarkCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update document bookmark.
     * 
     * @return BookmarkResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BookmarkResponse postUpdateDocumentBookmark(PostUpdateDocumentBookmarkRequest request) throws ApiException {
        try {
            ApiResponse<BookmarkResponse> resp = postUpdateDocumentBookmarkWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<BookmarkResponse> resp = postUpdateDocumentBookmarkWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Update document bookmark.
     * 
     * @return ApiResponse&lt;BookmarkResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<BookmarkResponse> postUpdateDocumentBookmarkWithHttpInfo(PostUpdateDocumentBookmarkRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postUpdateDocumentBookmarkValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<BookmarkResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update document bookmark. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUpdateDocumentBookmarkAsync(PostUpdateDocumentBookmarkRequest request, final ApiCallback<BookmarkResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postUpdateDocumentBookmarkValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BookmarkResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postUpdateDocumentFields
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postUpdateDocumentFieldsCall(PostUpdateDocumentFieldsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/updateFields"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postUpdateDocumentFieldsValidateBeforeCall(PostUpdateDocumentFieldsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postUpdateDocumentFields");
        }
        

        com.squareup.okhttp.Call call = postUpdateDocumentFieldsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update (reevaluate) fields in document.
     * 
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse postUpdateDocumentFields(PostUpdateDocumentFieldsRequest request) throws ApiException {
        try {
            ApiResponse<DocumentResponse> resp = postUpdateDocumentFieldsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<DocumentResponse> resp = postUpdateDocumentFieldsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Update (reevaluate) fields in document.
     * 
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DocumentResponse> postUpdateDocumentFieldsWithHttpInfo(PostUpdateDocumentFieldsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postUpdateDocumentFieldsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update (reevaluate) fields in document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUpdateDocumentFieldsAsync(PostUpdateDocumentFieldsRequest request, final ApiCallback<DocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postUpdateDocumentFieldsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putComment
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putCommentCall(PutCommentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getComment();

        // create path and map variables
        String localVarPath = "/words/{name}/comments"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putCommentValidateBeforeCall(PutCommentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling putComment");
        }
        
        // verify the required parameter 'Comment' is set
        if (request.getComment() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Comment' when calling putComment");
        }
        

        com.squareup.okhttp.Call call = putCommentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Adds comment to document, returns inserted comment&#39;s data.
     * 
     * @return CommentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommentResponse putComment(PutCommentRequest request) throws ApiException {
        try {
            ApiResponse<CommentResponse> resp = putCommentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<CommentResponse> resp = putCommentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Adds comment to document, returns inserted comment&#39;s data.
     * 
     * @return ApiResponse&lt;CommentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<CommentResponse> putCommentWithHttpInfo(PutCommentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putCommentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<CommentResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds comment to document, returns inserted comment&#39;s data. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putCommentAsync(PutCommentRequest request, final ApiCallback<CommentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putCommentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommentResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putConvertDocument
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putConvertDocumentCall(PutConvertDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/convert";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "outPath", request.getOutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "documentFileName", request.getDocumentFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "fontsLocation", request.getFontsLocation());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getDocument() != null)
          localVarFormParams.put("Document", request.getDocument());

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putConvertDocumentValidateBeforeCall(PutConvertDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Document' is set
        if (request.getDocument() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Document' when calling putConvertDocument");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Format' when calling putConvertDocument");
        }
        

        com.squareup.okhttp.Call call = putConvertDocumentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Convert document from request content to format specified.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putConvertDocument(PutConvertDocumentRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = putConvertDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = putConvertDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Convert document from request content to format specified.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> putConvertDocumentWithHttpInfo(PutConvertDocumentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putConvertDocumentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Convert document from request content to format specified. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putConvertDocumentAsync(PutConvertDocumentRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putConvertDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putCreateDocument
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putCreateDocumentCall(PutCreateDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/create";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "fileName", request.getFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putCreateDocumentValidateBeforeCall(PutCreateDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = putCreateDocumentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates new document. Document is created with format which is recognized from file extensions.  Supported extentions: \&quot;.doc\&quot;, \&quot;.docx\&quot;, \&quot;.docm\&quot;, \&quot;.dot\&quot;, \&quot;.dotm\&quot;, \&quot;.dotx\&quot;, \&quot;.flatopc\&quot;, \&quot;.fopc\&quot;, \&quot;.flatopc_macro\&quot;, \&quot;.fopc_macro\&quot;, \&quot;.flatopc_template\&quot;, \&quot;.fopc_template\&quot;, \&quot;.flatopc_template_macro\&quot;, \&quot;.fopc_template_macro\&quot;, \&quot;.wordml\&quot;, \&quot;.wml\&quot;, \&quot;.rtf\&quot;
     * 
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse putCreateDocument(PutCreateDocumentRequest request) throws ApiException {
        try {
            ApiResponse<DocumentResponse> resp = putCreateDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<DocumentResponse> resp = putCreateDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Creates new document. Document is created with format which is recognized from file extensions.  Supported extentions: \&quot;.doc\&quot;, \&quot;.docx\&quot;, \&quot;.docm\&quot;, \&quot;.dot\&quot;, \&quot;.dotm\&quot;, \&quot;.dotx\&quot;, \&quot;.flatopc\&quot;, \&quot;.fopc\&quot;, \&quot;.flatopc_macro\&quot;, \&quot;.fopc_macro\&quot;, \&quot;.flatopc_template\&quot;, \&quot;.fopc_template\&quot;, \&quot;.flatopc_template_macro\&quot;, \&quot;.fopc_template_macro\&quot;, \&quot;.wordml\&quot;, \&quot;.wml\&quot;, \&quot;.rtf\&quot;
     * 
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DocumentResponse> putCreateDocumentWithHttpInfo(PutCreateDocumentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putCreateDocumentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates new document. Document is created with format which is recognized from file extensions.  Supported extentions: \&quot;.doc\&quot;, \&quot;.docx\&quot;, \&quot;.docm\&quot;, \&quot;.dot\&quot;, \&quot;.dotm\&quot;, \&quot;.dotx\&quot;, \&quot;.flatopc\&quot;, \&quot;.fopc\&quot;, \&quot;.flatopc_macro\&quot;, \&quot;.fopc_macro\&quot;, \&quot;.flatopc_template\&quot;, \&quot;.fopc_template\&quot;, \&quot;.flatopc_template_macro\&quot;, \&quot;.fopc_template_macro\&quot;, \&quot;.wordml\&quot;, \&quot;.wml\&quot;, \&quot;.rtf\&quot; (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putCreateDocumentAsync(PutCreateDocumentRequest request, final ApiCallback<DocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putCreateDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putDocumentFieldNames
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putDocumentFieldNamesCall(PutDocumentFieldNamesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/mailMergeFieldNames";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "useNonMergeFields", request.getUseNonMergeFields());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getTemplate() != null)
          localVarFormParams.put("Template", request.getTemplate());

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putDocumentFieldNamesValidateBeforeCall(PutDocumentFieldNamesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Template' is set
        if (request.getTemplate() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Template' when calling putDocumentFieldNames");
        }
        

        com.squareup.okhttp.Call call = putDocumentFieldNamesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document field names.
     * 
     * @return FieldNamesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FieldNamesResponse putDocumentFieldNames(PutDocumentFieldNamesRequest request) throws ApiException {
        try {
            ApiResponse<FieldNamesResponse> resp = putDocumentFieldNamesWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<FieldNamesResponse> resp = putDocumentFieldNamesWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Read document field names.
     * 
     * @return ApiResponse&lt;FieldNamesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<FieldNamesResponse> putDocumentFieldNamesWithHttpInfo(PutDocumentFieldNamesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putDocumentFieldNamesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<FieldNamesResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document field names. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putDocumentFieldNamesAsync(PutDocumentFieldNamesRequest request, final ApiCallback<FieldNamesResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putDocumentFieldNamesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FieldNamesResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putDocumentSaveAsTiff
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putDocumentSaveAsTiffCall(PutDocumentSaveAsTiffRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getSaveOptions();

        // create path and map variables
        String localVarPath = "/words/{name}/saveAs/tiff"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "resultFile", request.getResultFile());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "useAntiAliasing", request.getUseAntiAliasing());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "useHighQualityRendering", request.getUseHighQualityRendering());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "imageBrightness", request.getImageBrightness());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "imageColorMode", request.getImageColorMode());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "imageContrast", request.getImageContrast());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "numeralFormat", request.getNumeralFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "pageCount", request.getPageCount());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "pageIndex", request.getPageIndex());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "paperColor", request.getPaperColor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "pixelFormat", request.getPixelFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "resolution", request.getResolution());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "scale", request.getScale());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "tiffCompression", request.getTiffCompression());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "dmlRenderingMode", request.getDmlRenderingMode());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "dmlEffectsRenderingMode", request.getDmlEffectsRenderingMode());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "tiffBinarizationMethod", request.getTiffBinarizationMethod());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "zipOutput", request.getZipOutput());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "fontsLocation", request.getFontsLocation());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putDocumentSaveAsTiffValidateBeforeCall(PutDocumentSaveAsTiffRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling putDocumentSaveAsTiff");
        }
        
        // verify the required parameter 'SaveOptions' is set
        if (request.getSaveOptions() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'SaveOptions' when calling putDocumentSaveAsTiff");
        }
        

        com.squareup.okhttp.Call call = putDocumentSaveAsTiffCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Convert document to tiff with detailed settings and save result to storage.
     * 
     * @return SaveResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SaveResponse putDocumentSaveAsTiff(PutDocumentSaveAsTiffRequest request) throws ApiException {
        try {
            ApiResponse<SaveResponse> resp = putDocumentSaveAsTiffWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<SaveResponse> resp = putDocumentSaveAsTiffWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Convert document to tiff with detailed settings and save result to storage.
     * 
     * @return ApiResponse&lt;SaveResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<SaveResponse> putDocumentSaveAsTiffWithHttpInfo(PutDocumentSaveAsTiffRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putDocumentSaveAsTiffValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SaveResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Convert document to tiff with detailed settings and save result to storage. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putDocumentSaveAsTiffAsync(PutDocumentSaveAsTiffRequest request, final ApiCallback<SaveResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putDocumentSaveAsTiffValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaveResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putDrawingObject
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putDrawingObjectCall(PutDrawingObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/drawingObjects"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getDrawingObject() != null)
          localVarFormParams.put("DrawingObject", request.getDrawingObject());
if (request.getImageFile() != null)
          localVarFormParams.put("ImageFile", request.getImageFile());

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putDrawingObjectValidateBeforeCall(PutDrawingObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling putDrawingObject");
        }
        
        // verify the required parameter 'DrawingObject' is set
        if (request.getDrawingObject() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'DrawingObject' when calling putDrawingObject");
        }
        
        // verify the required parameter 'ImageFile' is set
        if (request.getImageFile() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'ImageFile' when calling putDrawingObject");
        }
        

        com.squareup.okhttp.Call call = putDrawingObjectCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Adds  drawing object to document, returns added  drawing object&#39;s data.
     * 
     * @return DrawingObjectResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DrawingObjectResponse putDrawingObject(PutDrawingObjectRequest request) throws ApiException {
        try {
            ApiResponse<DrawingObjectResponse> resp = putDrawingObjectWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<DrawingObjectResponse> resp = putDrawingObjectWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Adds  drawing object to document, returns added  drawing object&#39;s data.
     * 
     * @return ApiResponse&lt;DrawingObjectResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DrawingObjectResponse> putDrawingObjectWithHttpInfo(PutDrawingObjectRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putDrawingObjectValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DrawingObjectResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds  drawing object to document, returns added  drawing object&#39;s data. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putDrawingObjectAsync(PutDrawingObjectRequest request, final ApiCallback<DrawingObjectResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putDrawingObjectValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DrawingObjectResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putExecuteMailMergeOnline
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putExecuteMailMergeOnlineCall(PutExecuteMailMergeOnlineRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/executeMailMerge";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "withRegions", request.getWithRegions());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "cleanup", request.getCleanup());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "documentFileName", request.getDocumentFileName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getTemplate() != null)
          localVarFormParams.put("Template", request.getTemplate());
if (request.getData() != null)
          localVarFormParams.put("Data", request.getData());

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putExecuteMailMergeOnlineValidateBeforeCall(PutExecuteMailMergeOnlineRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Template' is set
        if (request.getTemplate() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Template' when calling putExecuteMailMergeOnline");
        }
        
        // verify the required parameter 'Data' is set
        if (request.getData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Data' when calling putExecuteMailMergeOnline");
        }
        

        com.squareup.okhttp.Call call = putExecuteMailMergeOnlineCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Execute document mail merge online.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putExecuteMailMergeOnline(PutExecuteMailMergeOnlineRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = putExecuteMailMergeOnlineWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = putExecuteMailMergeOnlineWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Execute document mail merge online.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> putExecuteMailMergeOnlineWithHttpInfo(PutExecuteMailMergeOnlineRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putExecuteMailMergeOnlineValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Execute document mail merge online. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putExecuteMailMergeOnlineAsync(PutExecuteMailMergeOnlineRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putExecuteMailMergeOnlineValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putExecuteTemplateOnline
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putExecuteTemplateOnlineCall(PutExecuteTemplateOnlineRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/executeTemplate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "cleanup", request.getCleanup());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "useWholeParagraphAsRegion", request.getUseWholeParagraphAsRegion());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "withRegions", request.getWithRegions());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "documentFileName", request.getDocumentFileName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getTemplate() != null)
          localVarFormParams.put("Template", request.getTemplate());
if (request.getData() != null)
          localVarFormParams.put("Data", request.getData());

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putExecuteTemplateOnlineValidateBeforeCall(PutExecuteTemplateOnlineRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Template' is set
        if (request.getTemplate() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Template' when calling putExecuteTemplateOnline");
        }
        
        // verify the required parameter 'Data' is set
        if (request.getData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Data' when calling putExecuteTemplateOnline");
        }
        

        com.squareup.okhttp.Call call = putExecuteTemplateOnlineCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Populate document template with data online.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putExecuteTemplateOnline(PutExecuteTemplateOnlineRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = putExecuteTemplateOnlineWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = putExecuteTemplateOnlineWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Populate document template with data online.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> putExecuteTemplateOnlineWithHttpInfo(PutExecuteTemplateOnlineRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putExecuteTemplateOnlineValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Populate document template with data online. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putExecuteTemplateOnlineAsync(PutExecuteTemplateOnlineRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putExecuteTemplateOnlineValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putField
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putFieldCall(PutFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getField();

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/fields"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "insertBeforeNode", request.getInsertBeforeNode());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putFieldValidateBeforeCall(PutFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling putField");
        }
        
        // verify the required parameter 'Field' is set
        if (request.getField() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Field' when calling putField");
        }
        

        com.squareup.okhttp.Call call = putFieldCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Adds field to document, returns inserted field&#39;s data.
     * 
     * @return FieldResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FieldResponse putField(PutFieldRequest request) throws ApiException {
        try {
            ApiResponse<FieldResponse> resp = putFieldWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<FieldResponse> resp = putFieldWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Adds field to document, returns inserted field&#39;s data.
     * 
     * @return ApiResponse&lt;FieldResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<FieldResponse> putFieldWithHttpInfo(PutFieldRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putFieldValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<FieldResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds field to document, returns inserted field&#39;s data. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putFieldAsync(PutFieldRequest request, final ApiCallback<FieldResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putFieldValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FieldResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putFootnote
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putFootnoteCall(PutFootnoteRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getFootnoteDto();

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/footnotes"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putFootnoteValidateBeforeCall(PutFootnoteRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling putFootnote");
        }
        
        // verify the required parameter 'FootnoteDto' is set
        if (request.getFootnoteDto() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'FootnoteDto' when calling putFootnote");
        }
        

        com.squareup.okhttp.Call call = putFootnoteCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Adds footnote to document, returns added footnote&#39;s data.
     * 
     * @return FootnoteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FootnoteResponse putFootnote(PutFootnoteRequest request) throws ApiException {
        try {
            ApiResponse<FootnoteResponse> resp = putFootnoteWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<FootnoteResponse> resp = putFootnoteWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Adds footnote to document, returns added footnote&#39;s data.
     * 
     * @return ApiResponse&lt;FootnoteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<FootnoteResponse> putFootnoteWithHttpInfo(PutFootnoteRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putFootnoteValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<FootnoteResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds footnote to document, returns added footnote&#39;s data. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putFootnoteAsync(PutFootnoteRequest request, final ApiCallback<FootnoteResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putFootnoteValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FootnoteResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putFormField
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putFormFieldCall(PutFormFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getFormField();

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/formfields"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "insertBeforeNode", request.getInsertBeforeNode());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putFormFieldValidateBeforeCall(PutFormFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling putFormField");
        }
        
        // verify the required parameter 'FormField' is set
        if (request.getFormField() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'FormField' when calling putFormField");
        }
        

        com.squareup.okhttp.Call call = putFormFieldCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Adds form field to paragraph, returns added form field&#39;s data.
     * 
     * @return FormFieldResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FormFieldResponse putFormField(PutFormFieldRequest request) throws ApiException {
        try {
            ApiResponse<FormFieldResponse> resp = putFormFieldWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<FormFieldResponse> resp = putFormFieldWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Adds form field to paragraph, returns added form field&#39;s data.
     * 
     * @return ApiResponse&lt;FormFieldResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<FormFieldResponse> putFormFieldWithHttpInfo(PutFormFieldRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putFormFieldValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<FormFieldResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds form field to paragraph, returns added form field&#39;s data. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putFormFieldAsync(PutFormFieldRequest request, final ApiCallback<FormFieldResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putFormFieldValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FormFieldResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putHeaderFooter
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putHeaderFooterCall(PutHeaderFooterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getHeaderFooterType();

        // create path and map variables
        String localVarPath = "/words/{name}/{sectionPath}/headersfooters"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "sectionPath", request.getSectionPath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putHeaderFooterValidateBeforeCall(PutHeaderFooterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling putHeaderFooter");
        }
        
        // verify the required parameter 'HeaderFooterType' is set
        if (request.getHeaderFooterType() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'HeaderFooterType' when calling putHeaderFooter");
        }
        

        com.squareup.okhttp.Call call = putHeaderFooterCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insert to document header or footer.
     * 
     * @return HeaderFooterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HeaderFooterResponse putHeaderFooter(PutHeaderFooterRequest request) throws ApiException {
        try {
            ApiResponse<HeaderFooterResponse> resp = putHeaderFooterWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<HeaderFooterResponse> resp = putHeaderFooterWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Insert to document header or footer.
     * 
     * @return ApiResponse&lt;HeaderFooterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<HeaderFooterResponse> putHeaderFooterWithHttpInfo(PutHeaderFooterRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putHeaderFooterValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<HeaderFooterResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insert to document header or footer. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putHeaderFooterAsync(PutHeaderFooterRequest request, final ApiCallback<HeaderFooterResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putHeaderFooterValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HeaderFooterResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putParagraph
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putParagraphCall(PutParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getParagraph();

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/paragraphs"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "insertBeforeNode", request.getInsertBeforeNode());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putParagraphValidateBeforeCall(PutParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling putParagraph");
        }
        
        // verify the required parameter 'Paragraph' is set
        if (request.getParagraph() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Paragraph' when calling putParagraph");
        }
        

        com.squareup.okhttp.Call call = putParagraphCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Adds paragraph to document, returns added paragraph&#39;s data.
     * 
     * @return ParagraphResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ParagraphResponse putParagraph(PutParagraphRequest request) throws ApiException {
        try {
            ApiResponse<ParagraphResponse> resp = putParagraphWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<ParagraphResponse> resp = putParagraphWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Adds paragraph to document, returns added paragraph&#39;s data.
     * 
     * @return ApiResponse&lt;ParagraphResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<ParagraphResponse> putParagraphWithHttpInfo(PutParagraphRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putParagraphValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ParagraphResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds paragraph to document, returns added paragraph&#39;s data. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putParagraphAsync(PutParagraphRequest request, final ApiCallback<ParagraphResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putParagraphValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ParagraphResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putProtectDocument
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putProtectDocumentCall(PutProtectDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getProtectionRequest();

        // create path and map variables
        String localVarPath = "/words/{name}/protection"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putProtectDocumentValidateBeforeCall(PutProtectDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling putProtectDocument");
        }
        
        // verify the required parameter 'ProtectionRequest' is set
        if (request.getProtectionRequest() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'ProtectionRequest' when calling putProtectDocument");
        }
        

        com.squareup.okhttp.Call call = putProtectDocumentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Protect document.
     * 
     * @return ProtectionDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProtectionDataResponse putProtectDocument(PutProtectDocumentRequest request) throws ApiException {
        try {
            ApiResponse<ProtectionDataResponse> resp = putProtectDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<ProtectionDataResponse> resp = putProtectDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Protect document.
     * 
     * @return ApiResponse&lt;ProtectionDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<ProtectionDataResponse> putProtectDocumentWithHttpInfo(PutProtectDocumentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putProtectDocumentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ProtectionDataResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Protect document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putProtectDocumentAsync(PutProtectDocumentRequest request, final ApiCallback<ProtectionDataResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putProtectDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProtectionDataResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putRun
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putRunCall(PutRunRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getRun();

        // create path and map variables
        String localVarPath = "/words/{name}/{paragraphPath}/runs"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "paragraphPath" + "\\}", apiClient.escapeString(request.getParagraphPath().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "insertBeforeNode", request.getInsertBeforeNode());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putRunValidateBeforeCall(PutRunRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling putRun");
        }
        
        // verify the required parameter 'ParagraphPath' is set
        if (request.getParagraphPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'ParagraphPath' when calling putRun");
        }
        
        // verify the required parameter 'Run' is set
        if (request.getRun() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Run' when calling putRun");
        }
        

        com.squareup.okhttp.Call call = putRunCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Adds run to document, returns added paragraph&#39;s data.
     * 
     * @return RunResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RunResponse putRun(PutRunRequest request) throws ApiException {
        try {
            ApiResponse<RunResponse> resp = putRunWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<RunResponse> resp = putRunWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Adds run to document, returns added paragraph&#39;s data.
     * 
     * @return ApiResponse&lt;RunResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<RunResponse> putRunWithHttpInfo(PutRunRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putRunValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<RunResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds run to document, returns added paragraph&#39;s data. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putRunAsync(PutRunRequest request, final ApiCallback<RunResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putRunValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RunResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rejectAllRevisions
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call rejectAllRevisionsCall(RejectAllRevisionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/revisions/rejectAll"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call rejectAllRevisionsValidateBeforeCall(RejectAllRevisionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling rejectAllRevisions");
        }
        

        com.squareup.okhttp.Call call = rejectAllRevisionsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Reject all revisions in document
     * 
     * @return RevisionsModificationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RevisionsModificationResponse rejectAllRevisions(RejectAllRevisionsRequest request) throws ApiException {
        try {
            ApiResponse<RevisionsModificationResponse> resp = rejectAllRevisionsWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<RevisionsModificationResponse> resp = rejectAllRevisionsWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Reject all revisions in document
     * 
     * @return ApiResponse&lt;RevisionsModificationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<RevisionsModificationResponse> rejectAllRevisionsWithHttpInfo(RejectAllRevisionsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = rejectAllRevisionsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<RevisionsModificationResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Reject all revisions in document (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rejectAllRevisionsAsync(RejectAllRevisionsRequest request, final ApiCallback<RevisionsModificationResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = rejectAllRevisionsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RevisionsModificationResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for renderDrawingObject
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call renderDrawingObjectCall(RenderDrawingObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/drawingObjects/{index}/render"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "fontsLocation", request.getFontsLocation());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call renderDrawingObjectValidateBeforeCall(RenderDrawingObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling renderDrawingObject");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Format' when calling renderDrawingObject");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling renderDrawingObject");
        }
        

        com.squareup.okhttp.Call call = renderDrawingObjectCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Renders drawing object to specified format.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File renderDrawingObject(RenderDrawingObjectRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = renderDrawingObjectWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = renderDrawingObjectWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Renders drawing object to specified format.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> renderDrawingObjectWithHttpInfo(RenderDrawingObjectRequest request) throws ApiException {
        com.squareup.okhttp.Call call = renderDrawingObjectValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Renders drawing object to specified format. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call renderDrawingObjectAsync(RenderDrawingObjectRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = renderDrawingObjectValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for renderMathObject
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call renderMathObjectCall(RenderMathObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/OfficeMathObjects/{index}/render"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "fontsLocation", request.getFontsLocation());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call renderMathObjectValidateBeforeCall(RenderMathObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling renderMathObject");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Format' when calling renderMathObject");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling renderMathObject");
        }
        

        com.squareup.okhttp.Call call = renderMathObjectCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Renders math object to specified format.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File renderMathObject(RenderMathObjectRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = renderMathObjectWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = renderMathObjectWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Renders math object to specified format.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> renderMathObjectWithHttpInfo(RenderMathObjectRequest request) throws ApiException {
        com.squareup.okhttp.Call call = renderMathObjectValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Renders math object to specified format. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call renderMathObjectAsync(RenderMathObjectRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = renderMathObjectValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for renderPage
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call renderPageCall(RenderPageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/pages/{pageIndex}/render"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "pageIndex" + "\\}", apiClient.escapeString(request.getPageIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "fontsLocation", request.getFontsLocation());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call renderPageValidateBeforeCall(RenderPageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling renderPage");
        }
        
        // verify the required parameter 'PageIndex' is set
        if (request.getPageIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'PageIndex' when calling renderPage");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Format' when calling renderPage");
        }
        

        com.squareup.okhttp.Call call = renderPageCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Renders page to specified format.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File renderPage(RenderPageRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = renderPageWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = renderPageWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Renders page to specified format.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> renderPageWithHttpInfo(RenderPageRequest request) throws ApiException {
        com.squareup.okhttp.Call call = renderPageValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Renders page to specified format. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call renderPageAsync(RenderPageRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = renderPageValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for renderParagraph
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call renderParagraphCall(RenderParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/paragraphs/{index}/render"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "fontsLocation", request.getFontsLocation());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call renderParagraphValidateBeforeCall(RenderParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling renderParagraph");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Format' when calling renderParagraph");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling renderParagraph");
        }
        

        com.squareup.okhttp.Call call = renderParagraphCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Renders paragraph to specified format.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File renderParagraph(RenderParagraphRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = renderParagraphWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = renderParagraphWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Renders paragraph to specified format.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> renderParagraphWithHttpInfo(RenderParagraphRequest request) throws ApiException {
        com.squareup.okhttp.Call call = renderParagraphValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Renders paragraph to specified format. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call renderParagraphAsync(RenderParagraphRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = renderParagraphValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for renderTable
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call renderTableCall(RenderTableRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/tables/{index}/render"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "fontsLocation", request.getFontsLocation());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call renderTableValidateBeforeCall(RenderTableRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling renderTable");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Format' when calling renderTable");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling renderTable");
        }
        

        com.squareup.okhttp.Call call = renderTableCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Renders table to specified format.
     * 
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File renderTable(RenderTableRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = renderTableWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = renderTableWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Renders table to specified format.
     * 
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> renderTableWithHttpInfo(RenderTableRequest request) throws ApiException {
        com.squareup.okhttp.Call call = renderTableValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Renders table to specified format. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call renderTableAsync(RenderTableRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = renderTableValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for resetCache
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call resetCacheCall(ResetCacheRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/fonts/cache";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call resetCacheValidateBeforeCall(ResetCacheRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = resetCacheCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Resets font&#39;s cache.
     * 
     * @return AsposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsposeResponse resetCache(ResetCacheRequest request) throws ApiException {
        try {
            ApiResponse<AsposeResponse> resp = resetCacheWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<AsposeResponse> resp = resetCacheWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Resets font&#39;s cache.
     * 
     * @return ApiResponse&lt;AsposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AsposeResponse> resetCacheWithHttpInfo(ResetCacheRequest request) throws ApiException {
        com.squareup.okhttp.Call call = resetCacheValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Resets font&#39;s cache. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call resetCacheAsync(ResetCacheRequest request, final ApiCallback<AsposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = resetCacheValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for search
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call searchCall(SearchRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/words/{name}/search"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "pattern", request.getPattern());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchValidateBeforeCall(SearchRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling search");
        }
        
        // verify the required parameter 'Pattern' is set
        if (request.getPattern() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Pattern' when calling search");
        }
        

        com.squareup.okhttp.Call call = searchCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search text in document.
     * 
     * @return SearchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SearchResponse search(SearchRequest request) throws ApiException {
        try {
            ApiResponse<SearchResponse> resp = searchWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<SearchResponse> resp = searchWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Search text in document.
     * 
     * @return ApiResponse&lt;SearchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<SearchResponse> searchWithHttpInfo(SearchRequest request) throws ApiException {
        com.squareup.okhttp.Call call = searchValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SearchResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search text in document. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchAsync(SearchRequest request, final ApiCallback<SearchResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = searchValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SearchResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateBorder
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call updateBorderCall(UpdateBorderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getBorderProperties();

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/borders/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "nodePath" + "\\}", apiClient.escapeString(request.getNodePath().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateBorderValidateBeforeCall(UpdateBorderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling updateBorder");
        }
        
        // verify the required parameter 'BorderProperties' is set
        if (request.getBorderProperties() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'BorderProperties' when calling updateBorder");
        }
        
        // verify the required parameter 'NodePath' is set
        if (request.getNodePath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'NodePath' when calling updateBorder");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling updateBorder");
        }
        

        com.squareup.okhttp.Call call = updateBorderCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates border properties.             
     * &#39;nodePath&#39; should refer to node with cell or row
     * @return BorderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BorderResponse updateBorder(UpdateBorderRequest request) throws ApiException {
        try {
            ApiResponse<BorderResponse> resp = updateBorderWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<BorderResponse> resp = updateBorderWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates border properties.             
     * &#39;nodePath&#39; should refer to node with cell or row
     * @return ApiResponse&lt;BorderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<BorderResponse> updateBorderWithHttpInfo(UpdateBorderRequest request) throws ApiException {
        com.squareup.okhttp.Call call = updateBorderValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<BorderResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates border properties.              (asynchronously)
     * &#39;nodePath&#39; should refer to node with cell or row
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateBorderAsync(UpdateBorderRequest request, final ApiCallback<BorderResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateBorderValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BorderResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateSectionPageSetup
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call updateSectionPageSetupCall(UpdateSectionPageSetupRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getPageSetup();

        // create path and map variables
        String localVarPath = "/words/{name}/sections/{sectionIndex}/pageSetup"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "sectionIndex" + "\\}", apiClient.escapeString(request.getSectionIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateSectionPageSetupValidateBeforeCall(UpdateSectionPageSetupRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling updateSectionPageSetup");
        }
        
        // verify the required parameter 'SectionIndex' is set
        if (request.getSectionIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'SectionIndex' when calling updateSectionPageSetup");
        }
        
        // verify the required parameter 'PageSetup' is set
        if (request.getPageSetup() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'PageSetup' when calling updateSectionPageSetup");
        }
        

        com.squareup.okhttp.Call call = updateSectionPageSetupCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update page setup of section.
     * 
     * @return SectionPageSetupResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SectionPageSetupResponse updateSectionPageSetup(UpdateSectionPageSetupRequest request) throws ApiException {
        try {
            ApiResponse<SectionPageSetupResponse> resp = updateSectionPageSetupWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<SectionPageSetupResponse> resp = updateSectionPageSetupWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Update page setup of section.
     * 
     * @return ApiResponse&lt;SectionPageSetupResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<SectionPageSetupResponse> updateSectionPageSetupWithHttpInfo(UpdateSectionPageSetupRequest request) throws ApiException {
        com.squareup.okhttp.Call call = updateSectionPageSetupValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SectionPageSetupResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update page setup of section. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateSectionPageSetupAsync(UpdateSectionPageSetupRequest request, final ApiCallback<SectionPageSetupResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateSectionPageSetupValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SectionPageSetupResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateTableCellFormat
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call updateTableCellFormatCall(UpdateTableCellFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getFormat();

        // create path and map variables
        String localVarPath = "/words/{name}/{tableRowPath}/cells/{index}/cellformat"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "tableRowPath" + "\\}", apiClient.escapeString(request.getTableRowPath().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateTableCellFormatValidateBeforeCall(UpdateTableCellFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling updateTableCellFormat");
        }
        
        // verify the required parameter 'TableRowPath' is set
        if (request.getTableRowPath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'TableRowPath' when calling updateTableCellFormat");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling updateTableCellFormat");
        }
        

        com.squareup.okhttp.Call call = updateTableCellFormatCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates a table cell format.
     * 
     * @return TableCellFormatResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TableCellFormatResponse updateTableCellFormat(UpdateTableCellFormatRequest request) throws ApiException {
        try {
            ApiResponse<TableCellFormatResponse> resp = updateTableCellFormatWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<TableCellFormatResponse> resp = updateTableCellFormatWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates a table cell format.
     * 
     * @return ApiResponse&lt;TableCellFormatResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<TableCellFormatResponse> updateTableCellFormatWithHttpInfo(UpdateTableCellFormatRequest request) throws ApiException {
        com.squareup.okhttp.Call call = updateTableCellFormatValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<TableCellFormatResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a table cell format. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateTableCellFormatAsync(UpdateTableCellFormatRequest request, final ApiCallback<TableCellFormatResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateTableCellFormatValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TableCellFormatResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateTableProperties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call updateTablePropertiesCall(UpdateTablePropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getProperties();

        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/tables/{index}/properties"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "nodePath", request.getNodePath());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateTablePropertiesValidateBeforeCall(UpdateTablePropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling updateTableProperties");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling updateTableProperties");
        }
        

        com.squareup.okhttp.Call call = updateTablePropertiesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates a table properties.
     * 
     * @return TablePropertiesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TablePropertiesResponse updateTableProperties(UpdateTablePropertiesRequest request) throws ApiException {
        try {
            ApiResponse<TablePropertiesResponse> resp = updateTablePropertiesWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<TablePropertiesResponse> resp = updateTablePropertiesWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates a table properties.
     * 
     * @return ApiResponse&lt;TablePropertiesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<TablePropertiesResponse> updateTablePropertiesWithHttpInfo(UpdateTablePropertiesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = updateTablePropertiesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<TablePropertiesResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a table properties. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateTablePropertiesAsync(UpdateTablePropertiesRequest request, final ApiCallback<TablePropertiesResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateTablePropertiesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TablePropertiesResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateTableRowFormat
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call updateTableRowFormatCall(UpdateTableRowFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getFormat();

        // create path and map variables
        String localVarPath = "/words/{name}/{tablePath}/rows/{index}/rowformat"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "tablePath" + "\\}", apiClient.escapeString(request.getTablePath().toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "loadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "revisionDateTime", request.getRevisionDateTime());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateTableRowFormatValidateBeforeCall(UpdateTableRowFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling updateTableRowFormat");
        }
        
        // verify the required parameter 'TablePath' is set
        if (request.getTablePath() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'TablePath' when calling updateTableRowFormat");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Index' when calling updateTableRowFormat");
        }
        

        com.squareup.okhttp.Call call = updateTableRowFormatCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates a table row format.
     * 
     * @return TableRowFormatResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TableRowFormatResponse updateTableRowFormat(UpdateTableRowFormatRequest request) throws ApiException {
        try {
            ApiResponse<TableRowFormatResponse> resp = updateTableRowFormatWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<TableRowFormatResponse> resp = updateTableRowFormatWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Updates a table row format.
     * 
     * @return ApiResponse&lt;TableRowFormatResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<TableRowFormatResponse> updateTableRowFormatWithHttpInfo(UpdateTableRowFormatRequest request) throws ApiException {
        com.squareup.okhttp.Call call = updateTableRowFormatValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<TableRowFormatResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a table row format. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateTableRowFormatAsync(UpdateTableRowFormatRequest request, final ApiCallback<TableRowFormatResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateTableRowFormatValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TableRowFormatResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

      /**
     * Build call for putCreate
     * @param path Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext (required)
     * @param file File to upload (required)
     * @param versionId Source file&#39;s version (optional)
     * @param storage User&#39;s storage name (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call putCreateCall(String path, File file, String versionId, String storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = file;

        // create path and map variables
        String localVarPath = "/storage/file";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("path", path));
        if (versionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("versionId", versionId));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };

        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putCreateValidateBeforeCall(String path, File file, String versionId, String storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new ApiException("Missing the required parameter 'path' when calling putCreate(Async)");
        }
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling putCreate(Async)");
        }
        

        com.squareup.okhttp.Call call = putCreateCall(path, file, versionId, storage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Upload a specific file 
     * 
     * @param path Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext (required)
     * @param file File to upload (required)
     * @param versionId Source file&#39;s version (optional)
     * @param storage User&#39;s storage name (optional)
     * @return AsposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsposeResponse putCreate(String path, File file, String versionId, String storage) throws ApiException {
        try {
            ApiResponse<AsposeResponse> resp = putCreateWithHttpInfo(path, file, versionId, storage);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.refreshToken();
                ApiResponse<AsposeResponse> resp = putCreateWithHttpInfo(path, file, versionId, storage);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Upload a specific file 
     * 
     * @param path Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext (required)
     * @param file File to upload (required)
     * @param versionId Source file&#39;s version (optional)
     * @param storage User&#39;s storage name (optional)
     * @return ApiResponse&lt;AsposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<AsposeResponse> putCreateWithHttpInfo(String path, File file, String versionId, String storage) throws ApiException {
        com.squareup.okhttp.Call call = putCreateValidateBeforeCall(path, file, versionId, storage, null, null);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upload a specific file  (asynchronously)
     * 
     * @param path Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext (required)
     * @param file File to upload (required)
     * @param versionId Source file&#39;s version (optional)
     * @param storage User&#39;s storage name (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putCreateAsync(String path, File file, String versionId, String storage, final ApiCallback<AsposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putCreateValidateBeforeCall(path, file, versionId, storage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsposeResponse>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    private String addParameterToQuery(List<Pair> queryParams, String path, String paramName, Object paramValue) {
        if (path.contains("{" + paramName + "}")) {
            if (paramValue == null || paramValue.equals("")) {
                return path.replace("{" + paramName + "}", "");
            } 
            else {
                return path.replace("{" + paramName + "}", paramValue.toString());
            }
        }

        queryParams.addAll(apiClient.parameterToPair(paramName, paramValue));
        return path;
    }
}
