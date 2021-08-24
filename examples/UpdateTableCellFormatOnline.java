ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
TableCellFormat requestFormat = new TableCellFormat();
requestFormat.setBottomPadding((double)5);
requestFormat.setFitText(true);
requestFormat.setHorizontalMerge(TableCellFormat.HorizontalMergeEnum.FIRST);
requestFormat.setWrapText(true);

UpdateTableCellFormatOnlineRequest updateRequest = new UpdateTableCellFormatOnlineRequest(requestDocument, "sections/0/tables/2/rows/0", requestFormat, 0, null, null, null, null, null);
wordsApi.updateTableCellFormatOnline(updateRequest);