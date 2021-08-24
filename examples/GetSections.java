ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetSectionsRequest request = new GetSectionsRequest("Sample.docx", null, null, null, null);
wordsApi.getSections(request);