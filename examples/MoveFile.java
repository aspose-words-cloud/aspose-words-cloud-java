ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
MoveFileRequest moveRequest = new MoveFileRequest("/TestMoveFileDest_Sample.docx", "Sample.docx", null, null, null);
wordsApi.moveFile(moveRequest);