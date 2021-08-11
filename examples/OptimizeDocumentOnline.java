String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
OptimizationOptions requestOptions = new OptimizationOptions();
requestOptions.setMsWordVersion(OptimizationOptions.MsWordVersionEnum.WORD2002);

OptimizeDocumentOnlineRequest optimizeRequestRequest = new OptimizeDocumentOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestOptions,null,null,null,null,null);
wordsApi.optimizeDocumentOnline(optimizeRequestRequest);