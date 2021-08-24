ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";

DocumentEntry requestDocumentListDocumentEntries0 = new DocumentEntry();
requestDocumentListDocumentEntries0.setHref(remoteFileName);
requestDocumentListDocumentEntries0.setImportFormatMode("KeepSourceFormatting");

ArrayList<DocumentEntry> requestDocumentListDocumentEntries = new ArrayList<DocumentEntry>();
requestDocumentListDocumentEntries.add(requestDocumentListDocumentEntries0);

DocumentEntryList requestDocumentList = new DocumentEntryList();
requestDocumentList.setDocumentEntries(requestDocumentListDocumentEntries);

AppendDocumentRequest appendRequest = new AppendDocumentRequest(remoteFileName, requestDocumentList, null, null, null, null, null, null, null);
wordsApi.appendDocument(appendRequest);