/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="BatchPartRequest.java">
 *   Copyright (c) 2022 Aspose.Words for Cloud
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
import com.squareup.okhttp.Request;

import java.io.*;

/*
 * A batch part request wrapper to add batch part features.
 */
public class BatchPartRequest {
    private RequestIfc request;

    private String requestId;

    private String parentRequestId;

    /*
     * Initializes a new instance of the BatchPartRequest class.
     *
     * @param request RequestIfc inner request
     */
    public BatchPartRequest(RequestIfc request) {
        this.request = request;
        this.requestId = java.util.UUID.randomUUID().toString();
        this.parentRequestId = null;
    }

    /*
     * Get request object.
     */
    public RequestIfc getRequest() {
        return this.request;
    }

    /*
     * Get request ID.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /*
     * Get parent request ID.
     */
    public String getParentRequestId() {
        return this.parentRequestId;
    }

    /*
     * Set parent request.
     *
     * @param parentRequest BatchPartRequest a parent request.
     */
    public BatchPartRequest dependsOn(BatchPartRequest parentRequest) {
        this.parentRequestId = parentRequest.getRequestId();
        return this;
    }

    /*
     * Use a binary response of the request as an input for another request.
     */
    public byte[] resultOf() throws UnsupportedEncodingException {
        return ("resultOf(" + this.requestId + ")").getBytes("UTF8");
    }
}
