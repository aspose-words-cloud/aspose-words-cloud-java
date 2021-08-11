String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
CustomXmlPartInsert requestCustomXmlPart = new CustomXmlPartInsert();
requestCustomXmlPart.setId("hello");
requestCustomXmlPart.setData("<data>Hello world</data>");

InsertCustomXmlPartOnlineRequest insertRequestRequest = new InsertCustomXmlPartOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestCustomXmlPart,null,null,null,null,null);
wordsApi.insertCustomXmlPartOnline(insertRequestRequest);