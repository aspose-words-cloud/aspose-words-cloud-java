ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
RenderMathObjectRequest renderRequest = new RenderMathObjectRequest("Sample.docx", "png", 0, null, null, null, null, null, null, null);
wordsApi.renderMathObject(renderRequest);