ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
ParagraphInsert requestParagraph = new ParagraphInsert();
requestParagraph.setText("This is a new paragraph for your document");

InsertParagraphOnlineRequest insertRequest = new InsertParagraphOnlineRequest(requestDocument, requestParagraph, "sections/0", null, null, null, null, null, null);
wordsApi.insertParagraphOnline(insertRequest);