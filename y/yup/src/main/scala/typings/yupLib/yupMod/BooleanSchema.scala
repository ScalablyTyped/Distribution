package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BooleanSchema[T /* <: js.UndefOr[scala.Boolean | scala.Null] */] extends Schema[T] {
  def notRequired(): BooleanSchema[js.UndefOr[T]] = js.native
  def nullable(): BooleanSchema[T | scala.Null] = js.native
  def nullable(isNullable: scala.Boolean): BooleanSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: yupLib.yupLibNumbers.`false`): BooleanSchema[stdLib.Exclude[T, scala.Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: yupLib.yupLibNumbers.`true`): BooleanSchema[T | scala.Null] = js.native
  def required(): BooleanSchema[stdLib.Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def required(message: TestOptionsMessage): BooleanSchema[stdLib.Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
}

