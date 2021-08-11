ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetSectionPageSetupRequest requestRequest = new GetSectionPageSetupRequest("Sample.docx",0,null,null,null,null);
wordsApi.getSectionPageSetup(requestRequest);