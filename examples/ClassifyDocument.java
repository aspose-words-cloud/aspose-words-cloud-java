ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ClassifyDocumentRequest classifyRequestRequest = new ClassifyDocumentRequest("Sample.docx",null,null,null,null,"3",null);
wordsApi.classifyDocument(classifyRequestRequest);