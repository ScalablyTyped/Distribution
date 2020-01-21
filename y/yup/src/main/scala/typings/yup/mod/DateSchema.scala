package typings.yup.mod

import typings.std.Date
import typings.std.Exclude
import typings.yup.AnonMaxDate
import typings.yup.AnonMinDate
import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateSchema[T /* <: js.UndefOr[Date | Null] */] extends Schema[T] {
  def max(limit: String): DateSchema[T] = js.native
  def max(limit: String, message: TestOptionsMessage[AnonMaxDate, _]): DateSchema[T] = js.native
  def max(limit: Date): DateSchema[T] = js.native
  def max(limit: Date, message: TestOptionsMessage[AnonMaxDate, _]): DateSchema[T] = js.native
  def max(limit: Ref_): DateSchema[T] = js.native
  def max(limit: Ref_, message: TestOptionsMessage[AnonMaxDate, _]): DateSchema[T] = js.native
  def min(limit: String): DateSchema[T] = js.native
  def min(limit: String, message: TestOptionsMessage[AnonMinDate, _]): DateSchema[T] = js.native
  def min(limit: Date): DateSchema[T] = js.native
  def min(limit: Date, message: TestOptionsMessage[AnonMinDate, _]): DateSchema[T] = js.native
  def min(limit: Ref_): DateSchema[T] = js.native
  def min(limit: Ref_, message: TestOptionsMessage[AnonMinDate, _]): DateSchema[T] = js.native
  def notRequired(): DateSchema[js.UndefOr[T]] = js.native
  def nullable(): DateSchema[T | Null] = js.native
  def nullable(isNullable: Boolean): DateSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): DateSchema[Exclude[T, Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): DateSchema[T | Null] = js.native
  def required(): DateSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): DateSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
}

