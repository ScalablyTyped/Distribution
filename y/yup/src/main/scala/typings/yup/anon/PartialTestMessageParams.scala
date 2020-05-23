package typings.yup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<yup.yup.TestMessageParams> */
trait PartialTestMessageParams extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var originalValue: js.UndefOr[js.Any] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object PartialTestMessageParams {
  @scala.inline
  def apply(label: String = null, originalValue: js.Any = null, path: String = null, value: js.Any = null): PartialTestMessageParams = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (originalValue != null) __obj.updateDynamic("originalValue")(originalValue.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTestMessageParams]
  }
}

