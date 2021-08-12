String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteFootnoteOnlineRequest deleteRequestRequest = new DeleteFootnoteOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath()),0,null,null,null,null,null,null);
wordsApi.deleteFootnoteOnline(deleteRequestRequest);