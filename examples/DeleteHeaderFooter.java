ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteHeaderFooterRequest deleteRequest = new DeleteHeaderFooterRequest("Sample.docx", "", 0, null, null, null, null, null, null, null);
wordsApi.deleteHeaderFooter(deleteRequest);