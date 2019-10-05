package typings.youtube.YT

import typings.youtube.youtubeNumbers.`0`
import typings.youtube.youtubeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.youtube.youtubeNumbers.`0`
  - typings.youtube.youtubeNumbers.`1`
*/
trait ShowInfo extends js.Object

object ShowInfo {
  /**
  		 * Hide video title and uploader before video starts playing.
  		 */
  @scala.inline
  def Hide: `0` = this.cast(0)
  /**
  		 * Show video title and uploader before video starts playing.
  		 */
  @scala.inline
  def Show: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

