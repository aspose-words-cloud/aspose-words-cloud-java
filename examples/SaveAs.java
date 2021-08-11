ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
SaveOptionsData requestSaveOptionsData = new SaveOptionsData();
requestSaveOptionsData.setSaveFormat("docx");
requestSaveOptionsData.setFileName("/TestSaveAsFromPdfToDoc.docx");

SaveAsRequest saveRequestRequest = new SaveAsRequest("Sample.docx",requestSaveOptionsData,null,null,null,null,null);
wordsApi.saveAs(saveRequestRequest);