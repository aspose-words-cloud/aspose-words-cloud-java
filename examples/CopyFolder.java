ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String folderToCopy = "/TestCopyFolder";

CopyFolderRequest copyRequest = new CopyFolderRequest(folderToCopy + "Dest", folderToCopy + "Src", null, null);
wordsApi.copyFolder(copyRequest);