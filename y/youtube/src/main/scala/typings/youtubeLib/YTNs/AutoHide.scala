package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoHide extends js.Object

@JSGlobal("YT.AutoHide")
@js.native
object AutoHide extends js.Object {
  /**
  		 * Controls are visible throughout the video
  		 */
  @js.native
  sealed trait AlwaysVisible
    extends youtubeLib.YTNs.AutoHide
  
  /**
  		 * Progress bar and player controls slide out of view after a couple of seconds.
  		 */
  @js.native
  sealed trait HideAllControls
    extends youtubeLib.YTNs.AutoHide
  
  /**
  		 * Progress bar fades out while the player controls remain visible.
  		 */
  @js.native
  sealed trait HideProgressBar
    extends youtubeLib.YTNs.AutoHide
  
  /* 0 */ val AlwaysVisible: AlwaysVisible with scala.Double = js.native
  /* 1 */ val HideAllControls: HideAllControls with scala.Double = js.native
  /* 2 */ val HideProgressBar: HideProgressBar with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[youtubeLib.YTNs.AutoHide with scala.Double] = js.native
}

