package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPlaybackRateChangeEvent
  extends StObject
     with PlayerEvent {
  
  /**
    * New playback rate.
    */
  var data: Double
}
object OnPlaybackRateChangeEvent {
  
  inline def apply(data: Double, target: Player): OnPlaybackRateChangeEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPlaybackRateChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnPlaybackRateChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: Double): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
