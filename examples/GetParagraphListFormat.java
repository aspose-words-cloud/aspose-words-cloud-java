ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetParagraphListFormatRequest request = new GetParagraphListFormatRequest("Sample.docx", 0, null, null, null, null, null);
wordsApi.getParagraphListFormat(request);