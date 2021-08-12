ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DocumentPropertyCreateOrUpdate requestProperty = new DocumentPropertyCreateOrUpdate();
requestProperty.setValue("Imran Anwar");

CreateOrUpdateDocumentPropertyRequest createRequestRequest = new CreateOrUpdateDocumentPropertyRequest("Sample.docx","AsposeAuthor",requestProperty,null,null,null,null,null,null,null);
wordsApi.createOrUpdateDocumentProperty(createRequestRequest);