ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
StyleInsert requestStyleInsert = new StyleInsert();
requestStyleInsert.setStyleName("My Style");
requestStyleInsert.setStyleType(StyleInsert.StyleTypeEnum.PARAGRAPH);

InsertStyleOnlineRequest insertRequest = new InsertStyleOnlineRequest(requestDocument, requestStyleInsert, null, null, null, null, null);
wordsApi.insertStyleOnline(insertRequest);