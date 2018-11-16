package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShowInfo extends js.Object

@JSGlobal("YT.ShowInfo")
@js.native
object ShowInfo extends js.Object {
  /**
  		 * Hide video title and uploader before video starts playing.
  		 */
  @js.native
  sealed trait Hide
    extends youtubeLib.YTNs.ShowInfo
  
  /**
  		 * Show video title and uploader before video starts playing.
  		 */
  @js.native
  sealed trait Show
    extends youtubeLib.YTNs.ShowInfo
  
  /* 0 */ val Hide: Hide with scala.Double = js.native
  /* 1 */ val Show: Show with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[youtubeLib.YTNs.ShowInfo with scala.Double] = js.native
}

