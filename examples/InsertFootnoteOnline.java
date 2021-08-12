String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
FootnoteInsert requestFootnoteDto = new FootnoteInsert();
requestFootnoteDto.setFootnoteType(FootnoteInsert.FootnoteTypeEnum.ENDNOTE);
requestFootnoteDto.setText("test endnote");

InsertFootnoteOnlineRequest insertRequestRequest = new InsertFootnoteOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath()),requestFootnoteDto,null,null,null,null,null,null);
wordsApi.insertFootnoteOnline(insertRequestRequest);