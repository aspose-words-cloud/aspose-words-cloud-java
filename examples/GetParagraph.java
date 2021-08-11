ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetParagraphRequest requestRequest = new GetParagraphRequest("Sample.docx",0,null,null,null,null,null);
wordsApi.getParagraph(requestRequest);