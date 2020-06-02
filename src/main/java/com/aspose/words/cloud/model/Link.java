/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Link.java">
 *   Copyright (c) 2020 Aspose.Words for Cloud
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

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
import com.aspose.words.cloud.model.*;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Provides information for the object link.
 * This is supposed to be an atom:link, therefore it should have all attributes specified here http://tools.ietf.org/html/rfc4287#section-4.2.7.
 */
@ApiModel(description = "Provides information for the object link. This is supposed to be an atom:link, therefore it should have all attributes specified here http://tools.ietf.org/html/rfc4287#section-4.2.7.")
public class Link {
    @SerializedName("Href")
    private String href = null;

    @SerializedName("Rel")
    private String rel = null;

    @SerializedName("Title")
    private String title = null;

    @SerializedName("Type")
    private String type = null;
    public Link href(String href) {
        this.href = href;
        return this;
    }

    /**
     * Gets or sets the "href" attribute contains the link's IRI. atom:link elements MUST
     * have an href attribute, whose value MUST be a IRI reference.
    * @return href
    **/
    @ApiModelProperty(value = "Gets or sets the \"href\" attribute contains the link's IRI. atom:link elements MUST have an href attribute, whose value MUST be a IRI reference.")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Link rel(String rel) {
        this.rel = rel;
        return this;
    }

    /**
     * Gets or sets atom:link elements MAY have a "rel" attribute that indicates the link
     * relation type.  If the "rel" attribute is not present, the link
     * element MUST be interpreted as if the link relation type is "alternate".
    * @return rel
    **/
    @ApiModelProperty(value = "Gets or sets atom:link elements MAY have a \"rel\" attribute that indicates the link relation type.  If the \"rel\" attribute is not present, the link element MUST be interpreted as if the link relation type is \"alternate\".")
    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public Link title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Gets or sets the "title" attribute conveys human-readable information about the
     * link.  The content of the "title" attribute is Language-Sensitive.
    * @return title
    **/
    @ApiModelProperty(value = "Gets or sets the \"title\" attribute conveys human-readable information about the link.  The content of the \"title\" attribute is Language-Sensitive.")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Link type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Gets or sets on the link element, the "type" attribute's value is an advisory
     * media type: it is a hint about the type of the representation that is
     * expected to be returned when the value of the href attribute is
     * dereferenced.  Note that the type attribute does not override the
     * actual media type returned with the representation.
    * @return type
    **/
    @ApiModelProperty(value = "Gets or sets on the link element, the \"type\" attribute's value is an advisory media type: it is a hint about the type of the representation that is expected to be returned when the value of the href attribute is dereferenced.  Note that the type attribute does not override the actual media type returned with the representation.")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    Link link = (Link)o;
    return
        Objects.equals(this.href, link.href) &&
        Objects.equals(this.rel, link.rel) &&
        Objects.equals(this.title, link.title) &&
        Objects.equals(this.type, link.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, rel, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
