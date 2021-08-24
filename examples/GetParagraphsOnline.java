ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetParagraphsOnlineRequest request = new GetParagraphsOnlineRequest(requestDocument, "sections/0", null, null);
wordsApi.getParagraphsOnline(request);