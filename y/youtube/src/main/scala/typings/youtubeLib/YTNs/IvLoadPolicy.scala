package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - youtubeLib.youtubeLibNumbers.`1`
  - youtubeLib.youtubeLibNumbers.`3`
*/
trait IvLoadPolicy extends js.Object

object IvLoadPolicy {
  /**
  		 * Video annotations will not be shown.
  		 */
  @scala.inline
  def Hide: youtubeLib.youtubeLibNumbers.`3` = this.cast(3)
  /**
  		 * Video annotations will be shown.
  		 */
  @scala.inline
  def Show: youtubeLib.youtubeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

