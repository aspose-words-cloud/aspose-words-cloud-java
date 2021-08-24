ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
TableProperties requestProperties = new TableProperties();
requestProperties.setAlignment(TableProperties.AlignmentEnum.RIGHT);
requestProperties.setAllowAutoFit(false);
requestProperties.setBidi(true);
requestProperties.setBottomPadding((double)1);
requestProperties.setCellSpacing((double)2);
requestProperties.setStyleOptions(TableProperties.StyleOptionsEnum.COLUMNBANDS);

UpdateTablePropertiesOnlineRequest updateRequest = new UpdateTablePropertiesOnlineRequest(requestDocument, requestProperties, 1, null, null, null, null, null, null);
wordsApi.updateTablePropertiesOnline(updateRequest);