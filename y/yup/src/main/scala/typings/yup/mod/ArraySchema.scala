package typings.yup.mod

import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArraySchema[T]
  extends BasicArraySchema[js.Array[T]] {
  def notRequired(): NotRequiredArraySchema[T] = js.native
  def nullable(): NullableArraySchema[T] = js.native
  def nullable(isNullable: Boolean): ArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): ArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): NullableArraySchema[T] = js.native
  def of[U](`type`: Schema[U]): ArraySchema[U] = js.native
  def required(): ArraySchema[T] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): ArraySchema[T] = js.native
}

