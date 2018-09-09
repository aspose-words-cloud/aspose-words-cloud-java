
# HtmlFixedSaveOptionsData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**colorMode** | **String** | Gets or sets a value determining how colors are rendered. { Normal | Grayscale} |  [optional]
**saveFormat** | **String** | format of save |  [optional]
**fileName** | **String** | name of destination file |  [optional]
**dmlRenderingMode** | **String** | Gets or sets a value determining how DrawingML shapes are rendered. { Fallback | DrawingML } |  [optional]
**dmlEffectsRenderingMode** | **String** | Gets or sets a value determining how DrawingML effects are rendered. { Simplified | None | Fine } |  [optional]
**zipOutput** | **Boolean** | Controls zip output or not. Default value is false. |  [optional]
**updateLastSavedTimeProperty** | **Boolean** | Gets or sets a value determining whether the Aspose.Words.Properties.BuiltInDocumentProperties.LastSavedTime property is updated before saving. |  [optional]
**updateSdtContent** | **Boolean** | Gets or sets value determining whether content of  is updated before saving. |  [optional]
**updateFields** | **Boolean** | Gets or sets a value determining if fields should be updated before saving the document to a fixed page format. Default value for this property is true |  [optional]
**jpegQuality** | **Integer** | Determines the quality of the JPEG images inside PDF document. |  [optional]
**metafileRenderingOptions** | [**MetafileRenderingOptionsData**](MetafileRenderingOptionsData.md) | Allows to specify metafile rendering options. |  [optional]
**numeralFormat** | **String** | Indicates the symbol set that is used to represent numbers while rendering to fixed page formats |  [optional]
**optimizeOutput** | **Boolean** | Flag indicates whether it is required to optimize output of XPS.  If this flag is set redundant nested canvases and empty canvases are removed, also neighbor glyphs with the same formatting are concatenated.  Note: The accuracy of the content display may be affected if this property is set to true.  Default is false. |  [optional]
**pageCount** | **Integer** | Determines number of pages to render |  [optional]
**pageIndex** | **Integer** | Determines 0-based index of the first page to render |  [optional]
**cssClassNamesPrefix** | **String** | Specifies prefix which is added to all class names in style.css file. Default value is \&quot;aw\&quot;. |  [optional]
**encoding** | **String** | Encoding. |  [optional]
**exportEmbeddedCss** | **Boolean** | Specifies whether the CSS (Cascading Style Sheet) should be embedded into Html document. |  [optional]
**exportEmbeddedFonts** | **Boolean** | Specifies whether fonts should be embedded into Html document in Base64 format. |  [optional]
**exportEmbeddedImages** | **Boolean** | Specifies whether images should be embedded into Html document in Base64 format. |  [optional]
**exportFormFields** | **Boolean** | Gets or sets indication of whether form fields are exported as interactive items (as &#39;input&#39; tag) rather than converted to text or graphics. |  [optional]
**fontFormat** | **String** | Specifies export format of fonts |  [optional]
**pageHorizontalAlignment** | **String** | Specifies the horizontal alignment of pages in an HTML document. Default value is HtmlFixedHorizontalPageAlignment.Center. |  [optional]
**pageMargins** | **Double** | Specifies the margins around pages in an HTML document. The margins value is measured in points and should be equal to or greater than 0. Default value is 10 points. |  [optional]
**resourcesFolder** | **String** | Specifies the physical folder where resources are saved when exporting a document |  [optional]
**resourcesFolderAlias** | **String** | Specifies the name of the folder used to construct resource URIs |  [optional]
**showPageBorder** | **Boolean** | Specifies whether border around pages should be shown. |  [optional]



