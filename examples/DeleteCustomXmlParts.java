ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteCustomXmlPartsRequest deleteRequestRequest = new DeleteCustomXmlPartsRequest("Sample.docx",null,null,null,null,null,null,null);
wordsApi.deleteCustomXmlParts(deleteRequestRequest);