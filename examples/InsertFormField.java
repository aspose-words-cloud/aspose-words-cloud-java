ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String remoteFileName = "Sample.docx";

FormFieldTextInput requestFormField = new FormFieldTextInput();
requestFormField.setName("FullName");
requestFormField.setEnabled(true);
requestFormField.setCalculateOnExit(true);
requestFormField.setStatusText("");
requestFormField.setTextInputType(FormFieldTextInput.TextInputTypeEnum.REGULAR);
requestFormField.setTextInputDefault("123");
requestFormField.setTextInputFormat("UPPERCASE");

InsertFormFieldRequest insertRequestRequest = new InsertFormFieldRequest(remoteFileName,requestFormField,null,null,null,null,null,remoteFileName,null,null,null);
wordsApi.insertFormField(insertRequestRequest);