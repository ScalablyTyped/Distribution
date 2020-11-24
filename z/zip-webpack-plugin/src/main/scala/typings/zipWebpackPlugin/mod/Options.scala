package typings.zipWebpackPlugin.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Exclude file paths or patterns. Takes precedence over include. Defaults to no excluding.
    */
  var exclude: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
  
  /**
    * The file extension to use instead of "zip".
    * Defaults to "zip".
    */
  var extension: js.UndefOr[String] = js.native
  
  /**
    * File options passed to yazl `addFile`.
    * See https://github.com/thejoshwolfe/yazl#addfilerealpath-metadatapath-options
    */
  var fileOptions: js.UndefOr[typings.zipWebpackPlugin.mod.fileOptions] = js.native
  
  /**
    * Output file name.
    * Defaults to the Webpack output filename or basename of the path.
    */
  var filename: js.UndefOr[String] = js.native
  
  /**
    * Include file paths or patterns.
    * Defaults to including all files in the webpack output path.
    */
  var include: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
  
  /**
    * Output path. Can be relative (to the webpack output path) or absolute.
    * Defaults to the Webpack output path.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Function to map asset paths to new paths.
    */
  var pathMapper: js.UndefOr[js.Function1[/* assetPath */ String, String]] = js.native
  
  /**
    * The path prefix for files included in the zip file.
    * Default to no prefix.
    */
  var pathPrefix: js.UndefOr[String] = js.native
  
  /**
    * File options passed to yazl `end`.
    * See https://github.com/thejoshwolfe/yazl#endoptions-finalsizecallback
    */
  var zipOptions: js.UndefOr[typings.zipWebpackPlugin.mod.zipOptions] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExcludeVarargs(value: (String | RegExp)*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
    @scala.inline
    def setFileOptions(value: fileOptions): Self = this.set("fileOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileOptions: Self = this.set("fileOptions", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: (String | RegExp)*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPathMapper(value: /* assetPath */ String => String): Self = this.set("pathMapper", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePathMapper: Self = this.set("pathMapper", js.undefined)
    
    @scala.inline
    def setPathPrefix(value: String): Self = this.set("pathPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathPrefix: Self = this.set("pathPrefix", js.undefined)
    
    @scala.inline
    def setZipOptions(value: zipOptions): Self = this.set("zipOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZipOptions: Self = this.set("zipOptions", js.undefined)
  }
}
