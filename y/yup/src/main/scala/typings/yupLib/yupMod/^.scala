package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yup", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val array: yupLib.yupMod.ArraySchemaConstructor = js.native
  val bool: yupLib.yupMod.BooleanSchemaConstructor = js.native
  val boolean: yupLib.yupMod.BooleanSchemaConstructor = js.native
  val date: yupLib.yupMod.DateSchemaConstructor = js.native
  val mixed: yupLib.yupMod.MixedSchemaConstructor = js.native
  val number: yupLib.yupMod.NumberSchemaConstructor = js.native
  val `object`: yupLib.yupMod.ObjectSchemaConstructor = js.native
  val string: yupLib.yupMod.StringSchemaConstructor = js.native
  def addMethod[T /* <: yupLib.yupMod.Schema[_] */](
    schemaCtor: yupLib.yupMod.AnySchemaConstructor,
    name: java.lang.String,
    method: js.ThisFunction1[/* this */ T, /* repeated */ js.Any, T]
  ): scala.Unit = js.native
  def `lazy`[T](fn: js.Function1[/* value */ T, yupLib.yupMod.Schema[T]]): yupLib.yupMod.Lazy = js.native
  def reach[T](schema: yupLib.yupMod.Schema[T], path: java.lang.String): yupLib.yupMod.Schema[T] = js.native
  def reach[T](schema: yupLib.yupMod.Schema[T], path: java.lang.String, value: js.Any): yupLib.yupMod.Schema[T] = js.native
  def reach[T](schema: yupLib.yupMod.Schema[T], path: java.lang.String, value: js.Any, context: js.Any): yupLib.yupMod.Schema[T] = js.native
  def ref(path: java.lang.String): yupLib.yupMod.Ref = js.native
  def ref(path: java.lang.String, options: yupLib.Anon_ContextPrefix): yupLib.yupMod.Ref = js.native
  def setLocale(customLocale: yupLib.yupMod.LocaleObject): scala.Unit = js.native
}

