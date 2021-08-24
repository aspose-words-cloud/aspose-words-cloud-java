ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetRunFontOnlineRequest request = new GetRunFontOnlineRequest(requestDocument, "paragraphs/0", 0, null, null);
wordsApi.getRunFontOnline(request);