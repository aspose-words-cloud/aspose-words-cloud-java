ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
RenderDrawingObjectRequest renderRequestRequest = new RenderDrawingObjectRequest("Sample.docx","png",0,null,null,null,null,null,null,null);
wordsApi.renderDrawingObject(renderRequestRequest);