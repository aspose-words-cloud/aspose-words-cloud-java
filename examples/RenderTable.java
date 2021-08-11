ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
RenderTableRequest renderRequestRequest = new RenderTableRequest("Sample.docx","png",0,null,null,null,null,null,null,null);
wordsApi.renderTable(renderRequestRequest);