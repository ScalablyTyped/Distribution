package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPlaybackQualityChangeEvent extends PlayerEvent {
  /**
  		 * New playback quality.
  		 */
  var data: java.lang.String
}

object OnPlaybackQualityChangeEvent {
  @scala.inline
  def apply(data: java.lang.String, target: Player): OnPlaybackQualityChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[OnPlaybackQualityChangeEvent]
  }
}

