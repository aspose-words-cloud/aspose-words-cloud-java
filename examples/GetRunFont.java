ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetRunFontRequest request = new GetRunFontRequest("Sample.docx", "paragraphs/0", 0, null, null, null, null);
wordsApi.getRunFont(request);