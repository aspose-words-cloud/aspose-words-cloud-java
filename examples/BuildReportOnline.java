ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestTemplate = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
ReportEngineSettings requestReportEngineSettings = new ReportEngineSettings();
requestReportEngineSettings.setDataSourceType(ReportEngineSettings.DataSourceTypeEnum.JSON);
requestReportEngineSettings.setDataSourceName("persons");

BuildReportOnlineRequest buildReportRequest = new BuildReportOnlineRequest(requestTemplate, "Data.json", requestReportEngineSettings, null);
wordsApi.buildReportOnline(buildReportRequest);