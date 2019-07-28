package typings.yup.yupMod

import typings.yup.Anon_Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestContext extends js.Object {
  var options: ValidateOptions = js.native
  var parent: js.Any = js.native
  var path: String = js.native
  var schema: Schema[_] = js.native
  def createError(): ValidationError = js.native
  def createError(params: Anon_Message): ValidationError = js.native
  def resolve(value: js.Any): js.Any = js.native
}

