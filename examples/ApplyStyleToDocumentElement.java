ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
StyleApply requestStyleApply = new StyleApply();
requestStyleApply.setStyleName("Heading 1");

ApplyStyleToDocumentElementRequest applyStyleRequest = new ApplyStyleToDocumentElementRequest("Sample.docx", "paragraphs/1/paragraphFormat", requestStyleApply, null, null, null, null, null, null, null);
wordsApi.applyStyleToDocumentElement(applyStyleRequest);