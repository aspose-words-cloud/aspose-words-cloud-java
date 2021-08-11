String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetStyleFromDocumentElementOnlineRequest requestRequest = new GetStyleFromDocumentElementOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"paragraphs/1/paragraphFormat",null,null);
wordsApi.getStyleFromDocumentElementOnline(requestRequest);