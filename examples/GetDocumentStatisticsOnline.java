ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetDocumentStatisticsOnlineRequest request = new GetDocumentStatisticsOnlineRequest(requestDocument, null, null, null, null, null);
wordsApi.getDocumentStatisticsOnline(request);