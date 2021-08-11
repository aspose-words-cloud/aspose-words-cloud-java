String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteParagraphOnlineRequest deleteRequestRequest = new DeleteParagraphOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,"",null,null,null,null,null);
wordsApi.deleteParagraphOnline(deleteRequestRequest);