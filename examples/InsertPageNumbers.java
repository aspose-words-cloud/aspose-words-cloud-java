ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
PageNumber requestPageNumber = new PageNumber();
requestPageNumber.setAlignment("center");
requestPageNumber.setFormat("{PAGE} of {NUMPAGES}");

InsertPageNumbersRequest insertRequestRequest = new InsertPageNumbersRequest("Sample.docx",requestPageNumber,null,null,null,null,null,null,null);
wordsApi.insertPageNumbers(insertRequestRequest);