ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";

DeleteCustomXmlPartsRequest deleteRequestRequest = new DeleteCustomXmlPartsRequest(remoteFileName,null,null,null,null,remoteFileName,null,null);
wordsApi.deleteCustomXmlParts(deleteRequestRequest);