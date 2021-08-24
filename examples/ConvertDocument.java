ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
ConvertDocumentRequest convertRequest = new ConvertDocumentRequest(requestDocument, "pdf", null, null, null, null);
wordsApi.convertDocument(convertRequest);