package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionEventNames extends StObject {
  
  var end: String
}
object TransitionEventNames {
  
  inline def apply(end: String): TransitionEventNames = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionEventNames]
  }
  
  extension [Self <: TransitionEventNames](x: Self) {
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
  }
}
