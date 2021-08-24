ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetStyleFromDocumentElementRequest request = new GetStyleFromDocumentElementRequest("Sample.docx", "paragraphs/1/paragraphFormat", null, null, null, null);
wordsApi.getStyleFromDocumentElement(request);