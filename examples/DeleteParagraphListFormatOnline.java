ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
DeleteParagraphListFormatOnlineRequest deleteRequest = new DeleteParagraphListFormatOnlineRequest(requestDocument, 0, null, null, null, null, null, null);
wordsApi.deleteParagraphListFormatOnline(deleteRequest);