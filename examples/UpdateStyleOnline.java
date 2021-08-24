ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
StyleUpdate requestStyleUpdate = new StyleUpdate();
requestStyleUpdate.setName("My Style");

UpdateStyleOnlineRequest updateRequest = new UpdateStyleOnlineRequest(requestDocument, "Heading 1", requestStyleUpdate, null, null, null, null, null);
wordsApi.updateStyleOnline(updateRequest);