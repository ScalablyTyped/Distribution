package typings.youtubeDashPlayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndSecondsMediaContentUrl extends js.Object {
  var endSeconds: js.UndefOr[Double] = js.undefined
  var mediaContentUrl: String
  var startSeconds: js.UndefOr[Double] = js.undefined
  var suggestedQuality: js.UndefOr[String] = js.undefined
}

object Anon_EndSecondsMediaContentUrl {
  @scala.inline
  def apply(
    mediaContentUrl: String,
    endSeconds: Int | Double = null,
    startSeconds: Int | Double = null,
    suggestedQuality: String = null
  ): Anon_EndSecondsMediaContentUrl = {
    val __obj = js.Dynamic.literal(mediaContentUrl = mediaContentUrl)
    if (endSeconds != null) __obj.updateDynamic("endSeconds")(endSeconds.asInstanceOf[js.Any])
    if (startSeconds != null) __obj.updateDynamic("startSeconds")(startSeconds.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality)
    __obj.asInstanceOf[Anon_EndSecondsMediaContentUrl]
  }
}

