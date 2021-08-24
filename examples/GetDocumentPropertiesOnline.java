ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetDocumentPropertiesOnlineRequest request = new GetDocumentPropertiesOnlineRequest(requestDocument, null, null);
wordsApi.getDocumentPropertiesOnline(request);