String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
CompareData requestCompareData = new CompareData();
requestCompareData.setAuthor("author");
requestCompareData.setComparingWithDocument("TestCompareDocument2.doc");
requestCompareData.setDateTime(OffsetDateTime.of(2015, 10, 26, 0, 0, 0, 0, ZoneOffset.UTC));

CompareDocumentOnlineRequest compareRequestRequest = new CompareDocumentOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "compareTestDoc1.doc").toAbsolutePath()),requestCompareData,Files.readAllBytes(Paths.get(documentsDir, "compareTestDoc2.doc").toAbsolutePath()),null,null,"/TestCompareDocumentOut.doc");
wordsApi.compareDocumentOnline(compareRequestRequest);