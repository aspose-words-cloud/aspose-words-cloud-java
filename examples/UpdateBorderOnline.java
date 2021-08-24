ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
XmlColor requestBorderPropertiesColor = new XmlColor();
requestBorderPropertiesColor.setWeb("#AABBCC");

Border requestBorderProperties = new Border();
requestBorderProperties.setBorderType(Border.BorderTypeEnum.LEFT);
requestBorderProperties.setColor(requestBorderPropertiesColor);
requestBorderProperties.setDistanceFromText((double)6);
requestBorderProperties.setLineStyle(Border.LineStyleEnum.DASHDOTSTROKER);
requestBorderProperties.setLineWidth((double)2);
requestBorderProperties.setShadow(true);

UpdateBorderOnlineRequest updateRequest = new UpdateBorderOnlineRequest(requestDocument, requestBorderProperties, "left", "tables/1/rows/0/cells/0", null, null, null, null, null);
wordsApi.updateBorderOnline(updateRequest);