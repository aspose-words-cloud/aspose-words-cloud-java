ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetHeaderFooterOfSectionRequest request = new GetHeaderFooterOfSectionRequest("Sample.docx", 0, 0, null, null, null, null, null);
wordsApi.getHeaderFooterOfSection(request);