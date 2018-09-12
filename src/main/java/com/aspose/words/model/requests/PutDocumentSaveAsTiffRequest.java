/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutDocumentSaveAsTiffRequest.java">
 *   Copyright (c) 2018 Aspose.Words for Cloud
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
 * --------------------------------------------------------------------------------------
 */
package com.aspose.words.model.requests;
import com.aspose.words.model.*;
import java.io.File;

/*
 * Request model for putDocumentSaveAsTiff operation.
 */
public class PutDocumentSaveAsTiffRequest {
    /*
     * 
     */
    private String Name;

    /*
     * 
     */
    private TiffSaveOptionsData SaveOptions;

    /*
     * Original document folder.
     */
    private String Folder;

    /*
     * File storage, which have to be used.
     */
    private String Storage;

    /*
     * Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    private String LoadEncoding;

    /*
     * Password for opening an encrypted document.
     */
    private String Password;

    /*
     * Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    private String DestFileName;

    /*
     * 
     */
    private String ResultFile;

    /*
     * 
     */
    private Boolean UseAntiAliasing;

    /*
     * 
     */
    private Boolean UseHighQualityRendering;

    /*
     * 
     */
    private Double ImageBrightness;

    /*
     * 
     */
    private String ImageColorMode;

    /*
     * 
     */
    private Double ImageContrast;

    /*
     * 
     */
    private String NumeralFormat;

    /*
     * 
     */
    private Integer PageCount;

    /*
     * 
     */
    private Integer PageIndex;

    /*
     * 
     */
    private String PaperColor;

    /*
     * 
     */
    private String PixelFormat;

    /*
     * 
     */
    private Double Resolution;

    /*
     * 
     */
    private Double Scale;

    /*
     * 
     */
    private String TiffCompression;

    /*
     * 
     */
    private String DmlRenderingMode;

    /*
     * 
     */
    private String DmlEffectsRenderingMode;

    /*
     * 
     */
    private String TiffBinarizationMethod;

    /*
     * 
     */
    private Boolean ZipOutput;

    /*
     * Folder in filestorage with custom fonts.
     */
    private String FontsLocation;
    
    /*
     * Initializes a new instance of the putDocumentSaveAsTiffRequest class.
     *  
     * @param String name 
     * @param TiffSaveOptionsData saveOptions 
     * @param String folder Original document folder.
     * @param String storage File storage, which have to be used.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password for opening an encrypted document.
     * @param String destFileName Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     * @param String resultFile 
     * @param Boolean useAntiAliasing 
     * @param Boolean useHighQualityRendering 
     * @param Double imageBrightness 
     * @param String imageColorMode 
     * @param Double imageContrast 
     * @param String numeralFormat 
     * @param Integer pageCount 
     * @param Integer pageIndex 
     * @param String paperColor 
     * @param String pixelFormat 
     * @param Double resolution 
     * @param Double scale 
     * @param String tiffCompression 
     * @param String dmlRenderingMode 
     * @param String dmlEffectsRenderingMode 
     * @param String tiffBinarizationMethod 
     * @param Boolean zipOutput 
     * @param String fontsLocation Folder in filestorage with custom fonts.
     */
    public PutDocumentSaveAsTiffRequest(String name,  TiffSaveOptionsData saveOptions,  String folder,  String storage,  String loadEncoding,  String password,  String destFileName,  String resultFile,  Boolean useAntiAliasing,  Boolean useHighQualityRendering,  Double imageBrightness,  String imageColorMode,  Double imageContrast,  String numeralFormat,  Integer pageCount,  Integer pageIndex,  String paperColor,  String pixelFormat,  Double resolution,  Double scale,  String tiffCompression,  String dmlRenderingMode,  String dmlEffectsRenderingMode,  String tiffBinarizationMethod,  Boolean zipOutput,  String fontsLocation) {
        Name = name;
        SaveOptions = saveOptions;
        Folder = folder;
        Storage = storage;
        LoadEncoding = loadEncoding;
        Password = password;
        DestFileName = destFileName;
        ResultFile = resultFile;
        UseAntiAliasing = useAntiAliasing;
        UseHighQualityRendering = useHighQualityRendering;
        ImageBrightness = imageBrightness;
        ImageColorMode = imageColorMode;
        ImageContrast = imageContrast;
        NumeralFormat = numeralFormat;
        PageCount = pageCount;
        PageIndex = pageIndex;
        PaperColor = paperColor;
        PixelFormat = pixelFormat;
        Resolution = resolution;
        Scale = scale;
        TiffCompression = tiffCompression;
        DmlRenderingMode = dmlRenderingMode;
        DmlEffectsRenderingMode = dmlEffectsRenderingMode;
        TiffBinarizationMethod = tiffBinarizationMethod;
        ZipOutput = zipOutput;
        FontsLocation = fontsLocation;
    }

    /*
     * 
     */
    public String getName() {
        return Name;
    }

    /*
     * 
     */
    public void setName(String value) {
        Name = value;
    }

    /*
     * 
     */
    public TiffSaveOptionsData getSaveOptions() {
        return SaveOptions;
    }

