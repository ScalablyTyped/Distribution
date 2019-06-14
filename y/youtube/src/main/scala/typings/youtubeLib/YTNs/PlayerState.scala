package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - youtubeLib.youtubeLibNumbers.`-1`
  - youtubeLib.youtubeLibNumbers.`0`
  - youtubeLib.youtubeLibNumbers.`1`
  - youtubeLib.youtubeLibNumbers.`2`
  - youtubeLib.youtubeLibNumbers.`3`
  - youtubeLib.youtubeLibNumbers.`5`
*/
trait PlayerState extends js.Object

object PlayerState {
  @scala.inline
  def BUFFERING: youtubeLib.youtubeLibNumbers.`3` = this.cast(3)
  @scala.inline
  def CUED: youtubeLib.youtubeLibNumbers.`5` = this.cast(5)
  @scala.inline
  def ENDED: youtubeLib.youtubeLibNumbers.`0` = this.cast(0)
  @scala.inline
  def PAUSED: youtubeLib.youtubeLibNumbers.`2` = this.cast(2)
  @scala.inline
  def PLAYING: youtubeLib.youtubeLibNumbers.`1` = this.cast(1)
  @scala.inline
  def UNSTARTED: youtubeLib.youtubeLibNumbers.`-1` = this.cast(-1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

