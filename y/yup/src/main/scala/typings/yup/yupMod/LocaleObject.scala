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
    if (array != null) __obj.updateDynamic("array")(array)
    if (boolean != null) __obj.updateDynamic("boolean")(boolean)
    if (date != null) __obj.updateDynamic("date")(date)
    if (mixed != null) __obj.updateDynamic("mixed")(mixed)
    if (number != null) __obj.updateDynamic("number")(number)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (string != null) __obj.updateDynamic("string")(string)
    __obj.asInstanceOf[LocaleObject]
  }
}

