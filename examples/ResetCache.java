ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ResetCacheRequest resetRequest = new ResetCacheRequest();
wordsApi.resetCache(resetRequest);