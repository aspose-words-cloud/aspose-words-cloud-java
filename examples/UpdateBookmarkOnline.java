ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String bookmarkName = "aspose";

byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
BookmarkData requestBookmarkData = new BookmarkData();
requestBookmarkData.setName(bookmarkName);
requestBookmarkData.setText("This will be the text for Aspose");

UpdateBookmarkOnlineRequest updateRequest = new UpdateBookmarkOnlineRequest(requestDocument, bookmarkName, requestBookmarkData, null, null, "Sample.docx", null, null);
wordsApi.updateBookmarkOnline(updateRequest);