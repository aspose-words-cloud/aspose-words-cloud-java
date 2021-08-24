ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ProtectionRequest requestProtectionRequest = new ProtectionRequest();
requestProtectionRequest.setPassword("123");
requestProtectionRequest.setProtectionType("ReadOnly");

ProtectDocumentRequest protectRequest = new ProtectDocumentRequest("Sample.docx", requestProtectionRequest, null, null, null, null, null);
wordsApi.protectDocument(protectRequest);