package typings
package youtubeDashPlayerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndSeconds extends js.Object {
  var endSeconds: js.UndefOr[scala.Double] = js.undefined
  var startSeconds: js.UndefOr[scala.Double] = js.undefined
  var suggestedQuality: js.UndefOr[java.lang.String] = js.undefined
  var videoId: java.lang.String
}

object Anon_EndSeconds {
  @scala.inline
  def apply(
    videoId: java.lang.String,
    endSeconds: scala.Int | scala.Double = null,
    startSeconds: scala.Int | scala.Double = null,
    suggestedQuality: java.lang.String = null
  ): Anon_EndSeconds = {
    val __obj = js.Dynamic.literal(videoId = videoId)
    if (endSeconds != null) __obj.updateDynamic("endSeconds")(endSeconds.asInstanceOf[js.Any])
    if (startSeconds != null) __obj.updateDynamic("startSeconds")(startSeconds.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality)
    __obj.asInstanceOf[Anon_EndSeconds]
  }
}

