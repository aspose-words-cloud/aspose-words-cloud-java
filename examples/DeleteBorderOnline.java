ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
DeleteBorderOnlineRequest deleteRequest = new DeleteBorderOnlineRequest(requestDocument, "left", "tables/1/rows/0/cells/0", null, null, null, null, null);
wordsApi.deleteBorderOnline(deleteRequest);