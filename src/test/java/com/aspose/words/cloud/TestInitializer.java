package com.aspose.words.cloud;
import com.aspose.words.cloud.api.WordsApi;
import com.aspose.words.cloud.model.FilesUploadResult;
import com.aspose.words.cloud.model.requests.UploadFileRequest;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;

public final class TestInitializer {
    public static WordsApi wordsApi;
    public static String LocalTestFolder = "TestData";
    public static String LocalCommonFolder = PathUtil.get(LocalTestFolder, "Common");
    public static String RemoteTestFolder = PathUtil.get("Temp", "SdkTests", "java");
    public static String RemoteTestOut = PathUtil.get(RemoteTestFolder, "TestOut");


    public static void Initialize() throws FileNotFoundException, ApiException {
        Initialize("Settings/servercreds.json");
    }
    public static void Initialize(String credsPath) throws FileNotFoundException, ApiException {
        Map<String, String> creds = new Gson().fromJson(new JsonReader(new FileReader(credsPath)), Map.class);
        if (creds == null) {
            throw new FileNotFoundException("Please put your credentials into Settings/servercreds.json file");
        }

        wordsApi = new WordsApi(creds.get("AppSid"), creds.get("AppKey"), creds.get("BaseUrl"));
    }

    public static FilesUploadResult UploadFile(String file, String path) throws IOException, ApiException {
        UploadFileRequest request = new UploadFileRequest(Files.readAllBytes(new File(file).toPath()), path, null);
        return wordsApi.uploadFile(request);
    }
}
