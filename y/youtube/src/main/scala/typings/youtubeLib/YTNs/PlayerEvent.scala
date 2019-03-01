package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerEvent extends js.Object {
  /**
  		 * Video player corresponding to the event.
  		 */
  var target: Player
}

object PlayerEvent {
  @scala.inline
  def apply(target: Player): PlayerEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[PlayerEvent]
  }
}

