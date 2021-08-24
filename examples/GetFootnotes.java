ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetFootnotesRequest request = new GetFootnotesRequest("Sample.docx", null, null, null, null, null);
wordsApi.getFootnotes(request);