ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
CustomXmlPartInsert requestCustomXmlPart = new CustomXmlPartInsert();
requestCustomXmlPart.setId("hello");
requestCustomXmlPart.setData("<data>Hello world</data>");

InsertCustomXmlPartRequest insertRequest = new InsertCustomXmlPartRequest("Sample.docx", requestCustomXmlPart, null, null, null, null, null, null, null);
wordsApi.insertCustomXmlPart(insertRequest);