ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Common/Sample.docx").toAbsolutePath());
PageNumber requestPageNumber = new PageNumber();
requestPageNumber.setAlignment("center");
requestPageNumber.setFormat("{PAGE} of {NUMPAGES}");

InsertPageNumbersOnlineRequest insertRequest = new InsertPageNumbersOnlineRequest(requestDocument, requestPageNumber, null, null, null, null, null);
wordsApi.insertPageNumbersOnline(insertRequest);