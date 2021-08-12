String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetOfficeMathObjectsOnlineRequest requestRequest = new GetOfficeMathObjectsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,null);
wordsApi.getOfficeMathObjectsOnline(requestRequest);