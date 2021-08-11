ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteBorderRequest deleteRequestRequest = new DeleteBorderRequest("Sample.docx","left","tables/1/rows/0/cells/0",null,null,null,null,null,null,null);
wordsApi.deleteBorder(deleteRequestRequest);