ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetParagraphTabStopsOnlineRequest request = new GetParagraphTabStopsOnlineRequest(requestDocument, 0, null, null, null);
wordsApi.getParagraphTabStopsOnline(request);