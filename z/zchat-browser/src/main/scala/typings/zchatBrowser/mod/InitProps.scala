package typings.zchatBrowser.mod

import typings.zchatBrowser.anon.Jwtfn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitProps extends StObject {
  
  var account_key: String
  
  var authentication: js.UndefOr[Jwtfn] = js.undefined
}
object InitProps {
  
  @scala.inline
  def apply(account_key: String): InitProps = {
    val __obj = js.Dynamic.literal(account_key = account_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitProps]
  }
  
  @scala.inline
  implicit class InitPropsMutableBuilder[Self <: InitProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_key(value: String): Self = StObject.set(x, "account_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthentication(value: Jwtfn): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
  }
}
