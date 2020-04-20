package typings.youtube.YT

import typings.youtube.youtubeNumbers.`100`
import typings.youtube.youtubeNumbers.`101`
import typings.youtube.youtubeNumbers.`150`
import typings.youtube.youtubeNumbers.`2`
import typings.youtube.youtubeNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.youtube.youtubeNumbers.`2`
  - typings.youtube.youtubeNumbers.`5`
  - typings.youtube.youtubeNumbers.`100`
  - typings.youtube.youtubeNumbers.`101`
  - typings.youtube.youtubeNumbers.`150`
*/
trait PlayerError extends js.Object

object PlayerError {
  /**
  		 * The owner of the requested video does not allow it to be played in embedded players.
  		 */
  @scala.inline
  def EmbeddingNotAllowed: `101` = 101.asInstanceOf[`101`]
  /**
  		 * This error is the same as 101. It's just a 101 error in disguise!
  		 */
  @scala.inline
  def EmbeddingNotAllowed2: `150` = 150.asInstanceOf[`150`]
  /**
  		 * The requested content cannot be played in an HTML5 player.
  		 */
  @scala.inline
  def Html5Error: `5` = 5.asInstanceOf[`5`]
  /**
  		 * The request contained an invalid parameter value.
  		 */
  @scala.inline
  def InvalidParam: `2` = 2.asInstanceOf[`2`]
  /**
  		 * The video requested was not found.
  		 */
  @scala.inline
  def VideoNotFound: `100` = 100.asInstanceOf[`100`]
}

