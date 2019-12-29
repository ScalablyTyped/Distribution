package typings.yup.yupMod

import typings.std.Exclude
import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MixedSchema[T] extends Schema[T] {
  def concat[U](schema: MixedSchema[U]): MixedSchema[T | U] = js.native
  def notRequired(): MixedSchema[js.UndefOr[T]] = js.native
  def nullable(): MixedSchema[T | Null] = js.native
  def nullable(isNullable: Boolean): MixedSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): MixedSchema[Exclude[T, Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): MixedSchema[T | Null] = js.native
  def required(): MixedSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): MixedSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
}

