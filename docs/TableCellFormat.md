
# TableCellFormat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | [**WordsApiLink**](WordsApiLink.md) | Link to the document. |  [optional]
**bottomPadding** | **Double** | Returns or sets the amount of space (in points) to add below the contents of cell. |  [optional]
**fitText** | **Boolean** | If true, fits text in the cell, compressing each paragraph to the width of the cell. |  [optional]
**horizontalMerge** | [**HorizontalMergeEnum**](#HorizontalMergeEnum) | Specifies how the cell is merged horizontally with other cells in the row. |  [optional]
**leftPadding** | **Double** | Returns or sets the amount of space (in points) to add to the left of the contents of cell. |  [optional]
**orientation** | [**OrientationEnum**](#OrientationEnum) | Returns or sets the orientation of text in a table cell. |  [optional]
**preferredWidth** | [**PreferredWidth**](PreferredWidth.md) | Returns or sets the preferred width of the cell. |  [optional]
**rightPadding** | **Double** | Returns or sets the amount of space (in points) to add to the right of the contents of cell. |  [optional]
**topPadding** | **Double** | Returns or sets the amount of space (in points) to add above the contents of cell. |  [optional]
**verticalAlignment** | [**VerticalAlignmentEnum**](#VerticalAlignmentEnum) | Returns or sets the vertical alignment of text in the cell. |  [optional]
**verticalMerge** | [**VerticalMergeEnum**](#VerticalMergeEnum) | Specifies how the cell is merged with other cells vertically. |  [optional]
**width** | **Double** | Gets the width of the cell in points. |  [optional]
**wrapText** | **Boolean** | If true, wrap text for the cell. |  [optional]


<a name="HorizontalMergeEnum"></a>
## Enum: HorizontalMergeEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
FIRST | &quot;First&quot;
PREVIOUS | &quot;Previous&quot;


<a name="OrientationEnum"></a>
## Enum: OrientationEnum
Name | Value
---- | -----
HORIZONTAL | &quot;Horizontal&quot;
DOWNWARD | &quot;Downward&quot;
UPWARD | &quot;Upward&quot;
HORIZONTALROTATEDFAREAST | &quot;HorizontalRotatedFarEast&quot;
VERTICALFAREAST | &quot;VerticalFarEast&quot;
VERTICALROTATEDFAREAST | &quot;VerticalRotatedFarEast&quot;


<a name="VerticalAlignmentEnum"></a>
## Enum: VerticalAlignmentEnum
Name | Value
---- | -----
TOP | &quot;Top&quot;
CENTER | &quot;Center&quot;
BOTTOM | &quot;Bottom&quot;


<a name="VerticalMergeEnum"></a>
## Enum: VerticalMergeEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
FIRST | &quot;First&quot;
PREVIOUS | &quot;Previous&quot;



