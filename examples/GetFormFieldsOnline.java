ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetFormFieldsOnlineRequest request = new GetFormFieldsOnlineRequest(requestDocument, "sections/0", null, null);
wordsApi.getFormFieldsOnline(request);