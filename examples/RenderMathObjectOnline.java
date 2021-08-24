ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
RenderMathObjectOnlineRequest renderRequest = new RenderMathObjectOnlineRequest(requestDocument, "png", 0, null, null, null, null, null);
wordsApi.renderMathObjectOnline(renderRequest);