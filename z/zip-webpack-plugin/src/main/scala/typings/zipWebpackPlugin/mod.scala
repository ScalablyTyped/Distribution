package typings.zipWebpackPlugin

import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Webpack plugin to zip emitted files. Compresses all assets into a zip file.
    * See https://www.npmjs.com/package/zip-webpack-plugin#usage
    */
  @JSImport("zip-webpack-plugin", JSImport.Namespace)
  @js.native
  /**
    * @param options Options for ZipPlugin.
    */
  open class ^ ()
    extends StObject
       with ZipPlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Exclude file paths or patterns. Takes precedence over include. Defaults to no excluding.
      */
    var exclude: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    /**
      * The file extension to use instead of "zip".
      * Defaults to "zip".
      */
    var `extension`: js.UndefOr[String] = js.undefined
    
    /**
      * File options passed to yazl `addFile`.
      * See https://github.com/thejoshwolfe/yazl#addfilerealpath-metadatapath-options
      */
    var fileOptions: js.UndefOr[typings.zipWebpackPlugin.mod.fileOptions] = js.undefined
    
    /**
      * Output file name.
      * Defaults to the Webpack output filename or basename of the path.
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /**
      * Include file paths or patterns.
      * Defaults to including all files in the webpack output path.
      */
    var include: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    /**
      * Output path. Can be relative (to the webpack output path) or absolute.
      * Defaults to the Webpack output path.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Function to map asset paths to new paths.
      */
    var pathMapper: js.UndefOr[js.Function1[/* assetPath */ String, String]] = js.undefined
    
    /**
      * The path prefix for files included in the zip file.
      * Default to no prefix.
      */
    var pathPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * File options passed to yazl `end`.
      * See https://github.com/thejoshwolfe/yazl#endoptions-finalsizecallback
      */
    var zipOptions: js.UndefOr[typings.zipWebpackPlugin.mod.zipOptions] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setFileOptions(value: fileOptions): Self = StObject.set(x, "fileOptions", value.asInstanceOf[js.Any])
      
      inline def setFileOptionsUndefined: Self = StObject.set(x, "fileOptions", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setInclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathMapper(value: /* assetPath */ String => String): Self = StObject.set(x, "pathMapper", js.Any.fromFunction1(value))
      
      inline def setPathMapperUndefined: Self = StObject.set(x, "pathMapper", js.undefined)
      
      inline def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
      
      inline def setPathPrefixUndefined: Self = StObject.set(x, "pathPrefix", js.undefined)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setZipOptions(value: zipOptions): Self = StObject.set(x, "zipOptions", value.asInstanceOf[js.Any])
      
      inline def setZipOptionsUndefined: Self = StObject.set(x, "zipOptions", js.undefined)
    }
  }
  
  /**
    * Webpack plugin to zip emitted files. Compresses all assets into a zip file.
    * See https://www.npmjs.com/package/zip-webpack-plugin#usage
    */
  trait ZipPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
  }
  object ZipPlugin {
    
    inline def apply(apply: Compiler => Unit): ZipPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[ZipPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZipPlugin] (val x: Self) extends AnyVal {
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  trait fileOptions extends StObject {
    
    /**
      * Whether to compress the out[ut zip file.
      * When true, the file data will be deflated (compression method 8).
      * When false, the file data will be stored (compression method 0).
      */
    var compress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Force ZIP64 format. ZIP64 format is enabled by default where necessary.
      * See https://github.com/thejoshwolfe/yazl#regarding-zip64-support
      */
    var forceZip64Format: js.UndefOr[Boolean] = js.undefined
    
    /**
      * UNIX permission bits and file type.
      */
    var mode: js.UndefOr[Double] = js.undefined
    
    /**
      * Overwrite the last modified time.
      * Defaults to the current date and time.
      */
    var mtime: js.UndefOr[js.Date] = js.undefined
  }
  object fileOptions {
    
    inline def apply(): fileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[fileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: fileOptions] (val x: Self) extends AnyVal {
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setForceZip64Format(value: Boolean): Self = StObject.set(x, "forceZip64Format", value.asInstanceOf[js.Any])
      
      inline def setForceZip64FormatUndefined: Self = StObject.set(x, "forceZip64Format", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
    }
  }
  
  trait zipOptions extends StObject {
    
    /**
      * Force ZIP64 format. ZIP64 format is enabled by default where necessary.
      * See https://github.com/thejoshwolfe/yazl#regarding-zip64-support
      */
    var forceZip64Format: js.UndefOr[Boolean] = js.undefined
  }
  object zipOptions {
    
    inline def apply(): zipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[zipOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: zipOptions] (val x: Self) extends AnyVal {
      
      inline def setForceZip64Format(value: Boolean): Self = StObject.set(x, "forceZip64Format", value.asInstanceOf[js.Any])
      
      inline def setForceZip64FormatUndefined: Self = StObject.set(x, "forceZip64Format", js.undefined)
    }
  }
}
