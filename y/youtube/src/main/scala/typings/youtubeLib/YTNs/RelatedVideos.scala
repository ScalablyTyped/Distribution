package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelatedVideos extends js.Object

@JSGlobal("YT.RelatedVideos")
@js.native
object RelatedVideos extends js.Object {
  /**
  		 * Hide related videos after playback is complete.
  		 */
  @js.native
  sealed trait Hide
    extends youtubeLib.YTNs.RelatedVideos
  
  /**
  		 * Show related videos after playback is complete.
  		 */
  @js.native
  sealed trait Show
    extends youtubeLib.YTNs.RelatedVideos
  
  /* 0 */ val Hide: Hide with scala.Double = js.native
  /* 1 */ val Show: Show with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[youtubeLib.YTNs.RelatedVideos with scala.Double] = js.native
}

