package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Loop extends js.Object

@JSGlobal("YT.Loop")
@js.native
object Loop extends js.Object {
  /**
  		 * Video or playlist will be played over and over again.
  		 */
  @js.native
  sealed trait Loop
    extends youtubeLib.YTNs.Loop
  
  /**
  		 * Video or playlist will be played only once.
  		 */
  @js.native
  sealed trait SinglePlay
    extends youtubeLib.YTNs.Loop
  
  /* 1 */ val Loop: Loop with scala.Double = js.native
  /* 0 */ val SinglePlay: SinglePlay with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[youtubeLib.YTNs.Loop with scala.Double] = js.native
}

