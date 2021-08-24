ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ListFormatUpdate requestListFormatDto = new ListFormatUpdate();
requestListFormatDto.setListId(2);

UpdateParagraphListFormatRequest updateRequest = new UpdateParagraphListFormatRequest("Sample.docx", 0, requestListFormatDto, null, null, null, null, null, null, null, null);
wordsApi.updateParagraphListFormat(updateRequest);