String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
WatermarkText requestWatermarkText = new WatermarkText();
requestWatermarkText.setText("This is the text");
requestWatermarkText.setRotationAngle((double)90);

InsertWatermarkTextOnlineRequest insertRequestRequest = new InsertWatermarkTextOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestWatermarkText,null,null,null,null,null);
wordsApi.insertWatermarkTextOnline(insertRequestRequest);