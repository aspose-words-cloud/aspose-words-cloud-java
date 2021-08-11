ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetOfficeMathObjectRequest requestRequest = new GetOfficeMathObjectRequest("Sample.docx",0,null,null,null,null,null);
wordsApi.getOfficeMathObject(requestRequest);