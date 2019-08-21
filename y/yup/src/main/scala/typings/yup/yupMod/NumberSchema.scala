package typings.yup.yupMod

import typings.std.Exclude
import typings.yup.Anon_Less
import typings.yup.Anon_MaxNumber
import typings.yup.Anon_MinNumber
import typings.yup.Anon_More
import typings.yup.yupNumbers.`false`
import typings.yup.yupNumbers.`true`
import typings.yup.yupStrings.ceil
import typings.yup.yupStrings.floor
import typings.yup.yupStrings.round
import typings.yup.yupStrings.trunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberSchema[T /* <: js.UndefOr[Double | Null] */] extends Schema[T] {
  def integer(): NumberSchema[T] = js.native
  def integer(message: TestOptionsMessage[js.Object, _]): NumberSchema[T] = js.native
  def lessThan(limit: Double): NumberSchema[T] = js.native
  def lessThan(limit: Double, message: TestOptionsMessage[Anon_Less, _]): NumberSchema[T] = js.native
  def lessThan(limit: Ref): NumberSchema[T] = js.native
  def lessThan(limit: Ref, message: TestOptionsMessage[Anon_Less, _]): NumberSchema[T] = js.native
  def max(limit: Double): NumberSchema[T] = js.native
  def max(limit: Double, message: TestOptionsMessage[Anon_MaxNumber, _]): NumberSchema[T] = js.native
  def max(limit: Ref): NumberSchema[T] = js.native
  def max(limit: Ref, message: TestOptionsMessage[Anon_MaxNumber, _]): NumberSchema[T] = js.native
  def min(limit: Double): NumberSchema[T] = js.native
  def min(limit: Double, message: TestOptionsMessage[Anon_MinNumber, _]): NumberSchema[T] = js.native
  def min(limit: Ref): NumberSchema[T] = js.native
  def min(limit: Ref, message: TestOptionsMessage[Anon_MinNumber, _]): NumberSchema[T] = js.native
  def moreThan(limit: Double): NumberSchema[T] = js.native
  def moreThan(limit: Double, message: TestOptionsMessage[Anon_More, _]): NumberSchema[T] = js.native
  def moreThan(limit: Ref): NumberSchema[T] = js.native
  def moreThan(limit: Ref, message: TestOptionsMessage[Anon_More, _]): NumberSchema[T] = js.native
  def negative(): NumberSchema[T] = js.native
  def negative(message: TestOptionsMessage[Anon_Less, _]): NumberSchema[T] = js.native
  def notRequired(): NumberSchema[js.UndefOr[T]] = js.native
  def nullable(): NumberSchema[T | Null] = js.native
  def nullable(isNullable: Boolean): NumberSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): NumberSchema[Exclude[T, Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): NumberSchema[T | Null] = js.native
  def positive(): NumberSchema[T] = js.native
  def positive(message: TestOptionsMessage[Anon_More, _]): NumberSchema[T] = js.native
  def required(): NumberSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): NumberSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  @JSName("round")
  def round_ceil(`type`: ceil): NumberSchema[T] = js.native
  @JSName("round")
  def round_floor(`type`: floor): NumberSchema[T] = js.native
  @JSName("round")
  def round_round(`type`: round): NumberSchema[T] = js.native
  @JSName("round")
  def round_trunc(`type`: trunc): NumberSchema[T] = js.native
  def truncate(): NumberSchema[T] = js.native
}

