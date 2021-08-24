ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteAllParagraphTabStopsRequest deleteRequest = new DeleteAllParagraphTabStopsRequest("Sample.docx", 0, null, null, null, null, null, null);
wordsApi.deleteAllParagraphTabStops(deleteRequest);