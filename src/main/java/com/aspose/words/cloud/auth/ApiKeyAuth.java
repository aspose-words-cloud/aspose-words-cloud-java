/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ApiKeyAuth.java">
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

package com.aspose.words.cloud.auth;

import com.aspose.words.cloud.Pair;

import java.util.Map;
import java.util.List;


public class ApiKeyAuth implements Authentication {
  private final String location;
  private final String paramName;

  private String clientSecret;
  private String clientSecretPrefix;

  public ApiKeyAuth(String location, String paramName) {
    this.location = location;
    this.paramName = paramName;
  }

  public String getLocation() {
    return location;
  }

  public String getParamName() {
    return paramName;
  }

  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public String getClientSecretPrefix() {
    return clientSecretPrefix;
  }

  public void setClientSecretPrefix(String clientSecretPrefix) {
    this.clientSecretPrefix = clientSecretPrefix;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    if (clientSecret == null) {
      return;
    }
    String value;
    if (clientSecretPrefix != null) {
      value = clientSecretPrefix + " " + clientSecret;
    } 
    else {
      value = clientSecret;
    }
    if ("query".equals(location)) {
      queryParams.add(new Pair(paramName, value));
    } 
    else if ("header".equals(location)) {
      headerParams.put(paramName, value);
    }
  }
}
