String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
TableRowFormat requestFormat = new TableRowFormat();
requestFormat.setAllowBreakAcrossPages(true);
requestFormat.setHeadingFormat(true);
requestFormat.setHeight((double)10);
requestFormat.setHeightRule(TableRowFormat.HeightRuleEnum.AUTO);

UpdateTableRowFormatOnlineRequest updateRequestRequest = new UpdateTableRowFormatOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"sections/0/tables/2",requestFormat,0,null,null,null,null,null);
wordsApi.updateTableRowFormatOnline(updateRequestRequest);