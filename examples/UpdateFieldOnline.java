ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
FieldUpdate requestField = new FieldUpdate();
requestField.setFieldCode("{ NUMPAGES }");

UpdateFieldOnlineRequest updateRequest = new UpdateFieldOnlineRequest(requestDocument, requestField, 0, "sections/0/paragraphs/0", null, null, null, null, null);
wordsApi.updateFieldOnline(updateRequest);