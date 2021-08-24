ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DownloadFileRequest downloadRequest = new DownloadFileRequest("Sample.docx", null, null);
wordsApi.downloadFile(downloadRequest);