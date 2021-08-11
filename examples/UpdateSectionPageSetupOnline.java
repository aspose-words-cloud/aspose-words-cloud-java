String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
PageSetup requestPageSetup = new PageSetup();
requestPageSetup.setRtlGutter(true);
requestPageSetup.setLeftMargin((double)10);
requestPageSetup.setOrientation(PageSetup.OrientationEnum.LANDSCAPE);
requestPageSetup.setPaperSize(PageSetup.PaperSizeEnum.A5);

UpdateSectionPageSetupOnlineRequest updateRequestRequest = new UpdateSectionPageSetupOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,requestPageSetup,null,null,null,null,null);
wordsApi.updateSectionPageSetupOnline(updateRequestRequest);