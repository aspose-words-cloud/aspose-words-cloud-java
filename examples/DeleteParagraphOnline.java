ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
DeleteParagraphOnlineRequest deleteRequest = new DeleteParagraphOnlineRequest(requestDocument, 0, null, null, null, null, null, null);
wordsApi.deleteParagraphOnline(deleteRequest);