String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
TiffSaveOptionsData requestSaveOptions = new TiffSaveOptionsData();
requestSaveOptions.setSaveFormat("tiff");
requestSaveOptions.setFileName("/abc.tiff");

SaveAsTiffOnlineRequest saveRequestRequest = new SaveAsTiffOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Common/test_multi_pages.docx").toAbsolutePath()),requestSaveOptions,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
wordsApi.saveAsTiffOnline(saveRequestRequest);