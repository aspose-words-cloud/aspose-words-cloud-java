ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";

Font requestFontDto = new Font();
requestFontDto.setBold(true);

UpdateRunFontRequest updateRequestRequest = new UpdateRunFontRequest(remoteFileName,"paragraphs/0",0,requestFontDto,null,null,null,null,remoteFileName,null,null);
wordsApi.updateRunFont(updateRequestRequest);