/*
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
    private  Name;

    /*
     * Tiff save options.
     */
    private  SaveOptions;

    /*
     * Original document folder.
     */
    private  Folder;

    /*
     * Original document storage.
     */
    private  Storage;

    /*
     * Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    private  LoadEncoding;

    /*
     * Password for opening an encrypted document.
     */
    private  Password;

    /*
     * Use antialiasing flag.
     */
    private  UseAntiAliasing;

    /*
     * Use high quality flag.
     */
    private  UseHighQualityRendering;

    /*
     * Brightness for the generated images.
     */
    private  ImageBrightness;

    /*
     * Color mode for the generated images.
     */
    private  ImageColorMode;

    /*
     * The contrast for the generated images.
     */
    private  ImageContrast;

    /*
     * The images numeral format.
     */
    private  NumeralFormat;

    /*
     * Number of pages to render.
     */
    private  PageCount;

    /*
     * Page index to start rendering.
     */
    private  PageIndex;

    /*
     * Background image color.
     */
    private  PaperColor;

    /*
     * The pixel format of generated images.
     */
    private  PixelFormat;

    /*
     * The resolution of generated images.
     */
    private  Resolution;

    /*
     * Zoom factor for generated images.
     */
    private  Scale;

    /*
     * The compression tipe.
     */
    private  TiffCompression;

    /*
     * Optional, default is Fallback.
     */
    private  DmlRenderingMode;

    /*
     * Optional, default is Simplified.
     */
    private  DmlEffectsRenderingMode;

    /*
     * Optional, Tiff binarization method, possible values are: FloydSteinbergDithering, Threshold.
     */
    private  TiffBinarizationMethod;

    /*
     * Optional. A value determining zip output or not.
     */
    private  ZipOutput;

    /*
     * Folder in filestorage with custom fonts.
     */
    private  FontsLocation;
    
    /*
     * Initializes a new instance of the saveAsTiffRequest class.
     *  
     * @param  name The document name.
     * @param  saveOptions Tiff save options.
     * @param  folder Original document folder.
     * @param  storage Original document storage.
     * @param  loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param  password Password for opening an encrypted document.
     * @param  useAntiAliasing Use antialiasing flag.
     * @param  useHighQualityRendering Use high quality flag.
     * @param  imageBrightness Brightness for the generated images.
     * @param  imageColorMode Color mode for the generated images.
     * @param  imageContrast The contrast for the generated images.
     * @param  numeralFormat The images numeral format.
     * @param  pageCount Number of pages to render.
     * @param  pageIndex Page index to start rendering.
     * @param  paperColor Background image color.
     * @param  pixelFormat The pixel format of generated images.
     * @param  resolution The resolution of generated images.
     * @param  scale Zoom factor for generated images.
     * @param  tiffCompression The compression tipe.
     * @param  dmlRenderingMode Optional, default is Fallback.
     * @param  dmlEffectsRenderingMode Optional, default is Simplified.
     * @param  tiffBinarizationMethod Optional, Tiff binarization method, possible values are: FloydSteinbergDithering, Threshold.
     * @param  zipOutput Optional. A value determining zip output or not.
     * @param  fontsLocation Folder in filestorage with custom fonts.
     */
    public SaveAsTiffRequest( name,   saveOptions,   folder,   storage,   loadEncoding,   password,   useAntiAliasing,   useHighQualityRendering,   imageBrightness,   imageColorMode,   imageContrast,   numeralFormat,   pageCount,   pageIndex,   paperColor,   pixelFormat,   resolution,   scale,   tiffCompression,   dmlRenderingMode,   dmlEffectsRenderingMode,   tiffBinarizationMethod,   zipOutput,   fontsLocation) {
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
    public  getName() {
        return Name;
    }

    /*
     * Sets The document name.
     */
    public void setName( value) {
        Name = value;
    }

    /*
     *  Gets Tiff save options.
     */
    public  getSaveOptions() {
        return SaveOptions;
    }

    /*
     * Sets Tiff save options.
     */
    public void setSaveOptions( value) {
        SaveOptions = value;
    }

    /*
     *  Gets Original document folder.
     */
    public  getFolder() {
        return Folder;
    }

    /*
     * Sets Original document folder.
     */
    public void setFolder( value) {
        Folder = value;
    }

    /*
     *  Gets Original document storage.
     */
    public  getStorage() {
        return Storage;
    }

    /*
     * Sets Original document storage.
     */
    public void setStorage( value) {
        Storage = value;
    }

    /*
     *  Gets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public  getLoadEncoding() {
        return LoadEncoding;
    }

    /*
     * Sets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public void setLoadEncoding( value) {
        LoadEncoding = value;
    }

    /*
     *  Gets Password for opening an encrypted document.
     */
    public  getPassword() {
        return Password;
    }

    /*
     * Sets Password for opening an encrypted document.
     */
    public void setPassword( value) {
        Password = value;
    }

    /*
     *  Gets Use antialiasing flag.
     */
    public  getUseAntiAliasing() {
        return UseAntiAliasing;
    }

    /*
     * Sets Use antialiasing flag.
     */
    public void setUseAntiAliasing( value) {
        UseAntiAliasing = value;
    }

    /*
     *  Gets Use high quality flag.
     */
    public  getUseHighQualityRendering() {
        return UseHighQualityRendering;
    }

    /*
     * Sets Use high quality flag.
     */
    public void setUseHighQualityRendering( value) {
        UseHighQualityRendering = value;
    }

    /*
     *  Gets Brightness for the generated images.
     */
    public  getImageBrightness() {
        return ImageBrightness;
    }

    /*
     * Sets Brightness for the generated images.
     */
    public void setImageBrightness( value) {
        ImageBrightness = value;
    }

    /*
     *  Gets Color mode for the generated images.
     */
    public  getImageColorMode() {
        return ImageColorMode;
    }

    /*
     * Sets Color mode for the generated images.
     */
    public void setImageColorMode( value) {
        ImageColorMode = value;
    }

    /*
     *  Gets The contrast for the generated images.
     */
    public  getImageContrast() {
        return ImageContrast;
    }

    /*
     * Sets The contrast for the generated images.
     */
    public void setImageContrast( value) {
        ImageContrast = value;
    }

    /*
     *  Gets The images numeral format.
     */
    public  getNumeralFormat() {
        return NumeralFormat;
    }

    /*
     * Sets The images numeral format.
     */
    public void setNumeralFormat( value) {
        NumeralFormat = value;
    }

    /*
     *  Gets Number of pages to render.
     */
    public  getPageCount() {
        return PageCount;
    }

    /*
     * Sets Number of pages to render.
     */
    public void setPageCount( value) {
        PageCount = value;
    }

    /*
     *  Gets Page index to start rendering.
     */
    public  getPageIndex() {
        return PageIndex;
    }

    /*
     * Sets Page index to start rendering.
     */
    public void setPageIndex( value) {
        PageIndex = value;
    }

    /*
     *  Gets Background image color.
     */
    public  getPaperColor() {
        return PaperColor;
    }

    /*
     * Sets Background image color.
     */
    public void setPaperColor( value) {
        PaperColor = value;
    }

    /*
     *  Gets The pixel format of generated images.
     */
    public  getPixelFormat() {
        return PixelFormat;
    }

    /*
     * Sets The pixel format of generated images.
     */
    public void setPixelFormat( value) {
        PixelFormat = value;
    }

    /*
     *  Gets The resolution of generated images.
     */
    public  getResolution() {
        return Resolution;
    }

    /*
     * Sets The resolution of generated images.
     */
    public void setResolution( value) {
        Resolution = value;
    }

    /*
     *  Gets Zoom factor for generated images.
     */
    public  getScale() {
        return Scale;
    }

    /*
     * Sets Zoom factor for generated images.
     */
    public void setScale( value) {
        Scale = value;
    }

    /*
     *  Gets The compression tipe.
     */
    public  getTiffCompression() {
        return TiffCompression;
    }

    /*
     * Sets The compression tipe.
     */
    public void setTiffCompression( value) {
        TiffCompression = value;
    }

    /*
     *  Gets Optional, default is Fallback.
     */
    public  getDmlRenderingMode() {
        return DmlRenderingMode;
    }

    /*
     * Sets Optional, default is Fallback.
     */
    public void setDmlRenderingMode( value) {
        DmlRenderingMode = value;
    }

    /*
     *  Gets Optional, default is Simplified.
     */
    public  getDmlEffectsRenderingMode() {
        return DmlEffectsRenderingMode;
    }

    /*
     * Sets Optional, default is Simplified.
     */
    public void setDmlEffectsRenderingMode( value) {
        DmlEffectsRenderingMode = value;
    }

    /*
     *  Gets Optional, Tiff binarization method, possible values are: FloydSteinbergDithering, Threshold.
     */
    public  getTiffBinarizationMethod() {
        return TiffBinarizationMethod;
    }

    /*
     * Sets Optional, Tiff binarization method, possible values are: FloydSteinbergDithering, Threshold.
     */
    public void setTiffBinarizationMethod( value) {
        TiffBinarizationMethod = value;
    }

    /*
     *  Gets Optional. A value determining zip output or not.
     */
    public  getZipOutput() {
        return ZipOutput;
    }

    /*
     * Sets Optional. A value determining zip output or not.
     */
    public void setZipOutput( value) {
        ZipOutput = value;
    }

    /*
     *  Gets Folder in filestorage with custom fonts.
     */
    public  getFontsLocation() {
        return FontsLocation;
    }

    /*
     * Sets Folder in filestorage with custom fonts.
     */
    public void setFontsLocation( value) {
        FontsLocation = value;
    }
}
