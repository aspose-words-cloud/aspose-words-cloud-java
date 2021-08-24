ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteOfficeMathObjectRequest deleteRequest = new DeleteOfficeMathObjectRequest("Sample.docx", 0, null, null, null, null, null, null, null, null);
wordsApi.deleteOfficeMathObject(deleteRequest);