ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("compareTestDoc1.doc").toAbsolutePath());
CompareData requestCompareData = new CompareData();
requestCompareData.setAuthor("author");
requestCompareData.setComparingWithDocument("TestCompareDocument2.doc");
requestCompareData.setDateTime(OffsetDateTime.of(2015, 10, 26, 0, 0, 0, 0, ZoneOffset.UTC));

byte[] requestComparingDocument = Files.readAllBytes(Paths.get("compareTestDoc2.doc").toAbsolutePath());
CompareDocumentOnlineRequest compareRequest = new CompareDocumentOnlineRequest(requestDocument, requestCompareData, requestComparingDocument, null, null, "/TestCompareDocumentOut.doc");
wordsApi.compareDocumentOnline(compareRequest);