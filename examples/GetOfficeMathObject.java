ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetOfficeMathObjectRequest request = new GetOfficeMathObjectRequest("Sample.docx", 0, null, null, null, null, null);
wordsApi.getOfficeMathObject(request);