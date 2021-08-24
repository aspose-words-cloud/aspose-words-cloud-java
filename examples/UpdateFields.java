ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
UpdateFieldsRequest updateRequest = new UpdateFieldsRequest("Sample.docx", null, null, null, null, null);
wordsApi.updateFields(updateRequest);