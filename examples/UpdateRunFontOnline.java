String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
Font requestFontDto = new Font();
requestFontDto.setBold(true);

UpdateRunFontOnlineRequest updateRequestRequest = new UpdateRunFontOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"paragraphs/0",requestFontDto,0,null,null,null,null,null);
wordsApi.updateRunFontOnline(updateRequestRequest);