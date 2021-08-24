ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetParagraphFormatOnlineRequest request = new GetParagraphFormatOnlineRequest(requestDocument, 0, null, null, null);
wordsApi.getParagraphFormatOnline(request);