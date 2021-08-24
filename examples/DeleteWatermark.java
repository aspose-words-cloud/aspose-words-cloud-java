ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteWatermarkRequest deleteRequest = new DeleteWatermarkRequest("Sample.docx", null, null, null, null, null, null, null);
wordsApi.deleteWatermark(deleteRequest);