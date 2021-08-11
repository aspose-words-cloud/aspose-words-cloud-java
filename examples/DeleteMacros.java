ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteMacrosRequest deleteRequestRequest = new DeleteMacrosRequest("Sample.docx",null,null,null,null,null,null,null);
wordsApi.deleteMacros(deleteRequestRequest);