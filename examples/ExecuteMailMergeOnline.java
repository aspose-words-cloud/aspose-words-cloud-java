String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ExecuteMailMergeOnlineRequest mailMergeRequestRequest = new ExecuteMailMergeOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "TestExecuteTemplate.doc").toAbsolutePath()),Files.readAllBytes(Paths.get(documentsDir, "TestExecuteTemplateData.txt").toAbsolutePath()),null,null,null);
wordsApi.executeMailMergeOnline(mailMergeRequestRequest);