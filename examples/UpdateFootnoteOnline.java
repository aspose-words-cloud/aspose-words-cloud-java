String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
FootnoteUpdate requestFootnoteDto = new FootnoteUpdate();
requestFootnoteDto.setText("new text is here");

UpdateFootnoteOnlineRequest updateRequestRequest = new UpdateFootnoteOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "/Footnote.doc").toAbsolutePath()),requestFootnoteDto,0,"",null,null,null,null,null);
wordsApi.updateFootnoteOnline(updateRequestRequest);