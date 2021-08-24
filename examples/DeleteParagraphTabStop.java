ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteParagraphTabStopRequest deleteRequest = new DeleteParagraphTabStopRequest("Sample.docx", (double)72.0, 0, null, null, null, null, null, null);
wordsApi.deleteParagraphTabStop(deleteRequest);