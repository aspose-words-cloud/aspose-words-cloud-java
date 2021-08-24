ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetCustomXmlPartsOnlineRequest request = new GetCustomXmlPartsOnlineRequest(requestDocument, null, null);
wordsApi.getCustomXmlPartsOnline(request);