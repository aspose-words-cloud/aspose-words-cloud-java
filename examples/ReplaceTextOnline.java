ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
ReplaceTextParameters requestReplaceText = new ReplaceTextParameters();
requestReplaceText.setOldValue("aspose");
requestReplaceText.setNewValue("aspose new");

ReplaceTextOnlineRequest replaceRequest = new ReplaceTextOnlineRequest(requestDocument, requestReplaceText, null, null, null, null, null);
wordsApi.replaceTextOnline(replaceRequest);