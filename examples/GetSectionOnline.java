ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetSectionOnlineRequest request = new GetSectionOnlineRequest(requestDocument, 0, null, null);
wordsApi.getSectionOnline(request);