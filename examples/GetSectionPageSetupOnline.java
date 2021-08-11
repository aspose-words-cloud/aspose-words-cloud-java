String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetSectionPageSetupOnlineRequest requestRequest = new GetSectionPageSetupOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,null,null);
wordsApi.getSectionPageSetupOnline(requestRequest);