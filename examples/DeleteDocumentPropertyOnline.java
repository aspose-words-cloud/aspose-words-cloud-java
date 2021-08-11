String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteDocumentPropertyOnlineRequest deleteRequestRequest = new DeleteDocumentPropertyOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"testProp",null,null,null,null,null);
wordsApi.deleteDocumentPropertyOnline(deleteRequestRequest);