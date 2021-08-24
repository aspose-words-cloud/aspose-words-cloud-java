ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
RenderPageOnlineRequest renderRequest = new RenderPageOnlineRequest(requestDocument, 1, "bmp", null, null, null);
wordsApi.renderPageOnline(renderRequest);