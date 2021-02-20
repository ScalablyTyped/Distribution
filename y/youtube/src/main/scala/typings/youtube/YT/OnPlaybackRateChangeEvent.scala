package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPlaybackRateChangeEvent extends PlayerEvent {
  
  /**
    * New playback rate.
    */
  var data: Double = js.native
}
object OnPlaybackRateChangeEvent {
  
  @scala.inline
  def apply(data: Double, target: Player): OnPlaybackRateChangeEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPlaybackRateChangeEvent]
  }
  
  @scala.inline
  implicit class OnPlaybackRateChangeEventMutableBuilder[Self <: OnPlaybackRateChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Double): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
