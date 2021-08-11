ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetStyleRequest requestRequest = new GetStyleRequest("Sample.docx","Heading 1",null,null,null,null);
wordsApi.getStyle(requestRequest);