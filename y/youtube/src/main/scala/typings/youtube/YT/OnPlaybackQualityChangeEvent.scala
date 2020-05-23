package typings.youtube.YT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPlaybackQualityChangeEvent extends PlayerEvent {
  /**
    * New playback quality.
    */
  var data: String
}

object OnPlaybackQualityChangeEvent {
  @scala.inline
  def apply(data: String, target: Player): OnPlaybackQualityChangeEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPlaybackQualityChangeEvent]
  }
}

