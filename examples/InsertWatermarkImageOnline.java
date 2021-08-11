String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
InsertWatermarkImageOnlineRequest insertRequestRequest = new InsertWatermarkImageOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),Files.readAllBytes(Paths.get(documentsDir, "Common/aspose-cloud.png").toAbsolutePath()),null,null,null,null,null,null,null);
wordsApi.insertWatermarkImageOnline(insertRequestRequest);