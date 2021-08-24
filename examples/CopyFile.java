ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
CopyFileRequest copyRequest = new CopyFileRequest("/TestCopyFileDest.docx", "Sample.docx", null, null, null);
wordsApi.copyFile(copyRequest);