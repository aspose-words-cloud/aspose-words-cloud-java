ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";

DocumentPropertyCreateOrUpdate requestProperty = new DocumentPropertyCreateOrUpdate();
requestProperty.setValue("Imran Anwar");

CreateOrUpdateDocumentPropertyRequest createRequestRequest = new CreateOrUpdateDocumentPropertyRequest(remoteFileName,"AsposeAuthor",requestProperty,null,null,null,null,remoteFileName,null,null);
wordsApi.createOrUpdateDocumentProperty(createRequestRequest);