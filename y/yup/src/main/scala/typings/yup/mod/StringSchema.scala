package typings.yup.mod

import typings.std.Exclude
import typings.std.Record
import typings.std.RegExp
import typings.yup.anon.ExcludeEmptyString
import typings.yup.anon.Length
import typings.yup.anon.Max
import typings.yup.anon.Min
import typings.yup.anon.Regex
import typings.yup.anon.Values
import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringSchema[T /* <: js.UndefOr[String | Null] */] extends Schema[T] {
  def defined(): StringSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def email(): StringSchema[T] = js.native
  def email(message: TestOptionsMessage[Regex, _]): StringSchema[T] = js.native
  def ensure(): StringSchema[T] = js.native
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): StringSchema[MaintainOptionality[T, U]] = js.native
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: TestOptionsMessage[Values, _]): StringSchema[MaintainOptionality[T, U]] = js.native
  def length(limit: Double): StringSchema[T] = js.native
  def length(limit: Double, message: TestOptionsMessage[Length, _]): StringSchema[T] = js.native
  def length(limit: Ref_): StringSchema[T] = js.native
  def length(limit: Ref_, message: TestOptionsMessage[Length, _]): StringSchema[T] = js.native
  def lowercase(): StringSchema[T] = js.native
  def lowercase(message: TestOptionsMessage[js.Object, _]): StringSchema[T] = js.native
  def matches(regex: RegExp): StringSchema[T] = js.native
  def matches(regex: RegExp, messageOrOptions: ExcludeEmptyString): StringSchema[T] = js.native
  def matches(regex: RegExp, messageOrOptions: TestOptionsMessage[Regex, _]): StringSchema[T] = js.native
  def max(limit: Double): StringSchema[T] = js.native
  def max(limit: Double, message: TestOptionsMessage[Max, _]): StringSchema[T] = js.native
  def max(limit: Ref_): StringSchema[T] = js.native
  def max(limit: Ref_, message: TestOptionsMessage[Max, _]): StringSchema[T] = js.native
  def min(limit: Double): StringSchema[T] = js.native
  def min(limit: Double, message: TestOptionsMessage[Min, _]): StringSchema[T] = js.native
  def min(limit: Ref_): StringSchema[T] = js.native
  def min(limit: Ref_, message: TestOptionsMessage[Min, _]): StringSchema[T] = js.native
  def notRequired(): StringSchema[js.UndefOr[T]] = js.native
  def nullable(): StringSchema[T | Null] = js.native
  def nullable(isNullable: Boolean): StringSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): StringSchema[Exclude[T, Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): StringSchema[T | Null] = js.native
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): StringSchema[MaintainOptionality[T, U]] = js.native
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: TestOptionsMessage[Values, _]): StringSchema[MaintainOptionality[T, U]] = js.native
  def optional(): StringSchema[js.UndefOr[T]] = js.native
  def required(): StringSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): StringSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def test(name: String, message: TestOptionsMessage[js.Object, _], test: TestFunction): this.type = js.native
  def test(options: TestOptions[Record[String, _]]): this.type = js.native
  def test[U /* <: T */](options: AssertingTestOptions[U, Record[String, _]]): StringSchema[U] = js.native
  @JSName("test")
  def test_U_T_StringSchema[U /* <: T */](name: String, message: TestOptionsMessage[js.Object, _], test: AssertingTestFunction[U]): StringSchema[U] = js.native
  def trim(): StringSchema[T] = js.native
  def trim(message: TestOptionsMessage[js.Object, _]): StringSchema[T] = js.native
  def uppercase(): StringSchema[T] = js.native
  def uppercase(message: TestOptionsMessage[js.Object, _]): StringSchema[T] = js.native
  def url(): StringSchema[T] = js.native
  def url(message: TestOptionsMessage[Regex, _]): StringSchema[T] = js.native
}

