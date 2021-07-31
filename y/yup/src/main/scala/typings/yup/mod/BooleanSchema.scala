package typings.yup.mod

import typings.std.Exclude
import typings.std.Record
import typings.yup.anon.Values
import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooleanSchema[T /* <: js.UndefOr[Boolean | Null] */, C]
  extends StObject
     with Schema[T, C] {
  
  def defined(): BooleanSchema[Exclude[T, Unit], C] = js.native
  
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): BooleanSchema[MaintainOptionality[T, U], C] = js.native
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: js.UndefOr[TestOptionsMessage[Values, js.Any]]): BooleanSchema[MaintainOptionality[T, U], C] = js.native
  
  def notRequired(): BooleanSchema[js.UndefOr[T], C] = js.native
  
  def nullable(): BooleanSchema[T | Null, C] = js.native
  def nullable(isNullable: Boolean): BooleanSchema[T, C] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): BooleanSchema[Exclude[T, Null], C] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): BooleanSchema[T | Null, C] = js.native
  
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): BooleanSchema[MaintainOptionality[T, U], C] = js.native
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: js.UndefOr[TestOptionsMessage[Values, js.Any]]): BooleanSchema[MaintainOptionality[T, U], C] = js.native
  
  def optional(): BooleanSchema[js.UndefOr[T], C] = js.native
  
  def required(): BooleanSchema[Exclude[T, js.UndefOr[Null]], C] = js.native
  def required(message: TestOptionsMessage[js.Object, js.Any]): BooleanSchema[Exclude[T, js.UndefOr[Null]], C] = js.native
  
  def test(
    name: String,
    message: TestOptionsMessage[js.Object, js.Any],
    test: TestFunction[js.UndefOr[T | Null], C]
  ): this.type = js.native
  def test(options: TestOptions[Record[String, js.Any], C]): this.type = js.native
  def test[U /* <: T */](options: AssertingTestOptions[U, Record[String, js.Any], C]): BooleanSchema[U, C] = js.native
  @JSName("test")
  def test_U_T_BooleanSchema[U /* <: T */](name: String, message: TestOptionsMessage[js.Object, js.Any], test: AssertingTestFunction[U, C]): BooleanSchema[U, C] = js.native
}
