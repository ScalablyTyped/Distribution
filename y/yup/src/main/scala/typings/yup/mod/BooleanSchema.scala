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
trait BooleanSchema[T /* <: js.UndefOr[Boolean | Null] */] extends Schema[T] {
  def defined(): BooleanSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): BooleanSchema[MaintainOptionality[T, U]] = js.native
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: TestOptionsMessage[Values, _]): BooleanSchema[MaintainOptionality[T, U]] = js.native
  def notRequired(): BooleanSchema[js.UndefOr[T]] = js.native
  def nullable(): BooleanSchema[T | Null] = js.native
  def nullable(isNullable: Boolean): BooleanSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): BooleanSchema[Exclude[T, Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): BooleanSchema[T | Null] = js.native
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): BooleanSchema[MaintainOptionality[T, U]] = js.native
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: TestOptionsMessage[Values, _]): BooleanSchema[MaintainOptionality[T, U]] = js.native
  def optional(): BooleanSchema[js.UndefOr[T]] = js.native
  def required(): BooleanSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): BooleanSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def test(name: String, message: TestOptionsMessage[js.Object, _], test: TestFunction): this.type = js.native
  def test(options: TestOptions[Record[String, _]]): this.type = js.native
  def test[U /* <: T */](options: AssertingTestOptions[U, Record[String, _]]): BooleanSchema[U] = js.native
  @JSName("test")
  def test_U_T_BooleanSchema[U /* <: T */](name: String, message: TestOptionsMessage[js.Object, _], test: AssertingTestFunction[U]): BooleanSchema[U] = js.native
}

