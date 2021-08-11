String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentFieldNamesOnlineRequest requestRequest = new GetDocumentFieldNamesOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,true);
wordsApi.getDocumentFieldNamesOnline(requestRequest);