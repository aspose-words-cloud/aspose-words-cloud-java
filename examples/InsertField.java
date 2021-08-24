ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
FieldInsert requestField = new FieldInsert();
requestField.setFieldCode("{ NUMPAGES }");

InsertFieldRequest insertRequest = new InsertFieldRequest("Sample.docx", requestField, null, null, null, null, null, null, null, null, null);
wordsApi.insertField(insertRequest);