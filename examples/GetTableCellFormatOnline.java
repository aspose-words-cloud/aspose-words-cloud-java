ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetTableCellFormatOnlineRequest request = new GetTableCellFormatOnlineRequest(requestDocument, "sections/0/tables/2/rows/0", 0, null, null);
wordsApi.getTableCellFormatOnline(request);