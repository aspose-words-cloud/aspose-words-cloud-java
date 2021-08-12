ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ProtectionRequest requestProtectionRequest = new ProtectionRequest();
requestProtectionRequest.setPassword("123");
requestProtectionRequest.setProtectionType("ReadOnly");

ProtectDocumentRequest protectRequestRequest = new ProtectDocumentRequest("Sample.docx",requestProtectionRequest,null,null,null,null,null);
wordsApi.protectDocument(protectRequestRequest);