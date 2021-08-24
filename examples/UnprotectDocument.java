ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ProtectionRequest requestProtectionRequest = new ProtectionRequest();
requestProtectionRequest.setPassword("aspose");

UnprotectDocumentRequest unprotectRequest = new UnprotectDocumentRequest("Sample.docx", requestProtectionRequest, null, null, null, null, null);
wordsApi.unprotectDocument(unprotectRequest);