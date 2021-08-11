ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentProtectionRequest requestRequest = new GetDocumentProtectionRequest("Sample.docx",null,null,null,null);
wordsApi.getDocumentProtection(requestRequest);