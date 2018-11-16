package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FullscreenButton extends js.Object

@JSGlobal("YT.FullscreenButton")
@js.native
object FullscreenButton extends js.Object {
  /**
  		 * The full screen button is hidden.
  		 */
  @js.native
  sealed trait Hide
    extends youtubeLib.YTNs.FullscreenButton
  
  /**
  		 * The full screen button is visible.
  		 */
  @js.native
  sealed trait Show
    extends youtubeLib.YTNs.FullscreenButton
  
  /* 0 */ val Hide: Hide with scala.Double = js.native
  /* 1 */ val Show: Show with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[youtubeLib.YTNs.FullscreenButton with scala.Double] = js.native
}

