package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlaysInline extends js.Object

@JSGlobal("YT.PlaysInline")
@js.native
object PlaysInline extends js.Object {
  /**
  		 * Playback in fullscreen.
  		 */
  @js.native
  sealed trait Fullscreen
    extends youtubeLib.YTNs.PlaysInline
  
  /**
  		 * Playback inline
  		 */
  @js.native
  sealed trait Inline
    extends youtubeLib.YTNs.PlaysInline
  
  /* 0 */ val Fullscreen: Fullscreen with scala.Double = js.native
  /* 1 */ val Inline: Inline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[youtubeLib.YTNs.PlaysInline with scala.Double] = js.native
}

