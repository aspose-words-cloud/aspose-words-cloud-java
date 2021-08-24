ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetBookmarksOnlineRequest request = new GetBookmarksOnlineRequest(requestDocument, null, null);
wordsApi.getBookmarksOnline(request);