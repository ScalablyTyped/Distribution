package typings.youtube.YT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnErrorEvent extends PlayerEvent {
  /**
    * Which type of error occurred.
    */
  var data: PlayerError
}

object OnErrorEvent {
  @scala.inline
  def apply(data: PlayerError, target: Player): OnErrorEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnErrorEvent]
  }
}

