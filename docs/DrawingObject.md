
# DrawingObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | [**WordsApiLink**](WordsApiLink.md) | Link to the document. |  [optional]
**nodeId** | **String** | Node id |  [optional]
**height** | **Double** | Height of the drawing object in points. |  [optional]
**imageDataLink** | [**WordsApiLink**](WordsApiLink.md) | Link to image data. Can be null if shape does not have an image. |  [optional]
**left** | **Double** | Distance in points from the origin to the left side of the image.              |  [optional]
**oleDataLink** | [**WordsApiLink**](WordsApiLink.md) | Link to ole object. Can be null if shape does not have ole data. |  [optional]
**relativeHorizontalPosition** | [**RelativeHorizontalPositionEnum**](#RelativeHorizontalPositionEnum) | Specifies where the distance to the image is measured from.              |  [optional]
**relativeVerticalPosition** | [**RelativeVerticalPositionEnum**](#RelativeVerticalPositionEnum) | Specifies where the distance to the image measured from. |  [optional]
**renderLinks** | [**List&lt;WordsApiLink&gt;**](WordsApiLink.md) | A list of links that originate from this . |  [optional]
**top** | **Double** | Distance in points from the origin to the top side of the image. |  [optional]
**width** | **Double** | Width of the drawing objects in points. |  [optional]
**wrapType** | [**WrapTypeEnum**](#WrapTypeEnum) | Specifies how to wrap text around the image. |  [optional]


<a name="RelativeHorizontalPositionEnum"></a>
## Enum: RelativeHorizontalPositionEnum
Name | Value
---- | -----
MARGIN | &quot;Margin&quot;
PAGE | &quot;Page&quot;
COLUMN | &quot;Column&quot;
DEFAULT | &quot;Default&quot;
CHARACTER | &quot;Character&quot;
LEFTMARGIN | &quot;LeftMargin&quot;
RIGHTMARGIN | &quot;RightMargin&quot;
INSIDEMARGIN | &quot;InsideMargin&quot;
OUTSIDEMARGIN | &quot;OutsideMargin&quot;


<a name="RelativeVerticalPositionEnum"></a>
## Enum: RelativeVerticalPositionEnum
Name | Value
---- | -----
MARGIN | &quot;Margin&quot;
TABLEDEFAULT | &quot;TableDefault&quot;
PAGE | &quot;Page&quot;
PARAGRAPH | &quot;Paragraph&quot;
TEXTFRAMEDEFAULT | &quot;TextFrameDefault&quot;
LINE | &quot;Line&quot;
TOPMARGIN | &quot;TopMargin&quot;
BOTTOMMARGIN | &quot;BottomMargin&quot;
INSIDEMARGIN | &quot;InsideMargin&quot;
OUTSIDEMARGIN | &quot;OutsideMargin&quot;


<a name="WrapTypeEnum"></a>
## Enum: WrapTypeEnum
Name | Value
---- | -----
INLINE | &quot;Inline&quot;
TOPBOTTOM | &quot;TopBottom&quot;
SQUARE | &quot;Square&quot;
NONE | &quot;None&quot;
TIGHT | &quot;Tight&quot;
THROUGH | &quot;Through&quot;



