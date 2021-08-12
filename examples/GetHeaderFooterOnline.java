String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetHeaderFooterOnlineRequest requestRequest = new GetHeaderFooterOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath()),0,null,null,null);
wordsApi.getHeaderFooterOnline(requestRequest);