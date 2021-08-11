String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
StyleApply requestStyleApply = new StyleApply();
requestStyleApply.setStyleName("Heading 1");

ApplyStyleToDocumentElementOnlineRequest applyStyleRequestRequest = new ApplyStyleToDocumentElementOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"paragraphs/1/paragraphFormat",requestStyleApply,null,null,null,null,null);
wordsApi.applyStyleToDocumentElementOnline(applyStyleRequestRequest);