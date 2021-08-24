ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
GetParagraphListFormatOnlineRequest request = new GetParagraphListFormatOnlineRequest(requestDocument, 0, null, null, null);
wordsApi.getParagraphListFormatOnline(request);