package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModestBranding extends js.Object

@JSGlobal("YT.ModestBranding")
@js.native
object ModestBranding extends js.Object {
  /**
  		 * Player will contain full YouTube branding.
  		 */
  @js.native
  sealed trait Full
    extends youtubeLib.YTNs.ModestBranding
  
  /**
  		 * YouTube logo will not display in the control bar.
  		 */
  @js.native
  sealed trait Modest
    extends youtubeLib.YTNs.ModestBranding
  
  /* 0 */ val Full: Full with scala.Double = js.native
  /* 1 */ val Modest: Modest with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[youtubeLib.YTNs.ModestBranding with scala.Double] = js.native
}

