ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
CustomXmlPartUpdate requestCustomXmlPart = new CustomXmlPartUpdate();
requestCustomXmlPart.setData("<data>Hello world</data>");

UpdateCustomXmlPartOnlineRequest updateRequest = new UpdateCustomXmlPartOnlineRequest(requestDocument, 0, requestCustomXmlPart, null, null, null, null, null);
wordsApi.updateCustomXmlPartOnline(updateRequest);