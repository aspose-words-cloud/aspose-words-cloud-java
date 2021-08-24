ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetStyleOnlineRequest request = new GetStyleOnlineRequest(requestDocument, "Heading 1", null, null);
wordsApi.getStyleOnline(request);