/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ApiClient.java">
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

package com.aspose.words.cloud;

import com.aspose.words.cloud.model.requests.RequestIfc;
import com.squareup.okhttp.*;
import com.squareup.okhttp.internal.http.HttpMethod;
import com.squareup.okhttp.logging.HttpLoggingInterceptor;
import com.squareup.okhttp.logging.HttpLoggingInterceptor.Level;
import okio.BufferedSink;
import okio.Okio;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import java.io.*;
import java.lang.reflect.Type;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApiClient {

    private String apiVersion = "v4.0";
    private String baseUrl = "https://api.aspose.cloud";
    private String basePath = baseUrl + "/" + apiVersion;
    private String clientVersion = "21.4";
    private boolean debugging = false;
    private Map<String, String> defaultHeaderMap = new HashMap<String, String>();
    private String tempFolderPath = null;
    private Integer notAuthCode = 401;
    private Integer badRequestCode = 400;

    private OkHttpClient httpClient;
    private JSON json;

    private Interceptor loggingInterceptor;

    private String accessToken;
    private String refreshToken;
    private String ClientSecret;
    private String clientId;

    public ApiClient(String clientId, String clientSecret, String baseUrl) {
        this();
        this.clientId = clientId;
        this.ClientSecret = clientSecret;
        if (baseUrl != null) {
            this.setBaseUrl(baseUrl);
        }
    }

    /*
     * Constructor for ApiClient
     */
    public ApiClient() {
        httpClient = new OkHttpClient();
        httpClient.setProtocols(Arrays.asList(Protocol.HTTP_1_1));

        json = new JSON();

        // Set default User-Agent.
        setUserAgent("Swagger-Codegen/1.0.0/java");
        addDefaultHeader("x-aspose-client", "java sdk");
        addDefaultHeader("x-aspose-client-version", clientVersion);
        setConnectTimeout(5 * 60 * 1000);
        setReadTimeout(5 * 60 * 1000);
    }

     /**
     * Get NotAuth http code
     *
     * @return NotAuth http code
     */
    public Integer getNotAuthCode() {
        return notAuthCode;
    }

    /**
     * Get BadRequest http code
     *
     * @return BadRequest http code
     */
    public Integer getBadRequestCode() {
        return badRequestCode;
    }

    /**
     * Get client ID
     *
     * @return client ID
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Set client ID
     *
     * @param clientId client ID
     * @return An instance of OkHttpClient
     */
    public ApiClient setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get client secret
     *
     * @return client secret
     */
    public String getClientSecret() {
        return ClientSecret;
    }

    /**
     * Set client secret
     *
     * @param clientSecret client secret
     * @return An instance of OkHttpClient
     */
    public ApiClient setClientSecret(String clientSecret) {
        this.ClientSecret = clientSecret;
        return this;
    }

    /**
     * Get ApiVersion
     *
     * @return Api Version
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * Set ApiVersion
     *
     * @param apiVersion Api Version
     * @return An instance of OkHttpClient
     */
    public ApiClient setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }


    /**
     * Get base path
     *
     * @return Base path
     */
    public String getBasePath() {
        return basePath;
    }

    /**
     * Set BaseUrl
     *
     * @param baseUrl Base Url
     * @return An instance of OkHttpClient
     */
    public ApiClient setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        this.basePath = baseUrl + "/" + this.apiVersion;
        return this;
    }

    /**
     * Set base path
     *
     * @param basePath Base path of the URL (e.g https://api.aspose.cloud/v4.0
     * @return An instance of OkHttpClient
     */
    public ApiClient setBasePath(String basePath) {
        this.basePath = basePath;
        this.baseUrl = basePath.replace("/v1.1", "").replace("/v1", "").replace("/v2", "").replace("/v3", "");
        return this;
    }

    /**
     * Get HTTP client
     *
     * @return An instance of OkHttpClient
     */
    public OkHttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Set HTTP client
     *
     * @param httpClient An instance of OkHttpClient
     * @return Api Client
     */
    public ApiClient setHttpClient(OkHttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /**
     * Get JSON
     *
     * @return JSON object
     */
    public JSON getJSON() {
        return json;
    }

    /**
     * Set JSON
     *
     * @param json JSON object
     * @return Api client
     */
    public ApiClient setJSON(JSON json) {
        this.json = json;
        return this;
    }

    public ApiClient setLenientOnJson(boolean lenientOnJson) {
        this.json.setLenientOnJson(lenientOnJson);
        return this;
    }

    /**
     * Set access token for the OAuth2 authentication.
     *
     * @param accessToken Access token
     * @return An instance of OkHttpClient
     */
    public ApiClient setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Set refresh token for the OAuth2 authentication.
     *
     * @param refreshToken Access token
     * @return An instance of OkHttpClient
     */
    public ApiClient setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Set the User-Agent header's value (by adding to the default header map).
     *
     * @param userAgent HTTP request's user agent
     * @return ApiClient
     */
    public ApiClient setUserAgent(String userAgent) {
        addDefaultHeader("User-Agent", userAgent);
        return this;
    }

    /**
     * Add a default header.
     *
     * @param key The header's key
     * @param value The header's value
     * @return ApiClient
     */
    public ApiClient addDefaultHeader(String key, String value) {
        defaultHeaderMap.put(key, value);
        return this;
    }

    /**
     * Check that whether debugging is enabled for this API client.
     *
     * @return True if debugging is enabled, false otherwise.
     */
    public boolean isDebugging() {
        return debugging;
    }

    /**
     * Enable/disable debugging for this API client.
     *
     * @param debugging To enable (true) or disable (false) debugging
     * @return ApiClient
     */
    public ApiClient setDebugging(boolean debugging) {
        if (debugging != this.debugging) {
            if (debugging) {
                loggingInterceptor = new ApiLoggingInterceptor();
                httpClient.interceptors().add(loggingInterceptor);
            } 
            else {
                httpClient.interceptors().remove(loggingInterceptor);
                loggingInterceptor = null;
            }
        }
        this.debugging = debugging;
        return this;
    }

    /**
     * The path of temporary folder used to store downloaded files from endpoints
     * with file response. The default value is <code>null</code>, i.e. using
     * the system's default tempopary folder.
     *
     * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/io/File.html#createTempFile">createTempFile</a>
     * @return Temporary folder path
     */
    public String getTempFolderPath() {
        return tempFolderPath;
    }

    /**
     * Set the temporary folder path (for downloading files)
     *
     * @param tempFolderPath Temporary folder path
     * @return ApiClient
     */
    public ApiClient setTempFolderPath(String tempFolderPath) {
        this.tempFolderPath = tempFolderPath;
        return this;
    }

    /**
     * Get connection timeout (in milliseconds).
     *
     * @return Timeout in milliseconds
     */
    public int getConnectTimeout() {
        return httpClient.getConnectTimeout();
    }

    /**
     * Sets the connect timeout (in milliseconds).
     * A value of 0 means no timeout, otherwise values must be between 1 and
     * {@link Integer#MAX_VALUE}.
     *
     * @param connectionTimeout connection timeout in milliseconds
     * @return Api client
     */
    public ApiClient setConnectTimeout(int connectionTimeout) {
        httpClient.setConnectTimeout(connectionTimeout, TimeUnit.MILLISECONDS);
        return this;
    }

    /**
     * Get read timeout (in milliseconds).
     *
     * @return Timeout in milliseconds
     */
    public int getReadTimeout() {
        return httpClient.getReadTimeout();
    }

    /**
     * Sets the read timeout (in milliseconds).
     * A value of 0 means no timeout, otherwise values must be between 1 and
     * {@link Integer#MAX_VALUE}.
     *
     * @param readTimeout read timeout in milliseconds
     * @return Api client
     */
    public ApiClient setReadTimeout(int readTimeout) {
        httpClient.setReadTimeout(readTimeout, TimeUnit.MILLISECONDS);
        return this;
    }

    /**
     * Get write timeout (in milliseconds).
     *
     * @return Timeout in milliseconds
     */
    public int getWriteTimeout() {
        return httpClient.getWriteTimeout();
    }

    /**
     * Sets the write timeout (in milliseconds).
     * A value of 0 means no timeout, otherwise values must be between 1 and
     * {@link Integer#MAX_VALUE}.
     *
     * @param writeTimeout connection timeout in milliseconds
     * @return Api client
     */
    public ApiClient setWriteTimeout(int writeTimeout) {
        httpClient.setWriteTimeout(writeTimeout, TimeUnit.MILLISECONDS);
        return this;
    }

    /**
     * Format the given parameter object into string.
     *
     * @param param Parameter
     * @return String representation of the parameter
     */
    public String parameterToString(Object param) {
        if (param == null) {
            return "";
        } 
        else if (param instanceof Date || param instanceof OffsetDateTime || param instanceof LocalDate) {
            //Serialize to json string and remove the " enclosing characters
            String jsonStr = json.serialize(param);
            return jsonStr.substring(1, jsonStr.length() - 1);
        } 
        else if (param instanceof Collection) {
            StringBuilder b = new StringBuilder();
            for (Object o : (Collection) param) {
                if (b.length() > 0) {
                    b.append(",");
                }
                b.append(String.valueOf(o));
            }
            return b.toString();
        } 
        else if (param instanceof String) {
            return String.valueOf(param);
        }
        else {
            return json.serialize(param);
        }
    }

    /**
     * Formats the specified query parameter to a list containing a single {@code Pair} object.
     *
     * Note that {@code value} must not be a collection.
     *
     * @param name The name of the parameter.
     * @param value The value of the parameter.
     * @return A list containing a single {@code Pair} object.
     */
    public List<Pair> parameterToPair(String name, Object value) {
        List<Pair> params = new ArrayList<Pair>();

        // preconditions
        if (name == null || name.isEmpty() || value == null || value instanceof Collection) return params;

        params.add(new Pair(name, parameterToString(value)));
        return params;
    }

    /**
     * Formats the specified collection query parameters to a list of {@code Pair} objects.
     *
     * Note that the values of each of the returned Pair objects are percent-encoded.
     *
     * @param collectionFormat The collection format of the parameter.
     * @param name The name of the parameter.
     * @param value The value of the parameter.
     * @return A list of {@code Pair} objects.
     */
    public List<Pair> parameterToPairs(String collectionFormat, String name, Collection value) {
        List<Pair> params = new ArrayList<Pair>();

        // preconditions
        if (name == null || name.isEmpty() || value == null || value.isEmpty()) {
            return params;
        }

        // create the params based on the collection format
        if ("multi".equals(collectionFormat)) {
            for (Object item : value) {
                params.add(new Pair(name, escapeString(parameterToString(item))));
            }
            return params;
        }

        // collectionFormat is assumed to be "csv" by default
        String delimiter = ",";

        // escape all delimiters except commas, which are URI reserved
        // characters
        if ("ssv".equals(collectionFormat)) {
            delimiter = escapeString(" ");
        } 
        else if ("tsv".equals(collectionFormat)) {
            delimiter = escapeString("\t");
        } 
        else if ("pipes".equals(collectionFormat)) {
            delimiter = escapeString("|");
        }

        StringBuilder sb = new StringBuilder() ;
        for (Object item : value) {
            sb.append(delimiter);
            sb.append(escapeString(parameterToString(item)));
        }

        params.add(new Pair(name, sb.substring(delimiter.length())));

        return params;
    }

    /**
     * Sanitize filename by removing path.
     * e.g. ../../sun.gif becomes sun.gif
     *
     * @param filename The filename to be sanitized
     * @return The sanitized filename
     */
    public String sanitizeFilename(String filename) {
        return filename.replaceAll(".*[/\\\\]", "");
    }

    /**
     * Check if the given MIME is a JSON MIME.
     * JSON MIME examples:
     *   application/json
     *   application/json; charset=UTF8
     *   APPLICATION/JSON
     *   application/vnd.company+json
     * "* / *" is also default to JSON
     * @param mime MIME (Multipurpose Internet Mail Extensions)
     * @return True if the given MIME is JSON, false otherwise.
     */
    public boolean isJsonMime(String mime) {
      String jsonMime = "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$";
      return mime != null && (mime.matches(jsonMime) || mime.equals("*/*"));
    }

    /**
     * Select the Accept header's value from the given accepts array:
     *   if JSON exists in the given array, use it;
     *   otherwise use all of them (joining into a string)
     *
     * @param accepts The accepts array to select from
     * @return The Accept header to use. If the given array is empty,
     *   null will be returned (not to set the Accept header explicitly).
     */
    public String selectHeaderAccept(String[] accepts) {
        if (accepts.length == 0) {
            return null;
        }
        for (String accept : accepts) {
            if (isJsonMime(accept)) {
                return accept;
            }
        }
        return StringUtil.join(accepts, ",");
    }

    /**
     * Select the Content-Type header's value from the given array:
     *   if JSON exists in the given array, use it;
     *   otherwise use the first one of the array.
     *
     * @param contentTypes The Content-Type array to select from
     * @return The Content-Type header to use. If the given array is empty,
     *   or matches "any", JSON will be used.
     */
    public String selectHeaderContentType(String[] contentTypes) {
        if (contentTypes.length == 0 || contentTypes[0].equals("*/*")) {
             return "application/json";
        }
        for (String contentType : contentTypes) {
            if (isJsonMime(contentType)) {
                return contentType;
            }
        }
        return contentTypes[0];
    }

    /**
     * Escape the given string to be used as URL query value.
     *
     * @param str String to be escaped
     * @return Escaped string
     */
    public String escapeString(String str) {
        try {
            return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
        } 
        catch (UnsupportedEncodingException e) {
            return str;
        }
    }

    /**
     * Deserialize response body to Java object, according to the return type and
     * the Content-Type response header.
     *
     * @param <T> Type
     * @param response HTTP response
     * @param returnType The type of the Java object
     * @return The deserialized Java object
     * @throws ApiException If fail to deserialize response body, i.e. cannot read response body
     *   or the Content-Type of the response is not supported.
     */
    @SuppressWarnings("unchecked")
    public <T> T deserialize(Response response, Type returnType) throws ApiException {
        if (response == null || returnType == null) {
            return null;
        }

        if (returnType.equals(MimeMultipart.class)) {
            try {
                InputStream in = response.body().byteStream();
                ByteArrayDataSource dataSource = new ByteArrayDataSource(in, "multipart/form-data");
                return (T) new MimeMultipart(dataSource);
            }
            catch (IOException | MessagingException e) {
                throw new ApiException(e);
            }
        }
        else if (returnType.equals(byte[].class)) {
            // Handle binary response (byte array).
            try {
                return (T) response.body().bytes();
            } 
            catch (IOException e) {
                throw new ApiException(e);
            }
        } 
        else if (returnType.equals(File.class)) {
            // Handle file downloading.
            return (T) downloadFileFromResponse(response);
        }

        String respBody;
        try {
            if (response.body() != null)
                respBody = response.body().string();
            else
                respBody = null;
        } 
        catch (IOException e) {
            throw new ApiException(e);
        }

        if (respBody == null || "".equals(respBody)) {
            return null;
        }

        String contentType = response.headers().get("Content-Type");
        if (contentType == null) {
            // ensuring a default content type
            contentType = "application/json";
        }
        if (isJsonMime(contentType)) {
            return json.deserialize(respBody, returnType);
        } 
        else if (returnType.equals(String.class)) {
            // Expecting string, return the raw response body.
            return (T) respBody;
        } 
        else {
            throw new ApiException(
                    "Content type \"" + contentType + "\" is not supported for type: " + returnType,
                    response.code(),
                    response.headers().toMultimap(),
                    respBody);
        }
    }

    /**
     * Serialize the given Java object into request body according to the object's
     * class and the request Content-Type.
     *
     * @param obj The Java object
     * @param contentType The request Content-Type
     * @return The serialized request body
     * @throws ApiException If fail to serialize the given object
     */
    public RequestBody serialize(Object obj, String contentType) throws ApiException {
        if (obj instanceof byte[]) {
            // Binary (byte array) body parameter support.
            return RequestBody.create(MediaType.parse(contentType), (byte[]) obj);
        } 
        else if (obj instanceof File) {
            // File body parameter support.
            return RequestBody.create(MediaType.parse(contentType), (File) obj);
        } 
        else if (isJsonMime(contentType)) {
            String content;
            if (obj != null) {
                content = json.serialize(obj);
            } 
            else {
                content = null;
            }
            return RequestBody.create(MediaType.parse(contentType), content);
        } 
        else {
            throw new ApiException("Content type \"" + contentType + "\" is not supported");
        }
    }

    /**
     * Download file from the given response.
     *
     * @param response An instance of the Response object
     * @throws ApiException If fail to read file content from response and write to disk
     * @return Downloaded file
     */
    public File downloadFileFromResponse(Response response) throws ApiException {
        try {
            File file = prepareDownloadFile(response);
            BufferedSink sink = Okio.buffer(Okio.sink(file));
            sink.writeAll(response.body().source());
            sink.close();
            return file;
        } 
        catch (IOException e) {
            throw new ApiException(e);
        }
    }

    /**
     * Prepare file for download
     *
     * @param response An instance of the Response object
     * @throws IOException If fail to prepare file for download
     * @return Prepared file for the download
     */
    public File prepareDownloadFile(Response response) throws IOException {
        String filename = null;
        String contentDisposition = response.header("Content-Disposition");
        if (contentDisposition != null && !"".equals(contentDisposition)) {
            // Get filename from the Content-Disposition header.
            Pattern pattern = Pattern.compile("filename=['\"]?([^'\"\\s]+)['\"]?");
            Matcher matcher = pattern.matcher(contentDisposition);
            if (matcher.find()) {
                filename = sanitizeFilename(matcher.group(1));
            }
        }

        String prefix = null;
        String suffix = null;
        if (filename == null) {
            prefix = "download-";
            suffix = "";
        } 
        else {
            int pos = filename.lastIndexOf(".");
            if (pos == -1) {
                prefix = filename + "-";
            } 
            else {
                prefix = filename.substring(0, pos) + "-";
                suffix = filename.substring(pos);
            }
            // File.createTempFile requires the prefix to be at least three characters long
            if (prefix.length() < 3)
                prefix = "download-";
        }

        if (tempFolderPath == null)
            return File.createTempFile(prefix, suffix);
        else
            return File.createTempFile(prefix, suffix, new File(tempFolderPath));
    }

    /**
     * {@link #execute(Call, Type)}
     *
     * @param <T> Type
     * @param call An instance of the Call object
     * @throws ApiException If fail to execute the call
     * @return ApiResponse&lt;T&gt;
     */
    public <T> ApiResponse<T> execute(Call call) throws ApiException {
        return execute(call, null);
    }

    /**
     * Execute HTTP call and deserialize the HTTP response body into the given return type.
     *
     * @param returnType The return type used to deserialize HTTP response body
     * @param <T> The return type corresponding to (same with) returnType
     * @param call Call
     * @return ApiResponse object containing response status, headers and
     *   data, which is a Java object deserialized from response body and would be null
     *   when returnType is null.
     * @throws ApiException If fail to execute the call
     */
    public <T> ApiResponse<T> execute(Call call, Type returnType) throws ApiException {
        try {
            Response response = call.execute();
            T data = handleResponse(response, returnType);
            return new ApiResponse<T>(response.code(), response.headers().toMultimap(), data);
        } 
        catch (IOException e) {
            throw new ApiException(e);
        }
    }

    /**
     * {@link #executeAsync(Call, Type, ApiCallback)}
     *
     * @param <T> Type
     * @param call An instance of the Call object
     * @param callback ApiCallback&lt;T&gt;
     */
    public <T> void executeAsync(Call call, ApiCallback<T> callback) {
        executeAsync(call, null, callback);
    }

    /**
     * Execute HTTP call asynchronously.
     *
     * @see #execute(Call, Type)
     * @param <T> Type
     * @param call The callback to be executed when the API call finishes
     * @param returnType Return type
     * @param callback ApiCallback
     */
    @SuppressWarnings("unchecked")
    public <T> void executeAsync(Call call, final Type returnType, final ApiCallback<T> callback) {
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                callback.onFailure(new ApiException(e), 0, null);
            }

            @Override
            public void onResponse(Response response) throws IOException {
                T result;
                try {
                    result = (T) handleResponse(response, returnType);
                } 
                catch (ApiException e) {
                    callback.onFailure(e, response.code(), response.headers().toMultimap());
                    return;
                }
                callback.onSuccess(result, response.code(), response.headers().toMultimap());
            }
        });
    }

    /**
     * Handle the given response, return the deserialized object when the response is successful.
     *
     * @param <T> Type
     * @param response Response
     * @param returnType Return type
     * @throws ApiException If the response has a unsuccessful status code or
     *   fail to deserialize the response body
     * @return Type
     */
    public <T> T handleResponse(Response response, Type returnType) throws ApiException {
        if (response.isSuccessful()) {
            if (returnType == null || response.code() == 204) {
                // returning null if the returnType is not defined,
                // or the status code is 204 (No Content)
                if (response.body() != null) {
                    try {
                        response.body().close();
                    } 
                    catch (IOException e) {
                        throw new ApiException(response.message(), e, response.code(), response.headers().toMultimap());
                    }
                }
                return null;
            } 
            else {
                return deserialize(response, returnType);
            }
        } 
        else {
            String respBody = null;
            if (response.body() != null) {
                try {
                    respBody = response.body().string();
                } 
                catch (IOException e) {
                    throw new ApiException(response.message(), e, response.code(), response.headers().toMultimap());
                }
            }
            throw new ApiException(response.message(), response.code(), response.headers().toMultimap(), respBody);
        }
    }

    /**
     * Build HTTP call with the given options.
     *
     * @param request The http request instance
     */
    public Call buildCall(Request request) {
        return httpClient.newCall(request);
    }

    /**
     * Build an HTTP request with the given options.
     *
     * @param path The sub-path of the HTTP URL
     * @param method The request method, one of "GET", "HEAD", "OPTIONS", "POST", "PUT", "PATCH" and "DELETE"
     * @param queryParams The query parameters
     * @param collectionQueryParams The collection query parameters
     * @param body The request body object
     * @param headerParams The header parameters
     * @param formParams The form parameters
     * @param addAuthHeaders The authentications to apply
     * @param progressRequestListener Progress request listener
     * @return The HTTP request 
     * @throws ApiException If fail to serialize the request body object
     * @throws IOException If fail to serialize the request body object
     */
    public Request buildRequest(String path, String method, List<Pair> queryParams, List<Pair> collectionQueryParams, Object body, Map<String, String> headerParams, Map<String, Object> formParams, Boolean addAuthHeaders, ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
        if (addAuthHeaders) {
            addOAuthAuthentication(headerParams);
        }

        String contentType = (String) headerParams.get("Content-Type");
        // ensuring a default content type
        if (contentType == null) {
            contentType = "application/json";
        }

        RequestBody reqBody;
        if (!HttpMethod.permitsRequestBody(method)) {
            reqBody = null;
        } 
        else if (body instanceof RequestBody) {
            reqBody = (RequestBody) body;
        }
        else if ("application/x-www-form-urlencoded".equals(contentType)) {
            reqBody = buildRequestBodyFormEncoding(formParams);
        } 
        else if ("multipart/form-data".equals(contentType)) {
            String boundary = UUID.randomUUID().toString();
            contentType += "; boundary=" + boundary;
            headerParams.put("Content-Type", contentType);
            reqBody = buildRequestBodyMultipart(formParams, boundary);
        } 
        else if (body == null) {
            if ("DELETE".equals(method)) {
                // allow calling DELETE without sending a request body
                reqBody = null;
            } 
            else {
                // use an empty request body (for POST, PUT and PATCH)
                reqBody = RequestBody.create(MediaType.parse(contentType), "");
            }
        } 
        else {
            reqBody = serialize(body, contentType);
        }

        final String url = buildUrl(path, queryParams, collectionQueryParams);
        final Request.Builder reqBuilder = new Request.Builder().url(url);
        processHeaderParams(headerParams, reqBuilder, addAuthHeaders);

        Request request = null;
        if (progressRequestListener != null && reqBody != null) {
            ProgressRequestBody progressRequestBody = new ProgressRequestBody(reqBody, progressRequestListener);
            request = reqBuilder.method(method, progressRequestBody).build();
        } 
        else {
            request = reqBuilder.method(method, reqBody).build();
        }

        return request;
    }

    /**
     * Build full URL by concatenating base path, the given sub path and query parameters.
     *
     * @param path The sub path
     * @param queryParams The query parameters
     * @param collectionQueryParams The collection query parameters
     * @return The full URL
     */
    public String buildUrl(String path, List<Pair> queryParams, List<Pair> collectionQueryParams) {
        final StringBuilder url = new StringBuilder();
        url.append(basePath).append(path);

        if (queryParams != null && !queryParams.isEmpty()) {
            // support (constant) query string in `path`, e.g. "/posts?draft=1"
            String prefix = path.contains("?") ? "&" : "?";
            for (Pair param : queryParams) {
                if (param.getValue() != null) {
                    if (prefix != null) {
                        url.append(prefix);
                        prefix = null;
                    } 
                    else {
                        url.append("&");
                    }
                    String value = parameterToString(param.getValue());
                    url.append(escapeString(param.getName())).append("=").append(escapeString(value));
                }
            }
        }

        if (collectionQueryParams != null && !collectionQueryParams.isEmpty()) {
            String prefix = url.toString().contains("?") ? "&" : "?";
            for (Pair param : collectionQueryParams) {
                if (param.getValue() != null) {
                    if (prefix != null) {
                        url.append(prefix);
                        prefix = null;
                    } 
                    else {
                        url.append("&");
                    }
                    String value = parameterToString(param.getValue());
                    // collection query parameter value already escaped as part of parameterToPairs
                    url.append(escapeString(param.getName())).append("=").append(value);
                }
            }
        }

        return url.toString();
    }

    /**
     * Set header parameters to the request builder, including default headers.
     *
     * @param headerParams Header parameters in the ofrm of Map
     * @param reqBuilder Reqeust.Builder
     */
    public void processHeaderParams(Map<String, String> headerParams, Request.Builder reqBuilder, Boolean addDefaultHeaders) {
        for (Entry<String, String> param : headerParams.entrySet()) {
            reqBuilder.header(param.getKey(), parameterToString(param.getValue()));
        }
        if (addDefaultHeaders) {
            for (Entry<String, String> header : defaultHeaderMap.entrySet()) {
                if (!headerParams.containsKey(header.getKey())) {
                    reqBuilder.header(header.getKey(), parameterToString(header.getValue()));
                }
            }
        }
    }

    /**
     * Build a form-encoding request body with the given form parameters.
     *
     * @param formParams Form parameters in the form of Map
     * @return RequestBody
     */
    public RequestBody buildRequestBodyFormEncoding(Map<String, Object> formParams) {
        FormEncodingBuilder formBuilder  = new FormEncodingBuilder();
        for (Entry<String, Object> param : formParams.entrySet()) {
            formBuilder.add(param.getKey(), parameterToString(param.getValue()));
        }
        return formBuilder.build();
    }

    /**
     * Build a multipart (file uploading) request body with the given form parameters,
     * which could contain text fields and file fields.
     *
     * @param formParams Form parameters in the form of Map
     * @throws IOException If fail to serialize the request body object
     * @return RequestBody
     */
    public RequestBody buildRequestBodyMultipart(Map<String, Object> formParams, String boundary) throws IOException {
        MultipartBuilder mpBuilder = new MultipartBuilder(boundary).type(MultipartBuilder.FORM);
        if (formParams.isEmpty()) {
            Headers partHeaders = Headers.of("Content-Disposition", "form-data");
            mpBuilder.addPart(partHeaders, RequestBody.create(MediaType.parse("none"), new byte[] {}));
        }
        else {
            for (Entry<String, Object> param : formParams.entrySet()) {
                if (param.getValue() instanceof byte[]) {
                    byte[] file = (byte[]) param.getValue();
                    Headers partHeaders = Headers.of("Content-Disposition", "form-data; name=\"" + param.getKey() + "\"; filename=\"" + param.getKey() + "\"");
                    MediaType mediaType = MediaType.parse(guessContentTypeFromFile(file));
                    mpBuilder.addPart(partHeaders, RequestBody.create(mediaType, file));
                } 
                else {
                    Headers partHeaders = Headers.of("Content-Disposition", "form-data; name=\"" + param.getKey() + "\"");
                    mpBuilder.addPart(partHeaders, RequestBody.create(null, parameterToString(param.getValue())));
                }
            }
        }
        return mpBuilder.build();
    }

    /**
     * Guess Content-Type header from the given file (defaults to "application/octet-stream").
     *
     * @param file The given file
     * @return The guessed Content-Type
     * @throws IOException If fail to serialize the request body object
     */
    public String guessContentTypeFromFile(byte[] file) throws IOException {
        String contentType = URLConnection.guessContentTypeFromStream(new ByteArrayInputStream(file));
        if (contentType == null) {
            return "application/octet-stream";
        } 
        else {
            return contentType;
        }
    }

     /**
     * Request OAuth token
     @throws ApiException If authorization is failed
     */
    public void requestToken() throws ApiException {
        try {
            RequestBody requestBody = new FormEncodingBuilder()
                    .addEncoded("grant_type", "client_credentials")
                    .addEncoded("client_id", getClientId())
                    .addEncoded("client_secret", getClientSecret())
                    .build();

            String url = baseUrl + "/connect/token";
            Request request = new Request.Builder()
                    .url(url)
                    .post(requestBody)
                    .addHeader("Content-Type", " application/x-www-form-urlencoded")
                    .build();

            Response response = httpClient.newCall(request).execute();
            GetAccessTokenResult result = json.deserialize(response.body().string(), GetAccessTokenResult.class);
            setAccessToken(result.access_token);
        }
        catch (Exception ex) {
            throw new ApiException(ex);
        }
    }

    /**
    * AddParameterToQuery
    */
    public void addParameterToQuery(List<Pair> queryParams, String paramName, Object paramValue) {
        queryParams.addAll(parameterToPair(paramName, paramValue));
    }

    /**
    * AddParameterToPath
    */
    public String addParameterToPath(String path, String paramName, Object paramValue) {
        if (path.contains("{" + paramName + "}")) {
            if (paramValue == null || paramValue.equals("")) {
                return path.replace("{" + paramName + "}", "");
            } 
            else {
                return path.replace("{" + paramName + "}", paramValue.toString());
            }
        }

        return path;
    }

    /**
     * Build batch request
     */
    public Request buildBatchRequest(RequestIfc[] requests) throws ApiException, IOException {
        Headers multipartHeaders = Headers.of("Content-Disposition", "form-data");
        MultipartBuilder builder = new MultipartBuilder().type(MultipartBuilder.FORM);
        for (RequestIfc request : requests) {
            Request httpRequest = request.buildHttpRequest(this, null, null, false);
            builder.addPart(multipartHeaders, new ChildRequestContent(httpRequest, basePath + "/words/"));
        }

        RequestBody requestBody = builder.build();
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", requestBody.contentType().toString());
        return buildRequest("/words/batch", "PUT", new ArrayList<>(), new ArrayList<>(), requestBody, headers, new HashMap<>(), true, null);
    }

    /**
     * Parse model from online response.
     */
    public Object parseModel(BodyPart bodyPart, Type returnType) throws IOException, MessagingException {
        InputStream is = bodyPart.getInputStream();
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        int nRead;
        byte[] data = new byte[16384];

        while ((nRead = is.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }

        try {
            String stringData = buffer.toString("UTF-8");
            return json.deserialize(stringData, returnType);
        } 
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Parse document from online response.
     */
    public byte[] parseDocument(BodyPart bodyPart) throws IOException, MessagingException {
        InputStream is = bodyPart.getInputStream();
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        int nRead;
        byte[] data = new byte[16384];

        while ((nRead = is.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }

        return buffer.toByteArray();
    }

    /**
     * Get multipart from response.
     */
    public MimeMultipart getMultipartFromResponse(Response response) throws ApiException {
        try {
            InputStream in = response.body().byteStream();
            ByteArrayDataSource dataSource = new ByteArrayDataSource(in, "multipart/form-data");
            return new MimeMultipart(dataSource);
        }
        catch (IOException | MessagingException e) {
            throw new ApiException(e);
        }
    }

    /**
     * Parse batch part
     */
    public Object parseBatchPart(Request masterRequest, BodyPart bodyPart, Type returnType) throws IOException, MessagingException, ApiException {
        InputStream is = bodyPart.getInputStream();
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        int nRead;
        byte[] data = new byte[16384];

        while ((nRead = is.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }

        try {
            String stringData = buffer.toString("UTF-8");
            int lastSplitIndex = stringData.indexOf("\r\n");
            Integer responseCode = Integer.parseInt(stringData.substring(0, lastSplitIndex).split("\\s+")[0]);
            if (responseCode != 200) {
                return new ApiException(responseCode, stringData);
            }

            Headers.Builder headersBuilder = new Headers.Builder();
            while (true) {
                int splitIndex = stringData.indexOf("\r\n", lastSplitIndex + 2);
                String headerStr = stringData.substring(lastSplitIndex + 2, splitIndex);
                lastSplitIndex = splitIndex;

                if (headerStr.isEmpty()) {
                    break;
                }

                headersBuilder.add(headerStr);
            }

            ResponseBody responseBody = null;
            Headers headers = headersBuilder.build();
            byte[] rawBody = buffer.toByteArray();
            if (rawBody.length != lastSplitIndex + 2) {
                byte[] responseBytes = Arrays.copyOfRange(rawBody, lastSplitIndex + 2, rawBody.length);
                responseBody = ResponseBody.create(MediaType.parse(headers.get("Content-Type")), responseBytes);
            }

            Response response = new Response.Builder().request(masterRequest).protocol(Protocol.HTTP_1_1).code(responseCode).headers(headers).body(responseBody).build();
            return deserialize(response, returnType);
        }
        catch (Exception e) {
            throw new ApiException(400, "Invalid response format.");
        }
    }

     /**
     * Add OAuth2 header
     *
     * @param headerParams Map of request headers
     */
    private void addOAuthAuthentication(Map<String, String> headerParams) throws ApiException {
        if (null == accessToken) {
            requestToken();
        }
        headerParams.put("Authorization", "Bearer " + accessToken);
    }


    /**
    * GetAccessTokenResult class
    */
    private class GetAccessTokenResult {
        public String access_token;
    }
}
