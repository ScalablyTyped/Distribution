package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayerError extends js.Object

@JSGlobal("YT.PlayerError")
@js.native
object PlayerError extends js.Object {
  /**
  		 * The owner of the requested video does not allow it to be played in embedded players.
  		 */
  @js.native
  sealed trait EmbeddingNotAllowed
    extends youtubeLib.YTNs.PlayerError
  
  /**
  		 * This error is the same as 101. It's just a 101 error in disguise!
  		 */
  @js.native
  sealed trait EmbeddingNotAllowed2
    extends youtubeLib.YTNs.PlayerError
  
  /**
  		 * The requested content cannot be played in an HTML5 player.
  		 */
  @js.native
  sealed trait Html5Error
    extends youtubeLib.YTNs.PlayerError
  
  /**
  		 * The request contained an invalid parameter value.
  		 */
  @js.native
  sealed trait InvalidParam
    extends youtubeLib.YTNs.PlayerError
  
  /**
  		 * The video requested was not found.
  		 */
  @js.native
  sealed trait VideoNotFound
    extends youtubeLib.YTNs.PlayerError
  
  /* 101 */ val EmbeddingNotAllowed: EmbeddingNotAllowed with scala.Double = js.native
  /* 150 */ val EmbeddingNotAllowed2: EmbeddingNotAllowed2 with scala.Double = js.native
  /* 5 */ val Html5Error: Html5Error with scala.Double = js.native
  /* 2 */ val InvalidParam: InvalidParam with scala.Double = js.native
  /* 100 */ val VideoNotFound: VideoNotFound with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[youtubeLib.YTNs.PlayerError with scala.Double] = js.native
}

