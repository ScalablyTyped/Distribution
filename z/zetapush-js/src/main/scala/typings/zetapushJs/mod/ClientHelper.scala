package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientHelper extends StObject {
  
  def authentication(): AbstractHandshake
  @JSName("authentication")
  var authentication_Original: AuthenticationCallback
  
  def getUniqRequestId(): String
  
  var servers: js.Promise[js.Array[String]]
}
object ClientHelper {
  
  @scala.inline
  def apply(
    authentication: () => AbstractHandshake,
    getUniqRequestId: () => String,
    servers: js.Promise[js.Array[String]]
  ): ClientHelper = {
    val __obj = js.Dynamic.literal(authentication = js.Any.fromFunction0(authentication), getUniqRequestId = js.Any.fromFunction0(getUniqRequestId), servers = servers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientHelper]
  }
  
  @scala.inline
  implicit class ClientHelperMutableBuilder[Self <: ClientHelper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthentication(value: () => AbstractHandshake): Self = StObject.set(x, "authentication", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUniqRequestId(value: () => String): Self = StObject.set(x, "getUniqRequestId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setServers(value: js.Promise[js.Array[String]]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
  }
}
