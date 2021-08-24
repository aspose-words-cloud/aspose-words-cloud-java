ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetDocumentProtectionOnlineRequest request = new GetDocumentProtectionOnlineRequest(requestDocument, null, null);
wordsApi.getDocumentProtectionOnline(request);