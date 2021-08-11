ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
FootnoteUpdate requestFootnoteDto = new FootnoteUpdate();
requestFootnoteDto.setText("new text is here");

UpdateFootnoteRequest updateRequestRequest = new UpdateFootnoteRequest("Sample.docx",0,requestFootnoteDto,null,null,null,null,null,null,null,null);
wordsApi.updateFootnote(updateRequestRequest);