package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringSchema[T /* <: js.UndefOr[java.lang.String | scala.Null] */] extends Schema[T] {
  def email(): StringSchema[T] = js.native
  def email(message: TestOptionsMessage): StringSchema[T] = js.native
  def ensure(): StringSchema[T] = js.native
  def length(limit: scala.Double): StringSchema[T] = js.native
  def length(limit: scala.Double, message: TestOptionsMessage): StringSchema[T] = js.native
  def length(limit: Ref): StringSchema[T] = js.native
  def length(limit: Ref, message: TestOptionsMessage): StringSchema[T] = js.native
  def lowercase(): StringSchema[T] = js.native
  def lowercase(message: TestOptionsMessage): StringSchema[T] = js.native
  def matches(regex: stdLib.RegExp): StringSchema[T] = js.native
  def matches(regex: stdLib.RegExp, messageOrOptions: yupLib.Anon_ExcludeEmptyString): StringSchema[T] = js.native
  def matches(regex: stdLib.RegExp, messageOrOptions: TestOptionsMessage): StringSchema[T] = js.native
  def max(limit: scala.Double): StringSchema[T] = js.native
  def max(limit: scala.Double, message: TestOptionsMessage): StringSchema[T] = js.native
  def max(limit: Ref): StringSchema[T] = js.native
  def max(limit: Ref, message: TestOptionsMessage): StringSchema[T] = js.native
  def min(limit: scala.Double): StringSchema[T] = js.native
  def min(limit: scala.Double, message: TestOptionsMessage): StringSchema[T] = js.native
  def min(limit: Ref): StringSchema[T] = js.native
  def min(limit: Ref, message: TestOptionsMessage): StringSchema[T] = js.native
  def notRequired(): StringSchema[js.UndefOr[T]] = js.native
  def nullable(): StringSchema[T | scala.Null] = js.native
  def nullable(isNullable: scala.Boolean): StringSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: yupLib.yupLibNumbers.`false`): StringSchema[stdLib.Exclude[T, scala.Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: yupLib.yupLibNumbers.`true`): StringSchema[T | scala.Null] = js.native
  def required(): StringSchema[stdLib.Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def required(message: TestOptionsMessage): StringSchema[stdLib.Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def trim(): StringSchema[T] = js.native
  def trim(message: TestOptionsMessage): StringSchema[T] = js.native
  def uppercase(): StringSchema[T] = js.native
  def uppercase(message: TestOptionsMessage): StringSchema[T] = js.native
  def url(): StringSchema[T] = js.native
  def url(message: TestOptionsMessage): StringSchema[T] = js.native
}

