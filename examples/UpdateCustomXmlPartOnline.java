String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
CustomXmlPartUpdate requestCustomXmlPart = new CustomXmlPartUpdate();
requestCustomXmlPart.setData("<data>Hello world</data>");

UpdateCustomXmlPartOnlineRequest updateRequestRequest = new UpdateCustomXmlPartOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,requestCustomXmlPart,null,null,null,null,null);
wordsApi.updateCustomXmlPartOnline(updateRequestRequest);