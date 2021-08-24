ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetParagraphOnlineRequest request = new GetParagraphOnlineRequest(requestDocument, 0, "sections/0", null, null);
wordsApi.getParagraphOnline(request);