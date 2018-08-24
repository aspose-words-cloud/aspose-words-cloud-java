
# PdfSaveOptionsData

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
**compliance** | **String** | Specifies the PDF standards compliance level for output documents |  [optional]
**createNoteHyperlinks** | **Boolean** | Specifies whether to convert footnote/endnote references in main text story into active hyperlinks. When clicked the hyperlink will lead to the corresponding footnote/endnote. Default is false. |  [optional]
**customPropertiesExport** | **String** | Gets or sets a value determining the way  are exported to PDF file. Default value is . |  [optional]
**digitalSignatureDetails** | [**PdfDigitalSignatureDetailsData**](PdfDigitalSignatureDetailsData.md) | Specifies the details for signing the output PDF document |  [optional]
**displayDocTitle** | **Boolean** | A flag specifying whether the window’s title bar should display the document title taken from the Title entry of the document information dictionary. |  [optional]
**downsampleOptions** | [**DownsampleOptionsData**](DownsampleOptionsData.md) | Allows to specify downsample options. |  [optional]
**embedFullFonts** | **Boolean** | Controls how fonts are embedded into the resulting PDF documents |  [optional]
**encryptionDetails** | [**PdfEncryptionDetailsData**](PdfEncryptionDetailsData.md) | Specifies the details for encrypting the output PDF document |  [optional]
**escapeUri** | **Boolean** | A flag specifying whether URI should be escaped before writing.              |  [optional]
**exportDocumentStructure** | **Boolean** | Determines whether or not to export document structure |  [optional]
**fontEmbeddingMode** | **String** | Specifies the font embedding mode |  [optional]
**imageColorSpaceExportMode** | **String** | Specifies how the color space will be selected for the images in PDF document. |  [optional]
**imageCompression** | **String** | Specifies compression type to be used for all images in the document |  [optional]
**openHyperlinksInNewWindow** | **Boolean** | Determines whether hyperlinks in the output Pdf document are forced to be opened in a new window (or tab) of a browser |  [optional]
**outlineOptions** | [**OutlineOptionsData**](OutlineOptionsData.md) | Allows to specify outline options |  [optional]
**pageMode** | **String** | Specifies how the PDF document should be displayed when opened in the PDF reader |  [optional]
**preblendImages** | **Boolean** | Gets or sets a value determining whether or not to preblend transparent images with black background color. |  [optional]
**preserveFormFields** | **Boolean** | Specifies whether to preserve Microsoft Word form fields as form fields in PDF or convert them to text |  [optional]
**textCompression** | **String** | Specifies compression type to be used for all textual content in the document |  [optional]
**useBookFoldPrintingSettings** | **Boolean** | Determines whether the document should be saved using a booklet printing layout |  [optional]
**useCoreFonts** | **Boolean** | Determines whether or not to substitute TrueType fonts Arial, Times New Roman, Courier New and Symbol with core PDF Type 1 fonts |  [optional]
**zoomBehavior** | **String** | Determines what type of zoom should be applied when a document is opened with a PDF viewer |  [optional]
**zoomFactor** | **Integer** | Determines zoom factor (in percentages) for a document |  [optional]



