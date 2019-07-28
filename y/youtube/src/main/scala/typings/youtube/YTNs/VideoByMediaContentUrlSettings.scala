package typings.youtube.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoByMediaContentUrlSettings extends VideoOrPlaylistSettings {
  /**
  		 * Fully qualified player URL.
  		 */
  var mediaContentUrl: String
}

object VideoByMediaContentUrlSettings {
  @scala.inline
  def apply(
    mediaContentUrl: String,
    endSeconds: Int | Double = null,
    startSeconds: Int | Double = null,
    suggestedQuality: SuggestedVideoQuality = null
  ): VideoByMediaContentUrlSettings = {
    val __obj = js.Dynamic.literal(mediaContentUrl = mediaContentUrl)
    if (endSeconds != null) __obj.updateDynamic("endSeconds")(endSeconds.asInstanceOf[js.Any])
    if (startSeconds != null) __obj.updateDynamic("startSeconds")(startSeconds.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoByMediaContentUrlSettings]
  }
}

