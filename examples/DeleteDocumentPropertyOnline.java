ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
DeleteDocumentPropertyOnlineRequest deleteRequest = new DeleteDocumentPropertyOnlineRequest(requestDocument, "testProp", null, null, null, null, null);
wordsApi.deleteDocumentPropertyOnline(deleteRequest);