ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DrawingObjectInsert requestDrawingObject = new DrawingObjectInsert();
requestDrawingObject.setHeight((double)0);
requestDrawingObject.setLeft((double)0);
requestDrawingObject.setTop((double)0);
requestDrawingObject.setWidth((double)0);
requestDrawingObject.setRelativeHorizontalPosition(DrawingObjectInsert.RelativeHorizontalPositionEnum.MARGIN);
requestDrawingObject.setRelativeVerticalPosition(DrawingObjectInsert.RelativeVerticalPositionEnum.MARGIN);
requestDrawingObject.setWrapType(DrawingObjectInsert.WrapTypeEnum.INLINE);

byte[] requestImageFile = Files.readAllBytes(Paths.get("Common/aspose-cloud.png").toAbsolutePath());
InsertDrawingObjectRequest insertRequest = new InsertDrawingObjectRequest("Sample.docx", requestDrawingObject, requestImageFile, null, null, null, null, null, null, null, null);
wordsApi.insertDrawingObject(insertRequest);