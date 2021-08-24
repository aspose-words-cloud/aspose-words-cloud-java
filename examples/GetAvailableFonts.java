ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetAvailableFontsRequest request = new GetAvailableFontsRequest(null);
wordsApi.getAvailableFonts(request);