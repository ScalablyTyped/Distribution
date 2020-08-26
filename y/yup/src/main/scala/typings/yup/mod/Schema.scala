package typings.yup.mod

import typings.yup.anon.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema[T] extends js.Object {
  var `type`: String = js.native
  def cast(): T = js.native
  def cast(value: js.UndefOr[scala.Nothing], options: js.Any): T = js.native
  def cast(value: js.Any): T = js.native
  def cast(value: js.Any, options: js.Any): T = js.native
  def concat(schema: this.type): this.type = js.native
  def default(): T = js.native
  def default(value: js.Any): this.type = js.native
  def describe(): SchemaDescription = js.native
  def isType(value: js.Any): /* is T */ Boolean = js.native
  def isValid(value: js.Any): js.Promise[Boolean] = js.native
  def isValid(value: js.Any, options: js.Any): js.Promise[Boolean] = js.native
  def isValidSync(value: js.Any): /* is T */ Boolean = js.native
  def isValidSync(value: js.Any, options: js.Any): /* is T */ Boolean = js.native
  def label(label: String): this.type = js.native
  def meta(): js.Any = js.native
  def meta(metadata: js.Any): this.type = js.native
  def notOneOf(arrayOfValues: js.Array[_]): this.type = js.native
  def notOneOf(arrayOfValues: js.Array[_], message: js.UndefOr[TestOptionsMessage[Values, _]]): this.type = js.native
  def strict(isStrict: Boolean): this.type = js.native
  def strip(strip: Boolean): this.type = js.native
  def transform(fn: TransformFunction[this.type]): this.type = js.native
  def typeError(): this.type = js.native
  def typeError(message: TestOptionsMessage[js.Object, _]): this.type = js.native
  def validate(value: js.Any): js.Promise[T] = js.native
  def validate(value: js.Any, options: ValidateOptions): js.Promise[T] = js.native
  def validateAt(path: String, value: T): js.Promise[T] = js.native
  def validateAt(path: String, value: T, options: ValidateOptions): js.Promise[T] = js.native
  def validateSync(value: js.Any): T = js.native
  def validateSync(value: js.Any, options: ValidateOptions): T = js.native
  def validateSyncAt(path: String, value: T): T = js.native
  def validateSyncAt(path: String, value: T, options: ValidateOptions): T = js.native
  def when(keys: String, builder: WhenOptions[this.type]): this.type = js.native
  def when(keys: js.Array[_], builder: WhenOptions[this.type]): this.type = js.native
  def withMutation(fn: js.Function1[/* current */ this.type, Unit]): Unit = js.native
}

