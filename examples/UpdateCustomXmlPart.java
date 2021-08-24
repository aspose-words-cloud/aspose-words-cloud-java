ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
CustomXmlPartUpdate requestCustomXmlPart = new CustomXmlPartUpdate();
requestCustomXmlPart.setData("<data>Hello world</data>");

UpdateCustomXmlPartRequest updateRequest = new UpdateCustomXmlPartRequest("Sample.docx", 0, requestCustomXmlPart, null, null, null, null, null, null, null);
wordsApi.updateCustomXmlPart(updateRequest);