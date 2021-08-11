ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
OptimizationOptions requestOptions = new OptimizationOptions();
requestOptions.setMsWordVersion(OptimizationOptions.MsWordVersionEnum.WORD2002);

OptimizeDocumentRequest optimizeRequestRequest = new OptimizeDocumentRequest("Sample.docx",requestOptions,null,null,null,null,null,null,null);
wordsApi.optimizeDocument(optimizeRequestRequest);