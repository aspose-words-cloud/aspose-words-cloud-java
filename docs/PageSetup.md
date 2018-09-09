
# PageSetup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | [**WordsApiLink**](WordsApiLink.md) | Link to the document. |  [optional]
**bidi** | **Boolean** | Specifies that this section contains bidirectional (complex scripts) text.              |  [optional]
**borderAlwaysInFront** | **Boolean** | Specifies where the page border is positioned relative to intersecting texts and objects.              |  [optional]
**borderAppliesTo** | [**BorderAppliesToEnum**](#BorderAppliesToEnum) | Specifies which pages the page border is printed on.              |  [optional]
**borderDistanceFrom** | [**BorderDistanceFromEnum**](#BorderDistanceFromEnum) | Gets or sets a value that indicates whether the specified page border is measured from the edge of the page or from the text it surrounds.              |  [optional]
**bottomMargin** | **Double** | Returns or sets the distance (in points) between the bottom edge of the page and the bottom boundary of the body text.              |  [optional]
**differentFirstPageHeaderFooter** | **Boolean** | True if a different header or footer is used on the first page.              |  [optional]
**firstPageTray** | **Integer** | Gets or sets the paper tray (bin) to use for the first page of a section. The value is implementation (printer) specific.              |  [optional]
**footerDistance** | **Double** | Returns or sets the distance (in points) between the footer and the bottom of the page.              |  [optional]
**gutter** | **Double** | Gets or sets the amount of extra space added to the margin for document binding.              |  [optional]
**headerDistance** | **Double** | Returns or sets the distance (in points) between the header and the top of the page.              |  [optional]
**leftMargin** | **Double** | Returns or sets the distance (in points) between the left edge of the page and the left boundary of the body text.              |  [optional]
**lineNumberCountBy** | **Integer** | Returns or sets the numeric increment for line numbers.              |  [optional]
**lineNumberDistanceFromText** | **Double** | Gets or sets distance between the right edge of line numbers and the left edge of the document.              |  [optional]
**lineNumberRestartMode** | [**LineNumberRestartModeEnum**](#LineNumberRestartModeEnum) | Gets or sets the way line numbering runs  that is, whether it starts over at the beginning of a new page or section or runs continuously.              |  [optional]
**lineStartingNumber** | **Integer** | Gets or sets the starting line number.              |  [optional]
**orientation** | [**OrientationEnum**](#OrientationEnum) | Returns or sets the orientation of the page.              |  [optional]
**otherPagesTray** | **Integer** | Gets or sets the paper tray (bin) to be used for all but the first page of a section. The value is implementation (printer) specific.              |  [optional]
**pageHeight** | **Double** | Returns or sets the height of the page in points.              |  [optional]
**pageNumberStyle** | [**PageNumberStyleEnum**](#PageNumberStyleEnum) | Gets or sets the page number format.              |  [optional]
**pageStartingNumber** | **Integer** | Gets or sets the starting page number of the section.              |  [optional]
**pageWidth** | **Double** | Returns or sets the width of the page in points.              |  [optional]
**paperSize** | [**PaperSizeEnum**](#PaperSizeEnum) | Returns or sets the paper size.              |  [optional]
**restartPageNumbering** | **Boolean** | True if page numbering restarts at the beginning of the section.              |  [optional]
**rightMargin** | **Double** | Returns or sets the distance (in points) between the right edge of the page and the right boundary of the body text.              |  [optional]
**rtlGutter** | **Boolean** | Gets or sets whether Microsoft Word uses gutters for the section based on a right-to-left language or a left-to-right language.              |  [optional]
**sectionStart** | [**SectionStartEnum**](#SectionStartEnum) | Returns or sets the type of section break for the specified object.              |  [optional]
**suppressEndnotes** | **Boolean** | True if endnotes are printed at the end of the next section that doesn&#39;t suppress endnotes.                 Suppressed endnotes are printed before the endnotes in that section.              |  [optional]
**topMargin** | **Double** | Returns or sets the distance (in points) between the top edge of the page and the top boundary of the body text.              |  [optional]
**verticalAlignment** | [**VerticalAlignmentEnum**](#VerticalAlignmentEnum) | Returns or sets the vertical alignment of text on each page in a document or section.              |  [optional]


<a name="BorderAppliesToEnum"></a>
## Enum: BorderAppliesToEnum
Name | Value
---- | -----
ALLPAGES | &quot;AllPages&quot;
FIRSTPAGE | &quot;FirstPage&quot;
OTHERPAGES | &quot;OtherPages&quot;


<a name="BorderDistanceFromEnum"></a>
## Enum: BorderDistanceFromEnum
Name | Value
---- | -----
TEXT | &quot;Text&quot;
PAGEEDGE | &quot;PageEdge&quot;


<a name="LineNumberRestartModeEnum"></a>
## Enum: LineNumberRestartModeEnum
Name | Value
---- | -----
RESTARTPAGE | &quot;RestartPage&quot;
RESTARTSECTION | &quot;RestartSection&quot;
CONTINUOUS | &quot;Continuous&quot;


<a name="OrientationEnum"></a>
## Enum: OrientationEnum
Name | Value
---- | -----
PORTRAIT | &quot;Portrait&quot;
LANDSCAPE | &quot;Landscape&quot;


<a name="PageNumberStyleEnum"></a>
## Enum: PageNumberStyleEnum
Name | Value
---- | -----
ARABIC | &quot;Arabic&quot;
UPPERCASEROMAN | &quot;UppercaseRoman&quot;
LOWERCASEROMAN | &quot;LowercaseRoman&quot;
UPPERCASELETTER | &quot;UppercaseLetter&quot;
LOWERCASELETTER | &quot;LowercaseLetter&quot;
ORDINAL | &quot;Ordinal&quot;
NUMBER | &quot;Number&quot;
ORDINALTEXT | &quot;OrdinalText&quot;
HEX | &quot;Hex&quot;
CHICAGOMANUAL | &quot;ChicagoManual&quot;
KANJI | &quot;Kanji&quot;
KANJIDIGIT | &quot;KanjiDigit&quot;
AIUEOHALFWIDTH | &quot;AiueoHalfWidth&quot;
IROHAHALFWIDTH | &quot;IrohaHalfWidth&quot;
ARABICFULLWIDTH | &quot;ArabicFullWidth&quot;
ARABICHALFWIDTH | &quot;ArabicHalfWidth&quot;
KANJITRADITIONAL | &quot;KanjiTraditional&quot;
KANJITRADITIONAL2 | &quot;KanjiTraditional2&quot;
NUMBERINCIRCLE | &quot;NumberInCircle&quot;
DECIMALFULLWIDTH | &quot;DecimalFullWidth&quot;
AIUEO | &quot;Aiueo&quot;
IROHA | &quot;Iroha&quot;
LEADINGZERO | &quot;LeadingZero&quot;
BULLET | &quot;Bullet&quot;
GANADA | &quot;Ganada&quot;
CHOSUNG | &quot;Chosung&quot;
GB1 | &quot;GB1&quot;
GB2 | &quot;GB2&quot;
GB3 | &quot;GB3&quot;
GB4 | &quot;GB4&quot;
ZODIAC1 | &quot;Zodiac1&quot;
ZODIAC2 | &quot;Zodiac2&quot;
ZODIAC3 | &quot;Zodiac3&quot;
TRADCHINNUM1 | &quot;TradChinNum1&quot;
TRADCHINNUM2 | &quot;TradChinNum2&quot;
TRADCHINNUM3 | &quot;TradChinNum3&quot;
TRADCHINNUM4 | &quot;TradChinNum4&quot;
SIMPCHINNUM1 | &quot;SimpChinNum1&quot;
SIMPCHINNUM2 | &quot;SimpChinNum2&quot;
SIMPCHINNUM3 | &quot;SimpChinNum3&quot;
SIMPCHINNUM4 | &quot;SimpChinNum4&quot;
HANJAREAD | &quot;HanjaRead&quot;
HANJAREADDIGIT | &quot;HanjaReadDigit&quot;
HANGUL | &quot;Hangul&quot;
HANJA | &quot;Hanja&quot;
HEBREW1 | &quot;Hebrew1&quot;
ARABIC1 | &quot;Arabic1&quot;
HEBREW2 | &quot;Hebrew2&quot;
ARABIC2 | &quot;Arabic2&quot;
HINDILETTER1 | &quot;HindiLetter1&quot;
HINDILETTER2 | &quot;HindiLetter2&quot;
HINDIARABIC | &quot;HindiArabic&quot;
HINDICARDINALTEXT | &quot;HindiCardinalText&quot;
THAILETTER | &quot;ThaiLetter&quot;
THAIARABIC | &quot;ThaiArabic&quot;
THAICARDINALTEXT | &quot;ThaiCardinalText&quot;
VIETCARDINALTEXT | &quot;VietCardinalText&quot;
NUMBERINDASH | &quot;NumberInDash&quot;
NUMINDASH | &quot;NumInDash&quot;
LOWERCASERUSSIAN | &quot;LowercaseRussian&quot;
UPPERCASERUSSIAN | &quot;UppercaseRussian&quot;
NONE | &quot;None&quot;
CUSTOM | &quot;Custom&quot;


<a name="PaperSizeEnum"></a>
## Enum: PaperSizeEnum
Name | Value
---- | -----
A3 | &quot;A3&quot;
A4 | &quot;A4&quot;
A5 | &quot;A5&quot;
B4 | &quot;B4&quot;
B5 | &quot;B5&quot;
EXECUTIVE | &quot;Executive&quot;
FOLIO | &quot;Folio&quot;
LEDGER | &quot;Ledger&quot;
LEGAL | &quot;Legal&quot;
LETTER | &quot;Letter&quot;
ENVELOPEDL | &quot;EnvelopeDL&quot;
QUARTO | &quot;Quarto&quot;
STATEMENT | &quot;Statement&quot;
TABLOID | &quot;Tabloid&quot;
PAPER10X14 | &quot;Paper10x14&quot;
PAPER11X17 | &quot;Paper11x17&quot;
CUSTOM | &quot;Custom&quot;


<a name="SectionStartEnum"></a>
## Enum: SectionStartEnum
Name | Value
---- | -----
CONTINUOUS | &quot;Continuous&quot;
NEWCOLUMN | &quot;NewColumn&quot;
NEWPAGE | &quot;NewPage&quot;
EVENPAGE | &quot;EvenPage&quot;
ODDPAGE | &quot;OddPage&quot;


<a name="VerticalAlignmentEnum"></a>
## Enum: VerticalAlignmentEnum
Name | Value
---- | -----
TOP | &quot;Top&quot;
CENTER | &quot;Center&quot;
JUSTIFY | &quot;Justify&quot;
BOTTOM | &quot;Bottom&quot;



