package typings.yup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yup", "lazy")
@js.native
object `lazy` extends js.Object {
  
  def apply[T](fn: js.Function1[/* value */ T, Schema[T, js.Object]]): Lazy_ = js.native
}
