package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Controls extends js.Object

@JSGlobal("YT.Controls")
@js.native
object Controls extends js.Object {
  /**
  		 * Player controls do not display.
  		 */
  @js.native
  sealed trait Hide
    extends youtubeLib.YTNs.Controls
  
  /**
  		 * Player controls display after a delay.
  		 */
  @js.native
  sealed trait ShowDelayLoadPlayer
    extends youtubeLib.YTNs.Controls
  
  /**
  		 * Player controls display.
  		 */
  @js.native
  sealed trait ShowLoadPlayer
    extends youtubeLib.YTNs.Controls
  
  /* 0 */ val Hide: Hide with scala.Double = js.native
  /* 2 */ val ShowDelayLoadPlayer: ShowDelayLoadPlayer with scala.Double = js.native
  /* 1 */ val ShowLoadPlayer: ShowLoadPlayer with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[youtubeLib.YTNs.Controls with scala.Double] = js.native
}

