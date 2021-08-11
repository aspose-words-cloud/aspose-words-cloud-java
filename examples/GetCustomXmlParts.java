ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetCustomXmlPartsRequest requestRequest = new GetCustomXmlPartsRequest("Sample.docx",null,null,null,null);
wordsApi.getCustomXmlParts(requestRequest);