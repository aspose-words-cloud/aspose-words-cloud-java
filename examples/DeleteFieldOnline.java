String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteFieldOnlineRequest deleteRequestRequest = new DeleteFieldOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,"sections/0/paragraphs/0",null,null,null,null,null);
wordsApi.deleteFieldOnline(deleteRequestRequest);