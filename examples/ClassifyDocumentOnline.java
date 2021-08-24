ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
ClassifyDocumentOnlineRequest classifyRequest = new ClassifyDocumentOnlineRequest(requestDocument, null, null, "3", null);
wordsApi.classifyDocumentOnline(classifyRequest);