ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
SearchOnlineRequest searchRequest = new SearchOnlineRequest(requestDocument, "aspose", null, null);
wordsApi.searchOnline(searchRequest);