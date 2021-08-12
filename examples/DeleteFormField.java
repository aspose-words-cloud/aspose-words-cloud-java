ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteFormFieldRequest deleteRequestRequest = new DeleteFormFieldRequest("Sample.docx",0,null,null,null,null,null,null,null,null);
wordsApi.deleteFormField(deleteRequestRequest);