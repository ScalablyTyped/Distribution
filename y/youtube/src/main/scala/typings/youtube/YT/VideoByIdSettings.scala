package typings.youtube.YT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoByIdSettings extends VideoOrPlaylistSettings {
  /**
    * Video ID.
    */
  var videoId: String
}

object VideoByIdSettings {
  @scala.inline
  def apply(
    videoId: String,
    endSeconds: js.UndefOr[Double] = js.undefined,
    startSeconds: js.UndefOr[Double] = js.undefined,
    suggestedQuality: SuggestedVideoQuality = null
  ): VideoByIdSettings = {
    val __obj = js.Dynamic.literal(videoId = videoId.asInstanceOf[js.Any])
    if (!js.isUndefined(endSeconds)) __obj.updateDynamic("endSeconds")(endSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startSeconds)) __obj.updateDynamic("startSeconds")(startSeconds.get.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoByIdSettings]
  }
}

