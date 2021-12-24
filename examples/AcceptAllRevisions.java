import com.aspose.words.cloud.*;
import com.aspose.words.cloud.api.*;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import com.aspose.words.cloud.model.responses.*;
import java.nio.file.Files;
import java.nio.file.Paths;

ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String fileName = "test_doc.docx";

// Upload original document to cloud storage.
byte[] myVar1 = Files.readAllBytes(Paths.get(fileName).toAbsolutePath());
String myVar2 = fileName;
UploadFileRequest uploadFileRequest = new UploadFileRequest(myVar1, myVar2, null);
wordsApi.uploadFile(uploadFileRequest);

// Calls AcceptAllRevisions method for document in cloud.
String myVar3 = fileName;
AcceptAllRevisionsRequest request = new AcceptAllRevisionsRequest(myVar3, null, null, null, null, null, null);
wordsApi.acceptAllRevisions(request);