package typings.youtube.YTNs

import typings.youtube.youtubeNumbers.`0`
import typings.youtube.youtubeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.youtube.youtubeNumbers.`0`
  - typings.youtube.youtubeNumbers.`1`
*/
trait AutoPlay extends js.Object

object AutoPlay {
  /**
  		 * Video will autoplay when loaded.
  		 */
  @scala.inline
  def AutoPlay: `1` = this.cast(1)
  /**
  		 * Video does not autoplay.
  		 */
  @scala.inline
  def NoAutoPlay: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

