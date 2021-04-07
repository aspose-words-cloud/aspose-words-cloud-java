/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ChildRequestContent.java">
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

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import okio.BufferedSink;

import java.io.IOException;
import java.net.URI;

public class ChildRequestContent extends RequestBody {
    private static final String CRLF = "\r\n";
    private Request request;
    private URI baseUri;

    public ChildRequestContent(Request request, String rootUrl) {
        this.request = request;
        this.baseUri = URI.create(rootUrl);
    }

    @Override
    public MediaType contentType() {
        return MediaType.parse("application/http; msgtype=request");
    }

    @Override
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        bufferedSink.writeUtf8(request.method());
        bufferedSink.writeUtf8(" ");
        bufferedSink.writeUtf8(baseUri.relativize(request.uri()).toString());
        bufferedSink.writeUtf8(" ");
        bufferedSink.writeUtf8(CRLF);

        for (String key : request.headers().names()) {
            bufferedSink.writeUtf8(key);
            bufferedSink.writeUtf8(": ");
            bufferedSink.writeUtf8(request.headers().get(key));
            bufferedSink.writeUtf8(CRLF);
        }

        bufferedSink.writeUtf8(CRLF);
        if (request.body() != null) {
            request.body().writeTo(bufferedSink);
        }
    }
}
