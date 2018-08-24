
# TableRowFormat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | [**WordsApiLink**](WordsApiLink.md) | Link to the document. |  [optional]
**allowBreakAcrossPages** | **Boolean** | True if the text in a table row is allowed to split across a page break. |  [optional]
**headingFormat** | **Boolean** | True if the row is repeated as a table heading on every page when the table spans more than one page. |  [optional]
**height** | **Double** | Gets or sets the height of the table row in points. |  [optional]
**heightRule** | [**HeightRuleEnum**](#HeightRuleEnum) | Gets or sets the rule for determining the height of the table row. |  [optional]


<a name="HeightRuleEnum"></a>
## Enum: HeightRuleEnum
Name | Value
---- | -----
ATLEAST | &quot;AtLeast&quot;
EXACTLY | &quot;Exactly&quot;
AUTO | &quot;Auto&quot;



