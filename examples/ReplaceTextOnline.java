String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ReplaceTextParameters requestReplaceText = new ReplaceTextParameters();
requestReplaceText.setOldValue("aspose");
requestReplaceText.setNewValue("aspose new");

ReplaceTextOnlineRequest replaceRequestRequest = new ReplaceTextOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestReplaceText,null,null,null,null,null);
wordsApi.replaceTextOnline(replaceRequestRequest);