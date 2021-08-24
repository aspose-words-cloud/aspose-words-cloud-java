ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
ProtectionRequest requestProtectionRequest = new ProtectionRequest();
requestProtectionRequest.setPassword("aspose");

UnprotectDocumentOnlineRequest unprotectRequest = new UnprotectDocumentOnlineRequest(requestDocument, requestProtectionRequest, null, null, null);
wordsApi.unprotectDocumentOnline(unprotectRequest);