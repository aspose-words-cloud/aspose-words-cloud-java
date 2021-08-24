ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetBookmarksRequest request = new GetBookmarksRequest("Sample.docx", null, null, null, null);
wordsApi.getBookmarks(request);