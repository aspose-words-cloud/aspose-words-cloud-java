String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteParagraphListFormatOnlineRequest deleteRequestRequest = new DeleteParagraphListFormatOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "/ParagraphDeleteListFormat.doc").toAbsolutePath()),0,"",null,null,null,null,null);
wordsApi.deleteParagraphListFormatOnline(deleteRequestRequest);