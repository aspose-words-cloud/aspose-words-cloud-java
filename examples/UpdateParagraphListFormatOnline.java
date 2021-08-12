String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ListFormatUpdate requestListFormatDto = new ListFormatUpdate();
requestListFormatDto.setListId(2);

UpdateParagraphListFormatOnlineRequest updateRequestRequest = new UpdateParagraphListFormatOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath()),requestListFormatDto,0,null,null,null,null,null,null);
wordsApi.updateParagraphListFormatOnline(updateRequestRequest);