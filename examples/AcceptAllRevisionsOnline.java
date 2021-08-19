ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String fileName  = "test_doc.docx";

// Calls AcceptAllRevisionsOnline method for document in cloud.
byte[] requestDocument = Files.readAllBytes(Paths.get(fileName).toAbsolutePath());
AcceptAllRevisionsOnlineRequest request = new AcceptAllRevisionsOnlineRequest(requestDocument,null,null,null);
AcceptAllRevisionsOnlineResponse acceptAllRevisionsOnlineResult = wordsApi.acceptAllRevisionsOnline(request);
Files.write(Paths.get("test_result.docx"), acceptAllRevisionsOnlineResult.getDocument());