ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
ListFormatUpdate requestListFormatDto = new ListFormatUpdate();
requestListFormatDto.setListId(2);

UpdateParagraphListFormatOnlineRequest updateRequest = new UpdateParagraphListFormatOnlineRequest(requestDocument, requestListFormatDto, 0, null, null, null, null, null, null);
wordsApi.updateParagraphListFormatOnline(updateRequest);