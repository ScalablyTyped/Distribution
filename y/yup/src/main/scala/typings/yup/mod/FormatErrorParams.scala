package typings.yup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatErrorParams extends js.Object {
  var originalValue: js.UndefOr[js.Any] = js.undefined
  var path: String
  var `type`: String
  var value: js.UndefOr[js.Any] = js.undefined
}

object FormatErrorParams {
  @scala.inline
  def apply(path: String, `type`: String, originalValue: js.Any = null, value: js.Any = null): FormatErrorParams = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (originalValue != null) __obj.updateDynamic("originalValue")(originalValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatErrorParams]
  }
}

