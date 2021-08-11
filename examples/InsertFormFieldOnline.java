String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
FormFieldTextInput requestFormField = new FormFieldTextInput();
requestFormField.setName("FullName");
requestFormField.setEnabled(true);
requestFormField.setCalculateOnExit(true);
requestFormField.setStatusText("");
requestFormField.setTextInputType(FormFieldTextInput.TextInputTypeEnum.REGULAR);
requestFormField.setTextInputDefault("123");
requestFormField.setTextInputFormat("UPPERCASE");

InsertFormFieldOnlineRequest insertRequestRequest = new InsertFormFieldOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "/FormFilled.docx").toAbsolutePath()),requestFormField,"sections/0/paragraphs/0",null,null,null,null,null,null);
wordsApi.insertFormFieldOnline(insertRequestRequest);