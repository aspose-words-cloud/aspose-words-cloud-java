ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteDocumentPropertyRequest deleteRequestRequest = new DeleteDocumentPropertyRequest("Sample.docx","testProp",null,null,null,null,null,null,null);
wordsApi.deleteDocumentProperty(deleteRequestRequest);