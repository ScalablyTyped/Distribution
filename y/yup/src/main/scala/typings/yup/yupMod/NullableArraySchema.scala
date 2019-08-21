package typings.yup.yupMod

import typings.yup.yupNumbers.`false`
import typings.yup.yupNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NullableArraySchema[T]
  extends BasicArraySchema[js.Array[T] | Null] {
  def notRequired(): NotRequiredNullableArraySchema[T] = js.native
  def nullable(): ArraySchema[T] = js.native
  def nullable(isNullable: Boolean): ArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_NullableArraySchema(): NullableArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): ArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): NullableArraySchema[T] = js.native
  def of[U](`type`: Schema[U]): NullableArraySchema[U] = js.native
  def required(): NullableArraySchema[T] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): NullableArraySchema[T] = js.native
}

