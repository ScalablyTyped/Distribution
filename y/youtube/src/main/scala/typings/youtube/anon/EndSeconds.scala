package typings.youtube.anon

import typings.youtube.YT.SuggestedVideoQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndSeconds extends js.Object {
  var endSeconds: js.UndefOr[Double] = js.undefined
  var mediaContentUrl: String
  var startSeconds: js.UndefOr[Double] = js.undefined
  var suggestedQuality: js.UndefOr[SuggestedVideoQuality] = js.undefined
}

object EndSeconds {
  @scala.inline
  def apply(
    mediaContentUrl: String,
    endSeconds: js.UndefOr[Double] = js.undefined,
    startSeconds: js.UndefOr[Double] = js.undefined,
    suggestedQuality: SuggestedVideoQuality = null
  ): EndSeconds = {
    val __obj = js.Dynamic.literal(mediaContentUrl = mediaContentUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(endSeconds)) __obj.updateDynamic("endSeconds")(endSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startSeconds)) __obj.updateDynamic("startSeconds")(startSeconds.get.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndSeconds]
  }
}

