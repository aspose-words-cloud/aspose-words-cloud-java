ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
RemoveRangeRequest removeRequestRequest = new RemoveRangeRequest("Sample.docx","id0.0.0","id0.0.1",null,null,null,null,null);
wordsApi.removeRange(removeRequestRequest);