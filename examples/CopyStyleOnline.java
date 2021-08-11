String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
StyleCopy requestStyleCopy = new StyleCopy();
requestStyleCopy.setStyleName("Heading 1");

CopyStyleOnlineRequest copyRequestRequest = new CopyStyleOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestStyleCopy,null,null,null,null,null);
wordsApi.copyStyleOnline(copyRequestRequest);