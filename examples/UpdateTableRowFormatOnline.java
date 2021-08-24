ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
TableRowFormat requestFormat = new TableRowFormat();
requestFormat.setAllowBreakAcrossPages(true);
requestFormat.setHeadingFormat(true);
requestFormat.setHeight((double)10);
requestFormat.setHeightRule(TableRowFormat.HeightRuleEnum.AUTO);

UpdateTableRowFormatOnlineRequest updateRequest = new UpdateTableRowFormatOnlineRequest(requestDocument, "sections/0/tables/2", requestFormat, 0, null, null, null, null, null);
wordsApi.updateTableRowFormatOnline(updateRequest);