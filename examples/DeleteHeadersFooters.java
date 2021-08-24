ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteHeadersFootersRequest deleteRequest = new DeleteHeadersFootersRequest("Sample.docx", "", null, null, null, null, null, null, null, null);
wordsApi.deleteHeadersFooters(deleteRequest);