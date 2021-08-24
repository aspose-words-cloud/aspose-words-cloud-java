ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
FormFieldTextInput requestFormField = new FormFieldTextInput();
requestFormField.setName("FullName");
requestFormField.setEnabled(true);
requestFormField.setCalculateOnExit(true);
requestFormField.setStatusText("");
requestFormField.setTextInputType(FormFieldTextInput.TextInputTypeEnum.REGULAR);
requestFormField.setTextInputDefault("No name");

UpdateFormFieldRequest updateRequest = new UpdateFormFieldRequest("Sample.docx", 0, requestFormField, null, null, null, null, null, null, null, null);
wordsApi.updateFormField(updateRequest);