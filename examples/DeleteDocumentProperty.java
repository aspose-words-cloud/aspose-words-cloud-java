ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";

DeleteDocumentPropertyRequest deleteRequestRequest = new DeleteDocumentPropertyRequest(remoteFileName,"testProp",null,null,null,null,remoteFileName,null,null);
wordsApi.deleteDocumentProperty(deleteRequestRequest);