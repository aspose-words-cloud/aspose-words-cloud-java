ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
ParagraphFormatUpdate requestParagraphFormatDto = new ParagraphFormatUpdate();
requestParagraphFormatDto.setAlignment(ParagraphFormatUpdate.AlignmentEnum.RIGHT);

UpdateParagraphFormatOnlineRequest updateRequest = new UpdateParagraphFormatOnlineRequest(requestDocument, requestParagraphFormatDto, 0, null, null, null, null, null, null);
wordsApi.updateParagraphFormatOnline(updateRequest);