ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ParagraphInsert requestParagraph = new ParagraphInsert();
requestParagraph.setText("This is a new paragraph for your document");

InsertParagraphRequest insertRequest = new InsertParagraphRequest("Sample.docx", requestParagraph, null, null, null, null, null, null, null, null, null);
wordsApi.insertParagraph(insertRequest);