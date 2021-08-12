String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
InsertWatermarkImageRequest insertRequestRequest = new InsertWatermarkImageRequest("Sample.docx",null,null,null,null,null,null,null,null,null,"Sample.png");
wordsApi.insertWatermarkImage(insertRequestRequest);