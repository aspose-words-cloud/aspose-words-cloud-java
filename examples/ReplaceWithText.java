ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ReplaceRange requestRangeText = new ReplaceRange();
requestRangeText.setText("Replaced header");

ReplaceWithTextRequest replaceRequestRequest = new ReplaceWithTextRequest("Sample.docx","id0.0.0",requestRangeText,"id0.0.1",null,null,null,null,null);
wordsApi.replaceWithText(replaceRequestRequest);