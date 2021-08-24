ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetHeaderFooterRequest request = new GetHeaderFooterRequest("Sample.docx", 0, null, null, null, null, null);
wordsApi.getHeaderFooter(request);