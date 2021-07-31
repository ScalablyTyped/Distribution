package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionEventNames extends StObject {
  
  var end: String
}
object TransitionEventNames {
  
  @scala.inline
  def apply(end: String): TransitionEventNames = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionEventNames]
  }
  
  @scala.inline
  implicit class TransitionEventNamesMutableBuilder[Self <: TransitionEventNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
  }
}
