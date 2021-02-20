package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientHelper extends StObject {
  
  def authentication(): AbstractHandshake = js.native
  @JSName("authentication")
  var authentication_Original: AuthenticationCallback = js.native
  
  def getUniqRequestId(): String = js.native
  
  var servers: js.Promise[js.Array[String]] = js.native
}
