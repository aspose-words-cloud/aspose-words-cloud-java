String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
TableProperties requestProperties = new TableProperties();
requestProperties.setAlignment(TableProperties.AlignmentEnum.RIGHT);
requestProperties.setAllowAutoFit(false);
requestProperties.setBidi(true);
requestProperties.setBottomPadding((double)1);
requestProperties.setCellSpacing((double)2);
requestProperties.setStyleOptions(TableProperties.StyleOptionsEnum.COLUMNBANDS);

UpdateTablePropertiesOnlineRequest updateRequestRequest = new UpdateTablePropertiesOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestProperties,1,"",null,null,null,null,null);
wordsApi.updateTablePropertiesOnline(updateRequestRequest);