ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteCustomXmlPartsRequest deleteRequest = new DeleteCustomXmlPartsRequest("Sample.docx", null, null, null, null, null, null, null);
wordsApi.deleteCustomXmlParts(deleteRequest);