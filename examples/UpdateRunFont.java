ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
Font requestFontDto = new Font();
requestFontDto.setBold(true);

UpdateRunFontRequest updateRequestRequest = new UpdateRunFontRequest("Sample.docx","paragraphs/0",0,requestFontDto,null,null,null,null,null,null,null);
wordsApi.updateRunFont(updateRequestRequest);