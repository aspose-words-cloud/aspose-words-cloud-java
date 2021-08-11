ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
TiffSaveOptionsData requestSaveOptions = new TiffSaveOptionsData();
requestSaveOptions.setSaveFormat("tiff");
requestSaveOptions.setFileName("/abc.tiff");

SaveAsTiffRequest saveRequestRequest = new SaveAsTiffRequest("Sample.docx",requestSaveOptions,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
wordsApi.saveAsTiff(saveRequestRequest);