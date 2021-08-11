ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetHeaderFootersRequest requestRequest = new GetHeaderFootersRequest("Sample.docx","",null,null,null,null,null);
wordsApi.getHeaderFooters(requestRequest);