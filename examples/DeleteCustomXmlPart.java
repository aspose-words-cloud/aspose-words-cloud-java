ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteCustomXmlPartRequest deleteRequest = new DeleteCustomXmlPartRequest("Sample.docx", 0, null, null, null, null, null, null, null);
wordsApi.deleteCustomXmlPart(deleteRequest);