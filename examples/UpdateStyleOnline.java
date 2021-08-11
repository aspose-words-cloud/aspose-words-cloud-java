String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
StyleUpdate requestStyleUpdate = new StyleUpdate();
requestStyleUpdate.setName("My Style");

UpdateStyleOnlineRequest updateRequestRequest = new UpdateStyleOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"Heading 1",requestStyleUpdate,null,null,null,null,null);
wordsApi.updateStyleOnline(updateRequestRequest);