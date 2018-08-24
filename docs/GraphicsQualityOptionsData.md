
# GraphicsQualityOptionsData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**compositingMode** | [**CompositingModeEnum**](#CompositingModeEnum) | Gets or sets a value that specifies how composited images are drawn to this Graphics. |  [optional]
**compositingQuality** | [**CompositingQualityEnum**](#CompositingQualityEnum) | Gets or sets the rendering quality of composited images drawn to this Graphics. |  [optional]
**interpolationMode** | [**InterpolationModeEnum**](#InterpolationModeEnum) | Gets or sets the interpolation mode associated with this Graphics. |  [optional]
**smoothingMode** | [**SmoothingModeEnum**](#SmoothingModeEnum) | Gets or sets the rendering quality for this Graphics. |  [optional]
**stringFormat** | [**StringFormatData**](StringFormatData.md) | Gets or sets text layout information (such as alignment, orientation and tab stops) display manipulations (such as ellipsis insertion and national digit substitution) and OpenType features. |  [optional]
**textRenderingHint** | [**TextRenderingHintEnum**](#TextRenderingHintEnum) | Gets or sets the rendering mode for text associated with this Graphics. |  [optional]


<a name="CompositingModeEnum"></a>
## Enum: CompositingModeEnum
Name | Value
---- | -----
SOURCEOVER | &quot;SourceOver&quot;
SOURCECOPY | &quot;SourceCopy&quot;


<a name="CompositingQualityEnum"></a>
## Enum: CompositingQualityEnum
Name | Value
---- | -----
DEFAULT | &quot;Default&quot;
HIGHSPEED | &quot;HighSpeed&quot;
HIGHQUALITY | &quot;HighQuality&quot;
GAMMACORRECTED | &quot;GammaCorrected&quot;
ASSUMELINEAR | &quot;AssumeLinear&quot;
INVALID | &quot;Invalid&quot;


<a name="InterpolationModeEnum"></a>
## Enum: InterpolationModeEnum
Name | Value
---- | -----
DEFAULT | &quot;Default&quot;
LOW | &quot;Low&quot;
HIGH | &quot;High&quot;
BILINEAR | &quot;Bilinear&quot;
BICUBIC | &quot;Bicubic&quot;
NEARESTNEIGHBOR | &quot;NearestNeighbor&quot;
HIGHQUALITYBILINEAR | &quot;HighQualityBilinear&quot;
HIGHQUALITYBICUBIC | &quot;HighQualityBicubic&quot;
INVALID | &quot;Invalid&quot;


<a name="SmoothingModeEnum"></a>
## Enum: SmoothingModeEnum
Name | Value
---- | -----
DEFAULT | &quot;Default&quot;
HIGHSPEED | &quot;HighSpeed&quot;
HIGHQUALITY | &quot;HighQuality&quot;
NONE | &quot;None&quot;
ANTIALIAS | &quot;AntiAlias&quot;
INVALID | &quot;Invalid&quot;


<a name="TextRenderingHintEnum"></a>
## Enum: TextRenderingHintEnum
Name | Value
---- | -----
SYSTEMDEFAULT | &quot;SystemDefault&quot;
SINGLEBITPERPIXELGRIDFIT | &quot;SingleBitPerPixelGridFit&quot;
SINGLEBITPERPIXEL | &quot;SingleBitPerPixel&quot;
ANTIALIASGRIDFIT | &quot;AntiAliasGridFit&quot;
ANTIALIAS | &quot;AntiAlias&quot;
CLEARTYPEGRIDFIT | &quot;ClearTypeGridFit&quot;



