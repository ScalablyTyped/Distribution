package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoOrPlaylistSettings extends js.Object {
  /**
  		 * Time, in seconds from the end of the (first) video, when to end playing.
  		 */
  var endSeconds: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Time, in seconds from the beginning of the (first) video, when to start playing.
  		 */
  var startSeconds: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Suggested video player quality.
  		 */
  var suggestedQuality: js.UndefOr[SuggestedVideoQuality] = js.undefined
}

