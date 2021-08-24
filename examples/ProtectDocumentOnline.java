ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
ProtectionRequest requestProtectionRequest = new ProtectionRequest();
requestProtectionRequest.setNewPassword("123");

ProtectDocumentOnlineRequest protectRequest = new ProtectDocumentOnlineRequest(requestDocument, requestProtectionRequest, null, null, null);
wordsApi.protectDocumentOnline(protectRequest);