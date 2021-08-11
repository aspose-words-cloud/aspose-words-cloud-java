ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";

FormFieldTextInput requestFormField = new FormFieldTextInput();
requestFormField.setName("FullName");
requestFormField.setEnabled(true);
requestFormField.setCalculateOnExit(true);
requestFormField.setStatusText("");
requestFormField.setTextInputType(FormFieldTextInput.TextInputTypeEnum.REGULAR);
requestFormField.setTextInputDefault("No name");

UpdateFormFieldRequest updateRequestRequest = new UpdateFormFieldRequest(remoteFileName,0,requestFormField,null,null,null,null,null,remoteFileName,null,null);
wordsApi.updateFormField(updateRequestRequest);