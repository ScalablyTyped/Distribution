package typings.youtube.YT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  /**
    * Event fired to indicate thath the player has loaded, or unloaded, a module
    * with exposed API methods. This currently only occurs for closed captioning.
    */
  var onApiChange: js.UndefOr[PlayerEventHandler[PlayerEvent]] = js.native
  /**
    * Event fired when an error in the player occurs
    */
  var onError: js.UndefOr[PlayerEventHandler[OnErrorEvent]] = js.native
  /**
    * Event fired when the playback quality of the player changes.
    */
  var onPlaybackQualityChange: js.UndefOr[PlayerEventHandler[OnPlaybackQualityChangeEvent]] = js.native
  /**
    * Event fired when the playback rate of the player changes.
    */
  var onPlaybackRateChange: js.UndefOr[PlayerEventHandler[OnPlaybackRateChangeEvent]] = js.native
  /**
    * Event fired when a player has finished loading and is ready to begin receiving API calls.
    */
  var onReady: js.UndefOr[PlayerEventHandler[PlayerEvent]] = js.native
  /**
    * Event fired when the player's state changes.
    */
  var onStateChange: js.UndefOr[PlayerEventHandler[OnStateChangeEvent]] = js.native
}

object Events {
  @scala.inline
  def apply(): Events = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Events]
  }
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnApiChange(value: PlayerEvent => Unit): Self = this.set("onApiChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnApiChange: Self = this.set("onApiChange", js.undefined)
    @scala.inline
    def setOnError(value: OnErrorEvent => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnPlaybackQualityChange(value: OnPlaybackQualityChangeEvent => Unit): Self = this.set("onPlaybackQualityChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlaybackQualityChange: Self = this.set("onPlaybackQualityChange", js.undefined)
    @scala.inline
    def setOnPlaybackRateChange(value: OnPlaybackRateChangeEvent => Unit): Self = this.set("onPlaybackRateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlaybackRateChange: Self = this.set("onPlaybackRateChange", js.undefined)
    @scala.inline
    def setOnReady(value: PlayerEvent => Unit): Self = this.set("onReady", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    @scala.inline
    def setOnStateChange(value: OnStateChangeEvent => Unit): Self = this.set("onStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStateChange: Self = this.set("onStateChange", js.undefined)
  }
  
}

