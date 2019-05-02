package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatErrorParams extends js.Object {
  var originalValue: js.UndefOr[js.Any] = js.undefined
  var path: java.lang.String
  var `type`: java.lang.String
  var value: js.UndefOr[js.Any] = js.undefined
}

object FormatErrorParams {
  @scala.inline
  def apply(
    path: java.lang.String,
    `type`: java.lang.String,
    originalValue: js.Any = null,
    value: js.Any = null
  ): FormatErrorParams = {
    val __obj = js.Dynamic.literal(path = path)
    __obj.updateDynamic("type")(`type`)
    if (originalValue != null) __obj.updateDynamic("originalValue")(originalValue)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FormatErrorParams]
  }
}

