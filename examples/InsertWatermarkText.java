ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";

WatermarkText requestWatermarkText = new WatermarkText();
requestWatermarkText.setText("This is the text");
requestWatermarkText.setRotationAngle((double)90.0);

InsertWatermarkTextRequest insertRequestRequest = new InsertWatermarkTextRequest(remoteFileName,requestWatermarkText,null,null,null,null,remoteFileName,null,null);
wordsApi.insertWatermarkText(insertRequestRequest);