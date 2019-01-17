# AsposeWordsCloud
This repository contains Aspose.Words Cloud SDK for Java source code. This SDK allows you to work with Aspose.Words Cloud REST APIs in your Java applications quickly and easily, with zero initial cost.

## Key Features
* Conversion between various document-related formats (20+ formats supported), including PDF<->Word conversion
* Mail merge and reports generation 
* Splitting Word documents
* Accessing Word document metadata and statistics
* Find and replace
* Watermarks and protection
* Full read & write access to Document Object Model, including sections, paragraphs, text, images, tables, headers/footers and many others

See [API Reference](https://apireference.aspose.cloud/words/) for full API specification.

## How to use the SDK?
The complete source code is available in this repository folder. You can either directly use it in your project via source code or get [Maven](https://mvnrepository.com/artifact/com.aspose/aspose-cloud-words) (recommended). For more details, please visit our [documentation website](https://docs.aspose.cloud/display/wordscloud/Available+SDKs).

### Prerequisites

To use Aspose Words for Cloud Java SDK you need to register an account with [Aspose Cloud](https://www.aspose.cloud/) and lookup/create App Key and SID at [Cloud Dashboard](https://dashboard.aspose.cloud/#/apps). There is free quota available. For more details, see [Aspose Cloud Pricing](https://purchase.aspose.cloud/pricing).

## Installation & Usage
Add this dependency to your project's POM:

```xml
<repositories>
    <repository>
        <id>aspose-cloud</id>
        <name>artifact.aspose-cloud-releases</name>
        <url>http://artifact.aspose.cloud/repo</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.aspose</groupId>
        <artifactId>aspose-cloud-storage</artifactId>
        <version>1.0.1</version>
    </dependency>
    <dependency>
        <groupId>com.aspose</groupId>
        <artifactId>aspose-words-cloud</artifactId>
        <version>18.9.0</version>
    </dependency>
</dependencies>
```

## Getting Started

```java

import com.aspose.words.*;
import com.aspose.words.auth.*;
import com.aspose.words.model.*;
import com.aspose.words.api.WordsApi;

import java.io.File;
import java.util.*;

public class WordsApiExample {

    public static void main(String[] args) {
        
        WordsApi wordsApi = new WordsApi();
        String remoteName = "TestDeleteDocumentWatermark.docx";
		String remoteFolder = "TestFolder"
		DeleteDocumentWatermarkRequest request = new DeleteDocumentWatermarkRequest(remoteName,
                remoteFolder, null, null, null, null, null, null);

        DocumentResponse result = wordsApi.deleteDocumentWatermark(request);
    }
}

```

[Test](src/test/java/com/aspose/words) contain various examples of using the SDK.
Please put your credentials into [ApiClient](src/main/java/com/aspose/words/ApiClient.java).

## Dependencies
- Java 1.7+
- referenced packages (see [here](pom.xml) for more details)

## Comparison with Old generation SDK
New SDK has the following advantages over the [previous version](https://github.com/aspose-words/Aspose.Words-for-Cloud):
+ SDK is fully in sync with the API, all missing methods are added
+ Classes, methods and properties have comments and are IDE-friendly
+ Better security
+ Usage of Request/Response classes to represent long lists of parameters. This allows for cleaner code and easier backwards-compatibility going forward

New SDK is not backwards compatible with previous generation because of the last item. It should be straightforward to convert your code to using Request/Response objects, if you need any help on migration please ask at [Free Support Forums](https://forum.aspose.cloud/c/words).

## Contact Us
Your feedback is very important to us. Please feel free to contact us using our [Support Forums](https://forum.aspose.cloud/c/words).
