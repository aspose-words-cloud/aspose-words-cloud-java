String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
SaveOptionsData requestSaveOptionsData = new SaveOptionsData();
requestSaveOptionsData.setSaveFormat("pdf");
requestSaveOptionsData.setFileName("/TestSaveAs.pdf");

SaveAsOnlineRequest saveRequestRequest = new SaveAsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Common/test_multi_pages.docx").toAbsolutePath()),requestSaveOptionsData,null,null,null);
wordsApi.saveAsOnline(saveRequestRequest);