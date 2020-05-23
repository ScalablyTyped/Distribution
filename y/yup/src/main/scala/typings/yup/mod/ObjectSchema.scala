package typings.yup.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Exclude
import typings.std.Record
import typings.yup.anon.Values
import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectSchema[T /* <: js.UndefOr[js.Object | Null] */] extends Schema[T] {
  var fields: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: yup.yup.Schema<T[k]>}
    */ typings.yup.yupStrings.ObjectSchema with TopLevel[T] = js.native
  def camelCase(): ObjectSchema[T] = js.native
  def concat[U /* <: js.Object */](schema: ObjectSchema[U]): ObjectSchema[T with U] = js.native
  def constantCase(): ObjectSchema[T] = js.native
  def defined(): ObjectSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): ObjectSchema[U] = js.native
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: TestOptionsMessage[Values, _]): ObjectSchema[U] = js.native
  def from(fromKey: String, toKey: String): ObjectSchema[T] = js.native
  def from(fromKey: String, toKey: String, alias: Boolean): ObjectSchema[T] = js.native
  def noUnknown(): ObjectSchema[T] = js.native
  def noUnknown(onlyKnownKeys: Boolean): ObjectSchema[T] = js.native
  def noUnknown(onlyKnownKeys: Boolean, message: TestOptionsMessage[js.Object, _]): ObjectSchema[T] = js.native
  def notRequired(): ObjectSchema[js.UndefOr[T]] = js.native
  def nullable(): ObjectSchema[T | Null] = js.native
  def nullable(isNullable: Boolean): ObjectSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): ObjectSchema[Exclude[T, Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): ObjectSchema[T | Null] = js.native
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): ObjectSchema[U] = js.native
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: TestOptionsMessage[Values, _]): ObjectSchema[U] = js.native
  def optional(): ObjectSchema[js.UndefOr[T]] = js.native
  def required(): ObjectSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): ObjectSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def shape[U /* <: js.Object */](fields: ObjectSchemaDefinition[U]): ObjectSchema[Shape[T, U]] = js.native
  def shape[U /* <: js.Object */](fields: ObjectSchemaDefinition[U], noSortEdges: js.Array[js.Tuple2[String, String]]): ObjectSchema[Shape[T, U]] = js.native
  def snakeCase(): ObjectSchema[T] = js.native
  def test(name: String, message: TestOptionsMessage[js.Object, _], test: TestFunction): this.type = js.native
  def test(options: TestOptions[Record[String, _]]): this.type = js.native
  def test[U /* <: T */](options: AssertingTestOptions[U, Record[String, _]]): ObjectSchema[U] = js.native
  @JSName("test")
  def test_U_T_ObjectSchema[U /* <: T */](name: String, message: TestOptionsMessage[js.Object, _], test: AssertingTestFunction[U]): ObjectSchema[U] = js.native
  def transformKeys(callback: js.Function1[/* key */ js.Any, _]): Unit = js.native
  def unknown(): ObjectSchema[T] = js.native
  def unknown(allow: Boolean): ObjectSchema[T] = js.native
  def unknown(allow: Boolean, message: TestOptionsMessage[js.Object, _]): ObjectSchema[T] = js.native
}

