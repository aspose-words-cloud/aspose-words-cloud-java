ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteParagraphRequest deleteRequest = new DeleteParagraphRequest("Sample.docx", 0, null, null, null, null, null, null, null, null);
wordsApi.deleteParagraph(deleteRequest);