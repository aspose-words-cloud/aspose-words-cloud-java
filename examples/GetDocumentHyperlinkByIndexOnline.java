ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetDocumentHyperlinkByIndexOnlineRequest request = new GetDocumentHyperlinkByIndexOnlineRequest(requestDocument, 0, null, null);
wordsApi.getDocumentHyperlinkByIndexOnline(request);