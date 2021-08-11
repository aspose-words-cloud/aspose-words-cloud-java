ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";

ProtectionRequest requestProtectionRequest = new ProtectionRequest();
requestProtectionRequest.setPassword("123");
requestProtectionRequest.setProtectionType("ReadOnly");

ProtectDocumentRequest protectRequestRequest = new ProtectDocumentRequest(remoteFileName,requestProtectionRequest,null,null,null,null,remoteFileName);
wordsApi.protectDocument(protectRequestRequest);