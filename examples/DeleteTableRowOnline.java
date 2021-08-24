ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
DeleteTableRowOnlineRequest deleteRequest = new DeleteTableRowOnlineRequest(requestDocument, "tables/1", 0, null, null, null, null, null);
wordsApi.deleteTableRowOnline(deleteRequest);