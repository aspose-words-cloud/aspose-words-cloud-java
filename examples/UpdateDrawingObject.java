ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DrawingObjectUpdate requestDrawingObject = new DrawingObjectUpdate();
requestDrawingObject.setLeft((double)0);

byte[] requestImageFile = Files.readAllBytes(Paths.get("Common/aspose-cloud.png").toAbsolutePath());
UpdateDrawingObjectRequest updateRequest = new UpdateDrawingObjectRequest("Sample.docx", requestDrawingObject, requestImageFile, 0, null, null, null, null, null, null, null, null);
wordsApi.updateDrawingObject(updateRequest);