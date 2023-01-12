package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientOptions
  extends StObject
     with Options {
  
  def authentication(): AbstractHandshake
}
object ClientOptions {
  
  inline def apply(authentication: () => AbstractHandshake, sandboxId: String): ClientOptions = {
    val __obj = js.Dynamic.literal(authentication = js.Any.fromFunction0(authentication), sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
    inline def setAuthentication(value: () => AbstractHandshake): Self = StObject.set(x, "authentication", js.Any.fromFunction0(value))
  }
}
