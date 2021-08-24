ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetFieldsOnlineRequest request = new GetFieldsOnlineRequest(requestDocument, "sections/0", null, null);
wordsApi.getFieldsOnline(request);