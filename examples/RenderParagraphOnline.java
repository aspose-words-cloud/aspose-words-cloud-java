ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
RenderParagraphOnlineRequest renderRequest = new RenderParagraphOnlineRequest(requestDocument, "png", 0, null, null, null, null, null);
wordsApi.renderParagraphOnline(renderRequest);