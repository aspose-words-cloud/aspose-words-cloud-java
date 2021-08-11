String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
PageNumber requestPageNumber = new PageNumber();
requestPageNumber.setAlignment("center");
requestPageNumber.setFormat("{PAGE} of {NUMPAGES}");

InsertPageNumbersOnlineRequest insertRequestRequest = new InsertPageNumbersOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Common/Sample.docx").toAbsolutePath()),requestPageNumber,null,null,null,null,null);
wordsApi.insertPageNumbersOnline(insertRequestRequest);