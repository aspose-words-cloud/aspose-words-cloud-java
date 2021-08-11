ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteAllParagraphTabStopsRequest deleteRequestRequest = new DeleteAllParagraphTabStopsRequest("Sample.docx",0,null,null,null,null,null,null);
wordsApi.deleteAllParagraphTabStops(deleteRequestRequest);