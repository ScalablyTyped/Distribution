package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoByMediaContentUrlSettings extends VideoOrPlaylistSettings {
  /**
  		 * Fully qualified player URL.
  		 */
  var mediaContentUrl: java.lang.String
}

object VideoByMediaContentUrlSettings {
  @scala.inline
  def apply(
    mediaContentUrl: java.lang.String,
    endSeconds: scala.Int | scala.Double = null,
    startSeconds: scala.Int | scala.Double = null,
    suggestedQuality: SuggestedVideoQuality = null
  ): VideoByMediaContentUrlSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mediaContentUrl")(mediaContentUrl)
    if (endSeconds != null) __obj.updateDynamic("endSeconds")(endSeconds.asInstanceOf[js.Any])
    if (startSeconds != null) __obj.updateDynamic("startSeconds")(startSeconds.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoByMediaContentUrlSettings]
  }
}

