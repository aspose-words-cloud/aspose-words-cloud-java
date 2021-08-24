ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetFieldsRequest request = new GetFieldsRequest("Sample.docx", null, null, null, null, null);
wordsApi.getFields(request);