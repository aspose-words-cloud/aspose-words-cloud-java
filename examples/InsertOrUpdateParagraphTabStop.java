ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
TabStopInsert requestTabStopInsertDto = new TabStopInsert();
requestTabStopInsertDto.setAlignment(TabStopInsert.AlignmentEnum.LEFT);
requestTabStopInsertDto.setLeader(TabStopInsert.LeaderEnum.NONE);
requestTabStopInsertDto.setPosition((double)100.0);

InsertOrUpdateParagraphTabStopRequest insertRequest = new InsertOrUpdateParagraphTabStopRequest("Sample.docx", 0, requestTabStopInsertDto, null, null, null, null, null, null);
wordsApi.insertOrUpdateParagraphTabStop(insertRequest);