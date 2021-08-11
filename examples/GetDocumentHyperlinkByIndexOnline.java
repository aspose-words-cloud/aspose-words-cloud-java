String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentHyperlinkByIndexOnlineRequest requestRequest = new GetDocumentHyperlinkByIndexOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,null,null);
wordsApi.getDocumentHyperlinkByIndexOnline(requestRequest);