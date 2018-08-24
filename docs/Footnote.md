
# Footnote

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | [**WordsApiLink**](WordsApiLink.md) | Link to the document. |  [optional]
**nodeId** | **String** | Node id |  [optional]
**content** | [**StoryChildNodes**](StoryChildNodes.md) | Content of footnote. |  [optional]
**footnoteType** | [**FootnoteTypeEnum**](#FootnoteTypeEnum) | Returns a value that specifies whether this is a footnote or endnote. |  [optional]
**position** | [**DocumentPosition**](DocumentPosition.md) | Link to comment range start node. |  [optional]
**referenceMark** | **String** | Gets/sets custom reference mark to be used for this footnote. Default value is , meaning auto-numbered footnotes are used. |  [optional]
**text** | **String** | This is a convenience property that allows to easily get or set text of the footnote. |  [optional]


<a name="FootnoteTypeEnum"></a>
## Enum: FootnoteTypeEnum
Name | Value
---- | -----
FOOTNOTE | &quot;Footnote&quot;
ENDNOTE | &quot;Endnote&quot;



