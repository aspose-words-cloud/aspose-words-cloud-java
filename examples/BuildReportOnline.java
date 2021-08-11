String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ReportEngineSettings requestReportEngineSettings = new ReportEngineSettings();
requestReportEngineSettings.setDataSourceType(ReportEngineSettings.DataSourceTypeEnum.JSON);
requestReportEngineSettings.setDataSourceName("persons");

BuildReportOnlineRequest buildReportRequestRequest = new BuildReportOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"Data.json",requestReportEngineSettings,null);
wordsApi.buildReportOnline(buildReportRequestRequest);