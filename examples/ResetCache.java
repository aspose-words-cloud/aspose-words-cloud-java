ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ResetCacheRequest resetRequestRequest = new ResetCacheRequest();
wordsApi.resetCache(resetRequestRequest);