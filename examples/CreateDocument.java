ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
CreateDocumentRequest createRequestRequest = new CreateDocumentRequest("Sample.docx",null,null);
wordsApi.createDocument(createRequestRequest);