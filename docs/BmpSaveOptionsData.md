
# BmpSaveOptionsData

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
**graphicsQualityOptions** | [**GraphicsQualityOptionsData**](GraphicsQualityOptionsData.md) | Allows to specify additional System.Drawing.Graphics quality options. |  [optional]
**horizontalResolution** | **Double** | Gets or sets the horizontal resolution for the generated images, in dots per inch.  This property has effect only when saving to raster image formats. The default value is 96. |  [optional]
**imageBrightness** | **Double** | Brightness of image |  [optional]
**imageColorMode** | **String** | Color mode of image |  [optional]
**imageContrast** | **Double** | Contrast of image |  [optional]
**paperColor** | **String** | Background (paper) color of image |  [optional]
**pixelFormat** | **String** | Pixel format of image |  [optional]
**resolution** | **Double** | Sets both horizontal and vertical resolution for the generated images, in dots per inch.  This property has effect only when saving to raster image formats. The default value is 96. |  [optional]
**scale** | **Double** | Zoom factor of image |  [optional]
**useAntiAliasing** | **Boolean** | Determine whether or not to use anti-aliasing for rendering |  [optional]
**useGdiEmfRenderer** | **Boolean** | Gets or sets a value determining whether to use GDI+ or Aspose.Words metafile renderer when saving to EMF. |  [optional]
**useHighQualityRendering** | **Boolean** | Determine whether or not to use high quality (i.e. slow) rendering algorithms |  [optional]
**verticalResolution** | **Double** | Gets or sets the vertical resolution for the generated images, in dots per inch.  This property has effect only when saving to raster image formats. The default value is 96. |  [optional]



