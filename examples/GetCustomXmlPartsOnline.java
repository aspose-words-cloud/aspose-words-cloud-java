String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetCustomXmlPartsOnlineRequest requestRequest = new GetCustomXmlPartsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null);
wordsApi.getCustomXmlPartsOnline(requestRequest);