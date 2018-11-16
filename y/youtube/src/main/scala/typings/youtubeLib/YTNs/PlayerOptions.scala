package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PlayerOptions extends js.Object {
  /**
  		 * Handlers for events fired by the player.
  		 */
  var events: js.UndefOr[Events] = js.undefined
  /**
  		 * Player height
  		 */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  		 * Points host to correct origin for CORS
  		 */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Player parameters.
  		 */
  var playerVars: js.UndefOr[PlayerVars] = js.undefined
  /**
  		 * ID of the video to load.
  		 */
  var videoId: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Player width.
  		 */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

