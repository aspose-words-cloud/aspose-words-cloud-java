String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
UpdateFieldsOnlineRequest updateRequestRequest = new UpdateFieldsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,null);
wordsApi.updateFieldsOnline(updateRequestRequest);