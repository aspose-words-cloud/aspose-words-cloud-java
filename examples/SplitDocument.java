ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
SplitDocumentRequest splitRequestRequest = new SplitDocumentRequest("Sample.docx","text",null,null,null,null,"/TestSplitDocument.text",1,2,null,null);
wordsApi.splitDocument(splitRequestRequest);