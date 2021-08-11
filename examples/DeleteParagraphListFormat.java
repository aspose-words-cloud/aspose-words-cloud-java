ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteParagraphListFormatRequest deleteRequestRequest = new DeleteParagraphListFormatRequest("Sample.docx",0,null,null,null,null,null,null,null,null);
wordsApi.deleteParagraphListFormat(deleteRequestRequest);