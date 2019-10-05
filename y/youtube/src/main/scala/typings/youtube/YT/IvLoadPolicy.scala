package typings.youtube.YT

import typings.youtube.youtubeNumbers.`1`
import typings.youtube.youtubeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.youtube.youtubeNumbers.`1`
  - typings.youtube.youtubeNumbers.`3`
*/
trait IvLoadPolicy extends js.Object

object IvLoadPolicy {
  /**
  		 * Video annotations will not be shown.
  		 */
  @scala.inline
  def Hide: `3` = this.cast(3)
  /**
  		 * Video annotations will be shown.
  		 */
  @scala.inline
  def Show: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

