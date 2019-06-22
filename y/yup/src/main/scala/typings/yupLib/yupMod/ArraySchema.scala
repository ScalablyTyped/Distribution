package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArraySchema[T]
  extends BasicArraySchema[js.Array[T]] {
  def notRequired(): NotRequiredArraySchema[T] = js.native
  def nullable(): NullableArraySchema[T] = js.native
  def nullable(isNullable: scala.Boolean): ArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: yupLib.yupLibNumbers.`false`): ArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: yupLib.yupLibNumbers.`true`): NullableArraySchema[T] = js.native
  def of[U](`type`: Schema[U]): ArraySchema[U] = js.native
  def required(): ArraySchema[T] = js.native
  def required(message: TestOptionsMessage): ArraySchema[T] = js.native
}

