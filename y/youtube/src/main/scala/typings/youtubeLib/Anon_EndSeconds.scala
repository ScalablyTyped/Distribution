package typings
package youtubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndSeconds extends js.Object {
  var endSeconds: js.UndefOr[scala.Double] = js.undefined
  var mediaContentUrl: java.lang.String
  var startSeconds: js.UndefOr[scala.Double] = js.undefined
  var suggestedQuality: js.UndefOr[youtubeLib.YTNs.SuggestedVideoQuality] = js.undefined
}

object Anon_EndSeconds {
  @scala.inline
  def apply(
    mediaContentUrl: java.lang.String,
    endSeconds: scala.Int | scala.Double = null,
    startSeconds: scala.Int | scala.Double = null,
    suggestedQuality: youtubeLib.YTNs.SuggestedVideoQuality = null
  ): Anon_EndSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mediaContentUrl")(mediaContentUrl)
    if (endSeconds != null) __obj.updateDynamic("endSeconds")(endSeconds.asInstanceOf[js.Any])
    if (startSeconds != null) __obj.updateDynamic("startSeconds")(startSeconds.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndSeconds]
  }
}

