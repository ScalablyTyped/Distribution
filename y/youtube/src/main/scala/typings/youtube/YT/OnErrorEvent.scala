package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnErrorEvent
  extends StObject
     with PlayerEvent {
  
  /**
    * Which type of error occurred.
    */
  var data: PlayerError
}
object OnErrorEvent {
  
  inline def apply(data: PlayerError, target: Player): OnErrorEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnErrorEvent]
  }
  
  extension [Self <: OnErrorEvent](x: Self) {
    
    inline def setData(value: PlayerError): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
