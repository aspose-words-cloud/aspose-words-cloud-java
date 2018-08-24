
# FormFieldTextInput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | [**WordsApiLink**](WordsApiLink.md) | Link to the document. |  [optional]
**nodeId** | **String** | Node id |  [optional]
**calculateOnExit** | **Boolean** | True if references to the specified form field are automatically updated whenever the field is exited. |  [optional]
**enabled** | **Boolean** | True if a form field is enabled. |  [optional]
**entryMacro** | **String** | Returns or sets an entry macro name for the form field. |  [optional]
**exitMacro** | **String** | Returns or sets an exit macro name for the form field. |  [optional]
**helpText** | **String** | Returns or sets the text that&#39;s displayed in a message box when the form field has the focus and the user presses F1. |  [optional]
**name** | **String** | Gets or sets the form field name. |  [optional]
**ownHelp** | **Boolean** | Specifies the source of the text that&#39;s displayed in a message box when a form field has the focus and the user presses F1. |  [optional]
**ownStatus** | **Boolean** | Specifies the source of the text that&#39;s displayed in the status bar when a form field has the focus. |  [optional]
**statusText** | **String** | Returns or sets the text that&#39;s displayed in the status bar when a form field has the focus. |  [optional]
**maxLength** | **Integer** | Maximum length for the text field. Zero when the length is not limited. |  [optional]
**textInputDefault** | **String** | Gets or sets the default string or a calculation expression of a text form field.  |  [optional]
**textInputFormat** | **String** | Returns or sets the text formatting for a text form field. |  [optional]
**textInputType** | [**TextInputTypeEnum**](#TextInputTypeEnum) | Gets or sets the type of a text form field. |  [optional]


<a name="TextInputTypeEnum"></a>
## Enum: TextInputTypeEnum
Name | Value
---- | -----
REGULAR | &quot;Regular&quot;
NUMBER | &quot;Number&quot;
DATE | &quot;Date&quot;
CURRENTDATE | &quot;CurrentDate&quot;
CURRENTTIME | &quot;CurrentTime&quot;
CALCULATED | &quot;Calculated&quot;



