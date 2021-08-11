ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetFootnoteRequest requestRequest = new GetFootnoteRequest("Sample.docx",0,null,null,null,null,null);
wordsApi.getFootnote(requestRequest);