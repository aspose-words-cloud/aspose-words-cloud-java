ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";

PageNumber requestPageNumber = new PageNumber();
requestPageNumber.setAlignment("center");
requestPageNumber.setFormat("{PAGE} of {NUMPAGES}");

InsertPageNumbersRequest insertRequestRequest = new InsertPageNumbersRequest(remoteFileName,requestPageNumber,null,null,null,null,remoteFileName,null,null);
wordsApi.insertPageNumbers(insertRequestRequest);