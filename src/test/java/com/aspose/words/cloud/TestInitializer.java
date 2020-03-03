package com.aspose.words.cloud;
import com.aspose.words.cloud.api.WordsApi;
import com.aspose.words.cloud.model.FilesUploadResult;
import com.aspose.words.cloud.model.requests.UploadFileRequest;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Map;

public final class TestInitializer {
    public static WordsApi wordsApi;
    public static String LocalTestFolder = "TestData";
    public static String LocalCommonFolder = PathUtil.get(LocalTestFolder, "Common").toString();
    public static String RemoteTestFolder = PathUtil.get("Temp", "SdkTests", "java").toString();
    public static String RemoteTestOut = PathUtil.get(RemoteTestFolder, "TestOut").toString();


    public static void Initialize() throws FileNotFoundException, ApiException {
        Initialize("Settings/servercreds.json");
    }
    public static void Initialize(String credsPath) throws FileNotFoundException, ApiException {
        Map<String, String> creds = new Gson().fromJson(new JsonReader(new FileReader(credsPath)), Map.class);
        if (creds == null) {
            throw new FileNotFoundException("Please put your credentials into Settings/servercreds.json file");
        }

        wordsApi = new WordsApi(new ApiClient());
        ApiClient client = wordsApi.getApiClient();
        client.setDebugging(false).setBaseUrl(creds.get("BaseUrl")).setAppKey(creds.get("AppKey")).setAppSid(creds.get("AppSid"));
    }

    public static FilesUploadResult UploadFile(String file, String path) throws FileNotFoundException, ApiException {
        UploadFileRequest request = new UploadFileRequest(new File(file), path, null);
        return wordsApi.uploadFile(request);
    }
}
