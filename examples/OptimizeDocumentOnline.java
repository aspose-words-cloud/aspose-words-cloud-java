ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
OptimizationOptions requestOptions = new OptimizationOptions();
requestOptions.setMsWordVersion(OptimizationOptions.MsWordVersionEnum.WORD2002);

OptimizeDocumentOnlineRequest optimizeRequest = new OptimizeDocumentOnlineRequest(requestDocument, requestOptions, null, null, null, null, null);
wordsApi.optimizeDocumentOnline(optimizeRequest);