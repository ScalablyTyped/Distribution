package typings
package zipDotJsLib.zipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteOptions extends js.Object {
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var directory: js.UndefOr[scala.Boolean] = js.undefined
  var lastModDate: js.UndefOr[stdLib.Date] = js.undefined
  var level: js.UndefOr[scala.Double] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object WriteOptions {
  @scala.inline
  def apply(
    comment: java.lang.String = null,
    directory: js.UndefOr[scala.Boolean] = js.undefined,
    lastModDate: stdLib.Date = null,
    level: scala.Int | scala.Double = null,
    version: scala.Int | scala.Double = null
  ): WriteOptions = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (!js.isUndefined(directory)) __obj.updateDynamic("directory")(directory)
    if (lastModDate != null) __obj.updateDynamic("lastModDate")(lastModDate)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteOptions]
  }
}

