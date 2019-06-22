package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NullableArraySchema[T]
  extends BasicArraySchema[js.Array[T] | scala.Null] {
  def notRequired(): NotRequiredNullableArraySchema[T] = js.native
  def nullable(): ArraySchema[T] = js.native
  def nullable(isNullable: scala.Boolean): ArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_NullableArraySchema(): NullableArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: yupLib.yupLibNumbers.`false`): ArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: yupLib.yupLibNumbers.`true`): NullableArraySchema[T] = js.native
  def of[U](`type`: Schema[U]): NullableArraySchema[U] = js.native
  def required(): NullableArraySchema[T] = js.native
  def required(message: TestOptionsMessage): NullableArraySchema[T] = js.native
}

