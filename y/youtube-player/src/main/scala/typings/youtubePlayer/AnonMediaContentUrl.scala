package typings.youtubePlayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMediaContentUrl extends js.Object {
  var endSeconds: js.UndefOr[Double] = js.undefined
  var mediaContentUrl: String
  var startSeconds: js.UndefOr[Double] = js.undefined
  var suggestedQuality: js.UndefOr[String] = js.undefined
}

object AnonMediaContentUrl {
  @scala.inline
  def apply(
    mediaContentUrl: String,
    endSeconds: Int | Double = null,
    startSeconds: Int | Double = null,
    suggestedQuality: String = null
  ): AnonMediaContentUrl = {
    val __obj = js.Dynamic.literal(mediaContentUrl = mediaContentUrl.asInstanceOf[js.Any])
    if (endSeconds != null) __obj.updateDynamic("endSeconds")(endSeconds.asInstanceOf[js.Any])
    if (startSeconds != null) __obj.updateDynamic("startSeconds")(startSeconds.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMediaContentUrl]
  }
}

