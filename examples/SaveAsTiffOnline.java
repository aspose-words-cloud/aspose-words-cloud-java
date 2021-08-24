ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Common/test_multi_pages.docx").toAbsolutePath());
TiffSaveOptionsData requestSaveOptions = new TiffSaveOptionsData();
requestSaveOptions.setSaveFormat("tiff");
requestSaveOptions.setFileName("/abc.tiff");

SaveAsTiffOnlineRequest saveRequest = new SaveAsTiffOnlineRequest(requestDocument, requestSaveOptions, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
wordsApi.saveAsTiffOnline(saveRequest);