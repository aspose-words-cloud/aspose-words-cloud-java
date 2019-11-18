
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SaveAsTiffRequest.java">
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
 * --------------------------------------------------------------------------------------
 */
package com.aspose.words.cloud.model.requests;
import com.aspose.words.cloud.model.*;
import java.io.File;

/*
 * Request model for saveAsTiff operation.
 */
public class SaveAsTiffRequest {
    /*
     * The document name.
     */
    private String Name;

    /*
     * Tiff save options.
     */
    private TiffSaveOptionsData SaveOptions;

    /*
     * Original document folder.
     */
    private String Folder;

    /*
     * Original document storage.
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
     * Use antialiasing flag.
     */
    private Boolean UseAntiAliasing;

    /*
     * Use high quality flag.
     */
    private Boolean UseHighQualityRendering;

    /*
     * Brightness for the generated images.
     */
    private Double ImageBrightness;

    /*
     * Color mode for the generated images.
     */
    private String ImageColorMode;

    /*
     * The contrast for the generated images.
     */
    private Double ImageContrast;

    /*
     * The images numeral format.
     */
    private String NumeralFormat;

    /*
     * Number of pages to render.
     */
    private Integer PageCount;

    /*
     * Page index to start rendering.
     */
    private Integer PageIndex;

    /*
     * Background image color.
     */
    private String PaperColor;

    /*
     * The pixel format of generated images.
     */
    private String PixelFormat;

    /*
     * The resolution of generated images.
     */
    private Double Resolution;

    /*
     * Zoom factor for generated images.
     */
    private Double Scale;

    /*
     * The compression tipe.
     */
    private String TiffCompression;

    /*
     * Optional, default is Fallback.
     */
    private String DmlRenderingMode;

    /*
     * Optional, default is Simplified.
     */
    private String DmlEffectsRenderingMode;

    /*
     * Optional, Tiff binarization method, possible values are: FloydSteinbergDithering, Threshold.
     */
    private String TiffBinarizationMethod;

    /*
     * Optional. A value determining zip output or not.
     */
    private Boolean ZipOutput;

    /*
     * Folder in filestorage with custom fonts.
     */
    private String FontsLocation;
    
