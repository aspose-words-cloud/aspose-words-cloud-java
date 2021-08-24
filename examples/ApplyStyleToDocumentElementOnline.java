ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
StyleApply requestStyleApply = new StyleApply();
requestStyleApply.setStyleName("Heading 1");

ApplyStyleToDocumentElementOnlineRequest applyStyleRequest = new ApplyStyleToDocumentElementOnlineRequest(requestDocument, "paragraphs/1/paragraphFormat", requestStyleApply, null, null, null, null, null);
wordsApi.applyStyleToDocumentElementOnline(applyStyleRequest);