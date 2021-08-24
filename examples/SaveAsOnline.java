ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Common/test_multi_pages.docx").toAbsolutePath());
SaveOptionsData requestSaveOptionsData = new SaveOptionsData();
requestSaveOptionsData.setSaveFormat("pdf");
requestSaveOptionsData.setFileName("/TestSaveAs.pdf");

SaveAsOnlineRequest saveRequest = new SaveAsOnlineRequest(requestDocument, requestSaveOptionsData, null, null, null);
wordsApi.saveAsOnline(saveRequest);