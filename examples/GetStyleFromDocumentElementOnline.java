ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetStyleFromDocumentElementOnlineRequest request = new GetStyleFromDocumentElementOnlineRequest(requestDocument, "paragraphs/1/paragraphFormat", null, null);
wordsApi.getStyleFromDocumentElementOnline(request);