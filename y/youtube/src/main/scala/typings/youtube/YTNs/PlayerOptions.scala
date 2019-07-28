package typings.youtube.YTNs

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
  var height: js.UndefOr[String | Double] = js.undefined
  /**
  		 * Points host to correct origin for CORS
  		 */
  var host: js.UndefOr[String] = js.undefined
  /**
  		 * Player parameters.
  		 */
  var playerVars: js.UndefOr[PlayerVars] = js.undefined
  /**
  		 * ID of the video to load.
  		 */
  var videoId: js.UndefOr[String] = js.undefined
  /**
  		 * Player width.
  		 */
  var width: js.UndefOr[String | Double] = js.undefined
}

object PlayerOptions {
  @scala.inline
  def apply(
    events: Events = null,
    height: String | Double = null,
    host: String = null,
    playerVars: PlayerVars = null,
    videoId: String = null,
    width: String | Double = null
  ): PlayerOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (playerVars != null) __obj.updateDynamic("playerVars")(playerVars)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerOptions]
  }
}

