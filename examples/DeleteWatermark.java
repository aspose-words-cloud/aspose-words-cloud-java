ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteWatermarkRequest deleteRequestRequest = new DeleteWatermarkRequest("Sample.docx",null,null,null,null,null,null,null);
wordsApi.deleteWatermark(deleteRequestRequest);