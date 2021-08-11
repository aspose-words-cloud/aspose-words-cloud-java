ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";

RejectAllRevisionsRequest rejectRequestRequest = new RejectAllRevisionsRequest(remoteFileName,null,null,null,null,remoteFileName);
wordsApi.rejectAllRevisions(rejectRequestRequest);