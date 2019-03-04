package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnStateChangeEvent extends PlayerEvent {
  /**
  		 * New player state.
  		 */
  var data: PlayerState
}

object OnStateChangeEvent {
  @scala.inline
  def apply(data: PlayerState, target: Player): OnStateChangeEvent = {
    val __obj = js.Dynamic.literal(data = data, target = target)
  
    __obj.asInstanceOf[OnStateChangeEvent]
  }
}

