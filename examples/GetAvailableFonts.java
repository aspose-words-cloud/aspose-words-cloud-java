ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetAvailableFontsRequest requestRequest = new GetAvailableFontsRequest(null);
wordsApi.getAvailableFonts(requestRequest);