package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoPlay extends js.Object

@JSGlobal("YT.AutoPlay")
@js.native
object AutoPlay extends js.Object {
  /**
  		 * Video will autoplay when loaded.
  		 */
  @js.native
  sealed trait AutoPlay
    extends youtubeLib.YTNs.AutoPlay
  
  /**
  		 * Video does not autoplay.
  		 */
  @js.native
  sealed trait NoAutoPlay
    extends youtubeLib.YTNs.AutoPlay
  
  /* 1 */ val AutoPlay: AutoPlay with scala.Double = js.native
  /* 0 */ val NoAutoPlay: NoAutoPlay with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[youtubeLib.YTNs.AutoPlay with scala.Double] = js.native
}

