package typings.yup.mod

import typings.yup.AnonMax
import typings.yup.AnonMin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayLocale extends js.Object {
  var max: js.UndefOr[TestOptionsMessage[AnonMax, _]] = js.undefined
  var min: js.UndefOr[TestOptionsMessage[AnonMin, _]] = js.undefined
}

object ArrayLocale {
  @scala.inline
  def apply(max: TestOptionsMessage[AnonMax, _] = null, min: TestOptionsMessage[AnonMin, _] = null): ArrayLocale = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayLocale]
  }
}

