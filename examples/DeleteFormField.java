ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";

DeleteFormFieldRequest deleteRequestRequest = new DeleteFormFieldRequest(remoteFileName,0,null,null,null,null,null,remoteFileName,null,null);
wordsApi.deleteFormField(deleteRequestRequest);