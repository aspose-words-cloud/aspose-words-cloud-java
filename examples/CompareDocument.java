ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
CompareData requestCompareData = new CompareData();
requestCompareData.setAuthor("author");
requestCompareData.setComparingWithDocument("TestCompareDocument2.doc");
requestCompareData.setDateTime(OffsetDateTime.of(2015, 10, 26, 0, 0, 0, 0, ZoneOffset.UTC));

CompareDocumentRequest compareRequest = new CompareDocumentRequest("TestCompareDocument1.doc", requestCompareData, null, null, null, null, "/TestCompareDocumentOut.doc");
wordsApi.compareDocument(compareRequest);