    /*
     * 
     */
    public void setSaveOptions(TiffSaveOptionsData value) {
        SaveOptions = value;
    }

    /*
     *  Gets Original document folder.
     */
    public String getFolder() {
        return Folder;
    }

    /*
     * Sets Original document folder.
     */
    public void setFolder(String value) {
        Folder = value;
    }

    /*
     *  Gets File storage, which have to be used.
     */
    public String getStorage() {
        return Storage;
    }

    /*
     * Sets File storage, which have to be used.
     */
    public void setStorage(String value) {
        Storage = value;
    }

    /*
     *  Gets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public String getLoadEncoding() {
        return LoadEncoding;
    }

    /*
     * Sets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public void setLoadEncoding(String value) {
        LoadEncoding = value;
    }

    /*
     *  Gets Password for opening an encrypted document.
     */
    public String getPassword() {
        return Password;
    }

    /*
     * Sets Password for opening an encrypted document.
     */
    public void setPassword(String value) {
        Password = value;
    }

    /*
     *  Gets Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    public String getDestFileName() {
        return DestFileName;
    }

    /*
     * Sets Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    public void setDestFileName(String value) {
        DestFileName = value;
    }

    /*
     * 
     */
    public String getResultFile() {
        return ResultFile;
    }

    /*
     * 
     */
    public void setResultFile(String value) {
        ResultFile = value;
    }

    /*
     * 
     */
    public Boolean getUseAntiAliasing() {
        return UseAntiAliasing;
    }

    /*
     * 
     */
    public void setUseAntiAliasing(Boolean value) {
        UseAntiAliasing = value;
    }

    /*
     * 
     */
    public Boolean getUseHighQualityRendering() {
        return UseHighQualityRendering;
    }

    /*
     * 
     */
    public void setUseHighQualityRendering(Boolean value) {
        UseHighQualityRendering = value;
    }

    /*
     * 
     */
    public Double getImageBrightness() {
        return ImageBrightness;
    }

    /*
     * 
     */
    public void setImageBrightness(Double value) {
        ImageBrightness = value;
    }

    /*
     * 
     */
    public String getImageColorMode() {
        return ImageColorMode;
    }

    /*
     * 
     */
    public void setImageColorMode(String value) {
        ImageColorMode = value;
    }

    /*
     * 
     */
    public Double getImageContrast() {
        return ImageContrast;
    }

    /*
     * 
     */
    public void setImageContrast(Double value) {
        ImageContrast = value;
    }

    /*
     * 
     */
    public String getNumeralFormat() {
        return NumeralFormat;
    }

    /*
     * 
     */
    public void setNumeralFormat(String value) {
        NumeralFormat = value;
    }

    /*
     * 
     */
    public Integer getPageCount() {
        return PageCount;
    }

    /*
     * 
     */
    public void setPageCount(Integer value) {
        PageCount = value;
    }

    /*
     * 
     */
    public Integer getPageIndex() {
        return PageIndex;
    }

    /*
     * 
     */
    public void setPageIndex(Integer value) {
        PageIndex = value;
    }

    /*
     * 
     */
    public String getPaperColor() {
        return PaperColor;
    }

    /*
     * 
     */
    public void setPaperColor(String value) {
        PaperColor = value;
    }

    /*
     * 
     */
    public String getPixelFormat() {
        return PixelFormat;
    }

    /*
     * 
     */
    public void setPixelFormat(String value) {
        PixelFormat = value;
    }

    /*
     * 
     */
    public Double getResolution() {
        return Resolution;
    }

    /*
     * 
     */
    public void setResolution(Double value) {
        Resolution = value;
    }

    /*
     * 
     */
    public Double getScale() {
        return Scale;
    }

    /*
     * 
     */
    public void setScale(Double value) {
        Scale = value;
    }

    /*
     * 
     */
    public String getTiffCompression() {
        return TiffCompression;
    }

    /*
     * 
     */
    public void setTiffCompression(String value) {
        TiffCompression = value;
    }

    /*
     * 
     */
    public String getDmlRenderingMode() {
        return DmlRenderingMode;
    }

    /*
     * 
     */
    public void setDmlRenderingMode(String value) {
        DmlRenderingMode = value;
    }

    /*
     * 
     */
    public String getDmlEffectsRenderingMode() {
        return DmlEffectsRenderingMode;
    }

    /*
     * 
     */
    public void setDmlEffectsRenderingMode(String value) {
        DmlEffectsRenderingMode = value;
    }

    /*
     * 
     */
    public String getTiffBinarizationMethod() {
        return TiffBinarizationMethod;
    }

    /*
     * 
     */
    public void setTiffBinarizationMethod(String value) {
        TiffBinarizationMethod = value;
    }

    /*
     * 
     */
    public Boolean getZipOutput() {
        return ZipOutput;
    }

    /*
     * 
     */
    public void setZipOutput(Boolean value) {
        ZipOutput = value;
    }

    /*
     *  Gets Folder in filestorage with custom fonts.
     */
    public String getFontsLocation() {
        return FontsLocation;
    }

    /*
     * Sets Folder in filestorage with custom fonts.
     */
    public void setFontsLocation(String value) {
        FontsLocation = value;
    }
}
