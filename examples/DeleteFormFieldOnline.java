String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteFormFieldOnlineRequest deleteRequestRequest = new DeleteFormFieldOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "/FormFilled.docx").toAbsolutePath()),0,"sections/0",null,null,null,null,null);
wordsApi.deleteFormFieldOnline(deleteRequestRequest);