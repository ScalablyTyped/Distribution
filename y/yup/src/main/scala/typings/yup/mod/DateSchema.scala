package typings.yup.mod

import typings.std.Date
import typings.std.Exclude
import typings.std.Record
import typings.yup.anon.Values
import typings.yup.anon.`0`
import typings.yup.anon.`1`
import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateSchema[T /* <: js.UndefOr[Date | String | Null] */, C] extends Schema[T, C] {
  
  def defined(): DateSchema[Exclude[T, js.UndefOr[scala.Nothing]], C] = js.native
  
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): DateSchema[MaintainOptionality[T, U], C] = js.native
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: js.UndefOr[TestOptionsMessage[Values, _]]): DateSchema[MaintainOptionality[T, U], C] = js.native
  
  def max(limit: String): DateSchema[T, C] = js.native
  def max(limit: String, message: js.UndefOr[TestOptionsMessage[`1`, _]]): DateSchema[T, C] = js.native
  def max(limit: Date): DateSchema[T, C] = js.native
  def max(limit: Date, message: js.UndefOr[TestOptionsMessage[`1`, _]]): DateSchema[T, C] = js.native
  def max(limit: Ref_): DateSchema[T, C] = js.native
  def max(limit: Ref_, message: js.UndefOr[TestOptionsMessage[`1`, _]]): DateSchema[T, C] = js.native
  
  def min(limit: String): DateSchema[T, C] = js.native
  def min(limit: String, message: js.UndefOr[TestOptionsMessage[`0`, _]]): DateSchema[T, C] = js.native
  def min(limit: Date): DateSchema[T, C] = js.native
  def min(limit: Date, message: js.UndefOr[TestOptionsMessage[`0`, _]]): DateSchema[T, C] = js.native
  def min(limit: Ref_): DateSchema[T, C] = js.native
  def min(limit: Ref_, message: js.UndefOr[TestOptionsMessage[`0`, _]]): DateSchema[T, C] = js.native
  
  def notRequired(): DateSchema[js.UndefOr[T], C] = js.native
  
  def nullable(): DateSchema[T | Null, C] = js.native
  def nullable(isNullable: Boolean): DateSchema[T, C] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): DateSchema[Exclude[T, Null], C] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): DateSchema[T | Null, C] = js.native
  
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): DateSchema[MaintainOptionality[T, U], C] = js.native
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: js.UndefOr[TestOptionsMessage[Values, _]]): DateSchema[MaintainOptionality[T, U], C] = js.native
  
  def optional(): DateSchema[js.UndefOr[T], C] = js.native
  
  def required(): DateSchema[Exclude[T, js.UndefOr[Null]], C] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): DateSchema[Exclude[T, js.UndefOr[Null]], C] = js.native
  
  def test(
    name: String,
    message: TestOptionsMessage[js.Object, _],
    test: TestFunction[js.UndefOr[T | Null], C]
  ): this.type = js.native
  def test(options: TestOptions[Record[String, _], C]): this.type = js.native
  def test[U /* <: T */](options: AssertingTestOptions[U, Record[String, _], C]): DateSchema[U, C] = js.native
  @JSName("test")
  def test_U_T_DateSchema[U /* <: T */](name: String, message: TestOptionsMessage[js.Object, _], test: AssertingTestFunction[U, C]): DateSchema[U, C] = js.native
}
