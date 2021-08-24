ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetFormFieldOnlineRequest request = new GetFormFieldOnlineRequest(requestDocument, 0, "sections/0", null, null);
wordsApi.getFormFieldOnline(request);