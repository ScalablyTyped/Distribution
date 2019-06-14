package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - youtubeLib.youtubeLibNumbers.`0`
  - youtubeLib.youtubeLibNumbers.`1`
*/
trait PlaysInline extends js.Object

object PlaysInline {
  /**
  		 * Playback in fullscreen.
  		 */
  @scala.inline
  def Fullscreen: youtubeLib.youtubeLibNumbers.`0` = this.cast(0)
  /**
  		 * Playback inline
  		 */
  @scala.inline
  def Inline: youtubeLib.youtubeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

