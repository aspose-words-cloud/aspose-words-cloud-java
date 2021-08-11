String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DocumentPropertyCreateOrUpdate requestProperty = new DocumentPropertyCreateOrUpdate();
requestProperty.setValue("Imran Anwar");

CreateOrUpdateDocumentPropertyOnlineRequest createRequestRequest = new CreateOrUpdateDocumentPropertyOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"AsposeAuthor",requestProperty,null,null,null,null,null);
wordsApi.createOrUpdateDocumentPropertyOnline(createRequestRequest);