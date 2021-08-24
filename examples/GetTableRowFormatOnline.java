ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetTableRowFormatOnlineRequest request = new GetTableRowFormatOnlineRequest(requestDocument, "sections/0/tables/2", 0, null, null);
wordsApi.getTableRowFormatOnline(request);