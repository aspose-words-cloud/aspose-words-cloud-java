/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SaveAsTiffRequest.java">
 *   Copyright (c) 2020 Aspose.Words for Cloud
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
    private String name;

    /*
     * Tiff save options.
     */
    private TiffSaveOptionsData saveOptions;

    /*
     * Original document folder.
     */
    private String folder;

    /*
     * Original document storage.
     */
    private String storage;

    /*
     * Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    private String loadEncoding;

    /*
     * Password for opening an encrypted document.
     */
    private String password;

    /*
     * Use antialiasing flag.
     */
    private Boolean useAntiAliasing;

    /*
     * Use high quality flag.
     */
    private Boolean useHighQualityRendering;

    /*
     * Brightness for the generated images.
     */
    private Double imageBrightness;

    /*
     * Color mode for the generated images.
     */
    private String imageColorMode;

    /*
     * The contrast for the generated images.
     */
    private Double imageContrast;

    /*
     * The images numeral format.
     */
    private String numeralFormat;

    /*
     * Number of pages to render.
     */
    private Integer pageCount;

    /*
     * Page index to start rendering.
     */
    private Integer pageIndex;

    /*
     * Background image color.
     */
    private String paperColor;

    /*
     * The pixel format of generated images.
     */
    private String pixelFormat;

    /*
     * The resolution of generated images.
     */
    private Double resolution;

    /*
     * Zoom factor for generated images.
     */
    private Double scale;

    /*
     * The compression tipe.
     */
    private String tiffCompression;

    /*
     * Optional, default is Fallback.
     */
    private String dmlRenderingMode;

    /*
     * Optional, default is Simplified.
     */
    private String dmlEffectsRenderingMode;

    /*
     * Optional, Tiff binarization method, possible values are: FloydSteinbergDithering, Threshold.
     */
    private String tiffBinarizationMethod;

    /*
     * Optional. A value determining zip output or not.
     */
    private Boolean zipOutput;

    /*
     * Folder in filestorage with custom fonts.
     */
    private String fontsLocation;

    /*
     * Initializes a new instance of the SaveAsTiffRequest class.
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
    public SaveAsTiffRequest(String name, TiffSaveOptionsData saveOptions, String folder, String storage, String loadEncoding, String password, Boolean useAntiAliasing, Boolean useHighQualityRendering, Double imageBrightness, String imageColorMode, Double imageContrast, String numeralFormat, Integer pageCount, Integer pageIndex, String paperColor, String pixelFormat, Double resolution, Double scale, String tiffCompression, String dmlRenderingMode, String dmlEffectsRenderingMode, String tiffBinarizationMethod, Boolean zipOutput, String fontsLocation) {
        this.name = name;
        this.saveOptions = saveOptions;
        this.folder = folder;
        this.storage = storage;
        this.loadEncoding = loadEncoding;
        this.password = password;
        this.useAntiAliasing = useAntiAliasing;
        this.useHighQualityRendering = useHighQualityRendering;
        this.imageBrightness = imageBrightness;
        this.imageColorMode = imageColorMode;
        this.imageContrast = imageContrast;
        this.numeralFormat = numeralFormat;
        this.pageCount = pageCount;
        this.pageIndex = pageIndex;
        this.paperColor = paperColor;
        this.pixelFormat = pixelFormat;
        this.resolution = resolution;
        this.scale = scale;
        this.tiffCompression = tiffCompression;
        this.dmlRenderingMode = dmlRenderingMode;
        this.dmlEffectsRenderingMode = dmlEffectsRenderingMode;
        this.tiffBinarizationMethod = tiffBinarizationMethod;
        this.zipOutput = zipOutput;
        this.fontsLocation = fontsLocation;
    }

    /*
     * Gets The document name.
     */
    public String getName() {
        return this.name;
    }

    /*
     * Sets The document name.
     */
    public void setName(String value) {
        this.name = value;
    }

    /*
     * Gets Tiff save options.
     */
    public TiffSaveOptionsData getSaveOptions() {
        return this.saveOptions;
    }

    /*
     * Sets Tiff save options.
     */
    public void setSaveOptions(TiffSaveOptionsData value) {
        this.saveOptions = value;
    }

    /*
     * Gets Original document folder.
     */
    public String getFolder() {
        return this.folder;
    }

    /*
     * Sets Original document folder.
     */
    public void setFolder(String value) {
        this.folder = value;
    }

    /*
     * Gets Original document storage.
     */
    public String getStorage() {
        return this.storage;
    }

    /*
     * Sets Original document storage.
     */
    public void setStorage(String value) {
        this.storage = value;
    }

    /*
     * Gets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public String getLoadEncoding() {
        return this.loadEncoding;
    }

    /*
     * Sets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public void setLoadEncoding(String value) {
        this.loadEncoding = value;
    }

    /*
     * Gets Password for opening an encrypted document.
     */
    public String getPassword() {
        return this.password;
    }

    /*
     * Sets Password for opening an encrypted document.
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /*
     * Gets Use antialiasing flag.
     */
    public Boolean getUseAntiAliasing() {
        return this.useAntiAliasing;
    }

    /*
     * Sets Use antialiasing flag.
     */
    public void setUseAntiAliasing(Boolean value) {
        this.useAntiAliasing = value;
    }

    /*
     * Gets Use high quality flag.
     */
    public Boolean getUseHighQualityRendering() {
        return this.useHighQualityRendering;
    }

    /*
     * Sets Use high quality flag.
     */
    public void setUseHighQualityRendering(Boolean value) {
        this.useHighQualityRendering = value;
    }

    /*
     * Gets Brightness for the generated images.
     */
    public Double getImageBrightness() {
        return this.imageBrightness;
    }

    /*
     * Sets Brightness for the generated images.
     */
    public void setImageBrightness(Double value) {
        this.imageBrightness = value;
    }

    /*
     * Gets Color mode for the generated images.
     */
    public String getImageColorMode() {
        return this.imageColorMode;
    }

    /*
     * Sets Color mode for the generated images.
     */
    public void setImageColorMode(String value) {
        this.imageColorMode = value;
    }

    /*
     * Gets The contrast for the generated images.
     */
    public Double getImageContrast() {
        return this.imageContrast;
    }

    /*
     * Sets The contrast for the generated images.
     */
    public void setImageContrast(Double value) {
        this.imageContrast = value;
    }

    /*
     * Gets The images numeral format.
     */
    public String getNumeralFormat() {
        return this.numeralFormat;
    }

    /*
     * Sets The images numeral format.
     */
    public void setNumeralFormat(String value) {
        this.numeralFormat = value;
    }

    /*
     * Gets Number of pages to render.
     */
    public Integer getPageCount() {
        return this.pageCount;
    }

    /*
     * Sets Number of pages to render.
     */
    public void setPageCount(Integer value) {
        this.pageCount = value;
    }

    /*
     * Gets Page index to start rendering.
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /*
     * Sets Page index to start rendering.
     */
    public void setPageIndex(Integer value) {
        this.pageIndex = value;
    }

    /*
     * Gets Background image color.
     */
    public String getPaperColor() {
        return this.paperColor;
    }

    /*
     * Sets Background image color.
     */
    public void setPaperColor(String value) {
        this.paperColor = value;
    }

    /*
     * Gets The pixel format of generated images.
     */
    public String getPixelFormat() {
        return this.pixelFormat;
    }

    /*
     * Sets The pixel format of generated images.
     */
    public void setPixelFormat(String value) {
        this.pixelFormat = value;
    }

    /*
     * Gets The resolution of generated images.
     */
    public Double getResolution() {
        return this.resolution;
    }

    /*
     * Sets The resolution of generated images.
     */
    public void setResolution(Double value) {
        this.resolution = value;
    }

    /*
     * Gets Zoom factor for generated images.
     */
    public Double getScale() {
        return this.scale;
    }

    /*
     * Sets Zoom factor for generated images.
     */
    public void setScale(Double value) {
        this.scale = value;
    }

    /*
     * Gets The compression tipe.
     */
    public String getTiffCompression() {
        return this.tiffCompression;
    }

    /*
     * Sets The compression tipe.
     */
    public void setTiffCompression(String value) {
        this.tiffCompression = value;
    }

    /*
     * Gets Optional, default is Fallback.
     */
    public String getDmlRenderingMode() {
        return this.dmlRenderingMode;
    }

    /*
     * Sets Optional, default is Fallback.
     */
    public void setDmlRenderingMode(String value) {
        this.dmlRenderingMode = value;
    }

    /*
     * Gets Optional, default is Simplified.
     */
    public String getDmlEffectsRenderingMode() {
        return this.dmlEffectsRenderingMode;
    }

    /*
     * Sets Optional, default is Simplified.
     */
    public void setDmlEffectsRenderingMode(String value) {
        this.dmlEffectsRenderingMode = value;
    }

    /*
     * Gets Optional, Tiff binarization method, possible values are: FloydSteinbergDithering, Threshold.
     */
    public String getTiffBinarizationMethod() {
        return this.tiffBinarizationMethod;
    }

    /*
     * Sets Optional, Tiff binarization method, possible values are: FloydSteinbergDithering, Threshold.
     */
    public void setTiffBinarizationMethod(String value) {
        this.tiffBinarizationMethod = value;
    }

    /*
     * Gets Optional. A value determining zip output or not.
     */
    public Boolean getZipOutput() {
        return this.zipOutput;
    }

    /*
     * Sets Optional. A value determining zip output or not.
     */
    public void setZipOutput(Boolean value) {
        this.zipOutput = value;
    }

    /*
     * Gets Folder in filestorage with custom fonts.
     */
    public String getFontsLocation() {
        return this.fontsLocation;
    }

    /*
     * Sets Folder in filestorage with custom fonts.
     */
    public void setFontsLocation(String value) {
        this.fontsLocation = value;
    }
}
