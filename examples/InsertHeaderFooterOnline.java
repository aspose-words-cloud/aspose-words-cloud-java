ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
InsertHeaderFooterOnlineRequest insertRequest = new InsertHeaderFooterOnlineRequest(requestDocument, "", "FooterEven", null, null, null, null, null);
wordsApi.insertHeaderFooterOnline(insertRequest);