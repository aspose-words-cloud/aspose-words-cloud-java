ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
UpdateFieldsOnlineRequest updateRequest = new UpdateFieldsOnlineRequest(requestDocument, null, null, null);
wordsApi.updateFieldsOnline(updateRequest);