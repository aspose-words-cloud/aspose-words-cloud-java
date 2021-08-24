ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
WatermarkText requestWatermarkText = new WatermarkText();
requestWatermarkText.setText("This is the text");
requestWatermarkText.setRotationAngle((double)90);

InsertWatermarkTextOnlineRequest insertRequest = new InsertWatermarkTextOnlineRequest(requestDocument, requestWatermarkText, null, null, null, null, null);
wordsApi.insertWatermarkTextOnline(insertRequest);