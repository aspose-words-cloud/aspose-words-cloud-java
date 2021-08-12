String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ParagraphFormatUpdate requestParagraphFormatDto = new ParagraphFormatUpdate();
requestParagraphFormatDto.setAlignment(ParagraphFormatUpdate.AlignmentEnum.RIGHT);

UpdateParagraphFormatOnlineRequest updateRequestRequest = new UpdateParagraphFormatOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestParagraphFormatDto,0,null,null,null,null,null,null);
wordsApi.updateParagraphFormatOnline(updateRequestRequest);