ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetBookmarkByNameOnlineRequest request = new GetBookmarkByNameOnlineRequest(requestDocument, "aspose", null, null);
wordsApi.getBookmarkByNameOnline(request);