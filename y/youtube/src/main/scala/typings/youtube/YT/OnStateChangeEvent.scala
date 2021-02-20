package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnStateChangeEvent extends PlayerEvent {
  
  /**
    * New player state.
    */
  var data: PlayerState = js.native
}
object OnStateChangeEvent {
  
  @scala.inline
  def apply(data: PlayerState, target: Player): OnStateChangeEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnStateChangeEvent]
  }
  
  @scala.inline
  implicit class OnStateChangeEventMutableBuilder[Self <: OnStateChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: PlayerState): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
