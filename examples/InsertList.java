ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ListInsert requestListInsert = new ListInsert();
requestListInsert.setTemplate(ListInsert.TemplateEnum.OUTLINELEGAL);

InsertListRequest insertRequestRequest = new InsertListRequest("TestGetLists.doc",requestListInsert,null,null,null,null,null,null,null);
wordsApi.insertList(insertRequestRequest);