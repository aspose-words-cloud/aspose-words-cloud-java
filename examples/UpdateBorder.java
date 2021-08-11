ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
XmlColor requestBorderPropertiesColor = new XmlColor();
requestBorderPropertiesColor.setWeb("#AABBCC");

Border requestBorderProperties = new Border();
requestBorderProperties.setBorderType(Border.BorderTypeEnum.LEFT);
requestBorderProperties.setColor(requestBorderPropertiesColor);
requestBorderProperties.setDistanceFromText((double)6.0);
requestBorderProperties.setLineStyle(Border.LineStyleEnum.DASHDOTSTROKER);
requestBorderProperties.setLineWidth((double)2.0);
requestBorderProperties.setShadow(true);

UpdateBorderRequest updateRequestRequest = new UpdateBorderRequest("Sample.docx","left",requestBorderProperties,"tables/1/rows/0/cells/0",null,null,null,null,null,null,null);
wordsApi.updateBorder(updateRequestRequest);