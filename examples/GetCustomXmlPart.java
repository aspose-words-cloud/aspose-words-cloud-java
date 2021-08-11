ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetCustomXmlPartRequest requestRequest = new GetCustomXmlPartRequest("Sample.docx",0,null,null,null,null);
wordsApi.getCustomXmlPart(requestRequest);