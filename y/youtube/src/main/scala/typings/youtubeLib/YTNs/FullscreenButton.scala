package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - youtubeLib.youtubeLibNumbers.`0`
  - youtubeLib.youtubeLibNumbers.`1`
*/
trait FullscreenButton extends js.Object

object FullscreenButton {
  /**
  		 * The full screen button is hidden.
  		 */
  @scala.inline
  def Hide: youtubeLib.youtubeLibNumbers.`0` = this.cast(0)
  /**
  		 * The full screen button is visible.
  		 */
  @scala.inline
  def Show: youtubeLib.youtubeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

