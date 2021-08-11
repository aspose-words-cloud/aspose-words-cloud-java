ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";

DeleteWatermarkRequest deleteRequestRequest = new DeleteWatermarkRequest(remoteFileName,null,null,null,null,remoteFileName,null,null);
wordsApi.deleteWatermark(deleteRequestRequest);