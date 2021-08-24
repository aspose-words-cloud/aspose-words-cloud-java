ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
FieldUpdate requestField = new FieldUpdate();
requestField.setFieldCode("{ NUMPAGES }");

UpdateFieldRequest updateRequest = new UpdateFieldRequest("Sample.docx", 0, requestField, "sections/0/paragraphs/0", null, null, null, null, null, null, null);
wordsApi.updateField(updateRequest);