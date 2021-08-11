ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetParagraphsRequest requestRequest = new GetParagraphsRequest("Sample.docx",null,null,null,null,null);
wordsApi.getParagraphs(requestRequest);