package com.aspose.words;
import com.aspose.words.api.WordsApi;
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
        Map<String, String> creds = new Gson().fromJson(new JsonReader(new FileReader("Settings/servercreds.json")), Map.class);
        if (creds == null) {
            throw new FileNotFoundException("Please put your credentials into Settings/servercreds.json file");
        }

        wordsApi = new WordsApi(new ApiClient());
        ApiClient client = wordsApi.getApiClient();
        client.setBaseUrl(creds.get("BaseUrl")).setAppKey(creds.get("AppKey")).setAppSid(creds.get("AppSid"));
    }

    public static void uploadFile(String remoteName, String fileName) throws ApiException {
        wordsApi.putCreate(remoteName, new File(fileName),null, null);
    }
}
