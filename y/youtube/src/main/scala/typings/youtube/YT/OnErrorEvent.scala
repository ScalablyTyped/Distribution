package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnErrorEvent extends PlayerEvent {
  
  /**
    * Which type of error occurred.
    */
  var data: PlayerError = js.native
}
object OnErrorEvent {
  
  @scala.inline
  def apply(data: PlayerError, target: Player): OnErrorEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnErrorEvent]
  }
  
  @scala.inline
  implicit class OnErrorEventMutableBuilder[Self <: OnErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: PlayerError): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
