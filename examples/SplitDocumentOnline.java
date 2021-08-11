String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
SplitDocumentOnlineRequest splitRequestRequest = new SplitDocumentOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"text",null,null,"/TestSplitDocument.text",1,2,null,null);
wordsApi.splitDocumentOnline(splitRequestRequest);