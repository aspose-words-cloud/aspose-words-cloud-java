ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
StyleApply requestStyleApply = new StyleApply();
requestStyleApply.setStyleName("Heading 1");

ApplyStyleToDocumentElementRequest applyStyleRequestRequest = new ApplyStyleToDocumentElementRequest("Sample.docx","paragraphs/1/paragraphFormat",requestStyleApply,null,null,null,null,null,null,null);
wordsApi.applyStyleToDocumentElement(applyStyleRequestRequest);