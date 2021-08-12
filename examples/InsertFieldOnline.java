String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
FieldInsert requestField = new FieldInsert();
requestField.setFieldCode("{ NUMPAGES }");

InsertFieldOnlineRequest insertRequestRequest = new InsertFieldOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestField,"sections/0/paragraphs/0",null,null,null,null,null,null);
wordsApi.insertFieldOnline(insertRequestRequest);