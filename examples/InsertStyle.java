ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
StyleInsert requestStyleInsert = new StyleInsert();
requestStyleInsert.setStyleName("My Style");
requestStyleInsert.setStyleType(StyleInsert.StyleTypeEnum.PARAGRAPH);

InsertStyleRequest insertRequest = new InsertStyleRequest("Sample.docx", requestStyleInsert, null, null, null, null, null, null, null);
wordsApi.insertStyle(insertRequest);