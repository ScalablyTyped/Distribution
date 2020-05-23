package typings.yup.mod

import typings.yup.anon.`0`
import typings.yup.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateLocale extends js.Object {
  var max: js.UndefOr[TestOptionsMessage[`1`, _]] = js.undefined
  var min: js.UndefOr[TestOptionsMessage[`0`, _]] = js.undefined
}

object DateLocale {
  @scala.inline
  def apply(max: TestOptionsMessage[`1`, _] = null, min: TestOptionsMessage[`0`, _] = null): DateLocale = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateLocale]
  }
}

