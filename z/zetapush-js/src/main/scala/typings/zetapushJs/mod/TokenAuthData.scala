package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenAuthData extends StObject {
  
  var token: String
}
object TokenAuthData {
  
  @scala.inline
  def apply(token: String): TokenAuthData = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenAuthData]
  }
  
  @scala.inline
  implicit class TokenAuthDataMutableBuilder[Self <: TokenAuthData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
