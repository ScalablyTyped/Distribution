package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema[T] extends js.Object {
  def cast(value: js.Any): T = js.native
  def cast(value: js.Any, options: js.Any): T = js.native
  def concat(schema: this.type): this.type = js.native
  def default(): this.type = js.native
  def default(value: js.Any): this.type = js.native
  def describe(): SchemaDescription = js.native
  def isType(value: js.Any): /* is T */scala.Boolean = js.native
  def isValid(value: T): stdLib.Promise[scala.Boolean] = js.native
  def isValid(value: T, options: js.Any): stdLib.Promise[scala.Boolean] = js.native
  def isValidSync(value: T): scala.Boolean = js.native
  def isValidSync(value: T, options: js.Any): scala.Boolean = js.native
  def label(label: java.lang.String): this.type = js.native
  def meta(): js.Any = js.native
  def meta(metadata: js.Any): this.type = js.native
  def notOneOf(arrayOfValues: js.Array[_]): this.type = js.native
  def notOneOf(arrayOfValues: js.Array[_], message: java.lang.String): this.type = js.native
  def notRequired(): this.type = js.native
  def nullable(isNullable: scala.Boolean): this.type = js.native
  def oneOf(arrayOfValues: js.Array[_]): this.type = js.native
  def oneOf(arrayOfValues: js.Array[_], message: java.lang.String): this.type = js.native
  def required(): this.type = js.native
  def required(message: java.lang.String): this.type = js.native
  def strict(isStrict: scala.Boolean): this.type = js.native
  def strip(strip: scala.Boolean): this.type = js.native
  def test(
    name: java.lang.String,
    message: java.lang.String,
    test: js.ThisFunction1[
      /* this */ TestContext, 
      /* value */ js.UndefOr[js.Any], 
      scala.Boolean | ValidationError | (stdLib.Promise[scala.Boolean | ValidationError])
    ]
  ): this.type = js.native
  def test(
    name: java.lang.String,
    message: java.lang.String,
    test: js.ThisFunction1[
      /* this */ TestContext, 
      /* value */ js.UndefOr[js.Any], 
      scala.Boolean | ValidationError | (stdLib.Promise[scala.Boolean | ValidationError])
    ],
    callbackStyleAsync: scala.Boolean
  ): this.type = js.native
  def test(
    name: java.lang.String,
    message: js.Function1[/* params */ js.Object with stdLib.Partial[TestMessageParams], java.lang.String],
    test: js.ThisFunction1[
      /* this */ TestContext, 
      /* value */ js.UndefOr[js.Any], 
      scala.Boolean | ValidationError | (stdLib.Promise[scala.Boolean | ValidationError])
    ]
  ): this.type = js.native
  def test(
    name: java.lang.String,
    message: js.Function1[/* params */ js.Object with stdLib.Partial[TestMessageParams], java.lang.String],
    test: js.ThisFunction1[
      /* this */ TestContext, 
      /* value */ js.UndefOr[js.Any], 
      scala.Boolean | ValidationError | (stdLib.Promise[scala.Boolean | ValidationError])
    ],
    callbackStyleAsync: scala.Boolean
  ): this.type = js.native
  def test(options: TestOptions): this.type = js.native
  def transform(fn: TransformFunction[this.type]): this.type = js.native
  def typeError(): this.type = js.native
  def typeError(message: java.lang.String): this.type = js.native
  def validate(value: T): stdLib.Promise[T] = js.native
  def validate(value: T, options: ValidateOptions): stdLib.Promise[T] = js.native
  def validateAt(path: java.lang.String, value: T): stdLib.Promise[T] = js.native
  def validateAt(path: java.lang.String, value: T, options: ValidateOptions): stdLib.Promise[T] = js.native
  def validateSync(value: T): T = js.native
  def validateSync(value: T, options: ValidateOptions): T = js.native
  def validateSyncAt(path: java.lang.String, value: T): T = js.native
  def validateSyncAt(path: java.lang.String, value: T, options: ValidateOptions): T = js.native
  def when(keys: java.lang.String, builder: WhenOptions[this.type]): this.type = js.native
  def when(keys: js.Array[_], builder: WhenOptions[this.type]): this.type = js.native
  def withMutation(fn: js.Function1[/* current */ this.type, scala.Unit]): scala.Unit = js.native
}

