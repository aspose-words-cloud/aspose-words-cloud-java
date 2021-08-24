ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
SaveOptionsData requestDataSaveOptions = new SaveOptionsData();
requestDataSaveOptions.setFileName("google.doc");
requestDataSaveOptions.setSaveFormat("doc");
requestDataSaveOptions.setDmlEffectsRenderingMode("1");
requestDataSaveOptions.setDmlRenderingMode("1");
requestDataSaveOptions.setUpdateSdtContent(false);
requestDataSaveOptions.setZipOutput(false);

LoadWebDocumentData requestData = new LoadWebDocumentData();
requestData.setLoadingDocumentUrl("http://google.com");
requestData.setSaveOptions(requestDataSaveOptions);

LoadWebDocumentRequest loadRequest = new LoadWebDocumentRequest(requestData, null);
wordsApi.loadWebDocument(loadRequest);