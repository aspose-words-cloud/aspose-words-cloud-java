ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
DocumentEntry requestDocumentListDocumentEntries0 = new DocumentEntry();
requestDocumentListDocumentEntries0.setHref("Sample.docx");
requestDocumentListDocumentEntries0.setImportFormatMode("KeepSourceFormatting");

ArrayList<DocumentEntry> requestDocumentListDocumentEntries = new ArrayList<DocumentEntry>();
requestDocumentListDocumentEntries.add(requestDocumentListDocumentEntries0);

DocumentEntryList requestDocumentList = new DocumentEntryList();
requestDocumentList.setDocumentEntries(requestDocumentListDocumentEntries);

AppendDocumentOnlineRequest appendRequest = new AppendDocumentOnlineRequest(requestDocument, requestDocumentList, null, null, null, null, null);
wordsApi.appendDocumentOnline(appendRequest);