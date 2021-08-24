ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetSectionPageSetupOnlineRequest request = new GetSectionPageSetupOnlineRequest(requestDocument, 0, null, null);
wordsApi.getSectionPageSetupOnline(request);