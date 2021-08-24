ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
SplitDocumentOnlineRequest splitRequest = new SplitDocumentOnlineRequest(requestDocument, "text", null, null, "/TestSplitDocument.text", 1, 2, null, null);
wordsApi.splitDocumentOnline(splitRequest);