ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
UpdateFieldsRequest updateRequestRequest = new UpdateFieldsRequest("Sample.docx",null,null,null,null,null);
wordsApi.updateFields(updateRequestRequest);