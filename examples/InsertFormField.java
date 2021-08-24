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

InsertFormFieldRequest insertRequest = new InsertFormFieldRequest("Sample.docx", requestFormField, null, null, null, null, null, null, null, null, null);
wordsApi.insertFormField(insertRequest);