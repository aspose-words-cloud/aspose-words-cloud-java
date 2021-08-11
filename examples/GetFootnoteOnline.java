String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetFootnoteOnlineRequest requestRequest = new GetFootnoteOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "/Footnote.doc").toAbsolutePath()),0,"",null,null);
wordsApi.getFootnoteOnline(requestRequest);