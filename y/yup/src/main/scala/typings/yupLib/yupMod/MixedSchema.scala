package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MixedSchema[T] extends Schema[T] {
  def concat[U](schema: MixedSchema[U]): MixedSchema[T | U] = js.native
  def notRequired(): MixedSchema[js.UndefOr[T]] = js.native
  def nullable(): MixedSchema[T | scala.Null] = js.native
  def nullable(isNullable: scala.Boolean): MixedSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: yupLib.yupLibNumbers.`false`): MixedSchema[stdLib.Exclude[T, scala.Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: yupLib.yupLibNumbers.`true`): MixedSchema[T | scala.Null] = js.native
  def required(): MixedSchema[stdLib.Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def required(message: TestOptionsMessage): MixedSchema[stdLib.Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
}

