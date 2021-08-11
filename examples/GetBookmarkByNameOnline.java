String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetBookmarkByNameOnlineRequest requestRequest = new GetBookmarkByNameOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"aspose",null,null);
wordsApi.getBookmarkByNameOnline(requestRequest);