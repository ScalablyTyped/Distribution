package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuerySupport extends StObject {
  
  var transition: Boolean | TransitionEventNames
}
object JQuerySupport {
  
  inline def apply(transition: Boolean | TransitionEventNames): JQuerySupport = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQuerySupport] (val x: Self) extends AnyVal {
    
    inline def setTransition(value: Boolean | TransitionEventNames): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
  }
}
