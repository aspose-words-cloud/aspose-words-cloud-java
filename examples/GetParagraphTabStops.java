ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetParagraphTabStopsRequest requestRequest = new GetParagraphTabStopsRequest("Sample.docx",0,null,null,null,null,null);
wordsApi.getParagraphTabStops(requestRequest);