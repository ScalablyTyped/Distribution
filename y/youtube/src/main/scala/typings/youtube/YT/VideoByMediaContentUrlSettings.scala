package typings.youtube.YT

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
    endSeconds: js.UndefOr[Double] = js.undefined,
    startSeconds: js.UndefOr[Double] = js.undefined,
    suggestedQuality: SuggestedVideoQuality = null
  ): VideoByMediaContentUrlSettings = {
    val __obj = js.Dynamic.literal(mediaContentUrl = mediaContentUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(endSeconds)) __obj.updateDynamic("endSeconds")(endSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startSeconds)) __obj.updateDynamic("startSeconds")(startSeconds.get.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoByMediaContentUrlSettings]
  }
}

