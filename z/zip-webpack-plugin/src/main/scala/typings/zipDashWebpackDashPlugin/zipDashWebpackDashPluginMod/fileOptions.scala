package typings.zipDashWebpackDashPlugin.zipDashWebpackDashPluginMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fileOptions extends js.Object {
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
  var mtime: js.UndefOr[Date] = js.undefined
}

object fileOptions {
  @scala.inline
  def apply(
    compress: js.UndefOr[Boolean] = js.undefined,
    forceZip64Format: js.UndefOr[Boolean] = js.undefined,
    mode: Int | Double = null,
    mtime: Date = null
  ): fileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (!js.isUndefined(forceZip64Format)) __obj.updateDynamic("forceZip64Format")(forceZip64Format)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime)
    __obj.asInstanceOf[fileOptions]
  }
}

