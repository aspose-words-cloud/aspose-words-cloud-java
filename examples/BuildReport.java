ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ArrayList<ReportBuildOptions> requestReportEngineSettingsReportBuildOptions = new ArrayList<ReportBuildOptions>();
requestReportEngineSettingsReportBuildOptions.add(ReportBuildOptions.ALLOWMISSINGMEMBERS);
requestReportEngineSettingsReportBuildOptions.add(ReportBuildOptions.REMOVEEMPTYPARAGRAPHS);

ReportEngineSettings requestReportEngineSettings = new ReportEngineSettings();
requestReportEngineSettings.setDataSourceType(ReportEngineSettings.DataSourceTypeEnum.JSON);
requestReportEngineSettings.setReportBuildOptions(requestReportEngineSettingsReportBuildOptions);

BuildReportRequest buildReportRequest = new BuildReportRequest("Sample.docx", "Data.json", requestReportEngineSettings, null, null, null, null, null);
wordsApi.buildReport(buildReportRequest);