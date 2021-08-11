String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetHeaderFooterOfSectionOnlineRequest requestRequest = new GetHeaderFooterOfSectionOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/HeaderFooters/HeadersFooters.doc").toAbsolutePath()),0,0,null,null,null);
wordsApi.getHeaderFooterOfSectionOnline(requestRequest);