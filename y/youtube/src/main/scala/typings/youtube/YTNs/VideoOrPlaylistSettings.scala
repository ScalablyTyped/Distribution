package typings.youtube.YTNs

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
    endSeconds: Int | Double = null,
    startSeconds: Int | Double = null,
    suggestedQuality: SuggestedVideoQuality = null
  ): VideoOrPlaylistSettings = {
    val __obj = js.Dynamic.literal()
    if (endSeconds != null) __obj.updateDynamic("endSeconds")(endSeconds.asInstanceOf[js.Any])
    if (startSeconds != null) __obj.updateDynamic("startSeconds")(startSeconds.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoOrPlaylistSettings]
  }
}

