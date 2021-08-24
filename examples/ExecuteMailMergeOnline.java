ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestTemplate = Files.readAllBytes(Paths.get("TestExecuteTemplate.doc").toAbsolutePath());
byte[] requestData = Files.readAllBytes(Paths.get("TestExecuteTemplateData.txt").toAbsolutePath());
ExecuteMailMergeOnlineRequest mailMergeRequest = new ExecuteMailMergeOnlineRequest(requestTemplate, requestData, null, null, null);
wordsApi.executeMailMergeOnline(mailMergeRequest);