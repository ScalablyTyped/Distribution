package typings.yup.mod

import typings.yup.AnonValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema[T] extends js.Object {
  def cast(): T = js.native
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
  def notOneOf(arrayOfValues: js.Array[_], message: TestOptionsMessage[AnonValues, _]): this.type = js.native
  def oneOf(arrayOfValues: js.Array[T | Ref_ | Null]): this.type = js.native
  def oneOf(arrayOfValues: js.Array[T | Ref_ | Null], message: TestOptionsMessage[AnonValues, _]): this.type = js.native
  def strict(isStrict: Boolean): this.type = js.native
  def strip(strip: Boolean): this.type = js.native
  def test(
    name: String,
    message: TestOptionsMessage[js.Object, _],
    test: js.ThisFunction1[
      /* this */ TestContext, 
      /* value */ js.UndefOr[js.Any], 
      Boolean | ValidationError | (js.Promise[Boolean | ValidationError])
    ]
  ): this.type = js.native
  def test(
    name: String,
    message: TestOptionsMessage[js.Object, _],
    test: js.ThisFunction1[
      /* this */ TestContext, 
      /* value */ js.UndefOr[js.Any], 
      Boolean | ValidationError | (js.Promise[Boolean | ValidationError])
    ],
    callbackStyleAsync: Boolean
  ): this.type = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def test[P](options: TestOptions[P, _]): this.type = js.native
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

