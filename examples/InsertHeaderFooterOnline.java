String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
InsertHeaderFooterOnlineRequest insertRequestRequest = new InsertHeaderFooterOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath()),"","FooterEven",null,null,null,null,null);
wordsApi.insertHeaderFooterOnline(insertRequestRequest);