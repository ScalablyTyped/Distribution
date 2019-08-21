package typings.yup.yupMod

import typings.std.Exclude
import typings.std.RegExp
import typings.yup.Anon_ExcludeEmptyString
import typings.yup.Anon_Length
import typings.yup.Anon_Max
import typings.yup.Anon_Min
import typings.yup.Anon_Regex
import typings.yup.yupNumbers.`false`
import typings.yup.yupNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringSchema[T /* <: js.UndefOr[String | Null] */] extends Schema[T] {
  def email(): StringSchema[T] = js.native
  def email(message: TestOptionsMessage[Anon_Regex, _]): StringSchema[T] = js.native
  def ensure(): StringSchema[T] = js.native
  def length(limit: Double): StringSchema[T] = js.native
  def length(limit: Double, message: TestOptionsMessage[Anon_Length, _]): StringSchema[T] = js.native
  def length(limit: Ref): StringSchema[T] = js.native
  def length(limit: Ref, message: TestOptionsMessage[Anon_Length, _]): StringSchema[T] = js.native
  def lowercase(): StringSchema[T] = js.native
  def lowercase(message: TestOptionsMessage[js.Object, _]): StringSchema[T] = js.native
  def matches(regex: RegExp): StringSchema[T] = js.native
  def matches(regex: RegExp, messageOrOptions: Anon_ExcludeEmptyString): StringSchema[T] = js.native
  def matches(regex: RegExp, messageOrOptions: TestOptionsMessage[Anon_Regex, _]): StringSchema[T] = js.native
  def max(limit: Double): StringSchema[T] = js.native
  def max(limit: Double, message: TestOptionsMessage[Anon_Max, _]): StringSchema[T] = js.native
  def max(limit: Ref): StringSchema[T] = js.native
  def max(limit: Ref, message: TestOptionsMessage[Anon_Max, _]): StringSchema[T] = js.native
  def min(limit: Double): StringSchema[T] = js.native
  def min(limit: Double, message: TestOptionsMessage[Anon_Min, _]): StringSchema[T] = js.native
  def min(limit: Ref): StringSchema[T] = js.native
  def min(limit: Ref, message: TestOptionsMessage[Anon_Min, _]): StringSchema[T] = js.native
  def notRequired(): StringSchema[js.UndefOr[T]] = js.native
  def nullable(): StringSchema[T | Null] = js.native
  def nullable(isNullable: Boolean): StringSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): StringSchema[Exclude[T, Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): StringSchema[T | Null] = js.native
  def required(): StringSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): StringSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def trim(): StringSchema[T] = js.native
  def trim(message: TestOptionsMessage[js.Object, _]): StringSchema[T] = js.native
  def uppercase(): StringSchema[T] = js.native
  def uppercase(message: TestOptionsMessage[js.Object, _]): StringSchema[T] = js.native
  def url(): StringSchema[T] = js.native
  def url(message: TestOptionsMessage[Anon_Regex, _]): StringSchema[T] = js.native
}

