ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetFormFieldsRequest requestRequest = new GetFormFieldsRequest("Sample.docx",null,null,null,null,null);
wordsApi.getFormFields(requestRequest);