String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ConvertDocumentRequest convertRequestRequest = new ConvertDocumentRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"pdf",null,null,null,null);
wordsApi.convertDocument(convertRequestRequest);