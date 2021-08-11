ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";

DeleteCommentRequest deleteRequestRequest = new DeleteCommentRequest(remoteFileName,0,null,null,null,null,remoteFileName,null,null);
wordsApi.deleteComment(deleteRequestRequest);