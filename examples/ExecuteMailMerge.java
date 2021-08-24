ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ExecuteMailMergeRequest mailMergeRequest = new ExecuteMailMergeRequest("Sample.docx", "TestExecuteTemplateData.txt", null, null, null, null, null, null, null, null, null);
wordsApi.executeMailMerge(mailMergeRequest);