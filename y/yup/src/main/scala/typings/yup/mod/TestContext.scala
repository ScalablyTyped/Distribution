package typings.yup.mod

import typings.yup.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestContext[C] extends js.Object {
  
  def createError(): ValidationError = js.native
  def createError(params: Message): ValidationError = js.native
  
  var options: ValidateOptions[C] = js.native
  
  var parent: js.Any = js.native
  
  var path: String = js.native
  
  def resolve(value: js.Any): js.Any = js.native
  
  var schema: Schema[_, C] = js.native
}
