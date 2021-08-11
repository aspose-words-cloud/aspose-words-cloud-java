ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
StyleInsert requestStyleInsert = new StyleInsert();
requestStyleInsert.setStyleName("My Style");
requestStyleInsert.setStyleType(StyleInsert.StyleTypeEnum.PARAGRAPH);

InsertStyleRequest insertRequestRequest = new InsertStyleRequest("Sample.docx",requestStyleInsert,null,null,null,null,null,null,null);
wordsApi.insertStyle(insertRequestRequest);