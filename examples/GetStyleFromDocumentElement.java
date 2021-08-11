ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetStyleFromDocumentElementRequest requestRequest = new GetStyleFromDocumentElementRequest("Sample.docx","paragraphs/1/paragraphFormat",null,null,null,null);
wordsApi.getStyleFromDocumentElement(requestRequest);