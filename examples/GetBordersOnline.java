ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetBordersOnlineRequest request = new GetBordersOnlineRequest(requestDocument, "tables/1/rows/0/cells/0", null, null);
wordsApi.getBordersOnline(request);