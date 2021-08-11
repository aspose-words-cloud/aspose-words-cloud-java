ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";

ReplaceTextParameters requestReplaceText = new ReplaceTextParameters();
requestReplaceText.setOldValue("Testing");
requestReplaceText.setNewValue("Aspose testing");

ReplaceTextRequest replaceRequestRequest = new ReplaceTextRequest(remoteFileName,requestReplaceText,null,null,null,null,remoteFileName,null,null);
wordsApi.replaceText(replaceRequestRequest);