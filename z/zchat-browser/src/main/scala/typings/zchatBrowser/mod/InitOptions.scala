package typings.zchatBrowser.mod

import typings.zchatBrowser.anon.Jwtfn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitOptions extends StObject {
  
  var account_key: String
  
  var authentication: js.UndefOr[Jwtfn] = js.undefined
  
  var suppress_console_error: js.UndefOr[Boolean] = js.undefined
}
object InitOptions {
  
  inline def apply(account_key: String): InitOptions = {
    val __obj = js.Dynamic.literal(account_key = account_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
    
    inline def setAccount_key(value: String): Self = StObject.set(x, "account_key", value.asInstanceOf[js.Any])
    
    inline def setAuthentication(value: Jwtfn): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
    
    inline def setSuppress_console_error(value: Boolean): Self = StObject.set(x, "suppress_console_error", value.asInstanceOf[js.Any])
    
    inline def setSuppress_console_errorUndefined: Self = StObject.set(x, "suppress_console_error", js.undefined)
  }
}
