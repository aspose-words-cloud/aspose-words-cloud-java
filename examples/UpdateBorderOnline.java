String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
XmlColor requestBorderPropertiesColor = new XmlColor();
requestBorderPropertiesColor.setWeb("#AABBCC");

Border requestBorderProperties = new Border();
requestBorderProperties.setBorderType(Border.BorderTypeEnum.LEFT);
requestBorderProperties.setColor(requestBorderPropertiesColor);
requestBorderProperties.setDistanceFromText((double)6);
requestBorderProperties.setLineStyle(Border.LineStyleEnum.DASHDOTSTROKER);
requestBorderProperties.setLineWidth((double)2);
requestBorderProperties.setShadow(true);

UpdateBorderOnlineRequest updateRequestRequest = new UpdateBorderOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestBorderProperties,"left","tables/1/rows/0/cells/0",null,null,null,null,null);
wordsApi.updateBorderOnline(updateRequestRequest);