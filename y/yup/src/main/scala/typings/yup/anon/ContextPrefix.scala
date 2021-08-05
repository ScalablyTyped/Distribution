package typings.yup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextPrefix extends StObject {
  
  var contextPrefix: String
}
object ContextPrefix {
  
  inline def apply(contextPrefix: String): ContextPrefix = {
    val __obj = js.Dynamic.literal(contextPrefix = contextPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextPrefix]
  }
  
  extension [Self <: ContextPrefix](x: Self) {
    
    inline def setContextPrefix(value: String): Self = StObject.set(x, "contextPrefix", value.asInstanceOf[js.Any])
  }
}
