ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentWithFormatRequest requestRequest = new GetDocumentWithFormatRequest("Sample.docx","text",null,null,null,null,"/TestGetDocumentWithFormatAndOutPath.text",null);
wordsApi.getDocumentWithFormat(requestRequest);