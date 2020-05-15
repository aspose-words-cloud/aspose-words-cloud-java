package com.aspose.words.cloud;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import okio.Buffer;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ApiLoggingInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        long t1 = System.nanoTime();
        System.out.println("Sending request '" + request.url() + "'" + (chain.connection() != null ? " on " + chain.connection() : ""));
        if (request.headers() != null) {
            System.out.println("HEADERS BEGIN\n" + request.headers().toString().trim() + "\nHEADERS END");
        }
        if (request.body() != null) {
            System.out.println("REQUEST BODY BEGIN\n" + bodyToString(request) + "\nREQUEST BODY END");
        }
        System.out.println();

        Response response = chain.proceed(request);
        ResponseBody responseBody = response.body();
        byte[] responseBodyData = responseBody.bytes();
        Response newResponse = response.newBuilder().body(ResponseBody.create(responseBody.contentType(), responseBodyData)).build();

        long t2 = System.nanoTime();
        System.out.println("Received response for '" + response.request().url() + "' in " + (t2 - t1) / 1e6d + "ms.");
        if (response.headers() != null) {
            System.out.println("HEADERS BEGIN\n" + response.headers().toString().trim() + "\nHEADERS END");
        }
        System.out.println("RESPONSE BODY BEGIN\n" + formatStringForPrint(responseBodyData) + "\nRESPONSE BODY END");
        System.out.println();

        return newResponse;
    }

    private static String bodyToString(final Request request) throws IOException {
        final Request copy = request.newBuilder().build();
        final Buffer buffer = new Buffer();
        if (copy.body() != null) {
            copy.body().writeTo(buffer);
        }

        return formatStringForPrint(buffer.readByteArray());
    }

    private static String formatStringForPrint(byte[] data) {
        if (hasUnprintableCharacters(data)) {
            StringBuilder sb = new StringBuilder();
            for (byte b : data) {
                sb.append(String.format("%02X ", b));
            }
            return sb.toString();
        }

        return new String(data, StandardCharsets.UTF_8);
    }

    private static boolean hasUnprintableCharacters(byte[] data) {
        for (byte b : data) {
            if (b < 32 || b > 126) {
                return true;
            }
        }

        return false;
    }
}
