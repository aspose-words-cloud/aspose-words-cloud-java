ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteFormFieldRequest deleteRequest = new DeleteFormFieldRequest("Sample.docx", 0, null, null, null, null, null, null, null, null);
wordsApi.deleteFormField(deleteRequest);