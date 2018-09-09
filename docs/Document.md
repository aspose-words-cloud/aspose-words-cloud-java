
# Document

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**List&lt;Link&gt;**](Link.md) | A list of links that originate from this document. |  [optional]
**fileName** | **String** | Gets the name of the file. |  [optional]
**sourceFormat** | [**SourceFormatEnum**](#SourceFormatEnum) | Gets the original format of the document. | 
**isEncrypted** | **Boolean** | Returns true if the document is encrypted and requires a password to open.  | 
**isSigned** | **Boolean** | Returns true if the document contains a digital signature. This property merely informs that a  digital signature is present on a document, but it does not specify whether the signature is valid or not.  | 
**documentProperties** | [**DocumentProperties**](DocumentProperties.md) | Returns document properties. |  [optional]


<a name="SourceFormatEnum"></a>
## Enum: SourceFormatEnum
Name | Value
---- | -----
UNKNOWN | &quot;Unknown&quot;
DOC | &quot;Doc&quot;
DOT | &quot;Dot&quot;
DOCPREWORD60 | &quot;DocPreWord60&quot;
DOCX | &quot;Docx&quot;
DOCM | &quot;Docm&quot;
DOTX | &quot;Dotx&quot;
DOTM | &quot;Dotm&quot;
FLATOPC | &quot;FlatOpc&quot;
RTF | &quot;Rtf&quot;
WORDML | &quot;WordML&quot;
HTML | &quot;Html&quot;
MHTML | &quot;Mhtml&quot;
EPUB | &quot;Epub&quot;
TEXT | &quot;Text&quot;
ODT | &quot;Odt&quot;
OTT | &quot;Ott&quot;
PDF | &quot;Pdf&quot;
XPS | &quot;Xps&quot;
TIFF | &quot;Tiff&quot;
SVG | &quot;Svg&quot;



