package typings.youtubePlayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndSeconds extends js.Object {
  var endSeconds: js.UndefOr[Double] = js.undefined
  var startSeconds: js.UndefOr[Double] = js.undefined
  var suggestedQuality: js.UndefOr[String] = js.undefined
  var videoId: String
}

object AnonEndSeconds {
  @scala.inline
  def apply(
    videoId: String,
    endSeconds: Int | Double = null,
    startSeconds: Int | Double = null,
    suggestedQuality: String = null
  ): AnonEndSeconds = {
    val __obj = js.Dynamic.literal(videoId = videoId.asInstanceOf[js.Any])
    if (endSeconds != null) __obj.updateDynamic("endSeconds")(endSeconds.asInstanceOf[js.Any])
    if (startSeconds != null) __obj.updateDynamic("startSeconds")(startSeconds.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndSeconds]
  }
}

