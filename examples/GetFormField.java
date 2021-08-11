ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetFormFieldRequest requestRequest = new GetFormFieldRequest("Sample.docx",0,null,null,null,null,null);
wordsApi.getFormField(requestRequest);