ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
RenderDrawingObjectOnlineRequest renderRequest = new RenderDrawingObjectOnlineRequest(requestDocument, "png", 0, "sections/0", null, null, null, null);
wordsApi.renderDrawingObjectOnline(renderRequest);