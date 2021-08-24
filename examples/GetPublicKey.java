ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetPublicKeyRequest request = new GetPublicKeyRequest();
wordsApi.getPublicKey(request);