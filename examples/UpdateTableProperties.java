ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
TableProperties requestProperties = new TableProperties();
requestProperties.setAlignment(TableProperties.AlignmentEnum.RIGHT);
requestProperties.setAllowAutoFit(false);
requestProperties.setBidi(true);
requestProperties.setBottomPadding((double)1.0);
requestProperties.setCellSpacing((double)2.0);
requestProperties.setStyleOptions(TableProperties.StyleOptionsEnum.COLUMNBANDS);

UpdateTablePropertiesRequest updateRequestRequest = new UpdateTablePropertiesRequest("Sample.docx",1,requestProperties,null,null,null,null,null,null,null,null);
wordsApi.updateTableProperties(updateRequestRequest);