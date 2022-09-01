/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FileContent.java">
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
public class FileContent implements ModelIfc {
    @SerializedName("Id")
    private String id;

    @SerializedName("Filename")
    private String filename;

    private byte[] content;

    /**
     * Gets file id for multipart request.
    * @return String
    **/
    @ApiModelProperty(value = "Gets file id for multipart request.")
    public String getId() {
        return id;
    }

    /**
     * Gets filename for multipart request.
    * @return String
    **/
    @ApiModelProperty(value = "Gets filename for multipart request.")
    public String getFilename() {
        return filename;
    }

    /**
     * Gets content of file.
    * @return byte[]
    **/
    public byte[] getContent() {
        return content;
    }

    public FileContent(String filename, byte[] content) {
        this.id = java.util.UUID.randomUUID().toString();
        this.filename = filename;
        this.content = content;
    }

    /*
     * Gets files content.
     *
     * @param resultFilesContent List<FileContent> instance.
     */
    @Override
    public void getFilesContent(List<FileContent> resultFilesContent)
    {
        resultFilesContent.add(this);
    }
}
