package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerEvent extends StObject {
  
  /**
    * Video player corresponding to the event.
    */
  var target: Player
}
object PlayerEvent {
  
  inline def apply(target: Player): PlayerEvent = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayerEvent] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: Player): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
