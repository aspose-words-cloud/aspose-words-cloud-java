String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetFormFieldOnlineRequest requestRequest = new GetFormFieldOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "/FormFilled.docx").toAbsolutePath()),0,"sections/0",null,null);
wordsApi.getFormFieldOnline(requestRequest);