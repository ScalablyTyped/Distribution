package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoByIdSettings extends VideoOrPlaylistSettings {
  /**
  		 * Video ID.
  		 */
  var videoId: java.lang.String
}

object VideoByIdSettings {
  @scala.inline
  def apply(
    videoId: java.lang.String,
    endSeconds: scala.Int | scala.Double = null,
    startSeconds: scala.Int | scala.Double = null,
    suggestedQuality: SuggestedVideoQuality = null
  ): VideoByIdSettings = {
    val __obj = js.Dynamic.literal(videoId = videoId)
    if (endSeconds != null) __obj.updateDynamic("endSeconds")(endSeconds.asInstanceOf[js.Any])
    if (startSeconds != null) __obj.updateDynamic("startSeconds")(startSeconds.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoByIdSettings]
  }
}

