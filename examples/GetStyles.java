ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetStylesRequest requestRequest = new GetStylesRequest("Sample.docx",null,null,null,null);
wordsApi.getStyles(requestRequest);