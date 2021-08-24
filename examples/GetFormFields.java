ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetFormFieldsRequest request = new GetFormFieldsRequest("Sample.docx", null, null, null, null, null);
wordsApi.getFormFields(request);