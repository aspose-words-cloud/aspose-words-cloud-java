String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
StyleInsert requestStyleInsert = new StyleInsert();
requestStyleInsert.setStyleName("My Style");
requestStyleInsert.setStyleType(StyleInsert.StyleTypeEnum.PARAGRAPH);

InsertStyleOnlineRequest insertRequestRequest = new InsertStyleOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestStyleInsert,null,null,null,null,null);
wordsApi.insertStyleOnline(insertRequestRequest);