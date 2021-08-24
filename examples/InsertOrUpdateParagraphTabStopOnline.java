ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
TabStopInsert requestTabStopInsertDto = new TabStopInsert();
requestTabStopInsertDto.setAlignment(TabStopInsert.AlignmentEnum.LEFT);
requestTabStopInsertDto.setLeader(TabStopInsert.LeaderEnum.NONE);
requestTabStopInsertDto.setPosition((double)72);

InsertOrUpdateParagraphTabStopOnlineRequest insertRequest = new InsertOrUpdateParagraphTabStopOnlineRequest(requestDocument, requestTabStopInsertDto, 0, null, null, null, null);
wordsApi.insertOrUpdateParagraphTabStopOnline(insertRequest);