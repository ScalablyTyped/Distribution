package typings.zipWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait zipOptions extends js.Object {
  /**
    * Force ZIP64 format. ZIP64 format is enabled by default where necessary.
    * See https://github.com/thejoshwolfe/yazl#regarding-zip64-support
    */
  var forceZip64Format: js.UndefOr[Boolean] = js.undefined
}

object zipOptions {
  @scala.inline
  def apply(forceZip64Format: js.UndefOr[Boolean] = js.undefined): zipOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceZip64Format)) __obj.updateDynamic("forceZip64Format")(forceZip64Format.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[zipOptions]
  }
}

