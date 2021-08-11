ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
PageSetup requestPageSetup = new PageSetup();
requestPageSetup.setRtlGutter(true);
requestPageSetup.setLeftMargin((double)10.0);
requestPageSetup.setOrientation(PageSetup.OrientationEnum.LANDSCAPE);
requestPageSetup.setPaperSize(PageSetup.PaperSizeEnum.A5);

UpdateSectionPageSetupRequest updateRequestRequest = new UpdateSectionPageSetupRequest("Sample.docx",0,requestPageSetup,null,null,null,null,null,null,null);
wordsApi.updateSectionPageSetup(updateRequestRequest);