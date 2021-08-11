ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
StyleUpdate requestStyleUpdate = new StyleUpdate();
requestStyleUpdate.setName("My Style");

UpdateStyleRequest updateRequestRequest = new UpdateStyleRequest("Sample.docx","Heading 1",requestStyleUpdate,null,null,null,null,null,null,null);
wordsApi.updateStyle(updateRequestRequest);