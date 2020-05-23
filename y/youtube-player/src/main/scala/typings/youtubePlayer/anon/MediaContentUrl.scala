package typings.youtubePlayer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaContentUrl extends js.Object {
  var endSeconds: js.UndefOr[Double] = js.undefined
  var mediaContentUrl: String
  var startSeconds: js.UndefOr[Double] = js.undefined
  var suggestedQuality: js.UndefOr[String] = js.undefined
}

object MediaContentUrl {
  @scala.inline
  def apply(
    mediaContentUrl: String,
    endSeconds: js.UndefOr[Double] = js.undefined,
    startSeconds: js.UndefOr[Double] = js.undefined,
    suggestedQuality: String = null
  ): MediaContentUrl = {
    val __obj = js.Dynamic.literal(mediaContentUrl = mediaContentUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(endSeconds)) __obj.updateDynamic("endSeconds")(endSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startSeconds)) __obj.updateDynamic("startSeconds")(startSeconds.get.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaContentUrl]
  }
}

