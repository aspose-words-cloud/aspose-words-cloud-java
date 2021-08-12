ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ReplaceTextParameters requestReplaceText = new ReplaceTextParameters();
requestReplaceText.setOldValue("Testing");
requestReplaceText.setNewValue("Aspose testing");

ReplaceTextRequest replaceRequestRequest = new ReplaceTextRequest("Sample.docx",requestReplaceText,null,null,null,null,null,null,null);
wordsApi.replaceText(replaceRequestRequest);