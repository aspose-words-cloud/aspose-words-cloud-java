/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2019 Aspose.Words for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */
package com.aspose.words.cloud.Common;

import com.aspose.words.cloud.Document.TestDocument;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.DocumentActions.*;
import com.aspose.words.cloud.DocumentElements.*;
import com.aspose.words.cloud.Range.TestRange;
import com.aspose.words.cloud.Storage.*;
import com.aspose.words.cloud.api.WordsApi;
import com.squareup.okhttp.Call;

import org.junit.Test;

import junit.framework.TestCase;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class TestApiCoverage extends TestCase {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    @Test
    public void testApiCoverage() {
        Class[] testClasses = new Class[] { TestFont.class, TestFields.class, TestDocument.class, TestAppendDocument.class, TestDocumentProtection.class,
                                            TestClassification.class, TestCompareDocument.class, TestConvertDocument.class, TestDocumentStatistics.class,
                                            TestExecuteMailMerge.class, TestLoadWebDocument.class, TestMailMergeFields.class, TestRevisions.class,
                                            TestBookmarks.class, TestComments.class, TestDocumentProperties.class, TestDrawingObjects.class, TestFootnote.class,
                                            TestFormFields.class, TestHeaderFooter.class, TestHyperlinks.class, TestMacros.class, TestMathObjects.class,
                                            TestPages.class, TestParagraphs.class, TestRuns.class,TestSections.class, TestTables.class, TestText.class,
                                            TestText.class, TestWatermarks.class, TestRange.class, TestFileOperations.class, TestFolderOperations.class,
                                        TestSplitDocument.class };
        ArrayList<String> testMethods = new ArrayList<>();
        ArrayList<String> apiMethods = new ArrayList<>();
        ArrayList<String> uncoveredMethods = new ArrayList<>();
        Method[] allApiMethods = WordsApi.class.getDeclaredMethods();
        for (Method m:allApiMethods) {
            if (Modifier.isPublic(m.getModifiers()) && m.getExceptionTypes().length == 1 && m.getReturnType() != Call.class ) {
                apiMethods.add(m.getName());
            }
        }
        for (Class cls: testClasses) {
            Method[] methods = cls.getDeclaredMethods();
            for (Method m: methods) {
                if (Modifier.isPublic(m.getModifiers())){
                    testMethods.add(m.getName());
                }
            }
        }

        for (String m: apiMethods) {
            Boolean found = false;
            for (String tm: testMethods) {
                if (tm.toLowerCase().contains(m.toLowerCase())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                uncoveredMethods.add(m);
            }
        }

        assertEquals("You have to cover these methods with tests " + String.join("\n", uncoveredMethods), 0, uncoveredMethods.size());
    }
}
