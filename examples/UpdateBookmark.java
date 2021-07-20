ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";
String bookmarkName = "aspose";

BookmarkData testBookmarkData = new BookmarkData();
testBookmarkData.setName(bookmarkName);
testBookmarkData.setText("New Bookmark Text");

UpdateBookmarkRequest updateBookmarkRequest = new UpdateBookmarkRequest(remoteFileName,bookmarkName,testBookmarkData,null,null,null,null,null,null,null);
wordsApi.updateBookmark(updateBookmarkRequest);