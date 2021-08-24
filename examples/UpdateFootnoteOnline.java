ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
FootnoteUpdate requestFootnoteDto = new FootnoteUpdate();
requestFootnoteDto.setText("new text is here");

UpdateFootnoteOnlineRequest updateRequest = new UpdateFootnoteOnlineRequest(requestDocument, requestFootnoteDto, 0, null, null, null, null, null, null);
wordsApi.updateFootnoteOnline(updateRequest);