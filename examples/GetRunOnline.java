ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetRunOnlineRequest request = new GetRunOnlineRequest(requestDocument, "paragraphs/0", 0, null, null);
wordsApi.getRunOnline(request);