String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String bookmarkName = "aspose";

BookmarkData requestBookmarkData = new BookmarkData();
requestBookmarkData.setName(bookmarkName);
requestBookmarkData.setText("This will be the text for Aspose");

UpdateBookmarkOnlineRequest updateRequestRequest = new UpdateBookmarkOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),bookmarkName,requestBookmarkData,null,null,"Sample.docx",null,null);
wordsApi.updateBookmarkOnline(updateRequestRequest);