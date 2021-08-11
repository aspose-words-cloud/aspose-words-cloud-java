ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";

DeleteCustomXmlPartRequest deleteRequestRequest = new DeleteCustomXmlPartRequest(remoteFileName,0,null,null,null,null,remoteFileName,null,null);
wordsApi.deleteCustomXmlPart(deleteRequestRequest);