package typings.yup.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleObject extends js.Object {
  var array: js.UndefOr[ArrayLocale] = js.undefined
  var boolean: js.UndefOr[js.Object] = js.undefined
  var date: js.UndefOr[DateLocale] = js.undefined
  var mixed: js.UndefOr[MixedLocale] = js.undefined
  var number: js.UndefOr[NumberLocale] = js.undefined
  var `object`: js.UndefOr[ObjectLocale] = js.undefined
  var string: js.UndefOr[StringLocale] = js.undefined
}

object LocaleObject {
  @scala.inline
  def apply(
    array: ArrayLocale = null,
    boolean: js.Object = null,
    date: DateLocale = null,
    mixed: MixedLocale = null,
    number: NumberLocale = null,
    `object`: ObjectLocale = null,
    string: StringLocale = null
  ): LocaleObject = {
    val __obj = js.Dynamic.literal()
    if (array != null) __obj.updateDynamic("array")(array.asInstanceOf[js.Any])
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (mixed != null) __obj.updateDynamic("mixed")(mixed.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleObject]
  }
}

