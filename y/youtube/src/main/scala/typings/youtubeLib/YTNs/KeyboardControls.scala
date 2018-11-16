package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyboardControls extends js.Object

@JSGlobal("YT.KeyboardControls")
@js.native
object KeyboardControls extends js.Object {
  /**
  		 * Keyboard controls are disabled.
  		 */
  @js.native
  sealed trait Disable
    extends youtubeLib.YTNs.KeyboardControls
  
  /**
  		 * Keyboard controls are enabled.
  		 */
  @js.native
  sealed trait Enable
    extends youtubeLib.YTNs.KeyboardControls
  
  /* 1 */ val Disable: Disable with scala.Double = js.native
  /* 0 */ val Enable: Enable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[youtubeLib.YTNs.KeyboardControls with scala.Double] = js.native
}

