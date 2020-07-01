package typings.yup.mod

import typings.std.Exclude
import typings.std.Record
import typings.yup.anon.Values
import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MixedSchema[T /* <: js.Any */] extends Schema[T] {
  def concat[U](schema: Schema[U]): MixedSchema[T | U] = js.native
  def defined(): MixedSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): MixedSchema[MaintainOptionality[T, U]] = js.native
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: TestOptionsMessage[Values, _]): MixedSchema[MaintainOptionality[T, U]] = js.native
  def notRequired(): MixedSchema[js.UndefOr[T]] = js.native
  def nullable(): MixedSchema[T | Null] = js.native
  def nullable(isNullable: Boolean): MixedSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): MixedSchema[Exclude[T, Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): MixedSchema[T | Null] = js.native
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): MixedSchema[MaintainOptionality[T, U]] = js.native
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: TestOptionsMessage[Values, _]): MixedSchema[MaintainOptionality[T, U]] = js.native
  def optional(): MixedSchema[js.UndefOr[T]] = js.native
  def required(): MixedSchema[Exclude[T, js.UndefOr[Null]]] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): MixedSchema[Exclude[T, js.UndefOr[Null]]] = js.native
  def test(name: String, message: TestOptionsMessage[js.Object, _], test: TestFunction): this.type = js.native
  def test(options: TestOptions[Record[String, _]]): this.type = js.native
  def test[U /* <: T */](options: AssertingTestOptions[U, Record[String, _]]): MixedSchema[U] = js.native
  @JSName("test")
  def test_U_T_MixedSchema[U /* <: T */](name: String, message: TestOptionsMessage[js.Object, _], test: AssertingTestFunction[U]): MixedSchema[U] = js.native
}

