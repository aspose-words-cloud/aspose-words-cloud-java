String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
RenderDrawingObjectOnlineRequest renderRequestRequest = new RenderDrawingObjectOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"png",0,"sections/0",null,null,null,null);
wordsApi.renderDrawingObjectOnline(renderRequestRequest);