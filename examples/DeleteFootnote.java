ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteFootnoteRequest deleteRequestRequest = new DeleteFootnoteRequest("Sample.docx",0,null,null,null,null,null,null,null,null);
wordsApi.deleteFootnote(deleteRequestRequest);