package typings.yup.yupMod

import typings.yup.Anon_Max
import typings.yup.Anon_Min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayLocale extends js.Object {
  var max: js.UndefOr[TestOptionsMessage[Anon_Max, _]] = js.undefined
  var min: js.UndefOr[TestOptionsMessage[Anon_Min, _]] = js.undefined
}

object ArrayLocale {
  @scala.inline
  def apply(max: TestOptionsMessage[Anon_Max, _] = null, min: TestOptionsMessage[Anon_Min, _] = null): ArrayLocale = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayLocale]
  }
}

