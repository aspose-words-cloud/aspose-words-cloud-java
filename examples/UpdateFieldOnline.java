String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
FieldUpdate requestField = new FieldUpdate();
requestField.setFieldCode("{ NUMPAGES }");

UpdateFieldOnlineRequest updateRequestRequest = new UpdateFieldOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestField,0,"sections/0/paragraphs/0",null,null,null,null,null);
wordsApi.updateFieldOnline(updateRequestRequest);