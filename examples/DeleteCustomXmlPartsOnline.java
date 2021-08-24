ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
DeleteCustomXmlPartsOnlineRequest deleteRequest = new DeleteCustomXmlPartsOnlineRequest(requestDocument, null, null, null, null, null);
wordsApi.deleteCustomXmlPartsOnline(deleteRequest);