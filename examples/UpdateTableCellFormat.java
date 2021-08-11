ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
TableCellFormat requestFormat = new TableCellFormat();
requestFormat.setBottomPadding((double)5.0);
requestFormat.setFitText(true);
requestFormat.setHorizontalMerge(TableCellFormat.HorizontalMergeEnum.FIRST);
requestFormat.setWrapText(true);

UpdateTableCellFormatRequest updateRequestRequest = new UpdateTableCellFormatRequest("Sample.docx","sections/0/tables/2/rows/0",0,requestFormat,null,null,null,null,null,null,null);
wordsApi.updateTableCellFormat(updateRequestRequest);