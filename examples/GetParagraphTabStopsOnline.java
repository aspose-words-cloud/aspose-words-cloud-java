String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetParagraphTabStopsOnlineRequest requestRequest = new GetParagraphTabStopsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "/ParagraphTabStops.docx").toAbsolutePath()),0,"",null,null);
wordsApi.getParagraphTabStopsOnline(requestRequest);