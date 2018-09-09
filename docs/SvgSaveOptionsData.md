
# SvgSaveOptionsData

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
**exportEmbeddedImages** | **Boolean** | Specified whether images should be embedded into SVG document as base64 |  [optional]
**fitToViewPort** | **Boolean** | Specifies if the output SVG should fill the available viewport area (browser window or container). When set to true width and height of output SVG are set to 100%. |  [optional]
**resourcesFolder** | **String** | Specifies the physical folder where resources (images) are saved when exporting |  [optional]
**resourcesFolderAlias** | **String** | Specifies the name of the folder used to construct image URIs |  [optional]
**showPageBorder** | **Boolean** | Show/hide page stepper |  [optional]
**textOutputMode** | **String** | Determines how text should be rendered |  [optional]



