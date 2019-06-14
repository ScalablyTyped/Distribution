package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - youtubeLib.youtubeLibNumbers.`0`
  - youtubeLib.youtubeLibNumbers.`1`
*/
trait JsApi extends js.Object

object JsApi {
  /**
  		 * JavaScript API will be disabled.
  		 */
  @scala.inline
  def Disable: youtubeLib.youtubeLibNumbers.`0` = this.cast(0)
  /**
  		 * JavaScript API will be enabled.
  		 */
  @scala.inline
  def Enable: youtubeLib.youtubeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

