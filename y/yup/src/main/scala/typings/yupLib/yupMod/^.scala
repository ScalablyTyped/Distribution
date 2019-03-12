package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yup", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val array: ArraySchemaConstructor = js.native
  val bool: BooleanSchemaConstructor = js.native
  val boolean: BooleanSchemaConstructor = js.native
  val date: DateSchemaConstructor = js.native
  val mixed: MixedSchemaConstructor = js.native
  val number: NumberSchemaConstructor = js.native
  val `object`: ObjectSchemaConstructor = js.native
  val string: StringSchemaConstructor = js.native
  def addMethod[T /* <: Schema[_] */](
    schemaCtor: AnySchemaConstructor,
    name: java.lang.String,
    method: js.ThisFunction1[/* this */ T, /* repeated */ js.Any, T]
  ): scala.Unit = js.native
  def isSchema(obj: js.Any): /* is yup.yup.Schema<any> */ scala.Boolean = js.native
  def `lazy`[T](fn: js.Function1[/* value */ T, Schema[T]]): Lazy = js.native
  def reach[T](schema: Schema[T], path: java.lang.String): Schema[T] = js.native
  def reach[T](schema: Schema[T], path: java.lang.String, value: js.Any): Schema[T] = js.native
  def reach[T](schema: Schema[T], path: java.lang.String, value: js.Any, context: js.Any): Schema[T] = js.native
  def ref(path: java.lang.String): Ref = js.native
  def ref(path: java.lang.String, options: yupLib.Anon_ContextPrefix): Ref = js.native
  def setLocale(customLocale: LocaleObject): scala.Unit = js.native
}

