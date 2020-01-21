package typings.yup.mod

import typings.yup.AnonLess
import typings.yup.AnonMax
import typings.yup.AnonMin
import typings.yup.AnonMore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberLocale extends js.Object {
  var integer: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.undefined
  var lessThan: js.UndefOr[TestOptionsMessage[AnonLess, _]] = js.undefined
  var max: js.UndefOr[TestOptionsMessage[AnonMax, _]] = js.undefined
  var min: js.UndefOr[TestOptionsMessage[AnonMin, _]] = js.undefined
  var moreThan: js.UndefOr[TestOptionsMessage[AnonMore, _]] = js.undefined
  var negative: js.UndefOr[TestOptionsMessage[AnonLess, _]] = js.undefined
  var positive: js.UndefOr[TestOptionsMessage[AnonMore, _]] = js.undefined
}

object NumberLocale {
  @scala.inline
  def apply(
    integer: TestOptionsMessage[js.Object, _] = null,
    lessThan: TestOptionsMessage[AnonLess, _] = null,
    max: TestOptionsMessage[AnonMax, _] = null,
    min: TestOptionsMessage[AnonMin, _] = null,
    moreThan: TestOptionsMessage[AnonMore, _] = null,
    negative: TestOptionsMessage[AnonLess, _] = null,
    positive: TestOptionsMessage[AnonMore, _] = null
  ): NumberLocale = {
    val __obj = js.Dynamic.literal()
    if (integer != null) __obj.updateDynamic("integer")(integer.asInstanceOf[js.Any])
    if (lessThan != null) __obj.updateDynamic("lessThan")(lessThan.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (moreThan != null) __obj.updateDynamic("moreThan")(moreThan.asInstanceOf[js.Any])
    if (negative != null) __obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
    if (positive != null) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberLocale]
  }
}

