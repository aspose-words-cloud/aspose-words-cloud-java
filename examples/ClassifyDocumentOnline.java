String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ClassifyDocumentOnlineRequest classifyRequestRequest = new ClassifyDocumentOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,"3",null);
wordsApi.classifyDocumentOnline(classifyRequestRequest);