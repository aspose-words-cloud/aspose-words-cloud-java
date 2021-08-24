ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestTemplate = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetDocumentFieldNamesOnlineRequest request = new GetDocumentFieldNamesOnlineRequest(requestTemplate, null, null, true);
wordsApi.getDocumentFieldNamesOnline(request);