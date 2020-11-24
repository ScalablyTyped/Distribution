package typings.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientHelper extends js.Object {
  
  def authentication(): AbstractHandshake = js.native
  @JSName("authentication")
  var authentication_Original: AuthenticationCallback = js.native
  
  def getUniqRequestId(): String = js.native
  
  var servers: js.Promise[js.Array[String]] = js.native
}
