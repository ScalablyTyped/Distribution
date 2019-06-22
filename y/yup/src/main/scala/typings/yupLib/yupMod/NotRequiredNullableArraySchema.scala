package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotRequiredNullableArraySchema[T]
  extends BasicArraySchema[js.UndefOr[js.Array[T] | scala.Null]] {
  def notRequired(): NotRequiredNullableArraySchema[T] = js.native
  def nullable(): NotRequiredNullableArraySchema[T] = js.native
  def nullable(isNullable: scala.Boolean): ArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_ArraySchema(): ArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: yupLib.yupLibNumbers.`false`): NotRequiredArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: yupLib.yupLibNumbers.`true`): NotRequiredNullableArraySchema[T] = js.native
  def of[U](`type`: Schema[U]): NotRequiredNullableArraySchema[U] = js.native
  def required(): NullableArraySchema[T] = js.native
  def required(message: TestOptionsMessage): NullableArraySchema[T] = js.native
}

