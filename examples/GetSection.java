ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetSectionRequest request = new GetSectionRequest("Sample.docx", 0, null, null, null, null);
wordsApi.getSection(request);