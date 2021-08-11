String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteParagraphTabStopOnlineRequest deleteRequestRequest = new DeleteParagraphTabStopOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "/ParagraphTabStops.docx").toAbsolutePath()),(double)72.0,0,"",null,null,null);
wordsApi.deleteParagraphTabStopOnline(deleteRequestRequest);