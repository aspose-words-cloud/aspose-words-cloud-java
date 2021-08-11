String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DrawingObjectUpdate requestDrawingObject = new DrawingObjectUpdate();
requestDrawingObject.setLeft((double)0);

UpdateDrawingObjectRequest updateRequestRequest = new UpdateDrawingObjectRequest("Sample.docx",requestDrawingObject,Files.readAllBytes(Paths.get(documentsDir, "Common/aspose-cloud.png").toAbsolutePath()),0,null,null,null,null,null,null,null,null);
wordsApi.updateDrawingObject(updateRequestRequest);