package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - youtubeLib.youtubeLibNumbers.`2`
  - youtubeLib.youtubeLibNumbers.`5`
  - youtubeLib.youtubeLibNumbers.`100`
  - youtubeLib.youtubeLibNumbers.`101`
  - youtubeLib.youtubeLibNumbers.`150`
*/
trait PlayerError extends js.Object

object PlayerError {
  /**
  		 * The owner of the requested video does not allow it to be played in embedded players.
  		 */
  @scala.inline
  def EmbeddingNotAllowed: youtubeLib.youtubeLibNumbers.`101` = this.cast(101)
  /**
  		 * This error is the same as 101. It's just a 101 error in disguise!
  		 */
  @scala.inline
  def EmbeddingNotAllowed2: youtubeLib.youtubeLibNumbers.`150` = this.cast(150)
  /**
  		 * The requested content cannot be played in an HTML5 player.
  		 */
  @scala.inline
  def Html5Error: youtubeLib.youtubeLibNumbers.`5` = this.cast(5)
  /**
  		 * The request contained an invalid parameter value.
  		 */
  @scala.inline
  def InvalidParam: youtubeLib.youtubeLibNumbers.`2` = this.cast(2)
  /**
  		 * The video requested was not found.
  		 */
  @scala.inline
  def VideoNotFound: youtubeLib.youtubeLibNumbers.`100` = this.cast(100)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

