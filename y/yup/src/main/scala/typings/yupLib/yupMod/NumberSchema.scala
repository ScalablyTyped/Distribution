package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberSchema[T /* <: js.UndefOr[scala.Double | scala.Null] */] extends Schema[T] {
  def integer(): NumberSchema[T] = js.native
  def integer(message: TestOptionsMessage): NumberSchema[T] = js.native
  def lessThan(limit: scala.Double): NumberSchema[T] = js.native
  def lessThan(limit: scala.Double, message: TestOptionsMessage): NumberSchema[T] = js.native
  def lessThan(limit: Ref): NumberSchema[T] = js.native
  def lessThan(limit: Ref, message: TestOptionsMessage): NumberSchema[T] = js.native
  def max(limit: scala.Double): NumberSchema[T] = js.native
  def max(limit: scala.Double, message: TestOptionsMessage): NumberSchema[T] = js.native
  def max(limit: Ref): NumberSchema[T] = js.native
  def max(limit: Ref, message: TestOptionsMessage): NumberSchema[T] = js.native
  def min(limit: scala.Double): NumberSchema[T] = js.native
  def min(limit: scala.Double, message: TestOptionsMessage): NumberSchema[T] = js.native
  def min(limit: Ref): NumberSchema[T] = js.native
  def min(limit: Ref, message: TestOptionsMessage): NumberSchema[T] = js.native
  def moreThan(limit: scala.Double): NumberSchema[T] = js.native
  def moreThan(limit: scala.Double, message: TestOptionsMessage): NumberSchema[T] = js.native
  def moreThan(limit: Ref): NumberSchema[T] = js.native
  def moreThan(limit: Ref, message: TestOptionsMessage): NumberSchema[T] = js.native
  def negative(): NumberSchema[T] = js.native
  def negative(message: TestOptionsMessage): NumberSchema[T] = js.native
  def notRequired(): NumberSchema[js.UndefOr[T]] = js.native
  def nullable(): NumberSchema[T | scala.Null] = js.native
  def nullable(isNullable: scala.Boolean): NumberSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: yupLib.yupLibNumbers.`false`): NumberSchema[stdLib.Exclude[T, scala.Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: yupLib.yupLibNumbers.`true`): NumberSchema[T | scala.Null] = js.native
  def positive(): NumberSchema[T] = js.native
  def positive(message: TestOptionsMessage): NumberSchema[T] = js.native
  def required(): NumberSchema[stdLib.Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def required(message: TestOptionsMessage): NumberSchema[stdLib.Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  @JSName("round")
  def round_ceil(`type`: yupLib.yupLibStrings.ceil): NumberSchema[T] = js.native
  @JSName("round")
  def round_floor(`type`: yupLib.yupLibStrings.floor): NumberSchema[T] = js.native
  @JSName("round")
  def round_round(`type`: yupLib.yupLibStrings.round): NumberSchema[T] = js.native
  @JSName("round")
  def round_trunc(`type`: yupLib.yupLibStrings.trunc): NumberSchema[T] = js.native
  def truncate(): NumberSchema[T] = js.native
}

