ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetDocumentPropertyOnlineRequest request = new GetDocumentPropertyOnlineRequest(requestDocument, "Author", null, null);
wordsApi.getDocumentPropertyOnline(request);