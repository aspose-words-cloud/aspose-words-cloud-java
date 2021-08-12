String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
RenderMathObjectOnlineRequest renderRequestRequest = new RenderMathObjectOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"png",0,null,null,null,null,null);
wordsApi.renderMathObjectOnline(renderRequestRequest);