String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DocumentEntry requestDocumentListDocumentEntries0 = new DocumentEntry();
requestDocumentListDocumentEntries0.setHref("Sample.docx");
requestDocumentListDocumentEntries0.setImportFormatMode("KeepSourceFormatting");

ArrayList<DocumentEntry> requestDocumentListDocumentEntries = new ArrayList<DocumentEntry>();
requestDocumentListDocumentEntries.add(requestDocumentListDocumentEntries0);

DocumentEntryList requestDocumentList = new DocumentEntryList();
requestDocumentList.setDocumentEntries(requestDocumentListDocumentEntries);

AppendDocumentOnlineRequest appendRequestRequest = new AppendDocumentOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestDocumentList,null,null,null,null,null);
wordsApi.appendDocumentOnline(appendRequestRequest);