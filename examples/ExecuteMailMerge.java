ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";

ExecuteMailMergeRequest mailMergeRequestRequest = new ExecuteMailMergeRequest(remoteFileName,"TestExecuteTemplateData.txt",null,null,null,null,null,null,null,null,remoteFileName);
wordsApi.executeMailMerge(mailMergeRequestRequest);