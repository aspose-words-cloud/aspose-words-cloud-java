ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
SearchRequest searchRequestRequest = new SearchRequest("Sample.docx","aspose",null,null,null,null);
wordsApi.search(searchRequestRequest);