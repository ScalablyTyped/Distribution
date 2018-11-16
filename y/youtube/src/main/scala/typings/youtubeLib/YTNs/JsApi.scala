package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JsApi extends js.Object

@JSGlobal("YT.JsApi")
@js.native
object JsApi extends js.Object {
  /**
  		 * JavaScript API will be disabled.
  		 */
  @js.native
  sealed trait Disable
    extends youtubeLib.YTNs.JsApi
  
  /**
  		 * JavaScript API will be enabled.
  		 */
  @js.native
  sealed trait Enable
    extends youtubeLib.YTNs.JsApi
  
  /* 0 */ val Disable: Disable with scala.Double = js.native
  /* 1 */ val Enable: Enable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[youtubeLib.YTNs.JsApi with scala.Double] = js.native
}

