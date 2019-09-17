package typings.yup.yupMod

import typings.yup.Anon_MaxDate
import typings.yup.Anon_MinDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateLocale extends js.Object {
  var max: js.UndefOr[TestOptionsMessage[Anon_MaxDate, _]] = js.undefined
  var min: js.UndefOr[TestOptionsMessage[Anon_MinDate, _]] = js.undefined
}

object DateLocale {
  @scala.inline
  def apply(max: TestOptionsMessage[Anon_MaxDate, _] = null, min: TestOptionsMessage[Anon_MinDate, _] = null): DateLocale = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateLocale]
  }
}

