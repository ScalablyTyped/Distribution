package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - youtubeLib.youtubeLibNumbers.`0`
  - youtubeLib.youtubeLibNumbers.`1`
  - youtubeLib.youtubeLibNumbers.`2`
*/
trait Controls extends js.Object

object Controls {
  /**
  		 * Player controls do not display.
  		 */
  @scala.inline
  def Hide: youtubeLib.youtubeLibNumbers.`0` = this.cast(0)
  /**
  		 * Player controls display after a delay.
  		 */
  @scala.inline
  def ShowDelayLoadPlayer: youtubeLib.youtubeLibNumbers.`2` = this.cast(2)
  /**
  		 * Player controls display.
  		 */
  @scala.inline
  def ShowLoadPlayer: youtubeLib.youtubeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

