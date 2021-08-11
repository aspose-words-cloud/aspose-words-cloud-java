ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetParagraphFormatRequest requestRequest = new GetParagraphFormatRequest("Sample.docx",0,null,null,null,null,null);
wordsApi.getParagraphFormat(requestRequest);