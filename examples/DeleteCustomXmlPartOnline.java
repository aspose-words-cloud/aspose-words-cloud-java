String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteCustomXmlPartOnlineRequest deleteRequestRequest = new DeleteCustomXmlPartOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,null,null,null,null,null);
wordsApi.deleteCustomXmlPartOnline(deleteRequestRequest);