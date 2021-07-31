package typings.yup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextPrefix extends StObject {
  
  var contextPrefix: String
}
object ContextPrefix {
  
  @scala.inline
  def apply(contextPrefix: String): ContextPrefix = {
    val __obj = js.Dynamic.literal(contextPrefix = contextPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextPrefix]
  }
  
  @scala.inline
  implicit class ContextPrefixMutableBuilder[Self <: ContextPrefix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextPrefix(value: String): Self = StObject.set(x, "contextPrefix", value.asInstanceOf[js.Any])
  }
}
