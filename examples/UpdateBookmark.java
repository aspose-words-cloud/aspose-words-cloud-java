ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String bookmarkName = "aspose";

BookmarkData requestBookmarkData = new BookmarkData();
requestBookmarkData.setName(bookmarkName);
requestBookmarkData.setText("This will be the text for Aspose");

UpdateBookmarkRequest updateRequest = new UpdateBookmarkRequest("Sample.docx", bookmarkName, requestBookmarkData, null, null, null, null, null, null, null);
wordsApi.updateBookmark(updateRequest);