package typings.youtube.YT

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
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerEvent]
  }
}

