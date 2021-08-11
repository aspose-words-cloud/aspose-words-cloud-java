ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteDrawingObjectRequest deleteRequestRequest = new DeleteDrawingObjectRequest("Sample.docx",0,null,null,null,null,null,null,null,null);
wordsApi.deleteDrawingObject(deleteRequestRequest);