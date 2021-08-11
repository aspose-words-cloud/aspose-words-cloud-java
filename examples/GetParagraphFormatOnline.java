String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetParagraphFormatOnlineRequest requestRequest = new GetParagraphFormatOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,"",null,null);
wordsApi.getParagraphFormatOnline(requestRequest);