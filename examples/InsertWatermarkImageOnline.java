ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
byte[] requestImageFile = Files.readAllBytes(Paths.get("Common/aspose-cloud.png").toAbsolutePath());
InsertWatermarkImageOnlineRequest insertRequest = new InsertWatermarkImageOnlineRequest(requestDocument, requestImageFile, null, null, null, null, null, null, null);
wordsApi.insertWatermarkImageOnline(insertRequest);