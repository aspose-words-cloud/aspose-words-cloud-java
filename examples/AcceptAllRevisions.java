import com.aspose.words.cloud.*;
import com.aspose.words.cloud.api.*;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import com.aspose.words.cloud.model.responses.*;
import java.nio.file.Files;
import java.nio.file.Paths;

String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
String fileName  = "test_doc.docx";

// Upload original document to cloud storage.
UploadFileRequest uploadFileRequest = new UploadFileRequest(Files.readAllBytes(Paths.get(documentsDir, fileName).toAbsolutePath()),fileName,null);
wordsApi.uploadFile(uploadFileRequest);

// Calls AcceptAllRevisions method for document in cloud.
AcceptAllRevisionsRequest request = new AcceptAllRevisionsRequest(fileName,null,null,null,null,null);
wordsApi.acceptAllRevisions(request);