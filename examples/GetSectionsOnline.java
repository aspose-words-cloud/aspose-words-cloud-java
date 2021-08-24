ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetSectionsOnlineRequest request = new GetSectionsOnlineRequest(requestDocument, null, null);
wordsApi.getSectionsOnline(request);