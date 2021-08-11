ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetBookmarksRequest requestRequest = new GetBookmarksRequest("Sample.docx",null,null,null,null);
wordsApi.getBookmarks(requestRequest);