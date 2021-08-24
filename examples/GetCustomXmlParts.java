ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetCustomXmlPartsRequest request = new GetCustomXmlPartsRequest("Sample.docx", null, null, null, null);
wordsApi.getCustomXmlParts(request);