package com.aspose.words.Common;

import com.aspose.words.ApiException;
import com.aspose.words.TestInitializer;
import com.aspose.words.model.requests.GetSectionRequest;
import junit.framework.TestCase;
import org.junit.Assert;

public class TestErrorHandling extends TestCase {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    public void testHandleServerErrors() {
        String remoteName = "noFileWithThisName";
        GetSectionRequest request = new GetSectionRequest(remoteName, 0, null, null, null, null);
        try {
            TestInitializer.wordsApi.getSection(request);
            Assert.fail();
        }
        catch (ApiException ex){
            assertTrue(ex.getCode() == 400);
        }
    }
}
