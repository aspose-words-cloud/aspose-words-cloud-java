ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetHeaderFootersRequest request = new GetHeaderFootersRequest("Sample.docx", "", null, null, null, null, null);
wordsApi.getHeaderFooters(request);