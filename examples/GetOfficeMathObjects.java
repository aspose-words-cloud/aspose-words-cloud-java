ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetOfficeMathObjectsRequest requestRequest = new GetOfficeMathObjectsRequest("Sample.docx",null,null,null,null,null);
wordsApi.getOfficeMathObjects(requestRequest);