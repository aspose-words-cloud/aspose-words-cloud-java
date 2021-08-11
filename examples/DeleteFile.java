ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteFileRequest deleteRequestRequest = new DeleteFileRequest("Sample.docx",null,null);
wordsApi.deleteFile(deleteRequestRequest);