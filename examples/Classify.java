ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ClassifyRequest classifyRequestRequest = new ClassifyRequest("Try text classification","3");
wordsApi.classify(classifyRequestRequest);