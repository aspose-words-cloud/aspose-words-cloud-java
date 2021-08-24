ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetBookmarkByNameRequest request = new GetBookmarkByNameRequest("Sample.docx", "aspose", null, null, null, null);
wordsApi.getBookmarkByName(request);