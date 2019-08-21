package typings.yup.yupMod

import typings.std.Date
import typings.yup.Anon_NotType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleObject extends js.Object {
  var array: js.UndefOr[MappedLocaleSchema[ArraySchema[_]]] = js.undefined
  var bool: js.UndefOr[MappedLocaleSchema[BooleanSchema[Boolean]]] = js.undefined
  var boolean: js.UndefOr[MappedLocaleSchema[BooleanSchema[Boolean]]] = js.undefined
  var date: js.UndefOr[MappedLocaleSchema[DateSchema[Date]]] = js.undefined
  var mixed: js.UndefOr[MappedLocaleSchema[MixedSchema[_]] with Anon_NotType] = js.undefined
  var number: js.UndefOr[MappedLocaleSchema[NumberSchema[Double]]] = js.undefined
  var `object`: js.UndefOr[MappedLocaleSchema[ObjectSchema[_]]] = js.undefined
  var string: js.UndefOr[MappedLocaleSchema[StringSchema[String]]] = js.undefined
}

object LocaleObject {
  @scala.inline
  def apply(
    array: MappedLocaleSchema[ArraySchema[_]] = null,
    bool: MappedLocaleSchema[BooleanSchema[Boolean]] = null,
    boolean: MappedLocaleSchema[BooleanSchema[Boolean]] = null,
    date: MappedLocaleSchema[DateSchema[Date]] = null,
    mixed: MappedLocaleSchema[MixedSchema[_]] with Anon_NotType = null,
    number: MappedLocaleSchema[NumberSchema[Double]] = null,
    `object`: MappedLocaleSchema[ObjectSchema[_]] = null,
    string: MappedLocaleSchema[StringSchema[String]] = null
  ): LocaleObject = {
    val __obj = js.Dynamic.literal()
    if (array != null) __obj.updateDynamic("array")(array)
    if (bool != null) __obj.updateDynamic("bool")(bool)
    if (boolean != null) __obj.updateDynamic("boolean")(boolean)
    if (date != null) __obj.updateDynamic("date")(date)
    if (mixed != null) __obj.updateDynamic("mixed")(mixed)
    if (number != null) __obj.updateDynamic("number")(number)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (string != null) __obj.updateDynamic("string")(string)
    __obj.asInstanceOf[LocaleObject]
  }
}

