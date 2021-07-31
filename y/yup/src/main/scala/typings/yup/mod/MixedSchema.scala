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
trait MixedSchema[T /* <: js.Any */, C]
  extends StObject
     with Schema[T, C] {
  
  def concat[U](schema: Schema[U, C]): MixedSchema[T | U, C] = js.native
  
  def defined(): MixedSchema[Exclude[T, Unit], C] = js.native
  
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): MixedSchema[MaintainOptionality[T, U], C] = js.native
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: js.UndefOr[TestOptionsMessage[Values, js.Any]]): MixedSchema[MaintainOptionality[T, U], C] = js.native
  
  def notRequired(): MixedSchema[js.UndefOr[T], C] = js.native
  
  def nullable(): MixedSchema[T | Null, C] = js.native
  def nullable(isNullable: Boolean): MixedSchema[T, C] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): MixedSchema[Exclude[T, Null], C] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): MixedSchema[T | Null, C] = js.native
  
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): MixedSchema[MaintainOptionality[T, U], C] = js.native
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: js.UndefOr[TestOptionsMessage[Values, js.Any]]): MixedSchema[MaintainOptionality[T, U], C] = js.native
  
  def optional(): MixedSchema[js.UndefOr[T], C] = js.native
  
  def required(): MixedSchema[Exclude[T, js.UndefOr[Null]], C] = js.native
  def required(message: TestOptionsMessage[js.Object, js.Any]): MixedSchema[Exclude[T, js.UndefOr[Null]], C] = js.native
  
  def test(name: String, message: TestOptionsMessage[js.Object, js.Any], test: TestFunction[js.Any, C]): this.type = js.native
  def test(options: TestOptions[Record[String, js.Any], C]): this.type = js.native
  def test[U /* <: T */](options: AssertingTestOptions[U, Record[String, js.Any], C]): MixedSchema[U, C] = js.native
  @JSName("test")
  def test_U_T_MixedSchema[U /* <: T */](name: String, message: TestOptionsMessage[js.Object, js.Any], test: AssertingTestFunction[U, C]): MixedSchema[U, C] = js.native
}
