package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yup", "ValidationError")
@js.native
class ValidationError protected ()
  extends stdLib.Error {
  def this(errors: java.lang.String, value: js.Any, path: java.lang.String) = this()
  def this(errors: js.Array[java.lang.String], value: js.Any, path: java.lang.String) = this()
  def this(errors: java.lang.String, value: js.Any, path: java.lang.String, `type`: js.Any) = this()
  def this(errors: js.Array[java.lang.String], value: js.Any, path: java.lang.String, `type`: js.Any) = this()
  /**
    * array of error messages
    */
  var errors: js.Array[java.lang.String] = js.native
  /**
    * In the case of aggregate errors, inner is an array of ValidationErrors throw earlier in the validation chain.
    */
  var inner: js.Array[ValidationError] = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var params: js.UndefOr[js.Object] = js.native
  /**
    * A string, indicating where there error was thrown. path is empty at the root level.
    */
  var path: java.lang.String = js.native
  var `type`: js.Any = js.native
  var value: js.Any = js.native
}

/* static members */
@JSImport("yup", "ValidationError")
@js.native
object ValidationError extends js.Object {
  def formatError(message: java.lang.String): java.lang.String | (js.Function1[/* params */ js.UndefOr[js.Any], java.lang.String]) = js.native
  def formatError(message: java.lang.String, params: js.Any): java.lang.String | (js.Function1[/* params */ js.UndefOr[js.Any], java.lang.String]) = js.native
  def formatError(message: js.Function1[/* params */ js.UndefOr[js.Any], java.lang.String]): java.lang.String | (js.Function1[/* params */ js.UndefOr[js.Any], java.lang.String]) = js.native
  def formatError(message: js.Function1[/* params */ js.UndefOr[js.Any], java.lang.String], params: js.Any): java.lang.String | (js.Function1[/* params */ js.UndefOr[js.Any], java.lang.String]) = js.native
  def isError(err: js.Any): /* is yup.yup.ValidationError */ scala.Boolean = js.native
}

