package typings.zipJs.zip

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteOptions extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var directory: js.UndefOr[Boolean] = js.undefined
  var lastModDate: js.UndefOr[Date] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object WriteOptions {
  @scala.inline
  def apply(
    comment: String = null,
    directory: js.UndefOr[Boolean] = js.undefined,
    lastModDate: Date = null,
    level: js.UndefOr[Double] = js.undefined,
    version: js.UndefOr[Double] = js.undefined
  ): WriteOptions = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (!js.isUndefined(directory)) __obj.updateDynamic("directory")(directory.get.asInstanceOf[js.Any])
    if (lastModDate != null) __obj.updateDynamic("lastModDate")(lastModDate.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteOptions]
  }
}

