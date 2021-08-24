ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
FormFieldTextInput requestFormField = new FormFieldTextInput();
requestFormField.setName("FullName");
requestFormField.setEnabled(true);
requestFormField.setCalculateOnExit(true);
requestFormField.setStatusText("");
requestFormField.setTextInputType(FormFieldTextInput.TextInputTypeEnum.REGULAR);
requestFormField.setTextInputDefault("No name");

UpdateFormFieldOnlineRequest updateRequest = new UpdateFormFieldOnlineRequest(requestDocument, requestFormField, 0, "sections/0", null, null, null, null, null);
wordsApi.updateFormFieldOnline(updateRequest);