package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClosedCaptionsLoadPolicy extends js.Object

@JSGlobal("YT.ClosedCaptionsLoadPolicy")
@js.native
object ClosedCaptionsLoadPolicy extends js.Object {
  /**
  		 * For closed captions to be shown.
  		 */
  @js.native
  sealed trait ForceOn
    extends youtubeLib.YTNs.ClosedCaptionsLoadPolicy
  
  /**
  		 * Defaults to the user's preferences.
  		 */
  @js.native
  sealed trait UserDefault
    extends youtubeLib.YTNs.ClosedCaptionsLoadPolicy
  
  /* 1 */ val ForceOn: ForceOn with scala.Double = js.native
  /* 0 */ val UserDefault: UserDefault with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[youtubeLib.YTNs.ClosedCaptionsLoadPolicy with scala.Double] = js.native
}

