ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteFieldsRequest deleteRequest = new DeleteFieldsRequest("Sample.docx", null, null, null, null, null, null, null, null);
wordsApi.deleteFields(deleteRequest);