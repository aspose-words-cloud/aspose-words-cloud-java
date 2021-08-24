ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetOfficeMathObjectsRequest request = new GetOfficeMathObjectsRequest("Sample.docx", null, null, null, null, null);
wordsApi.getOfficeMathObjects(request);