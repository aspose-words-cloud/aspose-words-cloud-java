String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ListInsert requestListInsert = new ListInsert();
requestListInsert.setTemplate(ListInsert.TemplateEnum.OUTLINELEGAL);

InsertListOnlineRequest insertRequestRequest = new InsertListOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/Lists/ListsGet.doc").toAbsolutePath()),requestListInsert,null,null,null,null,null);
wordsApi.insertListOnline(insertRequestRequest);