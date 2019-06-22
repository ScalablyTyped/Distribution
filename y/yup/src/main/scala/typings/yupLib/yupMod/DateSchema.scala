package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateSchema[T /* <: js.UndefOr[stdLib.Date | scala.Null] */] extends Schema[T] {
  def max(limit: java.lang.String): DateSchema[T] = js.native
  def max(limit: java.lang.String, message: TestOptionsMessage): DateSchema[T] = js.native
  def max(limit: stdLib.Date): DateSchema[T] = js.native
  def max(limit: stdLib.Date, message: TestOptionsMessage): DateSchema[T] = js.native
  def max(limit: Ref): DateSchema[T] = js.native
  def max(limit: Ref, message: TestOptionsMessage): DateSchema[T] = js.native
  def min(limit: java.lang.String): DateSchema[T] = js.native
  def min(limit: java.lang.String, message: TestOptionsMessage): DateSchema[T] = js.native
  def min(limit: stdLib.Date): DateSchema[T] = js.native
  def min(limit: stdLib.Date, message: TestOptionsMessage): DateSchema[T] = js.native
  def min(limit: Ref): DateSchema[T] = js.native
  def min(limit: Ref, message: TestOptionsMessage): DateSchema[T] = js.native
  def notRequired(): DateSchema[js.UndefOr[T]] = js.native
  def nullable(): DateSchema[T | scala.Null] = js.native
  def nullable(isNullable: scala.Boolean): DateSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: yupLib.yupLibNumbers.`false`): DateSchema[stdLib.Exclude[T, scala.Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: yupLib.yupLibNumbers.`true`): DateSchema[T | scala.Null] = js.native
  def required(): DateSchema[stdLib.Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def required(message: TestOptionsMessage): DateSchema[stdLib.Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
}

