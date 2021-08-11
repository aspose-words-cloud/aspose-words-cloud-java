String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";

InsertWatermarkImageRequest insertRequestRequest = new InsertWatermarkImageRequest(remoteFileName,null,null,null,null,null,remoteFileName,null,null,null,"Sample.png");
wordsApi.insertWatermarkImage(insertRequestRequest);