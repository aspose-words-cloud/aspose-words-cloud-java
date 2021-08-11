ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
TableRowFormat requestFormat = new TableRowFormat();
requestFormat.setAllowBreakAcrossPages(true);
requestFormat.setHeadingFormat(true);
requestFormat.setHeight((double)10.0);
requestFormat.setHeightRule(TableRowFormat.HeightRuleEnum.EXACTLY);

UpdateTableRowFormatRequest updateRequestRequest = new UpdateTableRowFormatRequest("Sample.docx","sections/0/tables/2",0,requestFormat,null,null,null,null,null,null,null);
wordsApi.updateTableRowFormat(updateRequestRequest);