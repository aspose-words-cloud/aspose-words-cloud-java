ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetCustomXmlPartOnlineRequest request = new GetCustomXmlPartOnlineRequest(requestDocument, 0, null, null);
wordsApi.getCustomXmlPartOnline(request);