/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FileReference.java">
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

package com.aspose.words.cloud.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/*
 * File content special model.
 */
@ApiModel(description = "File content special model.")
public class FileReference implements ModelIfc {
    @SerializedName("Source")
    private String source;

    @SerializedName("Reference")
    private String reference;

    private byte[] content;

    /**
     * Gets file source.
    * @return String
    **/
    @ApiModelProperty(value = "Gets file source.")
    public String getSource() {
        return source;
    }

    /**
     * Gets file reference.
    * @return String
    **/
    @ApiModelProperty(value = "Gets file reference.")
    public String getReference() {
        return reference;
    }

    /**
     * Gets content of file.
    * @return byte[]
    **/
    public byte[] getContent() {
        return content;
    }

    public FileReference(String remoteFilePath) {
        this.source = "Storage";
        this.reference = remoteFilePath;
        this.content = null;
    }

    public FileReference(byte[] localFileContent) {
        this.source = "Request";
        this.reference = java.util.UUID.randomUUID().toString();
        this.content = localFileContent;
    }

    /*
     * Gets files content.
     *
     * @param resultFilesContent List<FileReference> instance.
     */
    @Override
    public void getFilesContent(List<FileReference> resultFilesContent)
    {
        if (this.source == "Request") {
            resultFilesContent.add(this);
        }
    }
}
