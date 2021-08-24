ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestFileContent = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
UploadFileRequest uploadRequest = new UploadFileRequest(requestFileContent, "Sample.docx", null);
wordsApi.uploadFile(uploadRequest);