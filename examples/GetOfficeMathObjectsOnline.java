ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetOfficeMathObjectsOnlineRequest request = new GetOfficeMathObjectsOnlineRequest(requestDocument, null, null, null);
wordsApi.getOfficeMathObjectsOnline(request);