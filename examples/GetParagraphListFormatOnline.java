String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetParagraphListFormatOnlineRequest requestRequest = new GetParagraphListFormatOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "/ParagraphGetListFormat.doc").toAbsolutePath()),0,"",null,null);
wordsApi.getParagraphListFormatOnline(requestRequest);