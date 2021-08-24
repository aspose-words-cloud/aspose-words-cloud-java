ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
CustomXmlPartInsert requestCustomXmlPart = new CustomXmlPartInsert();
requestCustomXmlPart.setId("hello");
requestCustomXmlPart.setData("<data>Hello world</data>");

InsertCustomXmlPartOnlineRequest insertRequest = new InsertCustomXmlPartOnlineRequest(requestDocument, requestCustomXmlPart, null, null, null, null, null);
wordsApi.insertCustomXmlPartOnline(insertRequest);