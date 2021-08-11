String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ProtectionRequest requestProtectionRequest = new ProtectionRequest();
requestProtectionRequest.setNewPassword("123");

ProtectDocumentOnlineRequest protectRequestRequest = new ProtectDocumentOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestProtectionRequest,null,null,null);
wordsApi.protectDocumentOnline(protectRequestRequest);