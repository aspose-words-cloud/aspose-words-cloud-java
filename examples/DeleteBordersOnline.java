ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
DeleteBordersOnlineRequest deleteRequest = new DeleteBordersOnlineRequest(requestDocument, "tables/1/rows/0/cells/0", null, null, null, null, null);
wordsApi.deleteBordersOnline(deleteRequest);