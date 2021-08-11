ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetRunsRequest requestRequest = new GetRunsRequest("Sample.docx","sections/0/paragraphs/0",null,null,null,null);
wordsApi.getRuns(requestRequest);