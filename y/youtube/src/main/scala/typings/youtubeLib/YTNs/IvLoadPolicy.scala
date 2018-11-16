package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IvLoadPolicy extends js.Object

@JSGlobal("YT.IvLoadPolicy")
@js.native
object IvLoadPolicy extends js.Object {
  /**
  		 * Video annotations will not be shown.
  		 */
  @js.native
  sealed trait Hide
    extends youtubeLib.YTNs.IvLoadPolicy
  
  /**
  		 * Video annotations will be shown.
  		 */
  @js.native
  sealed trait Show
    extends youtubeLib.YTNs.IvLoadPolicy
  
  /* 3 */ val Hide: Hide with scala.Double = js.native
  /* 1 */ val Show: Show with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[youtubeLib.YTNs.IvLoadPolicy with scala.Double] = js.native
}

