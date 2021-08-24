ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
DeleteSectionOnlineRequest deleteRequest = new DeleteSectionOnlineRequest(requestDocument, 0, null, null, null, null, null);
wordsApi.deleteSectionOnline(deleteRequest);