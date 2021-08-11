String documentsDir = "...";
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

InsertDrawingObjectOnlineRequest insertRequestRequest = new InsertDrawingObjectOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestDrawingObject,Files.readAllBytes(Paths.get(documentsDir, "Common/aspose-cloud.png").toAbsolutePath()),"",null,null,null,null,null);
wordsApi.insertDrawingObjectOnline(insertRequestRequest);