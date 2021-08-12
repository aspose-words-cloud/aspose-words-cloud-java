String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
RenderPageOnlineRequest renderRequestRequest = new RenderPageOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),1,"bmp",null,null,null);
wordsApi.renderPageOnline(renderRequestRequest);