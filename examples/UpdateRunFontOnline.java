ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
Font requestFontDto = new Font();
requestFontDto.setBold(true);

UpdateRunFontOnlineRequest updateRequest = new UpdateRunFontOnlineRequest(requestDocument, "paragraphs/0", requestFontDto, 0, null, null, null, null, null);
wordsApi.updateRunFontOnline(updateRequest);