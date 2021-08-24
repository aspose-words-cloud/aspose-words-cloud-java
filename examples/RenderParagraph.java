ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
RenderParagraphRequest renderRequest = new RenderParagraphRequest("Sample.docx", "png", 0, null, null, null, null, null, null, null);
wordsApi.renderParagraph(renderRequest);