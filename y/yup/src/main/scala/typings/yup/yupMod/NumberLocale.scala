package typings.yup.yupMod

import typings.yup.Anon_Less
import typings.yup.Anon_Max
import typings.yup.Anon_Min
import typings.yup.Anon_More
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberLocale extends js.Object {
  var integer: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.undefined
  var lessThan: js.UndefOr[TestOptionsMessage[Anon_Less, _]] = js.undefined
  var max: js.UndefOr[TestOptionsMessage[Anon_Max, _]] = js.undefined
  var min: js.UndefOr[TestOptionsMessage[Anon_Min, _]] = js.undefined
  var moreThan: js.UndefOr[TestOptionsMessage[Anon_More, _]] = js.undefined
  var negative: js.UndefOr[TestOptionsMessage[Anon_Less, _]] = js.undefined
  var positive: js.UndefOr[TestOptionsMessage[Anon_More, _]] = js.undefined
}

object NumberLocale {
  @scala.inline
  def apply(
    integer: TestOptionsMessage[js.Object, _] = null,
    lessThan: TestOptionsMessage[Anon_Less, _] = null,
    max: TestOptionsMessage[Anon_Max, _] = null,
    min: TestOptionsMessage[Anon_Min, _] = null,
    moreThan: TestOptionsMessage[Anon_More, _] = null,
    negative: TestOptionsMessage[Anon_Less, _] = null,
    positive: TestOptionsMessage[Anon_More, _] = null
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

