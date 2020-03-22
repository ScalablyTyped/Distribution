package typings.yup.mod

import typings.yup.Anon0
import typings.yup.Anon1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateLocale extends js.Object {
  var max: js.UndefOr[TestOptionsMessage[Anon1, _]] = js.undefined
  var min: js.UndefOr[TestOptionsMessage[Anon0, _]] = js.undefined
}

object DateLocale {
  @scala.inline
  def apply(max: TestOptionsMessage[Anon1, _] = null, min: TestOptionsMessage[Anon0, _] = null): DateLocale = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateLocale]
  }
}

