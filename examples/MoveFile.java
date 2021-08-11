ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
MoveFileRequest moveRequestRequest = new MoveFileRequest("/TestMoveFileDest_Sample.docx","Sample.docx",null,null,null);
wordsApi.moveFile(moveRequestRequest);