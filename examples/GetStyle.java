ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetStyleRequest request = new GetStyleRequest("Sample.docx", "Heading 1", null, null, null, null);
wordsApi.getStyle(request);