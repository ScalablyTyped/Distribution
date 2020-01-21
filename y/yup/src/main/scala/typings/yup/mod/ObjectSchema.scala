package typings.yup.mod

import typings.std.Exclude
import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectSchema[T /* <: js.UndefOr[js.Object | Null] */] extends Schema[T] {
  def camelCase(): ObjectSchema[T] = js.native
  def concat[U /* <: js.Object */](schema: ObjectSchema[U]): ObjectSchema[T with U] = js.native
  def constantCase(): ObjectSchema[T] = js.native
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
  def required(): ObjectSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): ObjectSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def shape[U /* <: js.Object */](fields: ObjectSchemaDefinition[U]): ObjectSchema[Shape[T, U]] = js.native
  def shape[U /* <: js.Object */](fields: ObjectSchemaDefinition[U], noSortEdges: js.Array[js.Tuple2[String, String]]): ObjectSchema[Shape[T, U]] = js.native
  def transformKeys(callback: js.Function1[/* key */ js.Any, _]): Unit = js.native
}

