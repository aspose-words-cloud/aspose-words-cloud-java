ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetFieldOnlineRequest request = new GetFieldOnlineRequest(requestDocument, 0, "sections/0/paragraphs/0", null, null);
wordsApi.getFieldOnline(request);