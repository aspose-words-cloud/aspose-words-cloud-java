ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
FieldInsert requestField = new FieldInsert();
requestField.setFieldCode("{ NUMPAGES }");

InsertFieldOnlineRequest insertRequest = new InsertFieldOnlineRequest(requestDocument, requestField, "sections/0/paragraphs/0", null, null, null, null, null, null);
wordsApi.insertFieldOnline(insertRequest);