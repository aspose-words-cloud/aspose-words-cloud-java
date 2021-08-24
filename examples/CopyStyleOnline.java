ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
StyleCopy requestStyleCopy = new StyleCopy();
requestStyleCopy.setStyleName("Heading 1");

CopyStyleOnlineRequest copyRequest = new CopyStyleOnlineRequest(requestDocument, requestStyleCopy, null, null, null, null, null);
wordsApi.copyStyleOnline(copyRequest);