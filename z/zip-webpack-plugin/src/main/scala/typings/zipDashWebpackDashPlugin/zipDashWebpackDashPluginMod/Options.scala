package typings.zipDashWebpackDashPlugin.zipDashWebpackDashPluginMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Exclude file paths or patterns. Takes precedence over include. Defaults to no excluding.
    */
  var exclude: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
  /**
    * The file extension to use instead of "zip".
    * Defaults to "zip".
    */
  var extension: js.UndefOr[String] = js.undefined
  /**
    * File options passed to yazl `addFile`.
    * See https://github.com/thejoshwolfe/yazl#addfilerealpath-metadatapath-options
    */
  var fileOptions: js.UndefOr[typings.zipDashWebpackDashPlugin.zipDashWebpackDashPluginMod.fileOptions] = js.undefined
  /**
    * Output file name.
    * Defaults to the Webpack output filename or basename of the path.
    */
  var filename: js.UndefOr[String] = js.undefined
  /**
    * Include file paths or patterns.
    * Defaults to including all files in the webpack output path.
    */
  var include: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
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
  var zipOptions: js.UndefOr[typings.zipDashWebpackDashPlugin.zipDashWebpackDashPluginMod.zipOptions] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    exclude: String | RegExp | (js.Array[String | RegExp]) = null,
    extension: String = null,
    fileOptions: fileOptions = null,
    filename: String = null,
    include: String | RegExp | (js.Array[String | RegExp]) = null,
    path: String = null,
    pathMapper: /* assetPath */ String => String = null,
    pathPrefix: String = null,
    zipOptions: zipOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fileOptions != null) __obj.updateDynamic("fileOptions")(fileOptions.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pathMapper != null) __obj.updateDynamic("pathMapper")(js.Any.fromFunction1(pathMapper))
    if (pathPrefix != null) __obj.updateDynamic("pathPrefix")(pathPrefix.asInstanceOf[js.Any])
    if (zipOptions != null) __obj.updateDynamic("zipOptions")(zipOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

