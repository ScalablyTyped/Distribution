package typings.yup.mod

import typings.yup.AnonMaxDate
import typings.yup.AnonMinDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateLocale extends js.Object {
  var max: js.UndefOr[TestOptionsMessage[AnonMaxDate, _]] = js.undefined
  var min: js.UndefOr[TestOptionsMessage[AnonMinDate, _]] = js.undefined
}

object DateLocale {
  @scala.inline
  def apply(max: TestOptionsMessage[AnonMaxDate, _] = null, min: TestOptionsMessage[AnonMinDate, _] = null): DateLocale = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateLocale]
  }
}

