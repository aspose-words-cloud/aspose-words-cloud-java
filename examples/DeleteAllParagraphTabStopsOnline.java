String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteAllParagraphTabStopsOnlineRequest deleteRequestRequest = new DeleteAllParagraphTabStopsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "/ParagraphTabStops.docx").toAbsolutePath()),0,"",null,null,null);
wordsApi.deleteAllParagraphTabStopsOnline(deleteRequestRequest);