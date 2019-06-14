package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - youtubeLib.youtubeLibNumbers.`0`
  - youtubeLib.youtubeLibNumbers.`1`
*/
trait ClosedCaptionsLoadPolicy extends js.Object

object ClosedCaptionsLoadPolicy {
  /**
  		 * For closed captions to be shown.
  		 */
  @scala.inline
  def ForceOn: youtubeLib.youtubeLibNumbers.`1` = this.cast(1)
  /**
  		 * Defaults to the user's preferences.
  		 */
  @scala.inline
  def UserDefault: youtubeLib.youtubeLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

