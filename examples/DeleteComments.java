ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";

DeleteCommentsRequest deleteRequestRequest = new DeleteCommentsRequest(remoteFileName,null,null,null,null,remoteFileName,null,null);
wordsApi.deleteComments(deleteRequestRequest);