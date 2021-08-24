ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
RenderPageRequest renderRequest = new RenderPageRequest("Sample.docx", 1, "bmp", null, null, null, null, null);
wordsApi.renderPage(renderRequest);