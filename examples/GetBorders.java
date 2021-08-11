ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetBordersRequest requestRequest = new GetBordersRequest("Sample.docx","tables/1/rows/0/cells/0",null,null,null,null);
wordsApi.getBorders(requestRequest);