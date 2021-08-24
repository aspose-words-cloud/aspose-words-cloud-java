ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
ListInsert requestListInsert = new ListInsert();
requestListInsert.setTemplate(ListInsert.TemplateEnum.OUTLINELEGAL);

InsertListOnlineRequest insertRequest = new InsertListOnlineRequest(requestDocument, requestListInsert, null, null, null, null, null);
wordsApi.insertListOnline(insertRequest);