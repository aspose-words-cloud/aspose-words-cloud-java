ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
FootnoteInsert requestFootnoteDto = new FootnoteInsert();
requestFootnoteDto.setFootnoteType(FootnoteInsert.FootnoteTypeEnum.ENDNOTE);
requestFootnoteDto.setText("test endnote");

InsertFootnoteOnlineRequest insertRequest = new InsertFootnoteOnlineRequest(requestDocument, requestFootnoteDto, null, null, null, null, null, null);
wordsApi.insertFootnoteOnline(insertRequest);