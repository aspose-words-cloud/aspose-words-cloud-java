/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="JobHandler.java">
 *   Copyright (c) 2026 Aspose.Words for Cloud
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

import com.aspose.words.cloud.model.JobInfo;
import com.aspose.words.cloud.model.requests.RequestIfc;
import jakarta.mail.BodyPart;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMultipart;
import java.io.IOException;

public class JobHandler<T> {
    private final ApiClient apiClient;
    private final RequestIfc request;
    private JobInfo info;
    private T result;

    public JobHandler(ApiClient apiClient, RequestIfc request, JobInfo info) {
        this.apiClient = apiClient;
        this.request = request;
        this.info = info;
    }

    public String getMessage() {
        return this.info.getMessage() != null ? this.info.getMessage() : "";
    }

    public JobInfo.StatusEnum getStatus() {
        return this.info.getStatus() != null ? this.info.getStatus() : JobInfo.StatusEnum.UNKNOWN;
    }

    public T getResult() {
        return this.result;
    }

    @SuppressWarnings("unchecked")
    public T update() throws ApiException, MessagingException, IOException {
        if (this.info.getJobId() == null || this.info.getJobId().isEmpty()) {
            throw new ApiException(400, "Invalid job id.");
        }

        MimeMultipart parts = this.apiClient.callJobResult(this.info.getJobId());
        if (parts.getCount() >= 1) {
            this.info = this.apiClient.deserializeJobInfoPart(parts.getBodyPart(0));
            if (parts.getCount() >= 2 && this.getStatus() == JobInfo.StatusEnum.SUCCEDED) {
                this.result = (T) this.apiClient.parseHttpResponsePart(this.request, parts.getBodyPart(1));
            }
        }

        return this.result;
    }

    public T waitResult() throws ApiException, MessagingException, IOException {
        return this.waitResult(3000L);
    }

    public T waitResult(long updateIntervalInMilliseconds) throws ApiException, MessagingException, IOException {
        while (this.getStatus() == JobInfo.StatusEnum.QUEUED || this.getStatus() == JobInfo.StatusEnum.PROCESSING) {
            try {
                Thread.sleep(updateIntervalInMilliseconds);
            }
            catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                throw new ApiException(ex);
            }

            this.update();
        }

        if (this.result == null && this.getStatus() == JobInfo.StatusEnum.SUCCEDED) {
            this.update();
        }

        if (this.getStatus() != JobInfo.StatusEnum.SUCCEDED) {
            throw new ApiException(400, "Job failed with status \"" + this.getStatus() + "\" - \"" + this.getMessage() + "\".");
        }

        return this.result;
    }
}
