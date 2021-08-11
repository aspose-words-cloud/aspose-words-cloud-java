String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetFormFieldsOnlineRequest requestRequest = new GetFormFieldsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "/FormFilled.docx").toAbsolutePath()),"sections/0",null,null);
wordsApi.getFormFieldsOnline(requestRequest);