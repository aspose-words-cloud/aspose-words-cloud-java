package com.aspose.words.cloud;
import com.aspose.words.cloud.api.WordsApi;
import com.aspose.words.cloud.model.FilesUploadResult;
import com.aspose.words.cloud.model.requests.UploadFileRequest;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public final class TestInitializer {
    public static WordsApi wordsApi;
    public static String LocalTestFolder = "TestData";
    public static String LocalCommonFolder = StringUtil.join("/",LocalTestFolder, "Common");
    public static String RemoteTestFolder = StringUtil.join("/","Temp", "SdkTests", "java");
    public static String RemoteTestOut =  StringUtil.join("/",RemoteTestFolder, "TestOut");


    public static void Initialize() throws FileNotFoundException {
        Initialize("Settings/servercreds.json");
    }

    public static void Initialize(String fileName) throws FileNotFoundException {
        Map<String, String> creds = new Gson().fromJson(new JsonReader(new FileReader(fileName)), Map.class);
        if (creds == null) {
            throw new FileNotFoundException("Please put your credentials into Settings/servercreds.json file");
        }

        wordsApi = new WordsApi(new ApiClient());
        ApiClient client = wordsApi.getApiClient();
        client.setBaseUrl(creds.get("BaseUrl")).setAppKey(creds.get("AppKey")).setAppSid(creds.get("AppSid"));
    }

    public static FilesUploadResult uploadFile(String fileName, String remoteName) throws ApiException {
        return wordsApi.uploadFile(new UploadFileRequest(new File(fileName), remoteName, null));
    }
}
