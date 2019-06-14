package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - youtubeLib.youtubeLibNumbers.`0`
  - youtubeLib.youtubeLibNumbers.`1`
*/
trait RelatedVideos extends js.Object

object RelatedVideos {
  /**
  		 * Hide related videos after playback is complete.
  		 */
  @scala.inline
  def Hide: youtubeLib.youtubeLibNumbers.`0` = this.cast(0)
  /**
  		 * Show related videos after playback is complete.
  		 */
  @scala.inline
  def Show: youtubeLib.youtubeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

