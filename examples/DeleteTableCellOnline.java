ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
DeleteTableCellOnlineRequest deleteRequest = new DeleteTableCellOnlineRequest(requestDocument, "sections/0/tables/2/rows/0", 0, null, null, null, null, null);
wordsApi.deleteTableCellOnline(deleteRequest);