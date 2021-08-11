ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentStatisticsRequest requestRequest = new GetDocumentStatisticsRequest("Sample.docx",null,null,null,null,null,null,null);
wordsApi.getDocumentStatistics(requestRequest);