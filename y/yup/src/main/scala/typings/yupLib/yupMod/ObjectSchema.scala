package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectSchema[T /* <: js.UndefOr[js.Object | scala.Null] */] extends Schema[T] {
  def camelCase(): ObjectSchema[T] = js.native
  def constantCase(): ObjectSchema[T] = js.native
  def from(fromKey: java.lang.String, toKey: java.lang.String): ObjectSchema[T] = js.native
  def from(fromKey: java.lang.String, toKey: java.lang.String, alias: scala.Boolean): ObjectSchema[T] = js.native
  def noUnknown(): ObjectSchema[T] = js.native
  def noUnknown(onlyKnownKeys: scala.Boolean): ObjectSchema[T] = js.native
  def noUnknown(onlyKnownKeys: scala.Boolean, message: TestOptionsMessage): ObjectSchema[T] = js.native
  def notRequired(): ObjectSchema[js.UndefOr[T]] = js.native
  def nullable(): ObjectSchema[T | scala.Null] = js.native
  def nullable(isNullable: scala.Boolean): ObjectSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: yupLib.yupLibNumbers.`false`): ObjectSchema[stdLib.Exclude[T, scala.Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: yupLib.yupLibNumbers.`true`): ObjectSchema[T | scala.Null] = js.native
  def required(): ObjectSchema[stdLib.Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def required(message: TestOptionsMessage): ObjectSchema[stdLib.Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def shape[U /* <: js.Object */](fields: ObjectSchemaDefinition[U]): ObjectSchema[Shape[T, U]] = js.native
  def shape[U /* <: js.Object */](
    fields: ObjectSchemaDefinition[U],
    noSortEdges: js.Array[js.Tuple2[java.lang.String, java.lang.String]]
  ): ObjectSchema[Shape[T, U]] = js.native
  def transformKeys(callback: js.Function1[/* key */ js.Any, _]): scala.Unit = js.native
}

