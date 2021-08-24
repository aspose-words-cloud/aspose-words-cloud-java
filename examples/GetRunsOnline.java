ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetRunsOnlineRequest request = new GetRunsOnlineRequest(requestDocument, "sections/0/paragraphs/0", null, null);
wordsApi.getRunsOnline(request);