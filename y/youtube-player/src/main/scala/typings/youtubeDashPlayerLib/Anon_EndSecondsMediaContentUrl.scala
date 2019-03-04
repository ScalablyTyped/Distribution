package typings
package youtubeDashPlayerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndSecondsMediaContentUrl extends js.Object {
  var endSeconds: js.UndefOr[scala.Double] = js.undefined
  var mediaContentUrl: java.lang.String
  var startSeconds: js.UndefOr[scala.Double] = js.undefined
  var suggestedQuality: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EndSecondsMediaContentUrl {
  @scala.inline
  def apply(
    mediaContentUrl: java.lang.String,
    endSeconds: scala.Int | scala.Double = null,
    startSeconds: scala.Int | scala.Double = null,
    suggestedQuality: java.lang.String = null
  ): Anon_EndSecondsMediaContentUrl = {
    val __obj = js.Dynamic.literal(mediaContentUrl = mediaContentUrl)
    if (endSeconds != null) __obj.updateDynamic("endSeconds")(endSeconds.asInstanceOf[js.Any])
    if (startSeconds != null) __obj.updateDynamic("startSeconds")(startSeconds.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality)
    __obj.asInstanceOf[Anon_EndSecondsMediaContentUrl]
  }
}

