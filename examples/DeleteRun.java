ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteRunRequest deleteRequestRequest = new DeleteRunRequest("Sample.docx","paragraphs/1",0,null,null,null,null,null,null,null);
wordsApi.deleteRun(deleteRequestRequest);