    /*
     * Initializes a new instance of the saveAsTiffRequest class.
     *  
     * @param String name The document name.
     * @param TiffSaveOptionsData saveOptions Tiff save options.
     * @param String folder Original document folder.
     * @param String storage Original document storage.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password for opening an encrypted document.
     * @param Boolean useAntiAliasing Use antialiasing flag.
     * @param Boolean useHighQualityRendering Use high quality flag.
     * @param Double imageBrightness Brightness for the generated images.
     * @param String imageColorMode Color mode for the generated images.
     * @param Double imageContrast The contrast for the generated images.
     * @param String numeralFormat The images numeral format.
     * @param Integer pageCount Number of pages to render.
     * @param Integer pageIndex Page index to start rendering.
     * @param String paperColor Background image color.
     * @param String pixelFormat The pixel format of generated images.
     * @param Double resolution The resolution of generated images.
     * @param Double scale Zoom factor for generated images.
     * @param String tiffCompression The compression tipe.
     * @param String dmlRenderingMode Optional, default is Fallback.
     * @param String dmlEffectsRenderingMode Optional, default is Simplified.
     * @param String tiffBinarizationMethod Optional, Tiff binarization method, possible values are: FloydSteinbergDithering, Threshold.
     * @param Boolean zipOutput Optional. A value determining zip output or not.
     * @param String fontsLocation Folder in filestorage with custom fonts.
     */
    public SaveAsTiffRequest(String name,  TiffSaveOptionsData saveOptions,  String folder,  String storage,  String loadEncoding,  String password,  Boolean useAntiAliasing,  Boolean useHighQualityRendering,  Double imageBrightness,  String imageColorMode,  Double imageContrast,  String numeralFormat,  Integer pageCount,  Integer pageIndex,  String paperColor,  String pixelFormat,  Double resolution,  Double scale,  String tiffCompression,  String dmlRenderingMode,  String dmlEffectsRenderingMode,  String tiffBinarizationMethod,  Boolean zipOutput,  String fontsLocation) {
        Name = name;
        SaveOptions = saveOptions;
        Folder = folder;
        Storage = storage;
        LoadEncoding = loadEncoding;
        Password = password;
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
     *  Gets The document name.
     */
    public String getName() {
        return Name;
    }

    /*
     * Sets The document name.
     */
    public void setName(String value) {
        Name = value;
    }

    /*
     *  Gets Tiff save options.
     */
    public TiffSaveOptionsData getSaveOptions() {
        return SaveOptions;
    }

    /*
     * Sets Tiff save options.
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
     *  Gets Original document storage.
     */
    public String getStorage() {
        return Storage;
    }

    /*
     * Sets Original document storage.
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
     *  Gets Use antialiasing flag.
     */
    public Boolean getUseAntiAliasing() {
        return UseAntiAliasing;
    }

    /*
     * Sets Use antialiasing flag.
     */
    public void setUseAntiAliasing(Boolean value) {
        UseAntiAliasing = value;
    }

    /*
     *  Gets Use high quality flag.
     */
    public Boolean getUseHighQualityRendering() {
        return UseHighQualityRendering;
    }

    /*
     * Sets Use high quality flag.
     */
    public void setUseHighQualityRendering(Boolean value) {
        UseHighQualityRendering = value;
    }

    /*
     *  Gets Brightness for the generated images.
     */
    public Double getImageBrightness() {
        return ImageBrightness;
    }

    /*
     * Sets Brightness for the generated images.
     */
    public void setImageBrightness(Double value) {
        ImageBrightness = value;
    }

    /*
     *  Gets Color mode for the generated images.
     */
    public String getImageColorMode() {
        return ImageColorMode;
    }

    /*
     * Sets Color mode for the generated images.
     */
    public void setImageColorMode(String value) {
        ImageColorMode = value;
    }

    /*
     *  Gets The contrast for the generated images.
     */
    public Double getImageContrast() {
        return ImageContrast;
    }

    /*
     * Sets The contrast for the generated images.
     */
    public void setImageContrast(Double value) {
        ImageContrast = value;
    }

    /*
     *  Gets The images numeral format.
     */
    public String getNumeralFormat() {
        return NumeralFormat;
    }

    /*
     * Sets The images numeral format.
     */
    public void setNumeralFormat(String value) {
        NumeralFormat = value;
    }

    /*
     *  Gets Number of pages to render.
     */
    public Integer getPageCount() {
        return PageCount;
    }

    /*
     * Sets Number of pages to render.
     */
    public void setPageCount(Integer value) {
        PageCount = value;
    }

    /*
     *  Gets Page index to start rendering.
     */
    public Integer getPageIndex() {
        return PageIndex;
    }

    /*
     * Sets Page index to start rendering.
     */
    public void setPageIndex(Integer value) {
        PageIndex = value;
    }

    /*
     *  Gets Background image color.
     */
    public String getPaperColor() {
        return PaperColor;
    }

    /*
     * Sets Background image color.
     */
    public void setPaperColor(String value) {
        PaperColor = value;
    }

    /*
     *  Gets The pixel format of generated images.
     */
    public String getPixelFormat() {
        return PixelFormat;
    }

    /*
     * Sets The pixel format of generated images.
     */
    public void setPixelFormat(String value) {
        PixelFormat = value;
    }

    /*
     *  Gets The resolution of generated images.
     */
    public Double getResolution() {
        return Resolution;
    }

    /*
     * Sets The resolution of generated images.
     */
    public void setResolution(Double value) {
        Resolution = value;
    }

    /*
     *  Gets Zoom factor for generated images.
     */
    public Double getScale() {
        return Scale;
    }

    /*
     * Sets Zoom factor for generated images.
     */
    public void setScale(Double value) {
        Scale = value;
    }

    /*
     *  Gets The compression tipe.
     */
    public String getTiffCompression() {
        return TiffCompression;
    }

    /*
     * Sets The compression tipe.
     */
    public void setTiffCompression(String value) {
        TiffCompression = value;
    }

    /*
     *  Gets Optional, default is Fallback.
     */
    public String getDmlRenderingMode() {
        return DmlRenderingMode;
    }

    /*
     * Sets Optional, default is Fallback.
     */
    public void setDmlRenderingMode(String value) {
        DmlRenderingMode = value;
    }

    /*
     *  Gets Optional, default is Simplified.
     */
    public String getDmlEffectsRenderingMode() {
        return DmlEffectsRenderingMode;
    }

    /*
     * Sets Optional, default is Simplified.
     */
    public void setDmlEffectsRenderingMode(String value) {
        DmlEffectsRenderingMode = value;
    }

    /*
     *  Gets Optional, Tiff binarization method, possible values are: FloydSteinbergDithering, Threshold.
     */
    public String getTiffBinarizationMethod() {
        return TiffBinarizationMethod;
    }

    /*
     * Sets Optional, Tiff binarization method, possible values are: FloydSteinbergDithering, Threshold.
     */
    public void setTiffBinarizationMethod(String value) {
        TiffBinarizationMethod = value;
    }

    /*
     *  Gets Optional. A value determining zip output or not.
     */
    public Boolean getZipOutput() {
        return ZipOutput;
    }

    /*
     * Sets Optional. A value determining zip output or not.
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
/*