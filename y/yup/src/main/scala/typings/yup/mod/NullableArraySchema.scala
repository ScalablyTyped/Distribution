package typings.yup.mod

import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullableArraySchema[T, C]
  extends BasicArraySchema[T, js.Array[T] | Null, C] {
  
  def defined(): NullableArraySchema[T, C] = js.native
  
  def notRequired(): NotRequiredNullableArraySchema[T, C] = js.native
  
  def nullable(): ArraySchema[T, C] = js.native
  def nullable(isNullable: Boolean): ArraySchema[T, C] = js.native
  @JSName("nullable")
  def nullable_NullableArraySchema(): NullableArraySchema[T, C] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): ArraySchema[T, C] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): NullableArraySchema[T, C] = js.native
  
  def of[U](`type`: Schema[U, C]): NullableArraySchema[U, C] = js.native
  
  def optional(): NotRequiredNullableArraySchema[T, C] = js.native
  
  def required(): ArraySchema[T, C] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): ArraySchema[T, C] = js.native
}
