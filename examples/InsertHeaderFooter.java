ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
InsertHeaderFooterRequest insertRequest = new InsertHeaderFooterRequest("Sample.docx", "", "FooterEven", null, null, null, null, null, null, null);
wordsApi.insertHeaderFooter(insertRequest);