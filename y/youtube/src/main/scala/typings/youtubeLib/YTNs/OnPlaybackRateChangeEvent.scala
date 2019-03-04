package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPlaybackRateChangeEvent extends PlayerEvent {
  /**
  		 * New playback rate.
  		 */
  var data: scala.Double
}

object OnPlaybackRateChangeEvent {
  @scala.inline
  def apply(data: scala.Double, target: Player): OnPlaybackRateChangeEvent = {
    val __obj = js.Dynamic.literal(data = data, target = target)
  
    __obj.asInstanceOf[OnPlaybackRateChangeEvent]
  }
}

