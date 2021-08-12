String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
TabStopInsert requestTabStopInsertDto = new TabStopInsert();
requestTabStopInsertDto.setAlignment(TabStopInsert.AlignmentEnum.LEFT);
requestTabStopInsertDto.setLeader(TabStopInsert.LeaderEnum.NONE);
requestTabStopInsertDto.setPosition((double)72);

InsertOrUpdateParagraphTabStopOnlineRequest insertRequestRequest = new InsertOrUpdateParagraphTabStopOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestTabStopInsertDto,0,null,null,null,null);
wordsApi.insertOrUpdateParagraphTabStopOnline(insertRequestRequest);