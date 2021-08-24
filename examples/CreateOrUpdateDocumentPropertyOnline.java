ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
DocumentPropertyCreateOrUpdate requestProperty = new DocumentPropertyCreateOrUpdate();
requestProperty.setValue("Imran Anwar");

CreateOrUpdateDocumentPropertyOnlineRequest createRequest = new CreateOrUpdateDocumentPropertyOnlineRequest(requestDocument, "AsposeAuthor", requestProperty, null, null, null, null, null);
wordsApi.createOrUpdateDocumentPropertyOnline(createRequest);