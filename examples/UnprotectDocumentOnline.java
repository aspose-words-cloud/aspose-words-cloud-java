String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ProtectionRequest requestProtectionRequest = new ProtectionRequest();
requestProtectionRequest.setPassword("aspose");

UnprotectDocumentOnlineRequest unprotectRequestRequest = new UnprotectDocumentOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestProtectionRequest,null,null,null);
wordsApi.unprotectDocumentOnline(unprotectRequestRequest);