package typings.youtubeDashPlayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndSeconds extends js.Object {
  var endSeconds: js.UndefOr[Double] = js.undefined
  var startSeconds: js.UndefOr[Double] = js.undefined
  var suggestedQuality: js.UndefOr[String] = js.undefined
  var videoId: String
}

object Anon_EndSeconds {
  @scala.inline
  def apply(
    videoId: String,
    endSeconds: Int | Double = null,
    startSeconds: Int | Double = null,
    suggestedQuality: String = null
  ): Anon_EndSeconds = {
    val __obj = js.Dynamic.literal(videoId = videoId)
    if (endSeconds != null) __obj.updateDynamic("endSeconds")(endSeconds.asInstanceOf[js.Any])
    if (startSeconds != null) __obj.updateDynamic("startSeconds")(startSeconds.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality)
    __obj.asInstanceOf[Anon_EndSeconds]
  }
}

