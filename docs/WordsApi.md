# WordsApi

All URIs are relative to *https://localhost/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptAllRevisions**](WordsApi.md#acceptAllRevisions) | **POST** /words/{name}/revisions/acceptAll | Accept all revisions in document
[**classify**](WordsApi.md#classify) | **PUT** /words/classify | Classify raw text.
[**classifyDocument**](WordsApi.md#classifyDocument) | **GET** /words/{documentName}/classify | Classify document.
[**createOrUpdateDocumentProperty**](WordsApi.md#createOrUpdateDocumentProperty) | **POST** /words/{name}/documentProperties/{propertyName} | Add new or update existing document property.
[**deleteBorder**](WordsApi.md#deleteBorder) | **DELETE** /words/{name}/{nodePath}/borders/{index} | Resets border properties to default values.             
[**deleteBorders**](WordsApi.md#deleteBorders) | **DELETE** /words/{name}/{nodePath}/borders | Resets borders properties to default values.             
[**deleteComment**](WordsApi.md#deleteComment) | **DELETE** /words/{name}/comments/{commentIndex} | Remove comment from document.
[**deleteDocumentMacros**](WordsApi.md#deleteDocumentMacros) | **DELETE** /words/{name}/macros | Remove macros from document.
[**deleteDocumentProperty**](WordsApi.md#deleteDocumentProperty) | **DELETE** /words/{name}/documentProperties/{propertyName} | Delete document property.
[**deleteDocumentWatermark**](WordsApi.md#deleteDocumentWatermark) | **DELETE** /words/{name}/watermark | Delete watermark (for deleting last watermark from the document).
[**deleteDrawingObject**](WordsApi.md#deleteDrawingObject) | **DELETE** /words/{name}/{nodePath}/drawingObjects/{index} | Removes drawing object from document.
[**deleteField**](WordsApi.md#deleteField) | **DELETE** /words/{name}/{nodePath}/fields/{index} | Delete field from document.
[**deleteFields**](WordsApi.md#deleteFields) | **DELETE** /words/{name}/{nodePath}/fields | Remove fields from section paragraph.
[**deleteFootnote**](WordsApi.md#deleteFootnote) | **DELETE** /words/{name}/{nodePath}/footnotes/{index} | Removes footnote from document.
[**deleteFormField**](WordsApi.md#deleteFormField) | **DELETE** /words/{name}/{nodePath}/formfields/{index} | Removes form field from document.
[**deleteHeaderFooter**](WordsApi.md#deleteHeaderFooter) | **DELETE** /words/{name}/{sectionPath}/headersfooters/{index} | Delete header/footer from document.
[**deleteHeadersFooters**](WordsApi.md#deleteHeadersFooters) | **DELETE** /words/{name}/{sectionPath}/headersfooters | Delete document headers and footers.
[**deleteOfficeMathObject**](WordsApi.md#deleteOfficeMathObject) | **DELETE** /words/{name}/{nodePath}/OfficeMathObjects/{index} | Removes OfficeMath object from document.
[**deleteParagraph**](WordsApi.md#deleteParagraph) | **DELETE** /words/{name}/{nodePath}/paragraphs/{index} | Remove paragraph from section.
[**deleteRun**](WordsApi.md#deleteRun) | **DELETE** /words/{name}/{paragraphPath}/runs/{index} | Removes run from document.
[**deleteTable**](WordsApi.md#deleteTable) | **DELETE** /words/{name}/{nodePath}/tables/{index} | Delete a table.
[**deleteTableCell**](WordsApi.md#deleteTableCell) | **DELETE** /words/{name}/{tableRowPath}/cells/{index} | Delete a table cell.
[**deleteTableRow**](WordsApi.md#deleteTableRow) | **DELETE** /words/{name}/{tablePath}/rows/{index} | Delete a table row.
[**deleteUnprotectDocument**](WordsApi.md#deleteUnprotectDocument) | **DELETE** /words/{name}/protection | Unprotect document.
[**getAvailableFonts**](WordsApi.md#getAvailableFonts) | **GET** /words/fonts/available | Gets the list of fonts, available for document processing
[**getBorder**](WordsApi.md#getBorder) | **GET** /words/{name}/{nodePath}/borders/{index} | Return a border.
[**getBorders**](WordsApi.md#getBorders) | **GET** /words/{name}/{nodePath}/borders | Return a collection of borders.
[**getComment**](WordsApi.md#getComment) | **GET** /words/{name}/comments/{commentIndex} | Get comment from document.
[**getComments**](WordsApi.md#getComments) | **GET** /words/{name}/comments | Get comments from document.
[**getDocument**](WordsApi.md#getDocument) | **GET** /words/{documentName} | Read document common info.
[**getDocumentBookmarkByName**](WordsApi.md#getDocumentBookmarkByName) | **GET** /words/{name}/bookmarks/{bookmarkName} | Read document bookmark data by its name.
[**getDocumentBookmarks**](WordsApi.md#getDocumentBookmarks) | **GET** /words/{name}/bookmarks | Read document bookmarks common info.
[**getDocumentDrawingObjectByIndex**](WordsApi.md#getDocumentDrawingObjectByIndex) | **GET** /words/{name}/{nodePath}/drawingObjects/{index} | Read document drawing object common info by its index or convert to format specified.
[**getDocumentDrawingObjectImageData**](WordsApi.md#getDocumentDrawingObjectImageData) | **GET** /words/{name}/{nodePath}/drawingObjects/{index}/imageData | Read drawing object image data.
[**getDocumentDrawingObjectOleData**](WordsApi.md#getDocumentDrawingObjectOleData) | **GET** /words/{name}/{nodePath}/drawingObjects/{index}/oleData | Get drawing object OLE data.
[**getDocumentDrawingObjects**](WordsApi.md#getDocumentDrawingObjects) | **GET** /words/{name}/{nodePath}/drawingObjects | Read document drawing objects common info.
[**getDocumentFieldNames**](WordsApi.md#getDocumentFieldNames) | **GET** /words/{name}/mailMergeFieldNames | Read document field names.
[**getDocumentHyperlinkByIndex**](WordsApi.md#getDocumentHyperlinkByIndex) | **GET** /words/{name}/hyperlinks/{hyperlinkIndex} | Read document hyperlink by its index.
[**getDocumentHyperlinks**](WordsApi.md#getDocumentHyperlinks) | **GET** /words/{name}/hyperlinks | Read document hyperlinks common info.
[**getDocumentParagraph**](WordsApi.md#getDocumentParagraph) | **GET** /words/{name}/{nodePath}/paragraphs/{index} | This resource represents one of the paragraphs contained in the document.
[**getDocumentParagraphRun**](WordsApi.md#getDocumentParagraphRun) | **GET** /words/{name}/{paragraphPath}/runs/{index} | This resource represents run of text contained in the document.
[**getDocumentParagraphRunFont**](WordsApi.md#getDocumentParagraphRunFont) | **GET** /words/{name}/{paragraphPath}/runs/{index}/font | This resource represents font of run.
[**getDocumentParagraphRuns**](WordsApi.md#getDocumentParagraphRuns) | **GET** /words/{name}/{paragraphPath}/runs | This resource represents collection of runs in the paragraph.
[**getDocumentParagraphs**](WordsApi.md#getDocumentParagraphs) | **GET** /words/{name}/{nodePath}/paragraphs | Return a list of paragraphs that are contained in the document.
[**getDocumentProperties**](WordsApi.md#getDocumentProperties) | **GET** /words/{name}/documentProperties | Read document properties info.
[**getDocumentProperty**](WordsApi.md#getDocumentProperty) | **GET** /words/{name}/documentProperties/{propertyName} | Read document property info by the property name.
[**getDocumentProtection**](WordsApi.md#getDocumentProtection) | **GET** /words/{name}/protection | Read document protection common info.
[**getDocumentStatistics**](WordsApi.md#getDocumentStatistics) | **GET** /words/{name}/statistics | Read document statistics.
[**getDocumentTextItems**](WordsApi.md#getDocumentTextItems) | **GET** /words/{name}/textItems | Read document text items.
[**getDocumentWithFormat**](WordsApi.md#getDocumentWithFormat) | **GET** /words/{name} | Export the document into the specified format.
[**getField**](WordsApi.md#getField) | **GET** /words/{name}/{nodePath}/fields/{index} | Get field from document.
[**getFields**](WordsApi.md#getFields) | **GET** /words/{name}/{nodePath}/fields | Get fields from document.
[**getFootnote**](WordsApi.md#getFootnote) | **GET** /words/{name}/{nodePath}/footnotes/{index} | Read footnote by index.
[**getFootnotes**](WordsApi.md#getFootnotes) | **GET** /words/{name}/{nodePath}/footnotes | Get footnotes from document.
[**getFormField**](WordsApi.md#getFormField) | **GET** /words/{name}/{nodePath}/formfields/{index} | Returns representation of an one of the form field.
[**getFormFields**](WordsApi.md#getFormFields) | **GET** /words/{name}/{nodePath}/formfields | Get form fields from document.
[**getHeaderFooter**](WordsApi.md#getHeaderFooter) | **GET** /words/{name}/headersfooters/{headerFooterIndex} | Return a header/footer that is contained in the document.
[**getHeaderFooterOfSection**](WordsApi.md#getHeaderFooterOfSection) | **GET** /words/{name}/sections/{sectionIndex}/headersfooters/{headerFooterIndex} | Return a header/footer that is contained in the document.
[**getHeaderFooters**](WordsApi.md#getHeaderFooters) | **GET** /words/{name}/{sectionPath}/headersfooters | Return a list of header/footers that are contained in the document.
[**getOfficeMathObject**](WordsApi.md#getOfficeMathObject) | **GET** /words/{name}/{nodePath}/OfficeMathObjects/{index} | Read OfficeMath object by index.
[**getOfficeMathObjects**](WordsApi.md#getOfficeMathObjects) | **GET** /words/{name}/{nodePath}/OfficeMathObjects | Get OfficeMath objects from document.
[**getSection**](WordsApi.md#getSection) | **GET** /words/{name}/sections/{sectionIndex} | Get document section by index.
[**getSectionPageSetup**](WordsApi.md#getSectionPageSetup) | **GET** /words/{name}/sections/{sectionIndex}/pageSetup | Get page setup of section.
[**getSections**](WordsApi.md#getSections) | **GET** /words/{name}/sections | Return a list of sections that are contained in the document.
[**getTable**](WordsApi.md#getTable) | **GET** /words/{name}/{nodePath}/tables/{index} | Return a table.
[**getTableCell**](WordsApi.md#getTableCell) | **GET** /words/{name}/{tableRowPath}/cells/{index} | Return a table cell.
[**getTableCellFormat**](WordsApi.md#getTableCellFormat) | **GET** /words/{name}/{tableRowPath}/cells/{index}/cellformat | Return a table cell format.
[**getTableProperties**](WordsApi.md#getTableProperties) | **GET** /words/{name}/{nodePath}/tables/{index}/properties | Return a table properties.
[**getTableRow**](WordsApi.md#getTableRow) | **GET** /words/{name}/{tablePath}/rows/{index} | Return a table row.
[**getTableRowFormat**](WordsApi.md#getTableRowFormat) | **GET** /words/{name}/{tablePath}/rows/{index}/rowformat | Return a table row format.
[**getTables**](WordsApi.md#getTables) | **GET** /words/{name}/{nodePath}/tables | Return a list of tables that are contained in the document.
[**insertTable**](WordsApi.md#insertTable) | **PUT** /words/{name}/{nodePath}/tables | Adds table to document, returns added table&#39;s data.             
[**insertTableCell**](WordsApi.md#insertTableCell) | **PUT** /words/{name}/{tableRowPath}/cells | Adds table cell to table, returns added cell&#39;s data.             
[**insertTableRow**](WordsApi.md#insertTableRow) | **PUT** /words/{name}/{tablePath}/rows | Adds table row to table, returns added row&#39;s data.             
[**postAppendDocument**](WordsApi.md#postAppendDocument) | **POST** /words/{name}/appendDocument | Append documents to original document.
[**postChangeDocumentProtection**](WordsApi.md#postChangeDocumentProtection) | **POST** /words/{name}/protection | Change document protection.
[**postComment**](WordsApi.md#postComment) | **POST** /words/{name}/comments/{commentIndex} | Updates the comment, returns updated comment&#39;s data.
[**postCompareDocument**](WordsApi.md#postCompareDocument) | **POST** /words/{name}/compareDocument | Compare document with original document.
[**postDocumentExecuteMailMerge**](WordsApi.md#postDocumentExecuteMailMerge) | **POST** /words/{name}/executeMailMerge | Execute document mail merge operation.
[**postDocumentParagraphRunFont**](WordsApi.md#postDocumentParagraphRunFont) | **POST** /words/{name}/{paragraphPath}/runs/{index}/font | Updates font properties, returns updated font data.
[**postDocumentSaveAs**](WordsApi.md#postDocumentSaveAs) | **POST** /words/{name}/saveAs | Convert document to destination format with detailed settings and save result to storage.
[**postDrawingObject**](WordsApi.md#postDrawingObject) | **POST** /words/{name}/{nodePath}/drawingObjects/{index} | Updates drawing object, returns updated  drawing object&#39;s data.
[**postExecuteTemplate**](WordsApi.md#postExecuteTemplate) | **POST** /words/{name}/executeTemplate | Populate document template with data.
[**postField**](WordsApi.md#postField) | **POST** /words/{name}/{nodePath}/fields/{index} | Updates field&#39;s properties, returns updated field&#39;s data.
[**postFootnote**](WordsApi.md#postFootnote) | **POST** /words/{name}/{nodePath}/footnotes/{index} | Updates footnote&#39;s properties, returns updated run&#39;s data.
[**postFormField**](WordsApi.md#postFormField) | **POST** /words/{name}/{nodePath}/formfields/{index} | Updates properties of form field, returns updated form field.
[**postInsertDocumentWatermarkImage**](WordsApi.md#postInsertDocumentWatermarkImage) | **POST** /words/{name}/watermark/insertImage | Insert document watermark image.
[**postInsertDocumentWatermarkText**](WordsApi.md#postInsertDocumentWatermarkText) | **POST** /words/{name}/watermark/insertText | Insert document watermark text.
[**postInsertPageNumbers**](WordsApi.md#postInsertPageNumbers) | **POST** /words/{name}/insertPageNumbers | Insert document page numbers.
[**postLoadWebDocument**](WordsApi.md#postLoadWebDocument) | **POST** /words/loadWebDocument | Loads new document from web into the file with any supported format of data.
[**postReplaceText**](WordsApi.md#postReplaceText) | **POST** /words/{name}/replaceText | Replace document text.
[**postRun**](WordsApi.md#postRun) | **POST** /words/{name}/{paragraphPath}/runs/{index} | Updates run&#39;s properties, returns updated run&#39;s data.
[**postSplitDocument**](WordsApi.md#postSplitDocument) | **POST** /words/{name}/split | Split document.
[**postUpdateDocumentBookmark**](WordsApi.md#postUpdateDocumentBookmark) | **POST** /words/{name}/bookmarks/{bookmarkName} | Update document bookmark.
[**postUpdateDocumentFields**](WordsApi.md#postUpdateDocumentFields) | **POST** /words/{name}/updateFields | Update (reevaluate) fields in document.
[**putComment**](WordsApi.md#putComment) | **PUT** /words/{name}/comments | Adds comment to document, returns inserted comment&#39;s data.
[**putConvertDocument**](WordsApi.md#putConvertDocument) | **PUT** /words/convert | Convert document from request content to format specified.
[**putCreateDocument**](WordsApi.md#putCreateDocument) | **PUT** /words/create | Creates new document. Document is created with format which is recognized from file extensions.  Supported extentions: \&quot;.doc\&quot;, \&quot;.docx\&quot;, \&quot;.docm\&quot;, \&quot;.dot\&quot;, \&quot;.dotm\&quot;, \&quot;.dotx\&quot;, \&quot;.flatopc\&quot;, \&quot;.fopc\&quot;, \&quot;.flatopc_macro\&quot;, \&quot;.fopc_macro\&quot;, \&quot;.flatopc_template\&quot;, \&quot;.fopc_template\&quot;, \&quot;.flatopc_template_macro\&quot;, \&quot;.fopc_template_macro\&quot;, \&quot;.wordml\&quot;, \&quot;.wml\&quot;, \&quot;.rtf\&quot;
[**putDocumentFieldNames**](WordsApi.md#putDocumentFieldNames) | **PUT** /words/mailMergeFieldNames | Read document field names.
[**putDocumentSaveAsTiff**](WordsApi.md#putDocumentSaveAsTiff) | **PUT** /words/{name}/saveAs/tiff | Convert document to tiff with detailed settings and save result to storage.
[**putDrawingObject**](WordsApi.md#putDrawingObject) | **PUT** /words/{name}/{nodePath}/drawingObjects | Adds  drawing object to document, returns added  drawing object&#39;s data.
[**putExecuteMailMergeOnline**](WordsApi.md#putExecuteMailMergeOnline) | **PUT** /words/executeMailMerge | Execute document mail merge online.
[**putExecuteTemplateOnline**](WordsApi.md#putExecuteTemplateOnline) | **PUT** /words/executeTemplate | Populate document template with data online.
[**putField**](WordsApi.md#putField) | **PUT** /words/{name}/{nodePath}/fields | Adds field to document, returns inserted field&#39;s data.
[**putFootnote**](WordsApi.md#putFootnote) | **PUT** /words/{name}/{nodePath}/footnotes | Adds footnote to document, returns added footnote&#39;s data.
[**putFormField**](WordsApi.md#putFormField) | **PUT** /words/{name}/{nodePath}/formfields | Adds form field to paragraph, returns added form field&#39;s data.
[**putHeaderFooter**](WordsApi.md#putHeaderFooter) | **PUT** /words/{name}/{sectionPath}/headersfooters | Insert to document header or footer.
[**putParagraph**](WordsApi.md#putParagraph) | **PUT** /words/{name}/{nodePath}/paragraphs | Adds paragraph to document, returns added paragraph&#39;s data.
[**putProtectDocument**](WordsApi.md#putProtectDocument) | **PUT** /words/{name}/protection | Protect document.
[**putRun**](WordsApi.md#putRun) | **PUT** /words/{name}/{paragraphPath}/runs | Adds run to document, returns added paragraph&#39;s data.
[**rejectAllRevisions**](WordsApi.md#rejectAllRevisions) | **POST** /words/{name}/revisions/rejectAll | Reject all revisions in document
[**renderDrawingObject**](WordsApi.md#renderDrawingObject) | **GET** /words/{name}/{nodePath}/drawingObjects/{index}/render | Renders drawing object to specified format.
[**renderMathObject**](WordsApi.md#renderMathObject) | **GET** /words/{name}/{nodePath}/OfficeMathObjects/{index}/render | Renders math object to specified format.
[**renderPage**](WordsApi.md#renderPage) | **GET** /words/{name}/pages/{pageIndex}/render | Renders page to specified format.
[**renderParagraph**](WordsApi.md#renderParagraph) | **GET** /words/{name}/{nodePath}/paragraphs/{index}/render | Renders paragraph to specified format.
[**renderTable**](WordsApi.md#renderTable) | **GET** /words/{name}/{nodePath}/tables/{index}/render | Renders table to specified format.
[**resetCache**](WordsApi.md#resetCache) | **DELETE** /words/fonts/cache | Resets font&#39;s cache.
[**search**](WordsApi.md#search) | **GET** /words/{name}/search | Search text in document.
[**updateBorder**](WordsApi.md#updateBorder) | **POST** /words/{name}/{nodePath}/borders/{index} | Updates border properties.             
[**updateSectionPageSetup**](WordsApi.md#updateSectionPageSetup) | **POST** /words/{name}/sections/{sectionIndex}/pageSetup | Update page setup of section.
[**updateTableCellFormat**](WordsApi.md#updateTableCellFormat) | **POST** /words/{name}/{tableRowPath}/cells/{index}/cellformat | Updates a table cell format.
[**updateTableProperties**](WordsApi.md#updateTableProperties) | **POST** /words/{name}/{nodePath}/tables/{index}/properties | Updates a table properties.
[**updateTableRowFormat**](WordsApi.md#updateTableRowFormat) | **POST** /words/{name}/{tablePath}/rows/{index}/rowformat | Updates a table row format.


<a name="acceptAllRevisions"></a>
# **acceptAllRevisions**
> RevisionsModificationResponse acceptAllRevisions(name, folder, storage, loadEncoding, password, destFileName)

Accept all revisions in document

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
try {
    RevisionsModificationResponse result = apiInstance.acceptAllRevisions(name, folder, storage, loadEncoding, password, destFileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#acceptAllRevisions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]

### Return type

[**RevisionsModificationResponse**](RevisionsModificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="classify"></a>
# **classify**
> ClassificationResponse classify(text, bestClassesCount)

Classify raw text.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String text = "text_example"; // String | Text to classify.
String bestClassesCount = "1"; // String | Count of the best classes to return.
try {
    ClassificationResponse result = apiInstance.classify(text, bestClassesCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#classify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Text to classify. |
 **bestClassesCount** | **String**| Count of the best classes to return. | [optional] [default to 1]

### Return type

[**ClassificationResponse**](ClassificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="classifyDocument"></a>
# **classifyDocument**
> ClassificationResponse classifyDocument(documentName, folder, storage, loadEncoding, password, bestClassesCount, taxonomy)

Classify document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String documentName = "documentName_example"; // String | The document name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String bestClassesCount = "1"; // String | Count of the best classes to return.
String taxonomy = "default"; // String | Taxonomy to use for classification return.
try {
    ClassificationResponse result = apiInstance.classifyDocument(documentName, folder, storage, loadEncoding, password, bestClassesCount, taxonomy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#classifyDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentName** | **String**| The document name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **bestClassesCount** | **String**| Count of the best classes to return. | [optional] [default to 1]
 **taxonomy** | **String**| Taxonomy to use for classification return. | [optional] [default to default]

### Return type

[**ClassificationResponse**](ClassificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="createOrUpdateDocumentProperty"></a>
# **createOrUpdateDocumentProperty**
> DocumentPropertyResponse createOrUpdateDocumentProperty(name, propertyName, property, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Add new or update existing document property.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String propertyName = "propertyName_example"; // String | The property name.
DocumentProperty property = new DocumentProperty(); // DocumentProperty | The property with new value.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    DocumentPropertyResponse result = apiInstance.createOrUpdateDocumentProperty(name, propertyName, property, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#createOrUpdateDocumentProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **propertyName** | **String**| The property name. |
 **property** | [**DocumentProperty**](DocumentProperty.md)| The property with new value. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**DocumentPropertyResponse**](DocumentPropertyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteBorder"></a>
# **deleteBorder**
> BorderResponse deleteBorder(name, nodePath, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Resets border properties to default values.             

&#39;nodePath&#39; should refer to node with cell or row

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String nodePath = "nodePath_example"; // String | Path to node with border(node should be cell or row).
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    BorderResponse result = apiInstance.deleteBorder(name, nodePath, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteBorder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **nodePath** | **String**| Path to node with border(node should be cell or row). |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**BorderResponse**](BorderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteBorders"></a>
# **deleteBorders**
> BordersResponse deleteBorders(name, nodePath, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Resets borders properties to default values.             

&#39;nodePath&#39; should refer to node with cell or row

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String nodePath = "nodePath_example"; // String | Path to node with borders(node should be cell or row).
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    BordersResponse result = apiInstance.deleteBorders(name, nodePath, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteBorders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **nodePath** | **String**| Path to node with borders(node should be cell or row). |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**BordersResponse**](BordersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteComment"></a>
# **deleteComment**
> AsposeResponse deleteComment(name, commentIndex, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Remove comment from document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
Integer commentIndex = 56; // Integer | Comment index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    AsposeResponse result = apiInstance.deleteComment(name, commentIndex, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **commentIndex** | **Integer**| Comment index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteDocumentMacros"></a>
# **deleteDocumentMacros**
> AsposeResponse deleteDocumentMacros(name, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Remove macros from document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    AsposeResponse result = apiInstance.deleteDocumentMacros(name, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteDocumentMacros");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteDocumentProperty"></a>
# **deleteDocumentProperty**
> AsposeResponse deleteDocumentProperty(name, propertyName, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Delete document property.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String propertyName = "propertyName_example"; // String | The property name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    AsposeResponse result = apiInstance.deleteDocumentProperty(name, propertyName, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteDocumentProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **propertyName** | **String**| The property name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteDocumentWatermark"></a>
# **deleteDocumentWatermark**
> DocumentResponse deleteDocumentWatermark(name, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Delete watermark (for deleting last watermark from the document).

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    DocumentResponse result = apiInstance.deleteDocumentWatermark(name, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteDocumentWatermark");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteDrawingObject"></a>
# **deleteDrawingObject**
> AsposeResponse deleteDrawingObject(name, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath)

Removes drawing object from document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of drawing objects.
try {
    AsposeResponse result = apiInstance.deleteDrawingObject(name, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteDrawingObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of drawing objects. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteField"></a>
# **deleteField**
> AsposeResponse deleteField(name, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath)

Delete field from document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of fields.
try {
    AsposeResponse result = apiInstance.deleteField(name, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of fields. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteFields"></a>
# **deleteFields**
> AsposeResponse deleteFields(name, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath)

Remove fields from section paragraph.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of fields.
try {
    AsposeResponse result = apiInstance.deleteFields(name, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of fields. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteFootnote"></a>
# **deleteFootnote**
> AsposeResponse deleteFootnote(name, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath)

Removes footnote from document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of footnotes.
try {
    AsposeResponse result = apiInstance.deleteFootnote(name, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteFootnote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of footnotes. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteFormField"></a>
# **deleteFormField**
> AsposeResponse deleteFormField(name, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath)

Removes form field from document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String nodePath = "nodePath_example"; // String | Path to node that contains collection of formfields.
try {
    AsposeResponse result = apiInstance.deleteFormField(name, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteFormField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **nodePath** | **String**| Path to node that contains collection of formfields. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteHeaderFooter"></a>
# **deleteHeaderFooter**
> AsposeResponse deleteHeaderFooter(name, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, sectionPath)

Delete header/footer from document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String sectionPath = "sectionPath_example"; // String | Path to parent section.
try {
    AsposeResponse result = apiInstance.deleteHeaderFooter(name, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, sectionPath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteHeaderFooter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **sectionPath** | **String**| Path to parent section. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteHeadersFooters"></a>
# **deleteHeadersFooters**
> AsposeResponse deleteHeadersFooters(name, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, sectionPath, headersFootersTypes)

Delete document headers and footers.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String sectionPath = "sectionPath_example"; // String | Path to parent section.
String headersFootersTypes = "headersFootersTypes_example"; // String | List of types of headers and footers.
try {
    AsposeResponse result = apiInstance.deleteHeadersFooters(name, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, sectionPath, headersFootersTypes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteHeadersFooters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **sectionPath** | **String**| Path to parent section. | [optional]
 **headersFootersTypes** | **String**| List of types of headers and footers. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteOfficeMathObject"></a>
# **deleteOfficeMathObject**
> AsposeResponse deleteOfficeMathObject(name, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath)

Removes OfficeMath object from document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of OfficeMath objects.
try {
    AsposeResponse result = apiInstance.deleteOfficeMathObject(name, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteOfficeMathObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of OfficeMath objects. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteParagraph"></a>
# **deleteParagraph**
> AsposeResponse deleteParagraph(name, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath)

Remove paragraph from section.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String nodePath = "nodePath_example"; // String | Path to node which contains paragraphs.
try {
    AsposeResponse result = apiInstance.deleteParagraph(name, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteParagraph");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **nodePath** | **String**| Path to node which contains paragraphs. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteRun"></a>
# **deleteRun**
> AsposeResponse deleteRun(name, paragraphPath, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Removes run from document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
String paragraphPath = "paragraphPath_example"; // String | Path to parent paragraph.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    AsposeResponse result = apiInstance.deleteRun(name, paragraphPath, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **paragraphPath** | **String**| Path to parent paragraph. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteTable"></a>
# **deleteTable**
> AsposeResponse deleteTable(name, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath)

Delete a table.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String nodePath = "nodePath_example"; // String | Path to node, which contains tables.
try {
    AsposeResponse result = apiInstance.deleteTable(name, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **nodePath** | **String**| Path to node, which contains tables. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteTableCell"></a>
# **deleteTableCell**
> AsposeResponse deleteTableCell(name, tableRowPath, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Delete a table cell.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String tableRowPath = "tableRowPath_example"; // String | Path to table row.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    AsposeResponse result = apiInstance.deleteTableCell(name, tableRowPath, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteTableCell");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **tableRowPath** | **String**| Path to table row. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteTableRow"></a>
# **deleteTableRow**
> AsposeResponse deleteTableRow(name, tablePath, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Delete a table row.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String tablePath = "tablePath_example"; // String | Path to table.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    AsposeResponse result = apiInstance.deleteTableRow(name, tablePath, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteTableRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **tablePath** | **String**| Path to table. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteUnprotectDocument"></a>
# **deleteUnprotectDocument**
> ProtectionDataResponse deleteUnprotectDocument(name, protectionRequest, folder, storage, loadEncoding, password, destFileName)

Unprotect document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
ProtectionRequest protectionRequest = new ProtectionRequest(); // ProtectionRequest | with protection settings.            
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
try {
    ProtectionDataResponse result = apiInstance.deleteUnprotectDocument(name, protectionRequest, folder, storage, loadEncoding, password, destFileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#deleteUnprotectDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **protectionRequest** | [**ProtectionRequest**](ProtectionRequest.md)| with protection settings.             |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]

### Return type

[**ProtectionDataResponse**](ProtectionDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getAvailableFonts"></a>
# **getAvailableFonts**
> AvailableFontsResponse getAvailableFonts(fontsLocation)

Gets the list of fonts, available for document processing

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String fontsLocation = "fontsLocation_example"; // String | Folder in filestorage with custom fonts.
try {
    AvailableFontsResponse result = apiInstance.getAvailableFonts(fontsLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getAvailableFonts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fontsLocation** | **String**| Folder in filestorage with custom fonts. | [optional]

### Return type

[**AvailableFontsResponse**](AvailableFontsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getBorder"></a>
# **getBorder**
> BorderResponse getBorder(name, nodePath, index, folder, storage, loadEncoding, password)

Return a border.

&#39;nodePath&#39; should refer to node with cell or row

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String nodePath = "nodePath_example"; // String | Path to node with border(node should be cell or row).
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    BorderResponse result = apiInstance.getBorder(name, nodePath, index, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getBorder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **nodePath** | **String**| Path to node with border(node should be cell or row). |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**BorderResponse**](BorderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getBorders"></a>
# **getBorders**
> BordersResponse getBorders(name, nodePath, folder, storage, loadEncoding, password)

Return a collection of borders.

&#39;nodePath&#39; should refer to node with cell or row

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String nodePath = "nodePath_example"; // String | Path to node with borders(node should be cell or row).
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    BordersResponse result = apiInstance.getBorders(name, nodePath, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getBorders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **nodePath** | **String**| Path to node with borders(node should be cell or row). |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**BordersResponse**](BordersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getComment"></a>
# **getComment**
> CommentResponse getComment(name, commentIndex, folder, storage, loadEncoding, password)

Get comment from document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
Integer commentIndex = 56; // Integer | Comment index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    CommentResponse result = apiInstance.getComment(name, commentIndex, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **commentIndex** | **Integer**| Comment index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**CommentResponse**](CommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getComments"></a>
# **getComments**
> CommentsResponse getComments(name, folder, storage, loadEncoding, password)

Get comments from document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    CommentsResponse result = apiInstance.getComments(name, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**CommentsResponse**](CommentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocument"></a>
# **getDocument**
> DocumentResponse getDocument(documentName, folder, storage, loadEncoding, password)

Read document common info.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String documentName = "documentName_example"; // String | The file name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    DocumentResponse result = apiInstance.getDocument(documentName, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentName** | **String**| The file name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentBookmarkByName"></a>
# **getDocumentBookmarkByName**
> BookmarkResponse getDocumentBookmarkByName(name, bookmarkName, folder, storage, loadEncoding, password)

Read document bookmark data by its name.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String bookmarkName = "bookmarkName_example"; // String | The bookmark name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    BookmarkResponse result = apiInstance.getDocumentBookmarkByName(name, bookmarkName, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentBookmarkByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **bookmarkName** | **String**| The bookmark name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**BookmarkResponse**](BookmarkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentBookmarks"></a>
# **getDocumentBookmarks**
> BookmarksResponse getDocumentBookmarks(name, folder, storage, loadEncoding, password)

Read document bookmarks common info.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    BookmarksResponse result = apiInstance.getDocumentBookmarks(name, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentBookmarks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**BookmarksResponse**](BookmarksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentDrawingObjectByIndex"></a>
# **getDocumentDrawingObjectByIndex**
> DrawingObjectResponse getDocumentDrawingObjectByIndex(name, index, folder, storage, loadEncoding, password, nodePath)

Read document drawing object common info by its index or convert to format specified.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of drawing objects.
try {
    DrawingObjectResponse result = apiInstance.getDocumentDrawingObjectByIndex(name, index, folder, storage, loadEncoding, password, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentDrawingObjectByIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of drawing objects. | [optional]

### Return type

[**DrawingObjectResponse**](DrawingObjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentDrawingObjectImageData"></a>
# **getDocumentDrawingObjectImageData**
> File getDocumentDrawingObjectImageData(name, index, folder, storage, loadEncoding, password, nodePath)

Read drawing object image data.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of drawing objects.
try {
    File result = apiInstance.getDocumentDrawingObjectImageData(name, index, folder, storage, loadEncoding, password, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentDrawingObjectImageData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of drawing objects. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentDrawingObjectOleData"></a>
# **getDocumentDrawingObjectOleData**
> File getDocumentDrawingObjectOleData(name, index, folder, storage, loadEncoding, password, nodePath)

Get drawing object OLE data.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of drawing objects.
try {
    File result = apiInstance.getDocumentDrawingObjectOleData(name, index, folder, storage, loadEncoding, password, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentDrawingObjectOleData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of drawing objects. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentDrawingObjects"></a>
# **getDocumentDrawingObjects**
> DrawingObjectsResponse getDocumentDrawingObjects(name, folder, storage, loadEncoding, password, nodePath)

Read document drawing objects common info.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of drawing objects.
try {
    DrawingObjectsResponse result = apiInstance.getDocumentDrawingObjects(name, folder, storage, loadEncoding, password, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentDrawingObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of drawing objects. | [optional]

### Return type

[**DrawingObjectsResponse**](DrawingObjectsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentFieldNames"></a>
# **getDocumentFieldNames**
> FieldNamesResponse getDocumentFieldNames(name, folder, storage, loadEncoding, password, useNonMergeFields)

Read document field names.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
Boolean useNonMergeFields = false; // Boolean | If true, result includes \"mustache\" field names.
try {
    FieldNamesResponse result = apiInstance.getDocumentFieldNames(name, folder, storage, loadEncoding, password, useNonMergeFields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentFieldNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **useNonMergeFields** | **Boolean**| If true, result includes \&quot;mustache\&quot; field names. | [optional] [default to false]

### Return type

[**FieldNamesResponse**](FieldNamesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentHyperlinkByIndex"></a>
# **getDocumentHyperlinkByIndex**
> HyperlinkResponse getDocumentHyperlinkByIndex(name, hyperlinkIndex, folder, storage, loadEncoding, password)

Read document hyperlink by its index.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer hyperlinkIndex = 56; // Integer | The hyperlink index.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    HyperlinkResponse result = apiInstance.getDocumentHyperlinkByIndex(name, hyperlinkIndex, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentHyperlinkByIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **hyperlinkIndex** | **Integer**| The hyperlink index. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**HyperlinkResponse**](HyperlinkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentHyperlinks"></a>
# **getDocumentHyperlinks**
> HyperlinksResponse getDocumentHyperlinks(name, folder, storage, loadEncoding, password)

Read document hyperlinks common info.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    HyperlinksResponse result = apiInstance.getDocumentHyperlinks(name, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentHyperlinks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**HyperlinksResponse**](HyperlinksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentParagraph"></a>
# **getDocumentParagraph**
> ParagraphResponse getDocumentParagraph(name, index, folder, storage, loadEncoding, password, nodePath)

This resource represents one of the paragraphs contained in the document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node which contains paragraphs.
try {
    ParagraphResponse result = apiInstance.getDocumentParagraph(name, index, folder, storage, loadEncoding, password, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentParagraph");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node which contains paragraphs. | [optional]

### Return type

[**ParagraphResponse**](ParagraphResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentParagraphRun"></a>
# **getDocumentParagraphRun**
> RunResponse getDocumentParagraphRun(name, paragraphPath, index, folder, storage, loadEncoding, password)

This resource represents run of text contained in the document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String paragraphPath = "paragraphPath_example"; // String | Path to parent paragraph.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    RunResponse result = apiInstance.getDocumentParagraphRun(name, paragraphPath, index, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentParagraphRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **paragraphPath** | **String**| Path to parent paragraph. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**RunResponse**](RunResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentParagraphRunFont"></a>
# **getDocumentParagraphRunFont**
> FontResponse getDocumentParagraphRunFont(name, paragraphPath, index, folder, storage, loadEncoding, password)

This resource represents font of run.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String paragraphPath = "paragraphPath_example"; // String | Path to parent paragraph.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    FontResponse result = apiInstance.getDocumentParagraphRunFont(name, paragraphPath, index, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentParagraphRunFont");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **paragraphPath** | **String**| Path to parent paragraph. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**FontResponse**](FontResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentParagraphRuns"></a>
# **getDocumentParagraphRuns**
> RunsResponse getDocumentParagraphRuns(name, paragraphPath, folder, storage, loadEncoding, password)

This resource represents collection of runs in the paragraph.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String paragraphPath = "paragraphPath_example"; // String | Path to parent paragraph.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    RunsResponse result = apiInstance.getDocumentParagraphRuns(name, paragraphPath, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentParagraphRuns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **paragraphPath** | **String**| Path to parent paragraph. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**RunsResponse**](RunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentParagraphs"></a>
# **getDocumentParagraphs**
> ParagraphLinkCollectionResponse getDocumentParagraphs(name, folder, storage, loadEncoding, password, nodePath)

Return a list of paragraphs that are contained in the document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node which contains paragraphs.
try {
    ParagraphLinkCollectionResponse result = apiInstance.getDocumentParagraphs(name, folder, storage, loadEncoding, password, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentParagraphs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node which contains paragraphs. | [optional]

### Return type

[**ParagraphLinkCollectionResponse**](ParagraphLinkCollectionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentProperties"></a>
# **getDocumentProperties**
> DocumentPropertiesResponse getDocumentProperties(name, folder, storage, loadEncoding, password)

Read document properties info.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document's name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    DocumentPropertiesResponse result = apiInstance.getDocumentProperties(name, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document&#39;s name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**DocumentPropertiesResponse**](DocumentPropertiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentProperty"></a>
# **getDocumentProperty**
> DocumentPropertyResponse getDocumentProperty(name, propertyName, folder, storage, loadEncoding, password)

Read document property info by the property name.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String propertyName = "propertyName_example"; // String | The property name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    DocumentPropertyResponse result = apiInstance.getDocumentProperty(name, propertyName, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **propertyName** | **String**| The property name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**DocumentPropertyResponse**](DocumentPropertyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentProtection"></a>
# **getDocumentProtection**
> ProtectionDataResponse getDocumentProtection(name, folder, storage, loadEncoding, password)

Read document protection common info.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    ProtectionDataResponse result = apiInstance.getDocumentProtection(name, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**ProtectionDataResponse**](ProtectionDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentStatistics"></a>
# **getDocumentStatistics**
> StatDataResponse getDocumentStatistics(name, folder, storage, loadEncoding, password, includeComments, includeFootnotes, includeTextInShapes)

Read document statistics.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
Boolean includeComments = false; // Boolean | Support including/excluding comments from the WordCount. Default value is \"true\".
Boolean includeFootnotes = false; // Boolean | Support including/excluding footnotes from the WordCount. Default value is \"false\".
Boolean includeTextInShapes = false; // Boolean | Support including/excluding shape's text from the WordCount. Default value is \"false\"
try {
    StatDataResponse result = apiInstance.getDocumentStatistics(name, folder, storage, loadEncoding, password, includeComments, includeFootnotes, includeTextInShapes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **includeComments** | **Boolean**| Support including/excluding comments from the WordCount. Default value is \&quot;true\&quot;. | [optional] [default to false]
 **includeFootnotes** | **Boolean**| Support including/excluding footnotes from the WordCount. Default value is \&quot;false\&quot;. | [optional] [default to false]
 **includeTextInShapes** | **Boolean**| Support including/excluding shape&#39;s text from the WordCount. Default value is \&quot;false\&quot; | [optional] [default to false]

### Return type

[**StatDataResponse**](StatDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentTextItems"></a>
# **getDocumentTextItems**
> TextItemsResponse getDocumentTextItems(name, folder, storage, loadEncoding, password)

Read document text items.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    TextItemsResponse result = apiInstance.getDocumentTextItems(name, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentTextItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**TextItemsResponse**](TextItemsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocumentWithFormat"></a>
# **getDocumentWithFormat**
> File getDocumentWithFormat(name, format, folder, storage, loadEncoding, password, outPath, fontsLocation)

Export the document into the specified format.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
String format = "format_example"; // String | The destination format.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String outPath = "outPath_example"; // String | Path to save result
String fontsLocation = "fontsLocation_example"; // String | Folder in filestorage with custom fonts.
try {
    File result = apiInstance.getDocumentWithFormat(name, format, folder, storage, loadEncoding, password, outPath, fontsLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getDocumentWithFormat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **format** | **String**| The destination format. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **outPath** | **String**| Path to save result | [optional]
 **fontsLocation** | **String**| Folder in filestorage with custom fonts. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getField"></a>
# **getField**
> FieldResponse getField(name, index, folder, storage, loadEncoding, password, nodePath)

Get field from document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of fields.
try {
    FieldResponse result = apiInstance.getField(name, index, folder, storage, loadEncoding, password, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of fields. | [optional]

### Return type

[**FieldResponse**](FieldResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getFields"></a>
# **getFields**
> FieldsResponse getFields(name, folder, storage, loadEncoding, password, nodePath)

Get fields from document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of fields.
try {
    FieldsResponse result = apiInstance.getFields(name, folder, storage, loadEncoding, password, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of fields. | [optional]

### Return type

[**FieldsResponse**](FieldsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getFootnote"></a>
# **getFootnote**
> FootnoteResponse getFootnote(name, index, folder, storage, loadEncoding, password, nodePath)

Read footnote by index.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of footnotes.
try {
    FootnoteResponse result = apiInstance.getFootnote(name, index, folder, storage, loadEncoding, password, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getFootnote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of footnotes. | [optional]

### Return type

[**FootnoteResponse**](FootnoteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getFootnotes"></a>
# **getFootnotes**
> FootnotesResponse getFootnotes(name, folder, storage, loadEncoding, password, nodePath)

Get footnotes from document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of footnotes.
try {
    FootnotesResponse result = apiInstance.getFootnotes(name, folder, storage, loadEncoding, password, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getFootnotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of footnotes. | [optional]

### Return type

[**FootnotesResponse**](FootnotesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getFormField"></a>
# **getFormField**
> FormFieldResponse getFormField(name, index, folder, storage, loadEncoding, password, nodePath)

Returns representation of an one of the form field.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node that contains collection of formfields.
try {
    FormFieldResponse result = apiInstance.getFormField(name, index, folder, storage, loadEncoding, password, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getFormField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node that contains collection of formfields. | [optional]

### Return type

[**FormFieldResponse**](FormFieldResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getFormFields"></a>
# **getFormFields**
> FormFieldsResponse getFormFields(name, folder, storage, loadEncoding, password, nodePath)

Get form fields from document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node containing collection of form fields.
try {
    FormFieldsResponse result = apiInstance.getFormFields(name, folder, storage, loadEncoding, password, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getFormFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node containing collection of form fields. | [optional]

### Return type

[**FormFieldsResponse**](FormFieldsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getHeaderFooter"></a>
# **getHeaderFooter**
> HeaderFooterResponse getHeaderFooter(name, headerFooterIndex, folder, storage, loadEncoding, password, filterByType)

Return a header/footer that is contained in the document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer headerFooterIndex = 56; // Integer | Header/footer index.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String filterByType = "filterByType_example"; // String | List of types of headers and footers.
try {
    HeaderFooterResponse result = apiInstance.getHeaderFooter(name, headerFooterIndex, folder, storage, loadEncoding, password, filterByType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getHeaderFooter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **headerFooterIndex** | **Integer**| Header/footer index. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **filterByType** | **String**| List of types of headers and footers. | [optional]

### Return type

[**HeaderFooterResponse**](HeaderFooterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getHeaderFooterOfSection"></a>
# **getHeaderFooterOfSection**
> HeaderFooterResponse getHeaderFooterOfSection(name, headerFooterIndex, sectionIndex, folder, storage, loadEncoding, password, filterByType)

Return a header/footer that is contained in the document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer headerFooterIndex = 56; // Integer | Header/footer index.
Integer sectionIndex = 56; // Integer | Section index.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String filterByType = "filterByType_example"; // String | List of types of headers and footers.
try {
    HeaderFooterResponse result = apiInstance.getHeaderFooterOfSection(name, headerFooterIndex, sectionIndex, folder, storage, loadEncoding, password, filterByType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getHeaderFooterOfSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **headerFooterIndex** | **Integer**| Header/footer index. |
 **sectionIndex** | **Integer**| Section index. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **filterByType** | **String**| List of types of headers and footers. | [optional]

### Return type

[**HeaderFooterResponse**](HeaderFooterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getHeaderFooters"></a>
# **getHeaderFooters**
> HeaderFootersResponse getHeaderFooters(name, folder, storage, loadEncoding, password, sectionPath, filterByType)

Return a list of header/footers that are contained in the document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String sectionPath = "sectionPath_example"; // String | Path to parent section.
String filterByType = "filterByType_example"; // String | List of types of headers and footers.
try {
    HeaderFootersResponse result = apiInstance.getHeaderFooters(name, folder, storage, loadEncoding, password, sectionPath, filterByType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getHeaderFooters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **sectionPath** | **String**| Path to parent section. | [optional]
 **filterByType** | **String**| List of types of headers and footers. | [optional]

### Return type

[**HeaderFootersResponse**](HeaderFootersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getOfficeMathObject"></a>
# **getOfficeMathObject**
> OfficeMathObjectResponse getOfficeMathObject(name, index, folder, storage, loadEncoding, password, nodePath)

Read OfficeMath object by index.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of OfficeMath objects.
try {
    OfficeMathObjectResponse result = apiInstance.getOfficeMathObject(name, index, folder, storage, loadEncoding, password, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getOfficeMathObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of OfficeMath objects. | [optional]

### Return type

[**OfficeMathObjectResponse**](OfficeMathObjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getOfficeMathObjects"></a>
# **getOfficeMathObjects**
> OfficeMathObjectsResponse getOfficeMathObjects(name, folder, storage, loadEncoding, password, nodePath)

Get OfficeMath objects from document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of OfficeMath objects.
try {
    OfficeMathObjectsResponse result = apiInstance.getOfficeMathObjects(name, folder, storage, loadEncoding, password, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getOfficeMathObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of OfficeMath objects. | [optional]

### Return type

[**OfficeMathObjectsResponse**](OfficeMathObjectsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getSection"></a>
# **getSection**
> SectionResponse getSection(name, sectionIndex, folder, storage, loadEncoding, password)

Get document section by index.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer sectionIndex = 56; // Integer | Section index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    SectionResponse result = apiInstance.getSection(name, sectionIndex, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **sectionIndex** | **Integer**| Section index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**SectionResponse**](SectionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getSectionPageSetup"></a>
# **getSectionPageSetup**
> SectionPageSetupResponse getSectionPageSetup(name, sectionIndex, folder, storage, loadEncoding, password)

Get page setup of section.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer sectionIndex = 56; // Integer | Section index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    SectionPageSetupResponse result = apiInstance.getSectionPageSetup(name, sectionIndex, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getSectionPageSetup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **sectionIndex** | **Integer**| Section index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**SectionPageSetupResponse**](SectionPageSetupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getSections"></a>
# **getSections**
> SectionLinkCollectionResponse getSections(name, folder, storage, loadEncoding, password)

Return a list of sections that are contained in the document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    SectionLinkCollectionResponse result = apiInstance.getSections(name, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getSections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**SectionLinkCollectionResponse**](SectionLinkCollectionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getTable"></a>
# **getTable**
> TableResponse getTable(name, index, folder, storage, loadEncoding, password, nodePath)

Return a table.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node, which contains tables.
try {
    TableResponse result = apiInstance.getTable(name, index, folder, storage, loadEncoding, password, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node, which contains tables. | [optional]

### Return type

[**TableResponse**](TableResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getTableCell"></a>
# **getTableCell**
> TableCellResponse getTableCell(name, tableRowPath, index, folder, storage, loadEncoding, password)

Return a table cell.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String tableRowPath = "tableRowPath_example"; // String | Path to table row.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    TableCellResponse result = apiInstance.getTableCell(name, tableRowPath, index, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getTableCell");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **tableRowPath** | **String**| Path to table row. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**TableCellResponse**](TableCellResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getTableCellFormat"></a>
# **getTableCellFormat**
> TableCellFormatResponse getTableCellFormat(name, tableRowPath, index, folder, storage, loadEncoding, password)

Return a table cell format.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String tableRowPath = "tableRowPath_example"; // String | Path to table row.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    TableCellFormatResponse result = apiInstance.getTableCellFormat(name, tableRowPath, index, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getTableCellFormat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **tableRowPath** | **String**| Path to table row. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**TableCellFormatResponse**](TableCellFormatResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getTableProperties"></a>
# **getTableProperties**
> TablePropertiesResponse getTableProperties(name, index, folder, storage, loadEncoding, password, nodePath)

Return a table properties.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node, which contains tables.
try {
    TablePropertiesResponse result = apiInstance.getTableProperties(name, index, folder, storage, loadEncoding, password, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getTableProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node, which contains tables. | [optional]

### Return type

[**TablePropertiesResponse**](TablePropertiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getTableRow"></a>
# **getTableRow**
> TableRowResponse getTableRow(name, tablePath, index, folder, storage, loadEncoding, password)

Return a table row.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String tablePath = "tablePath_example"; // String | Path to table.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    TableRowResponse result = apiInstance.getTableRow(name, tablePath, index, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getTableRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **tablePath** | **String**| Path to table. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**TableRowResponse**](TableRowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getTableRowFormat"></a>
# **getTableRowFormat**
> TableRowFormatResponse getTableRowFormat(name, tablePath, index, folder, storage, loadEncoding, password)

Return a table row format.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String tablePath = "tablePath_example"; // String | Path to table.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    TableRowFormatResponse result = apiInstance.getTableRowFormat(name, tablePath, index, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getTableRowFormat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **tablePath** | **String**| Path to table. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**TableRowFormatResponse**](TableRowFormatResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getTables"></a>
# **getTables**
> TableLinkCollectionResponse getTables(name, folder, storage, loadEncoding, password, nodePath)

Return a list of tables that are contained in the document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node, which contains tables.
try {
    TableLinkCollectionResponse result = apiInstance.getTables(name, folder, storage, loadEncoding, password, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#getTables");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node, which contains tables. | [optional]

### Return type

[**TableLinkCollectionResponse**](TableLinkCollectionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="insertTable"></a>
# **insertTable**
> TableResponse insertTable(name, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, table, nodePath)

Adds table to document, returns added table&#39;s data.             

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
TableInsert table = new TableInsert(); // TableInsert | Table parameters/
String nodePath = "nodePath_example"; // String | Path to node, which contains tables.
try {
    TableResponse result = apiInstance.insertTable(name, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, table, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#insertTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **table** | [**TableInsert**](TableInsert.md)| Table parameters/ | [optional]
 **nodePath** | **String**| Path to node, which contains tables. | [optional]

### Return type

[**TableResponse**](TableResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="insertTableCell"></a>
# **insertTableCell**
> TableCellResponse insertTableCell(name, tableRowPath, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, cell)

Adds table cell to table, returns added cell&#39;s data.             

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String tableRowPath = "tableRowPath_example"; // String | Path to table row.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
TableCellInsert cell = new TableCellInsert(); // TableCellInsert | Table cell parameters/
try {
    TableCellResponse result = apiInstance.insertTableCell(name, tableRowPath, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, cell);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#insertTableCell");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **tableRowPath** | **String**| Path to table row. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **cell** | [**TableCellInsert**](TableCellInsert.md)| Table cell parameters/ | [optional]

### Return type

[**TableCellResponse**](TableCellResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="insertTableRow"></a>
# **insertTableRow**
> TableRowResponse insertTableRow(name, tablePath, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, row)

Adds table row to table, returns added row&#39;s data.             

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String tablePath = "tablePath_example"; // String | Path to table.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
TableRowInsert row = new TableRowInsert(); // TableRowInsert | Table row parameters/
try {
    TableRowResponse result = apiInstance.insertTableRow(name, tablePath, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, row);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#insertTableRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **tablePath** | **String**| Path to table. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **row** | [**TableRowInsert**](TableRowInsert.md)| Table row parameters/ | [optional]

### Return type

[**TableRowResponse**](TableRowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="postAppendDocument"></a>
# **postAppendDocument**
> DocumentResponse postAppendDocument(name, documentList, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Append documents to original document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | Original document name.
DocumentEntryList documentList = new DocumentEntryList(); // DocumentEntryList | with a list of documents to append.            
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    DocumentResponse result = apiInstance.postAppendDocument(name, documentList, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postAppendDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Original document name. |
 **documentList** | [**DocumentEntryList**](DocumentEntryList.md)| with a list of documents to append.             |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="postChangeDocumentProtection"></a>
# **postChangeDocumentProtection**
> ProtectionDataResponse postChangeDocumentProtection(name, protectionRequest, folder, storage, loadEncoding, password, destFileName)

Change document protection.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
ProtectionRequest protectionRequest = new ProtectionRequest(); // ProtectionRequest | with protection settings.            
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
try {
    ProtectionDataResponse result = apiInstance.postChangeDocumentProtection(name, protectionRequest, folder, storage, loadEncoding, password, destFileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postChangeDocumentProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **protectionRequest** | [**ProtectionRequest**](ProtectionRequest.md)| with protection settings.             |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]

### Return type

[**ProtectionDataResponse**](ProtectionDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="postComment"></a>
# **postComment**
> CommentResponse postComment(name, commentIndex, comment, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Updates the comment, returns updated comment&#39;s data.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer commentIndex = 56; // Integer | Comment index
Comment comment = new Comment(); // Comment | Comment data.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    CommentResponse result = apiInstance.postComment(name, commentIndex, comment, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **commentIndex** | **Integer**| Comment index |
 **comment** | [**Comment**](Comment.md)| Comment data. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**CommentResponse**](CommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="postCompareDocument"></a>
# **postCompareDocument**
> DocumentResponse postCompareDocument(name, compareData, folder, storage, loadEncoding, password, destFileName)

Compare document with original document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | Original document name.
CompareData compareData = new CompareData(); // CompareData | with a document to compare.            
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
try {
    DocumentResponse result = apiInstance.postCompareDocument(name, compareData, folder, storage, loadEncoding, password, destFileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postCompareDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Original document name. |
 **compareData** | [**CompareData**](CompareData.md)| with a document to compare.             |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="postDocumentExecuteMailMerge"></a>
# **postDocumentExecuteMailMerge**
> DocumentResponse postDocumentExecuteMailMerge(name, data, folder, storage, loadEncoding, password, withRegions, mailMergeDataFile, cleanup, useWholeParagraphAsRegion, destFileName)

Execute document mail merge operation.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String data = "data_example"; // String | Mail merge data
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
Boolean withRegions = false; // Boolean | With regions flag.
String mailMergeDataFile = "mailMergeDataFile_example"; // String | Mail merge data.
String cleanup = "cleanup_example"; // String | Clean up options.
Boolean useWholeParagraphAsRegion = true; // Boolean | Gets or sets a value indicating whether paragraph with TableStart or              TableEnd field should be fully included into mail merge region or particular range between TableStart and TableEnd fields.              The default value is true.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved with autogenerated name.
try {
    DocumentResponse result = apiInstance.postDocumentExecuteMailMerge(name, data, folder, storage, loadEncoding, password, withRegions, mailMergeDataFile, cleanup, useWholeParagraphAsRegion, destFileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postDocumentExecuteMailMerge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **data** | **String**| Mail merge data | [optional]
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **withRegions** | **Boolean**| With regions flag. | [optional] [default to false]
 **mailMergeDataFile** | **String**| Mail merge data. | [optional]
 **cleanup** | **String**| Clean up options. | [optional]
 **useWholeParagraphAsRegion** | **Boolean**| Gets or sets a value indicating whether paragraph with TableStart or              TableEnd field should be fully included into mail merge region or particular range between TableStart and TableEnd fields.              The default value is true. | [optional] [default to true]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved with autogenerated name. | [optional]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/xml, application/json

<a name="postDocumentParagraphRunFont"></a>
# **postDocumentParagraphRunFont**
> FontResponse postDocumentParagraphRunFont(name, fontDto, paragraphPath, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Updates font properties, returns updated font data.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Font fontDto = new Font(); // Font | Font dto object
String paragraphPath = "paragraphPath_example"; // String | Path to parent paragraph.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    FontResponse result = apiInstance.postDocumentParagraphRunFont(name, fontDto, paragraphPath, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postDocumentParagraphRunFont");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fontDto** | [**Font**](Font.md)| Font dto object |
 **paragraphPath** | **String**| Path to parent paragraph. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**FontResponse**](FontResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="postDocumentSaveAs"></a>
# **postDocumentSaveAs**
> SaveResponse postDocumentSaveAs(name, saveOptionsData, folder, storage, loadEncoding, password, destFileName, fontsLocation)

Convert document to destination format with detailed settings and save result to storage.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
SaveOptionsData saveOptionsData = new SaveOptionsData(); // SaveOptionsData | Save options.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String fontsLocation = "fontsLocation_example"; // String | Folder in filestorage with custom fonts.
try {
    SaveResponse result = apiInstance.postDocumentSaveAs(name, saveOptionsData, folder, storage, loadEncoding, password, destFileName, fontsLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postDocumentSaveAs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **saveOptionsData** | [**SaveOptionsData**](SaveOptionsData.md)| Save options. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **fontsLocation** | **String**| Folder in filestorage with custom fonts. | [optional]

### Return type

[**SaveResponse**](SaveResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="postDrawingObject"></a>
# **postDrawingObject**
> DrawingObjectResponse postDrawingObject(name, drawingObject, imageFile, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath)

Updates drawing object, returns updated  drawing object&#39;s data.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String drawingObject = "drawingObject_example"; // String | Drawing object parameters
File imageFile = new File("/path/to/file.txt"); // File | File with image
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of drawing objects.
try {
    DrawingObjectResponse result = apiInstance.postDrawingObject(name, drawingObject, imageFile, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postDrawingObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **drawingObject** | **String**| Drawing object parameters |
 **imageFile** | **File**| File with image |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of drawing objects. | [optional]

### Return type

[**DrawingObjectResponse**](DrawingObjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/xml, application/json

<a name="postExecuteTemplate"></a>
# **postExecuteTemplate**
> DocumentResponse postExecuteTemplate(name, data, folder, storage, loadEncoding, password, cleanup, useWholeParagraphAsRegion, withRegions, destFileName)

Populate document template with data.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The template document name.
String data = "data_example"; // String | Mail merge data
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String cleanup = "cleanup_example"; // String | Clean up options.
Boolean useWholeParagraphAsRegion = true; // Boolean | Gets or sets a value indicating whether paragraph with TableStart or  TableEnd field should be fully included into mail merge region or particular range between TableStart and TableEnd fields.   The default value is true.
Boolean withRegions = true; // Boolean | Merge with regions or not. True by default
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved with autogenerated name.
try {
    DocumentResponse result = apiInstance.postExecuteTemplate(name, data, folder, storage, loadEncoding, password, cleanup, useWholeParagraphAsRegion, withRegions, destFileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postExecuteTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The template document name. |
 **data** | **String**| Mail merge data |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **cleanup** | **String**| Clean up options. | [optional]
 **useWholeParagraphAsRegion** | **Boolean**| Gets or sets a value indicating whether paragraph with TableStart or  TableEnd field should be fully included into mail merge region or particular range between TableStart and TableEnd fields.   The default value is true. | [optional] [default to true]
 **withRegions** | **Boolean**| Merge with regions or not. True by default | [optional] [default to true]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved with autogenerated name. | [optional]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/xml, application/json

<a name="postField"></a>
# **postField**
> FieldResponse postField(name, field, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath)

Updates field&#39;s properties, returns updated field&#39;s data.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Field field = new Field(); // Field | Field data.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of fields.
try {
    FieldResponse result = apiInstance.postField(name, field, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **field** | [**Field**](Field.md)| Field data. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of fields. | [optional]

### Return type

[**FieldResponse**](FieldResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="postFootnote"></a>
# **postFootnote**
> FootnoteResponse postFootnote(name, footnoteDto, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath)

Updates footnote&#39;s properties, returns updated run&#39;s data.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Footnote footnoteDto = new Footnote(); // Footnote | Footnote data.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of footnotes.
try {
    FootnoteResponse result = apiInstance.postFootnote(name, footnoteDto, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postFootnote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **footnoteDto** | [**Footnote**](Footnote.md)| Footnote data. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of footnotes. | [optional]

### Return type

[**FootnoteResponse**](FootnoteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="postFormField"></a>
# **postFormField**
> FormFieldResponse postFormField(name, formField, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath)

Updates properties of form field, returns updated form field.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
FormField formField = new FormField(); // FormField | From field data.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String nodePath = "nodePath_example"; // String | Path to node that contains collection of formfields.
try {
    FormFieldResponse result = apiInstance.postFormField(name, formField, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postFormField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **formField** | [**FormField**](FormField.md)| From field data. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **nodePath** | **String**| Path to node that contains collection of formfields. | [optional]

### Return type

[**FormFieldResponse**](FormFieldResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="postInsertDocumentWatermarkImage"></a>
# **postInsertDocumentWatermarkImage**
> DocumentResponse postInsertDocumentWatermarkImage(name, imageFile, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, rotationAngle, image)

Insert document watermark image.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
File imageFile = new File("/path/to/file.txt"); // File | File with image
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
Double rotationAngle = 3.4D; // Double | The watermark rotation angle.
String image = "image_example"; // String | The image file server full name. If the name is empty the image is expected in request content.
try {
    DocumentResponse result = apiInstance.postInsertDocumentWatermarkImage(name, imageFile, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, rotationAngle, image);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postInsertDocumentWatermarkImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageFile** | **File**| File with image | [optional]
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **rotationAngle** | **Double**| The watermark rotation angle. | [optional] [default to 0.0]
 **image** | **String**| The image file server full name. If the name is empty the image is expected in request content. | [optional]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/xml, application/json

<a name="postInsertDocumentWatermarkText"></a>
# **postInsertDocumentWatermarkText**
> DocumentResponse postInsertDocumentWatermarkText(name, watermarkText, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Insert document watermark text.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
WatermarkText watermarkText = new WatermarkText(); // WatermarkText | with the watermark data.            
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    DocumentResponse result = apiInstance.postInsertDocumentWatermarkText(name, watermarkText, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postInsertDocumentWatermarkText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **watermarkText** | [**WatermarkText**](WatermarkText.md)| with the watermark data.             |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="postInsertPageNumbers"></a>
# **postInsertPageNumbers**
> DocumentResponse postInsertPageNumbers(name, pageNumber, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Insert document page numbers.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | A document name.
PageNumber pageNumber = new PageNumber(); // PageNumber | with the page numbers settings.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    DocumentResponse result = apiInstance.postInsertPageNumbers(name, pageNumber, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postInsertPageNumbers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| A document name. |
 **pageNumber** | [**PageNumber**](PageNumber.md)| with the page numbers settings. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="postLoadWebDocument"></a>
# **postLoadWebDocument**
> SaveResponse postLoadWebDocument(data, storage)

Loads new document from web into the file with any supported format of data.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
LoadWebDocumentData data = new LoadWebDocumentData(); // LoadWebDocumentData | Parameters of loading.
String storage = "storage_example"; // String | File storage, which have to be used.
try {
    SaveResponse result = apiInstance.postLoadWebDocument(data, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postLoadWebDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**LoadWebDocumentData**](LoadWebDocumentData.md)| Parameters of loading. |
 **storage** | **String**| File storage, which have to be used. | [optional]

### Return type

[**SaveResponse**](SaveResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="postReplaceText"></a>
# **postReplaceText**
> ReplaceTextResponse postReplaceText(name, replaceText, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Replace document text.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
ReplaceTextRequest replaceText = new ReplaceTextRequest(); // ReplaceTextRequest | with the replace operation settings.            
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    ReplaceTextResponse result = apiInstance.postReplaceText(name, replaceText, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postReplaceText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **replaceText** | [**ReplaceTextRequest**](ReplaceTextRequest.md)| with the replace operation settings.             |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**ReplaceTextResponse**](ReplaceTextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="postRun"></a>
# **postRun**
> RunResponse postRun(name, run, paragraphPath, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Updates run&#39;s properties, returns updated run&#39;s data.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Run run = new Run(); // Run | Run data.
String paragraphPath = "paragraphPath_example"; // String | Path to parent paragraph.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    RunResponse result = apiInstance.postRun(name, run, paragraphPath, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **run** | [**Run**](Run.md)| Run data. |
 **paragraphPath** | **String**| Path to parent paragraph. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**RunResponse**](RunResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="postSplitDocument"></a>
# **postSplitDocument**
> SplitDocumentResponse postSplitDocument(name, folder, storage, loadEncoding, password, destFileName, format, from, to, zipOutput, fontsLocation)

Split document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | Original document name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String format = "format_example"; // String | Format to split.
Integer from = 56; // Integer | Start page.
Integer to = 56; // Integer | End page.
Boolean zipOutput = false; // Boolean | ZipOutput or not.
String fontsLocation = "fontsLocation_example"; // String | Folder in filestorage with custom fonts.
try {
    SplitDocumentResponse result = apiInstance.postSplitDocument(name, folder, storage, loadEncoding, password, destFileName, format, from, to, zipOutput, fontsLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postSplitDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Original document name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **format** | **String**| Format to split. | [optional]
 **from** | **Integer**| Start page. | [optional]
 **to** | **Integer**| End page. | [optional]
 **zipOutput** | **Boolean**| ZipOutput or not. | [optional] [default to false]
 **fontsLocation** | **String**| Folder in filestorage with custom fonts. | [optional]

### Return type

[**SplitDocumentResponse**](SplitDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="postUpdateDocumentBookmark"></a>
# **postUpdateDocumentBookmark**
> BookmarkResponse postUpdateDocumentBookmark(name, bookmarkData, bookmarkName, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Update document bookmark.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
BookmarkData bookmarkData = new BookmarkData(); // BookmarkData | with new bookmark data.            
String bookmarkName = "bookmarkName_example"; // String | The bookmark name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    BookmarkResponse result = apiInstance.postUpdateDocumentBookmark(name, bookmarkData, bookmarkName, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postUpdateDocumentBookmark");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **bookmarkData** | [**BookmarkData**](BookmarkData.md)| with new bookmark data.             |
 **bookmarkName** | **String**| The bookmark name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**BookmarkResponse**](BookmarkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="postUpdateDocumentFields"></a>
# **postUpdateDocumentFields**
> DocumentResponse postUpdateDocumentFields(name, folder, storage, loadEncoding, password, destFileName)

Update (reevaluate) fields in document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
try {
    DocumentResponse result = apiInstance.postUpdateDocumentFields(name, folder, storage, loadEncoding, password, destFileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#postUpdateDocumentFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="putComment"></a>
# **putComment**
> CommentResponse putComment(name, comment, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Adds comment to document, returns inserted comment&#39;s data.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Comment comment = new Comment(); // Comment | Comment data.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    CommentResponse result = apiInstance.putComment(name, comment, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#putComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **comment** | [**Comment**](Comment.md)| Comment data. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**CommentResponse**](CommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="putConvertDocument"></a>
# **putConvertDocument**
> File putConvertDocument(document, format, storage, outPath, documentFileName, fontsLocation)

Convert document from request content to format specified.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
File document = new File("/path/to/file.txt"); // File | Converting document
String format = "format_example"; // String | Format to convert.
String storage = "storage_example"; // String | File storage, which have to be used.
String outPath = "outPath_example"; // String | Path for saving operation result to the local storage.
String documentFileName = "sourceFilename"; // String | This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not setted, \"sourceFilename\" will be used instead. 
String fontsLocation = "fontsLocation_example"; // String | Folder in filestorage with custom fonts.
try {
    File result = apiInstance.putConvertDocument(document, format, storage, outPath, documentFileName, fontsLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#putConvertDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document** | **File**| Converting document |
 **format** | **String**| Format to convert. |
 **storage** | **String**| File storage, which have to be used. | [optional]
 **outPath** | **String**| Path for saving operation result to the local storage. | [optional]
 **documentFileName** | **String**| This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not setted, \&quot;sourceFilename\&quot; will be used instead.  | [optional] [default to sourceFilename]
 **fontsLocation** | **String**| Folder in filestorage with custom fonts. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/xml, application/json

<a name="putCreateDocument"></a>
# **putCreateDocument**
> DocumentResponse putCreateDocument(storage, fileName, folder)

Creates new document. Document is created with format which is recognized from file extensions.  Supported extentions: \&quot;.doc\&quot;, \&quot;.docx\&quot;, \&quot;.docm\&quot;, \&quot;.dot\&quot;, \&quot;.dotm\&quot;, \&quot;.dotx\&quot;, \&quot;.flatopc\&quot;, \&quot;.fopc\&quot;, \&quot;.flatopc_macro\&quot;, \&quot;.fopc_macro\&quot;, \&quot;.flatopc_template\&quot;, \&quot;.fopc_template\&quot;, \&quot;.flatopc_template_macro\&quot;, \&quot;.fopc_template_macro\&quot;, \&quot;.wordml\&quot;, \&quot;.wml\&quot;, \&quot;.rtf\&quot;

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String storage = "storage_example"; // String | File storage, which have to be used.
String fileName = "fileName_example"; // String | The file name.
String folder = "folder_example"; // String | The document folder.
try {
    DocumentResponse result = apiInstance.putCreateDocument(storage, fileName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#putCreateDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storage** | **String**| File storage, which have to be used. | [optional]
 **fileName** | **String**| The file name. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="putDocumentFieldNames"></a>
# **putDocumentFieldNames**
> FieldNamesResponse putDocumentFieldNames(template, useNonMergeFields)

Read document field names.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
File template = new File("/path/to/file.txt"); // File | File with template
Boolean useNonMergeFields = false; // Boolean | Use non merge fields or not.
try {
    FieldNamesResponse result = apiInstance.putDocumentFieldNames(template, useNonMergeFields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#putDocumentFieldNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template** | **File**| File with template |
 **useNonMergeFields** | **Boolean**| Use non merge fields or not. | [optional] [default to false]

### Return type

[**FieldNamesResponse**](FieldNamesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/xml, application/json

<a name="putDocumentSaveAsTiff"></a>
# **putDocumentSaveAsTiff**
> SaveResponse putDocumentSaveAsTiff(name, saveOptions, folder, storage, loadEncoding, password, destFileName, resultFile, useAntiAliasing, useHighQualityRendering, imageBrightness, imageColorMode, imageContrast, numeralFormat, pageCount, pageIndex, paperColor, pixelFormat, resolution, scale, tiffCompression, dmlRenderingMode, dmlEffectsRenderingMode, tiffBinarizationMethod, zipOutput, fontsLocation)

Convert document to tiff with detailed settings and save result to storage.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
TiffSaveOptionsData saveOptions = new TiffSaveOptionsData(); // TiffSaveOptionsData | Tiff save options.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String resultFile = "resultFile_example"; // String | The resulting file name.
Boolean useAntiAliasing = true; // Boolean | Use antialiasing flag.
Boolean useHighQualityRendering = true; // Boolean | Use high quality flag.
Double imageBrightness = 3.4D; // Double | Brightness for the generated images.
String imageColorMode = "imageColorMode_example"; // String | Color mode for the generated images.
Double imageContrast = 3.4D; // Double | The contrast for the generated images.
String numeralFormat = "numeralFormat_example"; // String | The images numeral format.
Integer pageCount = 56; // Integer | Number of pages to render.
Integer pageIndex = 56; // Integer | Page index to start rendering.
String paperColor = "paperColor_example"; // String | Background image color.
String pixelFormat = "pixelFormat_example"; // String | The pixel format of generated images.
Double resolution = 3.4D; // Double | The resolution of generated images.
Double scale = 3.4D; // Double | Zoom factor for generated images.
String tiffCompression = "tiffCompression_example"; // String | The compression tipe.
String dmlRenderingMode = "dmlRenderingMode_example"; // String | Optional, default is Fallback.
String dmlEffectsRenderingMode = "dmlEffectsRenderingMode_example"; // String | Optional, default is Simplified.
String tiffBinarizationMethod = "tiffBinarizationMethod_example"; // String | Optional, Tiff binarization method, possible values are: FloydSteinbergDithering, Threshold.
Boolean zipOutput = true; // Boolean | Optional. A value determining zip output or not.
String fontsLocation = "fontsLocation_example"; // String | Folder in filestorage with custom fonts.
try {
    SaveResponse result = apiInstance.putDocumentSaveAsTiff(name, saveOptions, folder, storage, loadEncoding, password, destFileName, resultFile, useAntiAliasing, useHighQualityRendering, imageBrightness, imageColorMode, imageContrast, numeralFormat, pageCount, pageIndex, paperColor, pixelFormat, resolution, scale, tiffCompression, dmlRenderingMode, dmlEffectsRenderingMode, tiffBinarizationMethod, zipOutput, fontsLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#putDocumentSaveAsTiff");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **saveOptions** | [**TiffSaveOptionsData**](TiffSaveOptionsData.md)| Tiff save options. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **resultFile** | **String**| The resulting file name. | [optional]
 **useAntiAliasing** | **Boolean**| Use antialiasing flag. | [optional]
 **useHighQualityRendering** | **Boolean**| Use high quality flag. | [optional]
 **imageBrightness** | **Double**| Brightness for the generated images. | [optional]
 **imageColorMode** | **String**| Color mode for the generated images. | [optional]
 **imageContrast** | **Double**| The contrast for the generated images. | [optional]
 **numeralFormat** | **String**| The images numeral format. | [optional]
 **pageCount** | **Integer**| Number of pages to render. | [optional]
 **pageIndex** | **Integer**| Page index to start rendering. | [optional]
 **paperColor** | **String**| Background image color. | [optional]
 **pixelFormat** | **String**| The pixel format of generated images. | [optional]
 **resolution** | **Double**| The resolution of generated images. | [optional]
 **scale** | **Double**| Zoom factor for generated images. | [optional]
 **tiffCompression** | **String**| The compression tipe. | [optional]
 **dmlRenderingMode** | **String**| Optional, default is Fallback. | [optional]
 **dmlEffectsRenderingMode** | **String**| Optional, default is Simplified. | [optional]
 **tiffBinarizationMethod** | **String**| Optional, Tiff binarization method, possible values are: FloydSteinbergDithering, Threshold. | [optional]
 **zipOutput** | **Boolean**| Optional. A value determining zip output or not. | [optional]
 **fontsLocation** | **String**| Folder in filestorage with custom fonts. | [optional]

### Return type

[**SaveResponse**](SaveResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="putDrawingObject"></a>
# **putDrawingObject**
> DrawingObjectResponse putDrawingObject(name, drawingObject, imageFile, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath)

Adds  drawing object to document, returns added  drawing object&#39;s data.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String drawingObject = "drawingObject_example"; // String | Drawing object parameters
File imageFile = new File("/path/to/file.txt"); // File | File with image
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of drawing objects.
try {
    DrawingObjectResponse result = apiInstance.putDrawingObject(name, drawingObject, imageFile, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#putDrawingObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **drawingObject** | **String**| Drawing object parameters |
 **imageFile** | **File**| File with image |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of drawing objects. | [optional]

### Return type

[**DrawingObjectResponse**](DrawingObjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/xml, application/json

<a name="putExecuteMailMergeOnline"></a>
# **putExecuteMailMergeOnline**
> File putExecuteMailMergeOnline(template, data, withRegions, cleanup, documentFileName)

Execute document mail merge online.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
File template = new File("/path/to/file.txt"); // File | File with template
File data = new File("/path/to/file.txt"); // File | File with mailmerge data
Boolean withRegions = false; // Boolean | With regions flag.
String cleanup = "cleanup_example"; // String | Clean up options.
String documentFileName = "template"; // String | This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not setted, \"template\" will be used instead. 
try {
    File result = apiInstance.putExecuteMailMergeOnline(template, data, withRegions, cleanup, documentFileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#putExecuteMailMergeOnline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template** | **File**| File with template |
 **data** | **File**| File with mailmerge data |
 **withRegions** | **Boolean**| With regions flag. | [optional] [default to false]
 **cleanup** | **String**| Clean up options. | [optional]
 **documentFileName** | **String**| This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not setted, \&quot;template\&quot; will be used instead.  | [optional] [default to template]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/xml, application/json

<a name="putExecuteTemplateOnline"></a>
# **putExecuteTemplateOnline**
> File putExecuteTemplateOnline(template, data, cleanup, useWholeParagraphAsRegion, withRegions, documentFileName)

Populate document template with data online.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
File template = new File("/path/to/file.txt"); // File | File with template
File data = new File("/path/to/file.txt"); // File | File with mailmerge data
String cleanup = "cleanup_example"; // String | Clean up options.
Boolean useWholeParagraphAsRegion = true; // Boolean | Gets or sets a value indicating whether paragraph with TableStart or              TableEnd field should be fully included into mail merge region or particular range between TableStart and TableEnd fields.              The default value is true.
Boolean withRegions = true; // Boolean | Merge with regions or not. True by default
String documentFileName = "template"; // String | This file name will be used when resulting document has dynamic field for document file name {filename}.  If it is not setted, \"template\" will be used instead.  Note: if withRegions == true executeTemplate updates fields only inside regions
try {
    File result = apiInstance.putExecuteTemplateOnline(template, data, cleanup, useWholeParagraphAsRegion, withRegions, documentFileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#putExecuteTemplateOnline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template** | **File**| File with template |
 **data** | **File**| File with mailmerge data |
 **cleanup** | **String**| Clean up options. | [optional]
 **useWholeParagraphAsRegion** | **Boolean**| Gets or sets a value indicating whether paragraph with TableStart or              TableEnd field should be fully included into mail merge region or particular range between TableStart and TableEnd fields.              The default value is true. | [optional] [default to true]
 **withRegions** | **Boolean**| Merge with regions or not. True by default | [optional] [default to true]
 **documentFileName** | **String**| This file name will be used when resulting document has dynamic field for document file name {filename}.  If it is not setted, \&quot;template\&quot; will be used instead.  Note: if withRegions &#x3D;&#x3D; true executeTemplate updates fields only inside regions | [optional] [default to template]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/xml, application/json

<a name="putField"></a>
# **putField**
> FieldResponse putField(name, field, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath, insertBeforeNode)

Adds field to document, returns inserted field&#39;s data.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Field field = new Field(); // Field | Field data.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of fields.
String insertBeforeNode = "insertBeforeNode_example"; // String | Field will be inserted before node with id=\"nodeId\".
try {
    FieldResponse result = apiInstance.putField(name, field, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath, insertBeforeNode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#putField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **field** | [**Field**](Field.md)| Field data. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of fields. | [optional]
 **insertBeforeNode** | **String**| Field will be inserted before node with id&#x3D;\&quot;nodeId\&quot;. | [optional]

### Return type

[**FieldResponse**](FieldResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="putFootnote"></a>
# **putFootnote**
> FootnoteResponse putFootnote(name, footnoteDto, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath)

Adds footnote to document, returns added footnote&#39;s data.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Footnote footnoteDto = new Footnote(); // Footnote | Footnote data.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String nodePath = "nodePath_example"; // String | Path to node, which contains collection of footnotes.
try {
    FootnoteResponse result = apiInstance.putFootnote(name, footnoteDto, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#putFootnote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **footnoteDto** | [**Footnote**](Footnote.md)| Footnote data. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **nodePath** | **String**| Path to node, which contains collection of footnotes. | [optional]

### Return type

[**FootnoteResponse**](FootnoteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="putFormField"></a>
# **putFormField**
> FormFieldResponse putFormField(name, formField, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath, insertBeforeNode)

Adds form field to paragraph, returns added form field&#39;s data.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
FormField formField = new FormField(); // FormField | From field data.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String nodePath = "nodePath_example"; // String | Path to node that contains collection of formfields.
String insertBeforeNode = "insertBeforeNode_example"; // String | Form field will be inserted before node with index.
try {
    FormFieldResponse result = apiInstance.putFormField(name, formField, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath, insertBeforeNode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#putFormField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **formField** | [**FormField**](FormField.md)| From field data. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **nodePath** | **String**| Path to node that contains collection of formfields. | [optional]
 **insertBeforeNode** | **String**| Form field will be inserted before node with index. | [optional]

### Return type

[**FormFieldResponse**](FormFieldResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="putHeaderFooter"></a>
# **putHeaderFooter**
> HeaderFooterResponse putHeaderFooter(name, headerFooterType, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, sectionPath)

Insert to document header or footer.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String headerFooterType = "headerFooterType_example"; // String | Type of header/footer.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String sectionPath = "sectionPath_example"; // String | Path to parent section.
try {
    HeaderFooterResponse result = apiInstance.putHeaderFooter(name, headerFooterType, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, sectionPath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#putHeaderFooter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **headerFooterType** | **String**| Type of header/footer. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **sectionPath** | **String**| Path to parent section. | [optional]

### Return type

[**HeaderFooterResponse**](HeaderFooterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="putParagraph"></a>
# **putParagraph**
> ParagraphResponse putParagraph(name, paragraph, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath, insertBeforeNode)

Adds paragraph to document, returns added paragraph&#39;s data.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
ParagraphInsert paragraph = new ParagraphInsert(); // ParagraphInsert | Paragraph data.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String nodePath = "nodePath_example"; // String | Path to node which contains paragraphs.
String insertBeforeNode = "insertBeforeNode_example"; // String | Paragraph will be inserted before node with index.
try {
    ParagraphResponse result = apiInstance.putParagraph(name, paragraph, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, nodePath, insertBeforeNode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#putParagraph");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **paragraph** | [**ParagraphInsert**](ParagraphInsert.md)| Paragraph data. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **nodePath** | **String**| Path to node which contains paragraphs. | [optional]
 **insertBeforeNode** | **String**| Paragraph will be inserted before node with index. | [optional]

### Return type

[**ParagraphResponse**](ParagraphResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="putProtectDocument"></a>
# **putProtectDocument**
> ProtectionDataResponse putProtectDocument(name, protectionRequest, folder, storage, loadEncoding, password, destFileName)

Protect document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
ProtectionRequest protectionRequest = new ProtectionRequest(); // ProtectionRequest | with protection settings.            
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
try {
    ProtectionDataResponse result = apiInstance.putProtectDocument(name, protectionRequest, folder, storage, loadEncoding, password, destFileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#putProtectDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **protectionRequest** | [**ProtectionRequest**](ProtectionRequest.md)| with protection settings.             |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]

### Return type

[**ProtectionDataResponse**](ProtectionDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="putRun"></a>
# **putRun**
> RunResponse putRun(name, paragraphPath, run, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, insertBeforeNode)

Adds run to document, returns added paragraph&#39;s data.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String paragraphPath = "paragraphPath_example"; // String | Path to parent paragraph.
Run run = new Run(); // Run | Run data.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
String insertBeforeNode = "insertBeforeNode_example"; // String | Paragraph will be inserted before node with index.
try {
    RunResponse result = apiInstance.putRun(name, paragraphPath, run, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, insertBeforeNode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#putRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **paragraphPath** | **String**| Path to parent paragraph. |
 **run** | [**Run**](Run.md)| Run data. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **insertBeforeNode** | **String**| Paragraph will be inserted before node with index. | [optional]

### Return type

[**RunResponse**](RunResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="rejectAllRevisions"></a>
# **rejectAllRevisions**
> RevisionsModificationResponse rejectAllRevisions(name, folder, storage, loadEncoding, password, destFileName)

Reject all revisions in document

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
try {
    RevisionsModificationResponse result = apiInstance.rejectAllRevisions(name, folder, storage, loadEncoding, password, destFileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#rejectAllRevisions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]

### Return type

[**RevisionsModificationResponse**](RevisionsModificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="renderDrawingObject"></a>
# **renderDrawingObject**
> File renderDrawingObject(name, format, index, folder, storage, loadEncoding, password, nodePath, fontsLocation)

Renders drawing object to specified format.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
String format = "format_example"; // String | The destination format.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node, which contains drawing objects.
String fontsLocation = "fontsLocation_example"; // String | Folder in filestorage with custom fonts.
try {
    File result = apiInstance.renderDrawingObject(name, format, index, folder, storage, loadEncoding, password, nodePath, fontsLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#renderDrawingObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **format** | **String**| The destination format. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node, which contains drawing objects. | [optional]
 **fontsLocation** | **String**| Folder in filestorage with custom fonts. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="renderMathObject"></a>
# **renderMathObject**
> File renderMathObject(name, format, index, folder, storage, loadEncoding, password, nodePath, fontsLocation)

Renders math object to specified format.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
String format = "format_example"; // String | The destination format.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node, which contains office math objects.
String fontsLocation = "fontsLocation_example"; // String | Folder in filestorage with custom fonts.
try {
    File result = apiInstance.renderMathObject(name, format, index, folder, storage, loadEncoding, password, nodePath, fontsLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#renderMathObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **format** | **String**| The destination format. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node, which contains office math objects. | [optional]
 **fontsLocation** | **String**| Folder in filestorage with custom fonts. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="renderPage"></a>
# **renderPage**
> File renderPage(name, pageIndex, format, folder, storage, loadEncoding, password, fontsLocation)

Renders page to specified format.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
Integer pageIndex = 56; // Integer | Comment index
String format = "format_example"; // String | The destination format.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String fontsLocation = "fontsLocation_example"; // String | Folder in filestorage with custom fonts.
try {
    File result = apiInstance.renderPage(name, pageIndex, format, folder, storage, loadEncoding, password, fontsLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#renderPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **pageIndex** | **Integer**| Comment index |
 **format** | **String**| The destination format. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **fontsLocation** | **String**| Folder in filestorage with custom fonts. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="renderParagraph"></a>
# **renderParagraph**
> File renderParagraph(name, format, index, folder, storage, loadEncoding, password, nodePath, fontsLocation)

Renders paragraph to specified format.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
String format = "format_example"; // String | The destination format.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node, which contains paragraphs.
String fontsLocation = "fontsLocation_example"; // String | Folder in filestorage with custom fonts.
try {
    File result = apiInstance.renderParagraph(name, format, index, folder, storage, loadEncoding, password, nodePath, fontsLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#renderParagraph");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **format** | **String**| The destination format. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node, which contains paragraphs. | [optional]
 **fontsLocation** | **String**| Folder in filestorage with custom fonts. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="renderTable"></a>
# **renderTable**
> File renderTable(name, format, index, folder, storage, loadEncoding, password, nodePath, fontsLocation)

Renders table to specified format.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The file name.
String format = "format_example"; // String | The destination format.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String nodePath = "nodePath_example"; // String | Path to node, which contains tables.
String fontsLocation = "fontsLocation_example"; // String | Folder in filestorage with custom fonts.
try {
    File result = apiInstance.renderTable(name, format, index, folder, storage, loadEncoding, password, nodePath, fontsLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#renderTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The file name. |
 **format** | **String**| The destination format. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **nodePath** | **String**| Path to node, which contains tables. | [optional]
 **fontsLocation** | **String**| Folder in filestorage with custom fonts. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="resetCache"></a>
# **resetCache**
> AsposeResponse resetCache()

Resets font&#39;s cache.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
try {
    AsposeResponse result = apiInstance.resetCache();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#resetCache");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AsposeResponse**](AsposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="search"></a>
# **search**
> SearchResponse search(name, pattern, folder, storage, loadEncoding, password)

Search text in document.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String pattern = "pattern_example"; // String | The regular expression used to find matches.
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
try {
    SearchResponse result = apiInstance.search(name, pattern, folder, storage, loadEncoding, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pattern** | **String**| The regular expression used to find matches. |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateBorder"></a>
# **updateBorder**
> BorderResponse updateBorder(name, borderProperties, nodePath, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Updates border properties.             

&#39;nodePath&#39; should refer to node with cell or row

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Border borderProperties = new Border(); // Border | Border properties
String nodePath = "nodePath_example"; // String | Path to node with border(node should be cell or row).
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    BorderResponse result = apiInstance.updateBorder(name, borderProperties, nodePath, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#updateBorder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **borderProperties** | [**Border**](Border.md)| Border properties |
 **nodePath** | **String**| Path to node with border(node should be cell or row). |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**BorderResponse**](BorderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateSectionPageSetup"></a>
# **updateSectionPageSetup**
> SectionPageSetupResponse updateSectionPageSetup(name, sectionIndex, pageSetup, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime)

Update page setup of section.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer sectionIndex = 56; // Integer | Section index
PageSetup pageSetup = new PageSetup(); // PageSetup | Page setup properties dto
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
try {
    SectionPageSetupResponse result = apiInstance.updateSectionPageSetup(name, sectionIndex, pageSetup, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#updateSectionPageSetup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **sectionIndex** | **Integer**| Section index |
 **pageSetup** | [**PageSetup**](PageSetup.md)| Page setup properties dto |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]

### Return type

[**SectionPageSetupResponse**](SectionPageSetupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateTableCellFormat"></a>
# **updateTableCellFormat**
> TableCellFormatResponse updateTableCellFormat(name, tableRowPath, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, format)

Updates a table cell format.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String tableRowPath = "tableRowPath_example"; // String | Path to table row.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
TableCellFormat format = new TableCellFormat(); // TableCellFormat | The properties.
try {
    TableCellFormatResponse result = apiInstance.updateTableCellFormat(name, tableRowPath, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#updateTableCellFormat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **tableRowPath** | **String**| Path to table row. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **format** | [**TableCellFormat**](TableCellFormat.md)| The properties. | [optional]

### Return type

[**TableCellFormatResponse**](TableCellFormatResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateTableProperties"></a>
# **updateTableProperties**
> TablePropertiesResponse updateTableProperties(name, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, properties, nodePath)

Updates a table properties.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
TableProperties properties = new TableProperties(); // TableProperties | The properties.
String nodePath = "nodePath_example"; // String | Path to node, which contains tables.
try {
    TablePropertiesResponse result = apiInstance.updateTableProperties(name, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, properties, nodePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#updateTableProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **properties** | [**TableProperties**](TableProperties.md)| The properties. | [optional]
 **nodePath** | **String**| Path to node, which contains tables. | [optional]

### Return type

[**TablePropertiesResponse**](TablePropertiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateTableRowFormat"></a>
# **updateTableRowFormat**
> TableRowFormatResponse updateTableRowFormat(name, tablePath, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, format)

Updates a table row format.

### Example
```java
// Import classes:
//import com.aspose.words.ApiException;
//import com.aspose.words.api.WordsApi;


WordsApi apiInstance = new WordsApi();
String name = "name_example"; // String | The document name.
String tablePath = "tablePath_example"; // String | Path to table.
Integer index = 56; // Integer | Object's index
String folder = "folder_example"; // String | Original document folder.
String storage = "storage_example"; // String | File storage, which have to be used.
String loadEncoding = "loadEncoding_example"; // String | Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
String password = "password_example"; // String | Password for opening an encrypted document.
String destFileName = "destFileName_example"; // String | Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
String revisionAuthor = "revisionAuthor_example"; // String | Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
String revisionDateTime = "revisionDateTime_example"; // String | The date and time to use for revisions.
TableRowFormat format = new TableRowFormat(); // TableRowFormat | Table row format.
try {
    TableRowFormatResponse result = apiInstance.updateTableRowFormat(name, tablePath, index, folder, storage, loadEncoding, password, destFileName, revisionAuthor, revisionDateTime, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#updateTableRowFormat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **tablePath** | **String**| Path to table. |
 **index** | **Integer**| Object&#39;s index |
 **folder** | **String**| Original document folder. | [optional]
 **storage** | **String**| File storage, which have to be used. | [optional]
 **loadEncoding** | **String**| Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML. | [optional]
 **password** | **String**| Password for opening an encrypted document. | [optional]
 **destFileName** | **String**| Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document. | [optional]
 **revisionAuthor** | **String**| Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions. | [optional]
 **revisionDateTime** | **String**| The date and time to use for revisions. | [optional]
 **format** | [**TableRowFormat**](TableRowFormat.md)| Table row format. | [optional]

### Return type

[**TableRowFormatResponse**](TableRowFormatResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

