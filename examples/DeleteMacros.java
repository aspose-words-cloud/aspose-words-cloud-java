ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteMacrosRequest deleteRequest = new DeleteMacrosRequest("Sample.docx", null, null, null, null, null, null, null);
wordsApi.deleteMacros(deleteRequest);