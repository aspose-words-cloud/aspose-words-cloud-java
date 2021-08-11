String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteOfficeMathObjectOnlineRequest deleteRequestRequest = new DeleteOfficeMathObjectOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,"",null,null,null,null,null);
wordsApi.deleteOfficeMathObjectOnline(deleteRequestRequest);