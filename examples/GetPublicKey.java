ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetPublicKeyRequest requestRequest = new GetPublicKeyRequest();
wordsApi.getPublicKey(requestRequest);