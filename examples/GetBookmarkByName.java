ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetBookmarkByNameRequest requestRequest = new GetBookmarkByNameRequest("Sample.docx","aspose",null,null,null,null);
wordsApi.getBookmarkByName(requestRequest);