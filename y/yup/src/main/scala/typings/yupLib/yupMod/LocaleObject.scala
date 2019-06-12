package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleObject extends js.Object {
  var array: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof yup.yup.ArraySchema<any> ]:? string}
    */ yupLib.yupLibStrings.LocaleObject with js.Any
  ] = js.undefined
  var bool: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof yup.yup.BooleanSchema<boolean> ]:? string}
    */ yupLib.yupLibStrings.LocaleObject with js.Any
  ] = js.undefined
  var boolean: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof yup.yup.BooleanSchema<boolean> ]:? string}
    */ yupLib.yupLibStrings.LocaleObject with js.Any
  ] = js.undefined
  var date: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof yup.yup.DateSchema<std.Date> ]:? string}
    */ yupLib.yupLibStrings.LocaleObject with js.Any
  ] = js.undefined
  var mixed: js.UndefOr[yupLib.yupLibStrings.LocaleObject with js.Any with yupLib.Anon_NotType] = js.undefined
  var number: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof yup.yup.NumberSchema<number> ]:? string}
    */ yupLib.yupLibStrings.LocaleObject with js.Any
  ] = js.undefined
  var `object`: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof yup.yup.ObjectSchema<any> ]:? string}
    */ yupLib.yupLibStrings.LocaleObject with js.Any
  ] = js.undefined
  var string: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof yup.yup.StringSchema<string> ]:? string}
    */ yupLib.yupLibStrings.LocaleObject with js.Any
  ] = js.undefined
}

object LocaleObject {
  @scala.inline
  def apply(
    array: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof yup.yup.ArraySchema<any> ]:? string}
    */ yupLib.yupLibStrings.LocaleObject with js.Any = null,
    bool: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof yup.yup.BooleanSchema<boolean> ]:? string}
    */ yupLib.yupLibStrings.LocaleObject with js.Any = null,
    boolean: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof yup.yup.BooleanSchema<boolean> ]:? string}
    */ yupLib.yupLibStrings.LocaleObject with js.Any = null,
    date: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof yup.yup.DateSchema<std.Date> ]:? string}
    */ yupLib.yupLibStrings.LocaleObject with js.Any = null,
    mixed: yupLib.yupLibStrings.LocaleObject with js.Any with yupLib.Anon_NotType = null,
    number: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof yup.yup.NumberSchema<number> ]:? string}
    */ yupLib.yupLibStrings.LocaleObject with js.Any = null,
    `object`: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof yup.yup.ObjectSchema<any> ]:? string}
    */ yupLib.yupLibStrings.LocaleObject with js.Any = null,
    string: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof yup.yup.StringSchema<string> ]:? string}
    */ yupLib.yupLibStrings.LocaleObject with js.Any = null
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

