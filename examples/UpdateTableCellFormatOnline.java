String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
TableCellFormat requestFormat = new TableCellFormat();
requestFormat.setBottomPadding((double)5);
requestFormat.setFitText(true);
requestFormat.setHorizontalMerge(TableCellFormat.HorizontalMergeEnum.FIRST);
requestFormat.setWrapText(true);

UpdateTableCellFormatOnlineRequest updateRequestRequest = new UpdateTableCellFormatOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"sections/0/tables/2/rows/0",requestFormat,0,null,null,null,null,null);
wordsApi.updateTableCellFormatOnline(updateRequestRequest);