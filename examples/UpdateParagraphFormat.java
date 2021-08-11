ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ParagraphFormatUpdate requestParagraphFormatDto = new ParagraphFormatUpdate();
requestParagraphFormatDto.setAlignment(ParagraphFormatUpdate.AlignmentEnum.RIGHT);

UpdateParagraphFormatRequest updateRequestRequest = new UpdateParagraphFormatRequest("Sample.docx",0,requestParagraphFormatDto,"",null,null,null,null,null,null,null);
wordsApi.updateParagraphFormat(updateRequestRequest);