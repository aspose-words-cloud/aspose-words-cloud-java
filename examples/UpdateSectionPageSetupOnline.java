ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
PageSetup requestPageSetup = new PageSetup();
requestPageSetup.setRtlGutter(true);
requestPageSetup.setLeftMargin((double)10);
requestPageSetup.setOrientation(PageSetup.OrientationEnum.LANDSCAPE);
requestPageSetup.setPaperSize(PageSetup.PaperSizeEnum.A5);

UpdateSectionPageSetupOnlineRequest updateRequest = new UpdateSectionPageSetupOnlineRequest(requestDocument, 0, requestPageSetup, null, null, null, null, null);
wordsApi.updateSectionPageSetupOnline(updateRequest);