package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPlaybackQualityChangeEvent extends PlayerEvent {
  
  /**
    * New playback quality.
    */
  var data: String = js.native
}
object OnPlaybackQualityChangeEvent {
  
  @scala.inline
  def apply(data: String, target: Player): OnPlaybackQualityChangeEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPlaybackQualityChangeEvent]
  }
  
  @scala.inline
  implicit class OnPlaybackQualityChangeEventMutableBuilder[Self <: OnPlaybackQualityChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
