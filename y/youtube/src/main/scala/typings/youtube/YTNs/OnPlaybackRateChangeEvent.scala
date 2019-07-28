package typings.youtube.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPlaybackRateChangeEvent extends PlayerEvent {
  /**
  		 * New playback rate.
  		 */
  var data: Double
}

object OnPlaybackRateChangeEvent {
  @scala.inline
  def apply(data: Double, target: Player): OnPlaybackRateChangeEvent = {
    val __obj = js.Dynamic.literal(data = data, target = target)
  
    __obj.asInstanceOf[OnPlaybackRateChangeEvent]
  }
}

