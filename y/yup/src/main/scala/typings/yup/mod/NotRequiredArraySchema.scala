package typings.yup.mod

import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotRequiredArraySchema[T]
  extends BasicArraySchema[js.UndefOr[js.Array[T]]] {
  def notRequired(): NotRequiredArraySchema[T] = js.native
  def nullable(): NotRequiredNullableArraySchema[T] = js.native
  def nullable(isNullable: Boolean): ArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): NotRequiredArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): NotRequiredNullableArraySchema[T] = js.native
  def of[U](`type`: Schema[U]): NotRequiredArraySchema[U] = js.native
  def required(): ArraySchema[T] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): ArraySchema[T] = js.native
}

