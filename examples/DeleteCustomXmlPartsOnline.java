String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteCustomXmlPartsOnlineRequest deleteRequestRequest = new DeleteCustomXmlPartsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,null,null,null);
wordsApi.deleteCustomXmlPartsOnline(deleteRequestRequest);