package typings.yup.mod

import typings.std.Date
import typings.std.Exclude
import typings.std.Record
import typings.yup.anon.Values
import typings.yup.anon.`0`
import typings.yup.anon.`1`
import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateSchema[T /* <: js.UndefOr[Date | Null] */] extends Schema[T] {
  def defined(): DateSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): DateSchema[MaintainOptionality[T, U]] = js.native
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: TestOptionsMessage[Values, _]): DateSchema[MaintainOptionality[T, U]] = js.native
  def max(limit: String): DateSchema[T] = js.native
  def max(limit: String, message: TestOptionsMessage[`1`, _]): DateSchema[T] = js.native
  def max(limit: Date): DateSchema[T] = js.native
  def max(limit: Date, message: TestOptionsMessage[`1`, _]): DateSchema[T] = js.native
  def max(limit: Ref_): DateSchema[T] = js.native
  def max(limit: Ref_, message: TestOptionsMessage[`1`, _]): DateSchema[T] = js.native
  def min(limit: String): DateSchema[T] = js.native
  def min(limit: String, message: TestOptionsMessage[`0`, _]): DateSchema[T] = js.native
  def min(limit: Date): DateSchema[T] = js.native
  def min(limit: Date, message: TestOptionsMessage[`0`, _]): DateSchema[T] = js.native
  def min(limit: Ref_): DateSchema[T] = js.native
  def min(limit: Ref_, message: TestOptionsMessage[`0`, _]): DateSchema[T] = js.native
  def notRequired(): DateSchema[js.UndefOr[T]] = js.native
  def nullable(): DateSchema[T | Null] = js.native
  def nullable(isNullable: Boolean): DateSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): DateSchema[Exclude[T, Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): DateSchema[T | Null] = js.native
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): DateSchema[MaintainOptionality[T, U]] = js.native
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: TestOptionsMessage[Values, _]): DateSchema[MaintainOptionality[T, U]] = js.native
  def optional(): DateSchema[js.UndefOr[T]] = js.native
  def required(): DateSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): DateSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def test(name: String, message: TestOptionsMessage[js.Object, _], test: TestFunction): this.type = js.native
  def test(options: TestOptions[Record[String, _]]): this.type = js.native
  def test[U /* <: T */](options: AssertingTestOptions[U, Record[String, _]]): DateSchema[U] = js.native
  @JSName("test")
  def test_U_T_DateSchema[U /* <: T */](name: String, message: TestOptionsMessage[js.Object, _], test: AssertingTestFunction[U]): DateSchema[U] = js.native
}

