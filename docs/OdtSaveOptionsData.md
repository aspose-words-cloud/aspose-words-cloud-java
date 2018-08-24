
# OdtSaveOptionsData

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
**isStrictSchema11** | **Boolean** | Specifies whether export should correspond to ODT specification 1.1 strictly |  [optional]
**measureUnit** | [**MeasureUnitEnum**](#MeasureUnitEnum) | Allows to specify units of measure to apply to document content. The default value is Aspose.Words.Saving.OdtSaveMeasureUnit.Centimeters  Open Office uses centimeters when specifying lengths, widths and other measurable formatting and content properties in documents whereas MS Office uses inches. |  [optional]
**prettyFormat** | **Boolean** | Specifies whether or not use pretty formats output |  [optional]


<a name="MeasureUnitEnum"></a>
## Enum: MeasureUnitEnum
Name | Value
---- | -----
CENTIMETERS | &quot;Centimeters&quot;
INCHES | &quot;Inches&quot;



