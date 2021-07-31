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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringSchema[T /* <: js.UndefOr[String | Null] */, C]
  extends StObject
     with Schema[T, C] {
  
  def defined(): StringSchema[Exclude[T, Unit], C] = js.native
  
  def email(): StringSchema[T, C] = js.native
  def email(message: js.UndefOr[TestOptionsMessage[Regex, js.Any]]): StringSchema[T, C] = js.native
  
  def ensure(): StringSchema[T, C] = js.native
  
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): StringSchema[MaintainOptionality[T, U], C] = js.native
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: js.UndefOr[TestOptionsMessage[Values, js.Any]]): StringSchema[MaintainOptionality[T, U], C] = js.native
  
  def length(limit: Double): StringSchema[T, C] = js.native
  def length(limit: Double, message: js.UndefOr[TestOptionsMessage[Length, js.Any]]): StringSchema[T, C] = js.native
  def length(limit: Ref_): StringSchema[T, C] = js.native
  def length(limit: Ref_, message: js.UndefOr[TestOptionsMessage[Length, js.Any]]): StringSchema[T, C] = js.native
  
  def lowercase(): StringSchema[T, C] = js.native
  def lowercase(message: js.UndefOr[TestOptionsMessage[js.Object, js.Any]]): StringSchema[T, C] = js.native
  
  def matches(regex: RegExp): StringSchema[T, C] = js.native
  def matches(regex: RegExp, messageOrOptions: js.UndefOr[TestOptionsMessage[Regex, js.Any]]): StringSchema[T, C] = js.native
  def matches(regex: RegExp, messageOrOptions: ExcludeEmptyString): StringSchema[T, C] = js.native
  
  def max(limit: Double): StringSchema[T, C] = js.native
  def max(limit: Double, message: js.UndefOr[TestOptionsMessage[Max, js.Any]]): StringSchema[T, C] = js.native
  def max(limit: Ref_): StringSchema[T, C] = js.native
  def max(limit: Ref_, message: js.UndefOr[TestOptionsMessage[Max, js.Any]]): StringSchema[T, C] = js.native
  
  def min(limit: Double): StringSchema[T, C] = js.native
  def min(limit: Double, message: js.UndefOr[TestOptionsMessage[Min, js.Any]]): StringSchema[T, C] = js.native
  def min(limit: Ref_): StringSchema[T, C] = js.native
  def min(limit: Ref_, message: js.UndefOr[TestOptionsMessage[Min, js.Any]]): StringSchema[T, C] = js.native
  
  def notRequired(): StringSchema[js.UndefOr[T], C] = js.native
  
  def nullable(): StringSchema[T | Null, C] = js.native
  def nullable(isNullable: Boolean): StringSchema[T, C] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): StringSchema[Exclude[T, Null], C] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): StringSchema[T | Null, C] = js.native
  
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): StringSchema[MaintainOptionality[T, U], C] = js.native
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: js.UndefOr[TestOptionsMessage[Values, js.Any]]): StringSchema[MaintainOptionality[T, U], C] = js.native
  
  def optional(): StringSchema[js.UndefOr[T], C] = js.native
  
  def required(): StringSchema[Exclude[T, js.UndefOr[Null]], C] = js.native
  def required(message: TestOptionsMessage[js.Object, js.Any]): StringSchema[Exclude[T, js.UndefOr[Null]], C] = js.native
  
  /*
    All TestFunction generics are intentionally T with (undefined | null) as previous .required / .defined / .nullable
    will narrow out those types, and tests run for (undefined | null) even if they're not allowed.
    */
  def test(
    name: String,
    message: TestOptionsMessage[js.Object, js.Any],
    test: TestFunction[js.UndefOr[T | Null], C]
  ): this.type = js.native
  def test(options: TestOptions[Record[String, js.Any], C]): this.type = js.native
  def test[U /* <: T */](options: AssertingTestOptions[U, Record[String, js.Any], C]): StringSchema[U, C] = js.native
  @JSName("test")
  def test_U_T_StringSchema[U /* <: T */](name: String, message: TestOptionsMessage[js.Object, js.Any], test: AssertingTestFunction[U, C]): StringSchema[U, C] = js.native
  
  def trim(): StringSchema[T, C] = js.native
  def trim(message: js.UndefOr[TestOptionsMessage[js.Object, js.Any]]): StringSchema[T, C] = js.native
  
  def uppercase(): StringSchema[T, C] = js.native
  def uppercase(message: js.UndefOr[TestOptionsMessage[js.Object, js.Any]]): StringSchema[T, C] = js.native
  
  def url(): StringSchema[T, C] = js.native
  def url(message: js.UndefOr[TestOptionsMessage[Regex, js.Any]]): StringSchema[T, C] = js.native
  
  def uuid(): StringSchema[T, C] = js.native
  def uuid(message: js.UndefOr[TestOptionsMessage[Regex, js.Any]]): StringSchema[T, C] = js.native
}
