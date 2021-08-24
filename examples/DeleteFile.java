ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteFileRequest deleteRequest = new DeleteFileRequest("Sample.docx", null, null);
wordsApi.deleteFile(deleteRequest);