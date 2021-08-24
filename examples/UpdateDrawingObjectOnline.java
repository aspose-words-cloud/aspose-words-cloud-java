ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
DrawingObjectUpdate requestDrawingObject = new DrawingObjectUpdate();
requestDrawingObject.setLeft((double)0);

byte[] requestImageFile = Files.readAllBytes(Paths.get("Common/aspose-cloud.png").toAbsolutePath());
UpdateDrawingObjectOnlineRequest updateRequest = new UpdateDrawingObjectOnlineRequest(requestDocument, requestDrawingObject, requestImageFile, 0, null, null, null, null, null, null);
wordsApi.updateDrawingObjectOnline(updateRequest);