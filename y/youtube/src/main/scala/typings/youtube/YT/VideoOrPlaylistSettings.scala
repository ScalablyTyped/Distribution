package typings.youtube.YT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoOrPlaylistSettings extends js.Object {
  /**
    * Time, in seconds from the end of the (first) video, when to end playing.
    */
  var endSeconds: js.UndefOr[Double] = js.undefined
  /**
    * Time, in seconds from the beginning of the (first) video, when to start playing.
    */
  var startSeconds: js.UndefOr[Double] = js.undefined
  /**
    * Suggested video player quality.
    */
  var suggestedQuality: js.UndefOr[SuggestedVideoQuality] = js.undefined
}

object VideoOrPlaylistSettings {
  @scala.inline
  def apply(
    endSeconds: js.UndefOr[Double] = js.undefined,
    startSeconds: js.UndefOr[Double] = js.undefined,
    suggestedQuality: SuggestedVideoQuality = null
  ): VideoOrPlaylistSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endSeconds)) __obj.updateDynamic("endSeconds")(endSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startSeconds)) __obj.updateDynamic("startSeconds")(startSeconds.get.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoOrPlaylistSettings]
  }
}

