package typings.yup.mod

import typings.yup.anon.Max
import typings.yup.anon.Min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayLocale extends js.Object {
  var max: js.UndefOr[TestOptionsMessage[Max, _]] = js.undefined
  var min: js.UndefOr[TestOptionsMessage[Min, _]] = js.undefined
}

object ArrayLocale {
  @scala.inline
  def apply(max: TestOptionsMessage[Max, _] = null, min: TestOptionsMessage[Min, _] = null): ArrayLocale = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayLocale]
  }
}

