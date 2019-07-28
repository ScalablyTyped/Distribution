package typings.youtube.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  /**
  		 * Event fired to indicate thath the player has loaded, or unloaded, a module
  		 * with exposed API methods. This currently only occurs for closed captioning.
  		 */
  var onApiChange: js.UndefOr[PlayerEventHandler[PlayerEvent]] = js.undefined
  /**
  		 * Event fired when an error in the player occurs
  		 */
  var onError: js.UndefOr[PlayerEventHandler[OnErrorEvent]] = js.undefined
  /**
  		 * Event fired when the playback quality of the player changes.
  		 */
  var onPlaybackQualityChange: js.UndefOr[PlayerEventHandler[OnPlaybackQualityChangeEvent]] = js.undefined
  /**
  		 * Event fired when the playback rate of the player changes.
  		 */
  var onPlaybackRateChange: js.UndefOr[PlayerEventHandler[OnPlaybackRateChangeEvent]] = js.undefined
  /**
  		 * Event fired when a player has finished loading and is ready to begin receiving API calls.
  		 */
  var onReady: js.UndefOr[PlayerEventHandler[PlayerEvent]] = js.undefined
  /**
  		 * Event fired when the player's state changes.
  		 */
  var onStateChange: js.UndefOr[PlayerEventHandler[OnStateChangeEvent]] = js.undefined
}

object Events {
  @scala.inline
  def apply(
    onApiChange: PlayerEventHandler[PlayerEvent] = null,
    onError: PlayerEventHandler[OnErrorEvent] = null,
    onPlaybackQualityChange: PlayerEventHandler[OnPlaybackQualityChangeEvent] = null,
    onPlaybackRateChange: PlayerEventHandler[OnPlaybackRateChangeEvent] = null,
    onReady: PlayerEventHandler[PlayerEvent] = null,
    onStateChange: PlayerEventHandler[OnStateChangeEvent] = null
  ): Events = {
    val __obj = js.Dynamic.literal()
    if (onApiChange != null) __obj.updateDynamic("onApiChange")(onApiChange)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onPlaybackQualityChange != null) __obj.updateDynamic("onPlaybackQualityChange")(onPlaybackQualityChange)
    if (onPlaybackRateChange != null) __obj.updateDynamic("onPlaybackRateChange")(onPlaybackRateChange)
    if (onReady != null) __obj.updateDynamic("onReady")(onReady)
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(onStateChange)
    __obj.asInstanceOf[Events]
  }
}

