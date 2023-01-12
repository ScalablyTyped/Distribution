package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnStateChangeEvent
  extends StObject
     with PlayerEvent {
  
  /**
    * New player state.
    */
  var data: PlayerState
}
object OnStateChangeEvent {
  
  inline def apply(data: PlayerState, target: Player): OnStateChangeEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnStateChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnStateChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: PlayerState): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
