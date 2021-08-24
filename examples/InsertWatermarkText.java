ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
WatermarkText requestWatermarkText = new WatermarkText();
requestWatermarkText.setText("This is the text");
requestWatermarkText.setRotationAngle((double)90.0);

InsertWatermarkTextRequest insertRequest = new InsertWatermarkTextRequest("Sample.docx", requestWatermarkText, null, null, null, null, null, null, null);
wordsApi.insertWatermarkText(insertRequest);