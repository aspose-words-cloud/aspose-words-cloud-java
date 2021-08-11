String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
RenderParagraphOnlineRequest renderRequestRequest = new RenderParagraphOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"png",0,"",null,null,null,null);
wordsApi.renderParagraphOnline(renderRequestRequest);