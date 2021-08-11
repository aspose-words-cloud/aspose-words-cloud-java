ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
FootnoteInsert requestFootnoteDto = new FootnoteInsert();
requestFootnoteDto.setFootnoteType(FootnoteInsert.FootnoteTypeEnum.ENDNOTE);
requestFootnoteDto.setText("test endnote");

InsertFootnoteRequest insertRequestRequest = new InsertFootnoteRequest("Sample.docx",requestFootnoteDto,null,null,null,null,null,null,null,null);
wordsApi.insertFootnote(insertRequestRequest);