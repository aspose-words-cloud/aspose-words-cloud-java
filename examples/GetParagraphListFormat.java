ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetParagraphListFormatRequest requestRequest = new GetParagraphListFormatRequest("Sample.docx",0,null,null,null,null,null);
wordsApi.getParagraphListFormat(requestRequest);