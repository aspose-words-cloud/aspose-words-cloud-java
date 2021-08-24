ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
DeleteParagraphTabStopOnlineRequest deleteRequest = new DeleteParagraphTabStopOnlineRequest(requestDocument, (double)72.0, 0, null, null, null, null);
wordsApi.deleteParagraphTabStopOnline(deleteRequest);