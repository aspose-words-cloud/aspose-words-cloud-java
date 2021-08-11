String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ParagraphInsert requestParagraph = new ParagraphInsert();
requestParagraph.setText("This is a new paragraph for your document");

InsertParagraphOnlineRequest insertRequestRequest = new InsertParagraphOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestParagraph,"sections/0",null,null,null,null,null,null);
wordsApi.insertParagraphOnline(insertRequestRequest);