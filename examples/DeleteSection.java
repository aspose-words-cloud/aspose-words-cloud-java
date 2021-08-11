ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteSectionRequest deleteRequestRequest = new DeleteSectionRequest("Sample.docx",0,null,null,null,null,null,null,null);
wordsApi.deleteSection(deleteRequestRequest);