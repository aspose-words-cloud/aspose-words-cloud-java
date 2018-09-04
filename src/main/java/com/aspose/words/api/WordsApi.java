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
package com.aspose.words.api;

import com.sun.jersey.api.client.GenericType;

import com.aspose.words.ApiException;
import com.aspose.words.ApiClient;
import com.aspose.words.Configuration;
import com.aspose.words.model.*;
import com.aspose.words.model.requests.*;
import com.aspose.words.Pair;

import com.aspose.words.model.AsposeResponse;
import com.aspose.words.model.AvailableFontsResponse;
import com.aspose.words.model.BookmarkData;
import com.aspose.words.model.BookmarkResponse;
import com.aspose.words.model.BookmarksResponse;
import com.aspose.words.model.Border;
import com.aspose.words.model.BorderResponse;
import com.aspose.words.model.BordersResponse;
import com.aspose.words.model.ClassificationResponse;
import com.aspose.words.model.Comment;
import com.aspose.words.model.CommentResponse;
import com.aspose.words.model.CommentsResponse;
import com.aspose.words.model.CompareData;
import com.aspose.words.model.DocumentEntryList;
import com.aspose.words.model.DocumentPropertiesResponse;
import com.aspose.words.model.DocumentProperty;
import com.aspose.words.model.DocumentPropertyResponse;
import com.aspose.words.model.DocumentResponse;
import com.aspose.words.model.DrawingObjectResponse;
import com.aspose.words.model.DrawingObjectsResponse;
import com.aspose.words.model.Field;
import com.aspose.words.model.FieldNamesResponse;
import com.aspose.words.model.FieldResponse;
import com.aspose.words.model.FieldsResponse;
import java.io.File;
import com.aspose.words.model.Font;
import com.aspose.words.model.FontResponse;
import com.aspose.words.model.Footnote;
import com.aspose.words.model.FootnoteResponse;
import com.aspose.words.model.FootnotesResponse;
import com.aspose.words.model.FormField;
import com.aspose.words.model.FormFieldResponse;
import com.aspose.words.model.FormFieldsResponse;
import com.aspose.words.model.HeaderFooterResponse;
import com.aspose.words.model.HeaderFootersResponse;
import com.aspose.words.model.HyperlinkResponse;
import com.aspose.words.model.HyperlinksResponse;
import com.aspose.words.model.LoadWebDocumentData;
import com.aspose.words.model.OfficeMathObjectResponse;
import com.aspose.words.model.OfficeMathObjectsResponse;
import com.aspose.words.model.PageNumber;
import com.aspose.words.model.PageSetup;
import com.aspose.words.model.ParagraphInsert;
import com.aspose.words.model.ParagraphLinkCollectionResponse;
import com.aspose.words.model.ParagraphResponse;
import com.aspose.words.model.ProtectionDataResponse;
import com.aspose.words.model.ProtectionRequest;
import com.aspose.words.model.ReplaceTextRequest;
import com.aspose.words.model.ReplaceTextResponse;
import com.aspose.words.model.RevisionsModificationResponse;
import com.aspose.words.model.Run;
import com.aspose.words.model.RunResponse;
import com.aspose.words.model.RunsResponse;
import com.aspose.words.model.SaveOptionsData;
import com.aspose.words.model.SaveResponse;
import com.aspose.words.model.SearchResponse;
import com.aspose.words.model.SectionLinkCollectionResponse;
import com.aspose.words.model.SectionPageSetupResponse;
import com.aspose.words.model.SectionResponse;
import com.aspose.words.model.SplitDocumentResponse;
import com.aspose.words.model.StatDataResponse;
import com.aspose.words.model.TableCellFormat;
import com.aspose.words.model.TableCellFormatResponse;
import com.aspose.words.model.TableCellInsert;
import com.aspose.words.model.TableCellResponse;
import com.aspose.words.model.TableInsert;
import com.aspose.words.model.TableLinkCollectionResponse;
import com.aspose.words.model.TableProperties;
import com.aspose.words.model.TablePropertiesResponse;
import com.aspose.words.model.TableResponse;
import com.aspose.words.model.TableRowFormat;
import com.aspose.words.model.TableRowFormatResponse;
import com.aspose.words.model.TableRowInsert;
import com.aspose.words.model.TableRowResponse;
import com.aspose.words.model.TextItemsResponse;
import com.aspose.words.model.TiffSaveOptionsData;
import com.aspose.words.model.WatermarkText;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T13:03:27.428Z")
public class WordsApi {
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
     * Accept all revisions in document
     */
    public RevisionsModificationResponse acceptAllRevisions(AcceptAllRevisionsRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling acceptAllRevisions");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/revisions/acceptAll"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<RevisionsModificationResponse> localVarReturnType = new GenericType<RevisionsModificationResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Classify raw text.
     */
    public ClassificationResponse classify(ClassifyRequest request) throws ApiException {
        Object localVarPostBody = request.getText();
        
        // verify the required parameter 'Text' is set
        if (request.getText() == null) {
          throw new ApiException(400, "Missing the required parameter 'Text' when calling classify");
        }
        
        // create path and map variables
        String localVarPath = "/words/classify";
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "BestClassesCount", request.getBestClassesCount());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<ClassificationResponse> localVarReturnType = new GenericType<ClassificationResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Classify document.
     */
    public ClassificationResponse classifyDocument(ClassifyDocumentRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'DocumentName' is set
        if (request.getDocumentName() == null) {
          throw new ApiException(400, "Missing the required parameter 'DocumentName' when calling classifyDocument");
        }
        
        // create path and map variables
        String localVarPath = "/words/{documentName}/classify"
          .replaceAll("\\{" + "documentName" + "\\}", apiClient.escapeString(request.getDocumentName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "BestClassesCount", request.getBestClassesCount());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Taxonomy", request.getTaxonomy());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<ClassificationResponse> localVarReturnType = new GenericType<ClassificationResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Add new or update existing document property.
     */
    public DocumentPropertyResponse createOrUpdateDocumentProperty(CreateOrUpdateDocumentPropertyRequest request) throws ApiException {
        Object localVarPostBody = request.getProperty();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling createOrUpdateDocumentProperty");
        }
        
        // verify the required parameter 'PropertyName' is set
        if (request.getPropertyName() == null) {
          throw new ApiException(400, "Missing the required parameter 'PropertyName' when calling createOrUpdateDocumentProperty");
        }
        
        // verify the required parameter 'Property' is set
        if (request.getProperty() == null) {
          throw new ApiException(400, "Missing the required parameter 'Property' when calling createOrUpdateDocumentProperty");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/documentProperties/{propertyName}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "propertyName" + "\\}", apiClient.escapeString(request.getPropertyName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<DocumentPropertyResponse> localVarReturnType = new GenericType<DocumentPropertyResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Resets border properties to default values.             
     */
    public BorderResponse deleteBorder(DeleteBorderRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteBorder");
        }
        
        // verify the required parameter 'NodePath' is set
        if (request.getNodePath() == null) {
          throw new ApiException(400, "Missing the required parameter 'NodePath' when calling deleteBorder");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling deleteBorder");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/borders/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "nodePath" + "\\}", apiClient.escapeString(request.getNodePath().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<BorderResponse> localVarReturnType = new GenericType<BorderResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Resets borders properties to default values.             
     */
    public BordersResponse deleteBorders(DeleteBordersRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteBorders");
        }
        
        // verify the required parameter 'NodePath' is set
        if (request.getNodePath() == null) {
          throw new ApiException(400, "Missing the required parameter 'NodePath' when calling deleteBorders");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/borders"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "nodePath" + "\\}", apiClient.escapeString(request.getNodePath().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<BordersResponse> localVarReturnType = new GenericType<BordersResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Remove comment from document.
     */
    public AsposeResponse deleteComment(DeleteCommentRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteComment");
        }
        
        // verify the required parameter 'CommentIndex' is set
        if (request.getCommentIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'CommentIndex' when calling deleteComment");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/comments/{commentIndex}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "commentIndex" + "\\}", apiClient.escapeString(request.getCommentIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<AsposeResponse> localVarReturnType = new GenericType<AsposeResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Remove macros from document.
     */
    public AsposeResponse deleteDocumentMacros(DeleteDocumentMacrosRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteDocumentMacros");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/macros"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<AsposeResponse> localVarReturnType = new GenericType<AsposeResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Delete document property.
     */
    public AsposeResponse deleteDocumentProperty(DeleteDocumentPropertyRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteDocumentProperty");
        }
        
        // verify the required parameter 'PropertyName' is set
        if (request.getPropertyName() == null) {
          throw new ApiException(400, "Missing the required parameter 'PropertyName' when calling deleteDocumentProperty");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/documentProperties/{propertyName}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "propertyName" + "\\}", apiClient.escapeString(request.getPropertyName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<AsposeResponse> localVarReturnType = new GenericType<AsposeResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Delete watermark (for deleting last watermark from the document).
     */
    public DocumentResponse deleteDocumentWatermark(DeleteDocumentWatermarkRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteDocumentWatermark");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/watermark"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<DocumentResponse> localVarReturnType = new GenericType<DocumentResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Removes drawing object from document.
     */
    public AsposeResponse deleteDrawingObject(DeleteDrawingObjectRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteDrawingObject");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling deleteDrawingObject");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/drawingObjects/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<AsposeResponse> localVarReturnType = new GenericType<AsposeResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Delete field from document.
     */
    public AsposeResponse deleteField(DeleteFieldRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteField");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling deleteField");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/fields/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<AsposeResponse> localVarReturnType = new GenericType<AsposeResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Remove fields from section paragraph.
     */
    public AsposeResponse deleteFields(DeleteFieldsRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteFields");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/fields"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<AsposeResponse> localVarReturnType = new GenericType<AsposeResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Removes footnote from document.
     */
    public AsposeResponse deleteFootnote(DeleteFootnoteRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteFootnote");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling deleteFootnote");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/footnotes/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<AsposeResponse> localVarReturnType = new GenericType<AsposeResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Removes form field from document.
     */
    public AsposeResponse deleteFormField(DeleteFormFieldRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteFormField");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling deleteFormField");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/formfields/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<AsposeResponse> localVarReturnType = new GenericType<AsposeResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Delete header/footer from document.
     */
    public AsposeResponse deleteHeaderFooter(DeleteHeaderFooterRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteHeaderFooter");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling deleteHeaderFooter");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{sectionPath}/headersfooters/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "SectionPath", request.getSectionPath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<AsposeResponse> localVarReturnType = new GenericType<AsposeResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Delete document headers and footers.
     */
    public AsposeResponse deleteHeadersFooters(DeleteHeadersFootersRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteHeadersFooters");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{sectionPath}/headersfooters"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "SectionPath", request.getSectionPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "HeadersFootersTypes", request.getHeadersFootersTypes());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<AsposeResponse> localVarReturnType = new GenericType<AsposeResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Removes OfficeMath object from document.
     */
    public AsposeResponse deleteOfficeMathObject(DeleteOfficeMathObjectRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteOfficeMathObject");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling deleteOfficeMathObject");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/OfficeMathObjects/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<AsposeResponse> localVarReturnType = new GenericType<AsposeResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Remove paragraph from section.
     */
    public AsposeResponse deleteParagraph(DeleteParagraphRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteParagraph");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling deleteParagraph");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/paragraphs/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<AsposeResponse> localVarReturnType = new GenericType<AsposeResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Removes run from document.
     */
    public AsposeResponse deleteRun(DeleteRunRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteRun");
        }
        
        // verify the required parameter 'ParagraphPath' is set
        if (request.getParagraphPath() == null) {
          throw new ApiException(400, "Missing the required parameter 'ParagraphPath' when calling deleteRun");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling deleteRun");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{paragraphPath}/runs/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "paragraphPath" + "\\}", apiClient.escapeString(request.getParagraphPath().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<AsposeResponse> localVarReturnType = new GenericType<AsposeResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Delete a table.
     */
    public AsposeResponse deleteTable(DeleteTableRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteTable");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling deleteTable");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/tables/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<AsposeResponse> localVarReturnType = new GenericType<AsposeResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Delete a table cell.
     */
    public AsposeResponse deleteTableCell(DeleteTableCellRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteTableCell");
        }
        
        // verify the required parameter 'TableRowPath' is set
        if (request.getTableRowPath() == null) {
          throw new ApiException(400, "Missing the required parameter 'TableRowPath' when calling deleteTableCell");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling deleteTableCell");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{tableRowPath}/cells/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "tableRowPath" + "\\}", apiClient.escapeString(request.getTableRowPath().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<AsposeResponse> localVarReturnType = new GenericType<AsposeResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Delete a table row.
     */
    public AsposeResponse deleteTableRow(DeleteTableRowRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteTableRow");
        }
        
        // verify the required parameter 'TablePath' is set
        if (request.getTablePath() == null) {
          throw new ApiException(400, "Missing the required parameter 'TablePath' when calling deleteTableRow");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling deleteTableRow");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{tablePath}/rows/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "tablePath" + "\\}", apiClient.escapeString(request.getTablePath().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<AsposeResponse> localVarReturnType = new GenericType<AsposeResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Unprotect document.
     */
    public ProtectionDataResponse deleteUnprotectDocument(DeleteUnprotectDocumentRequest request) throws ApiException {
        Object localVarPostBody = request.getProtectionRequest();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling deleteUnprotectDocument");
        }
        
        // verify the required parameter 'ProtectionRequest' is set
        if (request.getProtectionRequest() == null) {
          throw new ApiException(400, "Missing the required parameter 'ProtectionRequest' when calling deleteUnprotectDocument");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/protection"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<ProtectionDataResponse> localVarReturnType = new GenericType<ProtectionDataResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Gets the list of fonts, available for document processing
     */
    public AvailableFontsResponse getAvailableFonts(GetAvailableFontsRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/words/fonts/available";
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "FontsLocation", request.getFontsLocation());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<AvailableFontsResponse> localVarReturnType = new GenericType<AvailableFontsResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Return a border.
     */
    public BorderResponse getBorder(GetBorderRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getBorder");
        }
        
        // verify the required parameter 'NodePath' is set
        if (request.getNodePath() == null) {
          throw new ApiException(400, "Missing the required parameter 'NodePath' when calling getBorder");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling getBorder");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/borders/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "nodePath" + "\\}", apiClient.escapeString(request.getNodePath().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<BorderResponse> localVarReturnType = new GenericType<BorderResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Return a collection of borders.
     */
    public BordersResponse getBorders(GetBordersRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getBorders");
        }
        
        // verify the required parameter 'NodePath' is set
        if (request.getNodePath() == null) {
          throw new ApiException(400, "Missing the required parameter 'NodePath' when calling getBorders");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/borders"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "nodePath" + "\\}", apiClient.escapeString(request.getNodePath().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<BordersResponse> localVarReturnType = new GenericType<BordersResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Get comment from document.
     */
    public CommentResponse getComment(GetCommentRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getComment");
        }
        
        // verify the required parameter 'CommentIndex' is set
        if (request.getCommentIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'CommentIndex' when calling getComment");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/comments/{commentIndex}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "commentIndex" + "\\}", apiClient.escapeString(request.getCommentIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<CommentResponse> localVarReturnType = new GenericType<CommentResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Get comments from document.
     */
    public CommentsResponse getComments(GetCommentsRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getComments");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/comments"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<CommentsResponse> localVarReturnType = new GenericType<CommentsResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Read document common info.
     */
    public DocumentResponse getDocument(GetDocumentRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'DocumentName' is set
        if (request.getDocumentName() == null) {
          throw new ApiException(400, "Missing the required parameter 'DocumentName' when calling getDocument");
        }
        
        // create path and map variables
        String localVarPath = "/words/{documentName}"
          .replaceAll("\\{" + "documentName" + "\\}", apiClient.escapeString(request.getDocumentName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<DocumentResponse> localVarReturnType = new GenericType<DocumentResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Read document bookmark data by its name.
     */
    public BookmarkResponse getDocumentBookmarkByName(GetDocumentBookmarkByNameRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentBookmarkByName");
        }
        
        // verify the required parameter 'BookmarkName' is set
        if (request.getBookmarkName() == null) {
          throw new ApiException(400, "Missing the required parameter 'BookmarkName' when calling getDocumentBookmarkByName");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/bookmarks/{bookmarkName}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "bookmarkName" + "\\}", apiClient.escapeString(request.getBookmarkName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<BookmarkResponse> localVarReturnType = new GenericType<BookmarkResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Read document bookmarks common info.
     */
    public BookmarksResponse getDocumentBookmarks(GetDocumentBookmarksRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentBookmarks");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/bookmarks"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<BookmarksResponse> localVarReturnType = new GenericType<BookmarksResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Read document drawing object common info by its index or convert to format specified.
     */
    public DrawingObjectResponse getDocumentDrawingObjectByIndex(GetDocumentDrawingObjectByIndexRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentDrawingObjectByIndex");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling getDocumentDrawingObjectByIndex");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/drawingObjects/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<DrawingObjectResponse> localVarReturnType = new GenericType<DrawingObjectResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Read drawing object image data.
     */
    public File getDocumentDrawingObjectImageData(GetDocumentDrawingObjectImageDataRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentDrawingObjectImageData");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling getDocumentDrawingObjectImageData");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/drawingObjects/{index}/imageData"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<File> localVarReturnType = new GenericType<File>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Get drawing object OLE data.
     */
    public File getDocumentDrawingObjectOleData(GetDocumentDrawingObjectOleDataRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentDrawingObjectOleData");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling getDocumentDrawingObjectOleData");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/drawingObjects/{index}/oleData"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<File> localVarReturnType = new GenericType<File>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Read document drawing objects common info.
     */
    public DrawingObjectsResponse getDocumentDrawingObjects(GetDocumentDrawingObjectsRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentDrawingObjects");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/drawingObjects"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<DrawingObjectsResponse> localVarReturnType = new GenericType<DrawingObjectsResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Read document field names.
     */
    public FieldNamesResponse getDocumentFieldNames(GetDocumentFieldNamesRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentFieldNames");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/mailMergeFieldNames"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "UseNonMergeFields", request.getUseNonMergeFields());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<FieldNamesResponse> localVarReturnType = new GenericType<FieldNamesResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Read document hyperlink by its index.
     */
    public HyperlinkResponse getDocumentHyperlinkByIndex(GetDocumentHyperlinkByIndexRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentHyperlinkByIndex");
        }
        
        // verify the required parameter 'HyperlinkIndex' is set
        if (request.getHyperlinkIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'HyperlinkIndex' when calling getDocumentHyperlinkByIndex");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/hyperlinks/{hyperlinkIndex}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "hyperlinkIndex" + "\\}", apiClient.escapeString(request.getHyperlinkIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<HyperlinkResponse> localVarReturnType = new GenericType<HyperlinkResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Read document hyperlinks common info.
     */
    public HyperlinksResponse getDocumentHyperlinks(GetDocumentHyperlinksRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentHyperlinks");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/hyperlinks"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<HyperlinksResponse> localVarReturnType = new GenericType<HyperlinksResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * This resource represents one of the paragraphs contained in the document.
     */
    public ParagraphResponse getDocumentParagraph(GetDocumentParagraphRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentParagraph");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling getDocumentParagraph");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/paragraphs/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<ParagraphResponse> localVarReturnType = new GenericType<ParagraphResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * This resource represents run of text contained in the document.
     */
    public RunResponse getDocumentParagraphRun(GetDocumentParagraphRunRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentParagraphRun");
        }
        
        // verify the required parameter 'ParagraphPath' is set
        if (request.getParagraphPath() == null) {
          throw new ApiException(400, "Missing the required parameter 'ParagraphPath' when calling getDocumentParagraphRun");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling getDocumentParagraphRun");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{paragraphPath}/runs/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "paragraphPath" + "\\}", apiClient.escapeString(request.getParagraphPath().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<RunResponse> localVarReturnType = new GenericType<RunResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * This resource represents font of run.
     */
    public FontResponse getDocumentParagraphRunFont(GetDocumentParagraphRunFontRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentParagraphRunFont");
        }
        
        // verify the required parameter 'ParagraphPath' is set
        if (request.getParagraphPath() == null) {
          throw new ApiException(400, "Missing the required parameter 'ParagraphPath' when calling getDocumentParagraphRunFont");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling getDocumentParagraphRunFont");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{paragraphPath}/runs/{index}/font"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "paragraphPath" + "\\}", apiClient.escapeString(request.getParagraphPath().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<FontResponse> localVarReturnType = new GenericType<FontResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * This resource represents collection of runs in the paragraph.
     */
    public RunsResponse getDocumentParagraphRuns(GetDocumentParagraphRunsRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentParagraphRuns");
        }
        
        // verify the required parameter 'ParagraphPath' is set
        if (request.getParagraphPath() == null) {
          throw new ApiException(400, "Missing the required parameter 'ParagraphPath' when calling getDocumentParagraphRuns");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{paragraphPath}/runs"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "paragraphPath" + "\\}", apiClient.escapeString(request.getParagraphPath().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<RunsResponse> localVarReturnType = new GenericType<RunsResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Return a list of paragraphs that are contained in the document.
     */
    public ParagraphLinkCollectionResponse getDocumentParagraphs(GetDocumentParagraphsRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentParagraphs");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/paragraphs"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<ParagraphLinkCollectionResponse> localVarReturnType = new GenericType<ParagraphLinkCollectionResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Read document properties info.
     */
    public DocumentPropertiesResponse getDocumentProperties(GetDocumentPropertiesRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentProperties");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/documentProperties"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<DocumentPropertiesResponse> localVarReturnType = new GenericType<DocumentPropertiesResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Read document property info by the property name.
     */
    public DocumentPropertyResponse getDocumentProperty(GetDocumentPropertyRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentProperty");
        }
        
        // verify the required parameter 'PropertyName' is set
        if (request.getPropertyName() == null) {
          throw new ApiException(400, "Missing the required parameter 'PropertyName' when calling getDocumentProperty");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/documentProperties/{propertyName}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "propertyName" + "\\}", apiClient.escapeString(request.getPropertyName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<DocumentPropertyResponse> localVarReturnType = new GenericType<DocumentPropertyResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Read document protection common info.
     */
    public ProtectionDataResponse getDocumentProtection(GetDocumentProtectionRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentProtection");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/protection"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<ProtectionDataResponse> localVarReturnType = new GenericType<ProtectionDataResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Read document statistics.
     */
    public StatDataResponse getDocumentStatistics(GetDocumentStatisticsRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentStatistics");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/statistics"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "IncludeComments", request.getIncludeComments());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "IncludeFootnotes", request.getIncludeFootnotes());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "IncludeTextInShapes", request.getIncludeTextInShapes());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<StatDataResponse> localVarReturnType = new GenericType<StatDataResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Read document text items.
     */
    public TextItemsResponse getDocumentTextItems(GetDocumentTextItemsRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentTextItems");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/textItems"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<TextItemsResponse> localVarReturnType = new GenericType<TextItemsResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Export the document into the specified format.
     */
    public File getDocumentWithFormat(GetDocumentWithFormatRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getDocumentWithFormat");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(400, "Missing the required parameter 'Format' when calling getDocumentWithFormat");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "OutPath", request.getOutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "FontsLocation", request.getFontsLocation());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<File> localVarReturnType = new GenericType<File>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Get field from document.
     */
    public FieldResponse getField(GetFieldRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getField");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling getField");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/fields/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<FieldResponse> localVarReturnType = new GenericType<FieldResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Get fields from document.
     */
    public FieldsResponse getFields(GetFieldsRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getFields");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/fields"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<FieldsResponse> localVarReturnType = new GenericType<FieldsResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Read footnote by index.
     */
    public FootnoteResponse getFootnote(GetFootnoteRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getFootnote");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling getFootnote");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/footnotes/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<FootnoteResponse> localVarReturnType = new GenericType<FootnoteResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Get footnotes from document.
     */
    public FootnotesResponse getFootnotes(GetFootnotesRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getFootnotes");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/footnotes"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<FootnotesResponse> localVarReturnType = new GenericType<FootnotesResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Returns representation of an one of the form field.
     */
    public FormFieldResponse getFormField(GetFormFieldRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getFormField");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling getFormField");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/formfields/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<FormFieldResponse> localVarReturnType = new GenericType<FormFieldResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Get form fields from document.
     */
    public FormFieldsResponse getFormFields(GetFormFieldsRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getFormFields");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/formfields"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<FormFieldsResponse> localVarReturnType = new GenericType<FormFieldsResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Return a header/footer that is contained in the document.
     */
    public HeaderFooterResponse getHeaderFooter(GetHeaderFooterRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getHeaderFooter");
        }
        
        // verify the required parameter 'HeaderFooterIndex' is set
        if (request.getHeaderFooterIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'HeaderFooterIndex' when calling getHeaderFooter");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/headersfooters/{headerFooterIndex}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "headerFooterIndex" + "\\}", apiClient.escapeString(request.getHeaderFooterIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "FilterByType", request.getFilterByType());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<HeaderFooterResponse> localVarReturnType = new GenericType<HeaderFooterResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Return a header/footer that is contained in the document.
     */
    public HeaderFooterResponse getHeaderFooterOfSection(GetHeaderFooterOfSectionRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getHeaderFooterOfSection");
        }
        
        // verify the required parameter 'HeaderFooterIndex' is set
        if (request.getHeaderFooterIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'HeaderFooterIndex' when calling getHeaderFooterOfSection");
        }
        
        // verify the required parameter 'SectionIndex' is set
        if (request.getSectionIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'SectionIndex' when calling getHeaderFooterOfSection");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/sections/{sectionIndex}/headersfooters/{headerFooterIndex}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "headerFooterIndex" + "\\}", apiClient.escapeString(request.getHeaderFooterIndex().toString()))
          .replaceAll("\\{" + "sectionIndex" + "\\}", apiClient.escapeString(request.getSectionIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "FilterByType", request.getFilterByType());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<HeaderFooterResponse> localVarReturnType = new GenericType<HeaderFooterResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Return a list of header/footers that are contained in the document.
     */
    public HeaderFootersResponse getHeaderFooters(GetHeaderFootersRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getHeaderFooters");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{sectionPath}/headersfooters"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "SectionPath", request.getSectionPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "FilterByType", request.getFilterByType());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<HeaderFootersResponse> localVarReturnType = new GenericType<HeaderFootersResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Read OfficeMath object by index.
     */
    public OfficeMathObjectResponse getOfficeMathObject(GetOfficeMathObjectRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getOfficeMathObject");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling getOfficeMathObject");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/OfficeMathObjects/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<OfficeMathObjectResponse> localVarReturnType = new GenericType<OfficeMathObjectResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Get OfficeMath objects from document.
     */
    public OfficeMathObjectsResponse getOfficeMathObjects(GetOfficeMathObjectsRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getOfficeMathObjects");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/OfficeMathObjects"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<OfficeMathObjectsResponse> localVarReturnType = new GenericType<OfficeMathObjectsResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Get document section by index.
     */
    public SectionResponse getSection(GetSectionRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getSection");
        }
        
        // verify the required parameter 'SectionIndex' is set
        if (request.getSectionIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'SectionIndex' when calling getSection");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/sections/{sectionIndex}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "sectionIndex" + "\\}", apiClient.escapeString(request.getSectionIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<SectionResponse> localVarReturnType = new GenericType<SectionResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Get page setup of section.
     */
    public SectionPageSetupResponse getSectionPageSetup(GetSectionPageSetupRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getSectionPageSetup");
        }
        
        // verify the required parameter 'SectionIndex' is set
        if (request.getSectionIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'SectionIndex' when calling getSectionPageSetup");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/sections/{sectionIndex}/pageSetup"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "sectionIndex" + "\\}", apiClient.escapeString(request.getSectionIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<SectionPageSetupResponse> localVarReturnType = new GenericType<SectionPageSetupResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Return a list of sections that are contained in the document.
     */
    public SectionLinkCollectionResponse getSections(GetSectionsRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getSections");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/sections"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<SectionLinkCollectionResponse> localVarReturnType = new GenericType<SectionLinkCollectionResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Return a table.
     */
    public TableResponse getTable(GetTableRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getTable");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling getTable");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/tables/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<TableResponse> localVarReturnType = new GenericType<TableResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Return a table cell.
     */
    public TableCellResponse getTableCell(GetTableCellRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getTableCell");
        }
        
        // verify the required parameter 'TableRowPath' is set
        if (request.getTableRowPath() == null) {
          throw new ApiException(400, "Missing the required parameter 'TableRowPath' when calling getTableCell");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling getTableCell");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{tableRowPath}/cells/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "tableRowPath" + "\\}", apiClient.escapeString(request.getTableRowPath().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<TableCellResponse> localVarReturnType = new GenericType<TableCellResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Return a table cell format.
     */
    public TableCellFormatResponse getTableCellFormat(GetTableCellFormatRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getTableCellFormat");
        }
        
        // verify the required parameter 'TableRowPath' is set
        if (request.getTableRowPath() == null) {
          throw new ApiException(400, "Missing the required parameter 'TableRowPath' when calling getTableCellFormat");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling getTableCellFormat");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{tableRowPath}/cells/{index}/cellformat"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "tableRowPath" + "\\}", apiClient.escapeString(request.getTableRowPath().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<TableCellFormatResponse> localVarReturnType = new GenericType<TableCellFormatResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Return a table properties.
     */
    public TablePropertiesResponse getTableProperties(GetTablePropertiesRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getTableProperties");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling getTableProperties");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/tables/{index}/properties"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<TablePropertiesResponse> localVarReturnType = new GenericType<TablePropertiesResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Return a table row.
     */
    public TableRowResponse getTableRow(GetTableRowRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getTableRow");
        }
        
        // verify the required parameter 'TablePath' is set
        if (request.getTablePath() == null) {
          throw new ApiException(400, "Missing the required parameter 'TablePath' when calling getTableRow");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling getTableRow");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{tablePath}/rows/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "tablePath" + "\\}", apiClient.escapeString(request.getTablePath().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<TableRowResponse> localVarReturnType = new GenericType<TableRowResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Return a table row format.
     */
    public TableRowFormatResponse getTableRowFormat(GetTableRowFormatRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getTableRowFormat");
        }
        
        // verify the required parameter 'TablePath' is set
        if (request.getTablePath() == null) {
          throw new ApiException(400, "Missing the required parameter 'TablePath' when calling getTableRowFormat");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling getTableRowFormat");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{tablePath}/rows/{index}/rowformat"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "tablePath" + "\\}", apiClient.escapeString(request.getTablePath().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<TableRowFormatResponse> localVarReturnType = new GenericType<TableRowFormatResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Return a list of tables that are contained in the document.
     */
    public TableLinkCollectionResponse getTables(GetTablesRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling getTables");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/tables"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<TableLinkCollectionResponse> localVarReturnType = new GenericType<TableLinkCollectionResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Adds table to document, returns added table&#39;s data.             
     */
    public TableResponse insertTable(InsertTableRequest request) throws ApiException {
        Object localVarPostBody = request.getTable();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling insertTable");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/tables"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<TableResponse> localVarReturnType = new GenericType<TableResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Adds table cell to table, returns added cell&#39;s data.             
     */
    public TableCellResponse insertTableCell(InsertTableCellRequest request) throws ApiException {
        Object localVarPostBody = request.getCell();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling insertTableCell");
        }
        
        // verify the required parameter 'TableRowPath' is set
        if (request.getTableRowPath() == null) {
          throw new ApiException(400, "Missing the required parameter 'TableRowPath' when calling insertTableCell");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{tableRowPath}/cells"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "tableRowPath" + "\\}", apiClient.escapeString(request.getTableRowPath().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<TableCellResponse> localVarReturnType = new GenericType<TableCellResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Adds table row to table, returns added row&#39;s data.             
     */
    public TableRowResponse insertTableRow(InsertTableRowRequest request) throws ApiException {
        Object localVarPostBody = request.getRow();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling insertTableRow");
        }
        
        // verify the required parameter 'TablePath' is set
        if (request.getTablePath() == null) {
          throw new ApiException(400, "Missing the required parameter 'TablePath' when calling insertTableRow");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{tablePath}/rows"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "tablePath" + "\\}", apiClient.escapeString(request.getTablePath().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<TableRowResponse> localVarReturnType = new GenericType<TableRowResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Append documents to original document.
     */
    public DocumentResponse postAppendDocument(PostAppendDocumentRequest request) throws ApiException {
        Object localVarPostBody = request.getDocumentList();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postAppendDocument");
        }
        
        // verify the required parameter 'DocumentList' is set
        if (request.getDocumentList() == null) {
          throw new ApiException(400, "Missing the required parameter 'DocumentList' when calling postAppendDocument");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/appendDocument"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<DocumentResponse> localVarReturnType = new GenericType<DocumentResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Change document protection.
     */
    public ProtectionDataResponse postChangeDocumentProtection(PostChangeDocumentProtectionRequest request) throws ApiException {
        Object localVarPostBody = request.getProtectionRequest();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postChangeDocumentProtection");
        }
        
        // verify the required parameter 'ProtectionRequest' is set
        if (request.getProtectionRequest() == null) {
          throw new ApiException(400, "Missing the required parameter 'ProtectionRequest' when calling postChangeDocumentProtection");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/protection"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<ProtectionDataResponse> localVarReturnType = new GenericType<ProtectionDataResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Updates the comment, returns updated comment&#39;s data.
     */
    public CommentResponse postComment(PostCommentRequest request) throws ApiException {
        Object localVarPostBody = request.getComment();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postComment");
        }
        
        // verify the required parameter 'CommentIndex' is set
        if (request.getCommentIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'CommentIndex' when calling postComment");
        }
        
        // verify the required parameter 'Comment' is set
        if (request.getComment() == null) {
          throw new ApiException(400, "Missing the required parameter 'Comment' when calling postComment");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/comments/{commentIndex}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "commentIndex" + "\\}", apiClient.escapeString(request.getCommentIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<CommentResponse> localVarReturnType = new GenericType<CommentResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Compare document with original document.
     */
    public DocumentResponse postCompareDocument(PostCompareDocumentRequest request) throws ApiException {
        Object localVarPostBody = request.getCompareData();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postCompareDocument");
        }
        
        // verify the required parameter 'CompareData' is set
        if (request.getCompareData() == null) {
          throw new ApiException(400, "Missing the required parameter 'CompareData' when calling postCompareDocument");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/compareDocument"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<DocumentResponse> localVarReturnType = new GenericType<DocumentResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Execute document mail merge operation.
     */
    public DocumentResponse postDocumentExecuteMailMerge(PostDocumentExecuteMailMergeRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postDocumentExecuteMailMerge");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/executeMailMerge"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "WithRegions", request.getWithRegions());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "MailMergeDataFile", request.getMailMergeDataFile());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Cleanup", request.getCleanup());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "UseWholeParagraphAsRegion", request.getUseWholeParagraphAsRegion());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        
                
        if (request.getData() != null)
          localVarFormParams.put("Data", request.getData());
        
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<DocumentResponse> localVarReturnType = new GenericType<DocumentResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Updates font properties, returns updated font data.
     */
    public FontResponse postDocumentParagraphRunFont(PostDocumentParagraphRunFontRequest request) throws ApiException {
        Object localVarPostBody = request.getFontDto();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postDocumentParagraphRunFont");
        }
        
        // verify the required parameter 'FontDto' is set
        if (request.getFontDto() == null) {
          throw new ApiException(400, "Missing the required parameter 'FontDto' when calling postDocumentParagraphRunFont");
        }
        
        // verify the required parameter 'ParagraphPath' is set
        if (request.getParagraphPath() == null) {
          throw new ApiException(400, "Missing the required parameter 'ParagraphPath' when calling postDocumentParagraphRunFont");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling postDocumentParagraphRunFont");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{paragraphPath}/runs/{index}/font"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "paragraphPath" + "\\}", apiClient.escapeString(request.getParagraphPath().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<FontResponse> localVarReturnType = new GenericType<FontResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Convert document to destination format with detailed settings and save result to storage.
     */
    public SaveResponse postDocumentSaveAs(PostDocumentSaveAsRequest request) throws ApiException {
        Object localVarPostBody = request.getSaveOptionsData();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postDocumentSaveAs");
        }
        
        // verify the required parameter 'SaveOptionsData' is set
        if (request.getSaveOptionsData() == null) {
          throw new ApiException(400, "Missing the required parameter 'SaveOptionsData' when calling postDocumentSaveAs");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/saveAs"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "FontsLocation", request.getFontsLocation());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<SaveResponse> localVarReturnType = new GenericType<SaveResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Updates drawing object, returns updated  drawing object&#39;s data.
     */
    public DrawingObjectResponse postDrawingObject(PostDrawingObjectRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postDrawingObject");
        }
        
        // verify the required parameter 'DrawingObject' is set
        if (request.getDrawingObject() == null) {
          throw new ApiException(400, "Missing the required parameter 'DrawingObject' when calling postDrawingObject");
        }
        
        // verify the required parameter 'ImageFile' is set
        if (request.getImageFile() == null) {
          throw new ApiException(400, "Missing the required parameter 'ImageFile' when calling postDrawingObject");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling postDrawingObject");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/drawingObjects/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
        if (request.getDrawingObject() != null)
          localVarFormParams.put("DrawingObject", request.getDrawingObject());
if (request.getImageFile() != null)
          localVarFormParams.put("ImageFile", request.getImageFile());
        
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<DrawingObjectResponse> localVarReturnType = new GenericType<DrawingObjectResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Populate document template with data.
     */
    public DocumentResponse postExecuteTemplate(PostExecuteTemplateRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postExecuteTemplate");
        }
        
        // verify the required parameter 'Data' is set
        if (request.getData() == null) {
          throw new ApiException(400, "Missing the required parameter 'Data' when calling postExecuteTemplate");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/executeTemplate"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Cleanup", request.getCleanup());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "UseWholeParagraphAsRegion", request.getUseWholeParagraphAsRegion());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "WithRegions", request.getWithRegions());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        
                
        if (request.getData() != null)
          localVarFormParams.put("Data", request.getData());
        
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<DocumentResponse> localVarReturnType = new GenericType<DocumentResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Updates field&#39;s properties, returns updated field&#39;s data.
     */
    public FieldResponse postField(PostFieldRequest request) throws ApiException {
        Object localVarPostBody = request.getField();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postField");
        }
        
        // verify the required parameter 'Field' is set
        if (request.getField() == null) {
          throw new ApiException(400, "Missing the required parameter 'Field' when calling postField");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling postField");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/fields/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<FieldResponse> localVarReturnType = new GenericType<FieldResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Updates footnote&#39;s properties, returns updated run&#39;s data.
     */
    public FootnoteResponse postFootnote(PostFootnoteRequest request) throws ApiException {
        Object localVarPostBody = request.getFootnoteDto();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postFootnote");
        }
        
        // verify the required parameter 'FootnoteDto' is set
        if (request.getFootnoteDto() == null) {
          throw new ApiException(400, "Missing the required parameter 'FootnoteDto' when calling postFootnote");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling postFootnote");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/footnotes/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<FootnoteResponse> localVarReturnType = new GenericType<FootnoteResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Updates properties of form field, returns updated form field.
     */
    public FormFieldResponse postFormField(PostFormFieldRequest request) throws ApiException {
        Object localVarPostBody = request.getFormField();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postFormField");
        }
        
        // verify the required parameter 'FormField' is set
        if (request.getFormField() == null) {
          throw new ApiException(400, "Missing the required parameter 'FormField' when calling postFormField");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling postFormField");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/formfields/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<FormFieldResponse> localVarReturnType = new GenericType<FormFieldResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Insert document watermark image.
     */
    public DocumentResponse postInsertDocumentWatermarkImage(PostInsertDocumentWatermarkImageRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postInsertDocumentWatermarkImage");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/watermark/insertImage"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RotationAngle", request.getRotationAngle());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Image", request.getImage());
        
                
        if (request.getImageFile() != null)
          localVarFormParams.put("ImageFile", request.getImageFile());
        
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<DocumentResponse> localVarReturnType = new GenericType<DocumentResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Insert document watermark text.
     */
    public DocumentResponse postInsertDocumentWatermarkText(PostInsertDocumentWatermarkTextRequest request) throws ApiException {
        Object localVarPostBody = request.getWatermarkText();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postInsertDocumentWatermarkText");
        }
        
        // verify the required parameter 'WatermarkText' is set
        if (request.getWatermarkText() == null) {
          throw new ApiException(400, "Missing the required parameter 'WatermarkText' when calling postInsertDocumentWatermarkText");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/watermark/insertText"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<DocumentResponse> localVarReturnType = new GenericType<DocumentResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Insert document page numbers.
     */
    public DocumentResponse postInsertPageNumbers(PostInsertPageNumbersRequest request) throws ApiException {
        Object localVarPostBody = request.getPageNumber();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postInsertPageNumbers");
        }
        
        // verify the required parameter 'PageNumber' is set
        if (request.getPageNumber() == null) {
          throw new ApiException(400, "Missing the required parameter 'PageNumber' when calling postInsertPageNumbers");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/insertPageNumbers"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<DocumentResponse> localVarReturnType = new GenericType<DocumentResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Loads new document from web into the file with any supported format of data.
     */
    public SaveResponse postLoadWebDocument(PostLoadWebDocumentRequest request) throws ApiException {
        Object localVarPostBody = request.getData();
        
        // verify the required parameter 'Data' is set
        if (request.getData() == null) {
          throw new ApiException(400, "Missing the required parameter 'Data' when calling postLoadWebDocument");
        }
        
        // create path and map variables
        String localVarPath = "/words/loadWebDocument";
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<SaveResponse> localVarReturnType = new GenericType<SaveResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Replace document text.
     */
    public ReplaceTextResponse postReplaceText(PostReplaceTextRequest request) throws ApiException {
        Object localVarPostBody = request.getReplaceText();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postReplaceText");
        }
        
        // verify the required parameter 'ReplaceText' is set
        if (request.getReplaceText() == null) {
          throw new ApiException(400, "Missing the required parameter 'ReplaceText' when calling postReplaceText");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/replaceText"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<ReplaceTextResponse> localVarReturnType = new GenericType<ReplaceTextResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Updates run&#39;s properties, returns updated run&#39;s data.
     */
    public RunResponse postRun(PostRunRequest request) throws ApiException {
        Object localVarPostBody = request.getRun();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postRun");
        }
        
        // verify the required parameter 'Run' is set
        if (request.getRun() == null) {
          throw new ApiException(400, "Missing the required parameter 'Run' when calling postRun");
        }
        
        // verify the required parameter 'ParagraphPath' is set
        if (request.getParagraphPath() == null) {
          throw new ApiException(400, "Missing the required parameter 'ParagraphPath' when calling postRun");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling postRun");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{paragraphPath}/runs/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "paragraphPath" + "\\}", apiClient.escapeString(request.getParagraphPath().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<RunResponse> localVarReturnType = new GenericType<RunResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Split document.
     */
    public SplitDocumentResponse postSplitDocument(PostSplitDocumentRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postSplitDocument");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/split"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "From", request.getFrom());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "To", request.getTo());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "ZipOutput", request.getZipOutput());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "FontsLocation", request.getFontsLocation());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<SplitDocumentResponse> localVarReturnType = new GenericType<SplitDocumentResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Update document bookmark.
     */
    public BookmarkResponse postUpdateDocumentBookmark(PostUpdateDocumentBookmarkRequest request) throws ApiException {
        Object localVarPostBody = request.getBookmarkData();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postUpdateDocumentBookmark");
        }
        
        // verify the required parameter 'BookmarkData' is set
        if (request.getBookmarkData() == null) {
          throw new ApiException(400, "Missing the required parameter 'BookmarkData' when calling postUpdateDocumentBookmark");
        }
        
        // verify the required parameter 'BookmarkName' is set
        if (request.getBookmarkName() == null) {
          throw new ApiException(400, "Missing the required parameter 'BookmarkName' when calling postUpdateDocumentBookmark");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/bookmarks/{bookmarkName}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "bookmarkName" + "\\}", apiClient.escapeString(request.getBookmarkName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<BookmarkResponse> localVarReturnType = new GenericType<BookmarkResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Update (reevaluate) fields in document.
     */
    public DocumentResponse postUpdateDocumentFields(PostUpdateDocumentFieldsRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling postUpdateDocumentFields");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/updateFields"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<DocumentResponse> localVarReturnType = new GenericType<DocumentResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Adds comment to document, returns inserted comment&#39;s data.
     */
    public CommentResponse putComment(PutCommentRequest request) throws ApiException {
        Object localVarPostBody = request.getComment();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling putComment");
        }
        
        // verify the required parameter 'Comment' is set
        if (request.getComment() == null) {
          throw new ApiException(400, "Missing the required parameter 'Comment' when calling putComment");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/comments"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<CommentResponse> localVarReturnType = new GenericType<CommentResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Convert document from request content to format specified.
     */
    public File putConvertDocument(PutConvertDocumentRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Document' is set
        if (request.getDocument() == null) {
          throw new ApiException(400, "Missing the required parameter 'Document' when calling putConvertDocument");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(400, "Missing the required parameter 'Format' when calling putConvertDocument");
        }
        
        // create path and map variables
        String localVarPath = "/words/convert";
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "OutPath", request.getOutPath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DocumentFileName", request.getDocumentFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "FontsLocation", request.getFontsLocation());
        
                
        if (request.getDocument() != null)
          localVarFormParams.put("Document", request.getDocument());
        
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<File> localVarReturnType = new GenericType<File>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Creates new document. Document is created with format which is recognized from file extensions.  Supported extentions: \&quot;.doc\&quot;, \&quot;.docx\&quot;, \&quot;.docm\&quot;, \&quot;.dot\&quot;, \&quot;.dotm\&quot;, \&quot;.dotx\&quot;, \&quot;.flatopc\&quot;, \&quot;.fopc\&quot;, \&quot;.flatopc_macro\&quot;, \&quot;.fopc_macro\&quot;, \&quot;.flatopc_template\&quot;, \&quot;.fopc_template\&quot;, \&quot;.flatopc_template_macro\&quot;, \&quot;.fopc_template_macro\&quot;, \&quot;.wordml\&quot;, \&quot;.wml\&quot;, \&quot;.rtf\&quot;
     */
    public DocumentResponse putCreateDocument(PutCreateDocumentRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/words/create";
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "FileName", request.getFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<DocumentResponse> localVarReturnType = new GenericType<DocumentResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Read document field names.
     */
    public FieldNamesResponse putDocumentFieldNames(PutDocumentFieldNamesRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Template' is set
        if (request.getTemplate() == null) {
          throw new ApiException(400, "Missing the required parameter 'Template' when calling putDocumentFieldNames");
        }
        
        // create path and map variables
        String localVarPath = "/words/mailMergeFieldNames";
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "UseNonMergeFields", request.getUseNonMergeFields());
        
                
        if (request.getTemplate() != null)
          localVarFormParams.put("Template", request.getTemplate());
        
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<FieldNamesResponse> localVarReturnType = new GenericType<FieldNamesResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Convert document to tiff with detailed settings and save result to storage.
     */
    public SaveResponse putDocumentSaveAsTiff(PutDocumentSaveAsTiffRequest request) throws ApiException {
        Object localVarPostBody = request.getSaveOptions();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling putDocumentSaveAsTiff");
        }
        
        // verify the required parameter 'SaveOptions' is set
        if (request.getSaveOptions() == null) {
          throw new ApiException(400, "Missing the required parameter 'SaveOptions' when calling putDocumentSaveAsTiff");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/saveAs/tiff"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "ResultFile", request.getResultFile());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "UseAntiAliasing", request.getUseAntiAliasing());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "UseHighQualityRendering", request.getUseHighQualityRendering());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "ImageBrightness", request.getImageBrightness());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "ImageColorMode", request.getImageColorMode());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "ImageContrast", request.getImageContrast());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NumeralFormat", request.getNumeralFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "PageCount", request.getPageCount());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "PageIndex", request.getPageIndex());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "PaperColor", request.getPaperColor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "PixelFormat", request.getPixelFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Resolution", request.getResolution());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Scale", request.getScale());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "TiffCompression", request.getTiffCompression());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DmlRenderingMode", request.getDmlRenderingMode());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DmlEffectsRenderingMode", request.getDmlEffectsRenderingMode());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "TiffBinarizationMethod", request.getTiffBinarizationMethod());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "ZipOutput", request.getZipOutput());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "FontsLocation", request.getFontsLocation());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<SaveResponse> localVarReturnType = new GenericType<SaveResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Adds  drawing object to document, returns added  drawing object&#39;s data.
     */
    public DrawingObjectResponse putDrawingObject(PutDrawingObjectRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling putDrawingObject");
        }
        
        // verify the required parameter 'DrawingObject' is set
        if (request.getDrawingObject() == null) {
          throw new ApiException(400, "Missing the required parameter 'DrawingObject' when calling putDrawingObject");
        }
        
        // verify the required parameter 'ImageFile' is set
        if (request.getImageFile() == null) {
          throw new ApiException(400, "Missing the required parameter 'ImageFile' when calling putDrawingObject");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/drawingObjects"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
        if (request.getDrawingObject() != null)
          localVarFormParams.put("DrawingObject", request.getDrawingObject());
if (request.getImageFile() != null)
          localVarFormParams.put("ImageFile", request.getImageFile());
        
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<DrawingObjectResponse> localVarReturnType = new GenericType<DrawingObjectResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Execute document mail merge online.
     */
    public File putExecuteMailMergeOnline(PutExecuteMailMergeOnlineRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Template' is set
        if (request.getTemplate() == null) {
          throw new ApiException(400, "Missing the required parameter 'Template' when calling putExecuteMailMergeOnline");
        }
        
        // verify the required parameter 'Data' is set
        if (request.getData() == null) {
          throw new ApiException(400, "Missing the required parameter 'Data' when calling putExecuteMailMergeOnline");
        }
        
        // create path and map variables
        String localVarPath = "/words/executeMailMerge";
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "WithRegions", request.getWithRegions());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Cleanup", request.getCleanup());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DocumentFileName", request.getDocumentFileName());
        
                
        if (request.getTemplate() != null)
          localVarFormParams.put("Template", request.getTemplate());
if (request.getData() != null)
          localVarFormParams.put("Data", request.getData());
        
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<File> localVarReturnType = new GenericType<File>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Populate document template with data online.
     */
    public File putExecuteTemplateOnline(PutExecuteTemplateOnlineRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Template' is set
        if (request.getTemplate() == null) {
          throw new ApiException(400, "Missing the required parameter 'Template' when calling putExecuteTemplateOnline");
        }
        
        // verify the required parameter 'Data' is set
        if (request.getData() == null) {
          throw new ApiException(400, "Missing the required parameter 'Data' when calling putExecuteTemplateOnline");
        }
        
        // create path and map variables
        String localVarPath = "/words/executeTemplate";
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Cleanup", request.getCleanup());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "UseWholeParagraphAsRegion", request.getUseWholeParagraphAsRegion());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "WithRegions", request.getWithRegions());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DocumentFileName", request.getDocumentFileName());
        
                
        if (request.getTemplate() != null)
          localVarFormParams.put("Template", request.getTemplate());
if (request.getData() != null)
          localVarFormParams.put("Data", request.getData());
        
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<File> localVarReturnType = new GenericType<File>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Adds field to document, returns inserted field&#39;s data.
     */
    public FieldResponse putField(PutFieldRequest request) throws ApiException {
        Object localVarPostBody = request.getField();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling putField");
        }
        
        // verify the required parameter 'Field' is set
        if (request.getField() == null) {
          throw new ApiException(400, "Missing the required parameter 'Field' when calling putField");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/fields"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "InsertBeforeNode", request.getInsertBeforeNode());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<FieldResponse> localVarReturnType = new GenericType<FieldResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Adds footnote to document, returns added footnote&#39;s data.
     */
    public FootnoteResponse putFootnote(PutFootnoteRequest request) throws ApiException {
        Object localVarPostBody = request.getFootnoteDto();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling putFootnote");
        }
        
        // verify the required parameter 'FootnoteDto' is set
        if (request.getFootnoteDto() == null) {
          throw new ApiException(400, "Missing the required parameter 'FootnoteDto' when calling putFootnote");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/footnotes"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<FootnoteResponse> localVarReturnType = new GenericType<FootnoteResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Adds form field to paragraph, returns added form field&#39;s data.
     */
    public FormFieldResponse putFormField(PutFormFieldRequest request) throws ApiException {
        Object localVarPostBody = request.getFormField();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling putFormField");
        }
        
        // verify the required parameter 'FormField' is set
        if (request.getFormField() == null) {
          throw new ApiException(400, "Missing the required parameter 'FormField' when calling putFormField");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/formfields"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "InsertBeforeNode", request.getInsertBeforeNode());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<FormFieldResponse> localVarReturnType = new GenericType<FormFieldResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Insert to document header or footer.
     */
    public HeaderFooterResponse putHeaderFooter(PutHeaderFooterRequest request) throws ApiException {
        Object localVarPostBody = request.getHeaderFooterType();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling putHeaderFooter");
        }
        
        // verify the required parameter 'HeaderFooterType' is set
        if (request.getHeaderFooterType() == null) {
          throw new ApiException(400, "Missing the required parameter 'HeaderFooterType' when calling putHeaderFooter");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{sectionPath}/headersfooters"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "SectionPath", request.getSectionPath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<HeaderFooterResponse> localVarReturnType = new GenericType<HeaderFooterResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Adds paragraph to document, returns added paragraph&#39;s data.
     */
    public ParagraphResponse putParagraph(PutParagraphRequest request) throws ApiException {
        Object localVarPostBody = request.getParagraph();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling putParagraph");
        }
        
        // verify the required parameter 'Paragraph' is set
        if (request.getParagraph() == null) {
          throw new ApiException(400, "Missing the required parameter 'Paragraph' when calling putParagraph");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/paragraphs"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "InsertBeforeNode", request.getInsertBeforeNode());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<ParagraphResponse> localVarReturnType = new GenericType<ParagraphResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Protect document.
     */
    public ProtectionDataResponse putProtectDocument(PutProtectDocumentRequest request) throws ApiException {
        Object localVarPostBody = request.getProtectionRequest();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling putProtectDocument");
        }
        
        // verify the required parameter 'ProtectionRequest' is set
        if (request.getProtectionRequest() == null) {
          throw new ApiException(400, "Missing the required parameter 'ProtectionRequest' when calling putProtectDocument");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/protection"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<ProtectionDataResponse> localVarReturnType = new GenericType<ProtectionDataResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Adds run to document, returns added paragraph&#39;s data.
     */
    public RunResponse putRun(PutRunRequest request) throws ApiException {
        Object localVarPostBody = request.getRun();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling putRun");
        }
        
        // verify the required parameter 'ParagraphPath' is set
        if (request.getParagraphPath() == null) {
          throw new ApiException(400, "Missing the required parameter 'ParagraphPath' when calling putRun");
        }
        
        // verify the required parameter 'Run' is set
        if (request.getRun() == null) {
          throw new ApiException(400, "Missing the required parameter 'Run' when calling putRun");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{paragraphPath}/runs"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "paragraphPath" + "\\}", apiClient.escapeString(request.getParagraphPath().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "InsertBeforeNode", request.getInsertBeforeNode());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<RunResponse> localVarReturnType = new GenericType<RunResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Reject all revisions in document
     */
    public RevisionsModificationResponse rejectAllRevisions(RejectAllRevisionsRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling rejectAllRevisions");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/revisions/rejectAll"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<RevisionsModificationResponse> localVarReturnType = new GenericType<RevisionsModificationResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Renders drawing object to specified format.
     */
    public File renderDrawingObject(RenderDrawingObjectRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling renderDrawingObject");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(400, "Missing the required parameter 'Format' when calling renderDrawingObject");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling renderDrawingObject");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/drawingObjects/{index}/render"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "FontsLocation", request.getFontsLocation());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<File> localVarReturnType = new GenericType<File>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Renders math object to specified format.
     */
    public File renderMathObject(RenderMathObjectRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling renderMathObject");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(400, "Missing the required parameter 'Format' when calling renderMathObject");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling renderMathObject");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/OfficeMathObjects/{index}/render"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "FontsLocation", request.getFontsLocation());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<File> localVarReturnType = new GenericType<File>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Renders page to specified format.
     */
    public File renderPage(RenderPageRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling renderPage");
        }
        
        // verify the required parameter 'PageIndex' is set
        if (request.getPageIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'PageIndex' when calling renderPage");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(400, "Missing the required parameter 'Format' when calling renderPage");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/pages/{pageIndex}/render"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "pageIndex" + "\\}", apiClient.escapeString(request.getPageIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "FontsLocation", request.getFontsLocation());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<File> localVarReturnType = new GenericType<File>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Renders paragraph to specified format.
     */
    public File renderParagraph(RenderParagraphRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling renderParagraph");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(400, "Missing the required parameter 'Format' when calling renderParagraph");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling renderParagraph");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/paragraphs/{index}/render"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "FontsLocation", request.getFontsLocation());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<File> localVarReturnType = new GenericType<File>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Renders table to specified format.
     */
    public File renderTable(RenderTableRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling renderTable");
        }
        
        // verify the required parameter 'Format' is set
        if (request.getFormat() == null) {
          throw new ApiException(400, "Missing the required parameter 'Format' when calling renderTable");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling renderTable");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/tables/{index}/render"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Format", request.getFormat());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "FontsLocation", request.getFontsLocation());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<File> localVarReturnType = new GenericType<File>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Resets font&#39;s cache.
     */
    public AsposeResponse resetCache(ResetCacheRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/words/fonts/cache";
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<AsposeResponse> localVarReturnType = new GenericType<AsposeResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Search text in document.
     */
    public SearchResponse search(SearchRequest request) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling search");
        }
        
        // verify the required parameter 'Pattern' is set
        if (request.getPattern() == null) {
          throw new ApiException(400, "Missing the required parameter 'Pattern' when calling search");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/search"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Pattern", request.getPattern());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<SearchResponse> localVarReturnType = new GenericType<SearchResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Updates border properties.             
     */
    public BorderResponse updateBorder(UpdateBorderRequest request) throws ApiException {
        Object localVarPostBody = request.getBorderProperties();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling updateBorder");
        }
        
        // verify the required parameter 'BorderProperties' is set
        if (request.getBorderProperties() == null) {
          throw new ApiException(400, "Missing the required parameter 'BorderProperties' when calling updateBorder");
        }
        
        // verify the required parameter 'NodePath' is set
        if (request.getNodePath() == null) {
          throw new ApiException(400, "Missing the required parameter 'NodePath' when calling updateBorder");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling updateBorder");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/borders/{index}"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "nodePath" + "\\}", apiClient.escapeString(request.getNodePath().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<BorderResponse> localVarReturnType = new GenericType<BorderResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Update page setup of section.
     */
    public SectionPageSetupResponse updateSectionPageSetup(UpdateSectionPageSetupRequest request) throws ApiException {
        Object localVarPostBody = request.getPageSetup();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling updateSectionPageSetup");
        }
        
        // verify the required parameter 'SectionIndex' is set
        if (request.getSectionIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'SectionIndex' when calling updateSectionPageSetup");
        }
        
        // verify the required parameter 'PageSetup' is set
        if (request.getPageSetup() == null) {
          throw new ApiException(400, "Missing the required parameter 'PageSetup' when calling updateSectionPageSetup");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/sections/{sectionIndex}/pageSetup"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "sectionIndex" + "\\}", apiClient.escapeString(request.getSectionIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<SectionPageSetupResponse> localVarReturnType = new GenericType<SectionPageSetupResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Updates a table cell format.
     */
    public TableCellFormatResponse updateTableCellFormat(UpdateTableCellFormatRequest request) throws ApiException {
        Object localVarPostBody = request.getFormat();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling updateTableCellFormat");
        }
        
        // verify the required parameter 'TableRowPath' is set
        if (request.getTableRowPath() == null) {
          throw new ApiException(400, "Missing the required parameter 'TableRowPath' when calling updateTableCellFormat");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling updateTableCellFormat");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{tableRowPath}/cells/{index}/cellformat"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "tableRowPath" + "\\}", apiClient.escapeString(request.getTableRowPath().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<TableCellFormatResponse> localVarReturnType = new GenericType<TableCellFormatResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Updates a table properties.
     */
    public TablePropertiesResponse updateTableProperties(UpdateTablePropertiesRequest request) throws ApiException {
        Object localVarPostBody = request.getProperties();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling updateTableProperties");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling updateTableProperties");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{nodePath}/tables/{index}/properties"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "NodePath", request.getNodePath());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<TablePropertiesResponse> localVarReturnType = new GenericType<TablePropertiesResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    /**
     * Updates a table row format.
     */
    public TableRowFormatResponse updateTableRowFormat(UpdateTableRowFormatRequest request) throws ApiException {
        Object localVarPostBody = request.getFormat();
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(400, "Missing the required parameter 'Name' when calling updateTableRowFormat");
        }
        
        // verify the required parameter 'TablePath' is set
        if (request.getTablePath() == null) {
          throw new ApiException(400, "Missing the required parameter 'TablePath' when calling updateTableRowFormat");
        }
        
        // verify the required parameter 'Index' is set
        if (request.getIndex() == null) {
          throw new ApiException(400, "Missing the required parameter 'Index' when calling updateTableRowFormat");
        }
        
        // create path and map variables
        String localVarPath = "/words/{name}/{tablePath}/rows/{index}/rowformat"
          .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
          .replaceAll("\\{" + "tablePath" + "\\}", apiClient.escapeString(request.getTablePath().toString()))
          .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(request.getIndex().toString()));
        
        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Storage", request.getStorage());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "LoadEncoding", request.getLoadEncoding());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "Password", request.getPassword());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "DestFileName", request.getDestFileName());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionAuthor", request.getRevisionAuthor());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "RevisionDateTime", request.getRevisionDateTime());
        
                
                
        final String[] localVarAccepts = {
          "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        
        final String[] localVarContentTypes = {
          "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        
        String[] localVarAuthNames = new String[] {  };
        
        GenericType<TableRowFormatResponse> localVarReturnType = new GenericType<TableRowFormatResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,              localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,   localVarAuthNames, localVarReturnType);
            }
    private String addParameterToQuery(List<Pair> queryParams, String path, String paramName, Object paramValue){
        if (path.contains("{" + paramName + "}")){
            if (paramValue == null || paramValue == ""){
                return path.replace("{" + paramName + "}", "");
            }else {
                return path.replace("{" + paramName + "}", paramValue.toString());
            }
        }

        queryParams.addAll(apiClient.parameterToPair(paramName, paramValue));
        return path;
    }
