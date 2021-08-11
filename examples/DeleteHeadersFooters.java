ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteHeadersFootersRequest deleteRequestRequest = new DeleteHeadersFootersRequest("Sample.docx","",null,null,null,null,null,null,null,null);
wordsApi.deleteHeadersFooters(deleteRequestRequest);