package typings.youtubePlayer.anon

import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ eventType in youtube-player.youtube-player/dist/eventNames.EventType ]:? (event : std.CustomEvent<any>): void} */
@js.native
trait eventTypeinEventTypeevent extends js.Object {
  
  var apiChange: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.native
  
  var error: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.native
  
  var playbackQualityChange: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.native
  
  var playbackRateChange: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.native
  
  var ready: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.native
  
  var stateChange: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.native
  
  var volumeChange: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.native
}
object eventTypeinEventTypeevent {
  
  @scala.inline
  def apply(): eventTypeinEventTypeevent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[eventTypeinEventTypeevent]
  }
  
  @scala.inline
  implicit class eventTypeinEventTypeeventOps[Self <: eventTypeinEventTypeevent] (val x: Self) extends AnyVal {
    
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
    def setApiChange(value: /* event */ CustomEvent[_] => Unit): Self = this.set("apiChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteApiChange: Self = this.set("apiChange", js.undefined)
    
    @scala.inline
    def setError(value: /* event */ CustomEvent[_] => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setPlaybackQualityChange(value: /* event */ CustomEvent[_] => Unit): Self = this.set("playbackQualityChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePlaybackQualityChange: Self = this.set("playbackQualityChange", js.undefined)
    
    @scala.inline
    def setPlaybackRateChange(value: /* event */ CustomEvent[_] => Unit): Self = this.set("playbackRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePlaybackRateChange: Self = this.set("playbackRateChange", js.undefined)
    
    @scala.inline
    def setReady(value: /* event */ CustomEvent[_] => Unit): Self = this.set("ready", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    
    @scala.inline
    def setStateChange(value: /* event */ CustomEvent[_] => Unit): Self = this.set("stateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStateChange: Self = this.set("stateChange", js.undefined)
    
    @scala.inline
    def setVolumeChange(value: /* event */ CustomEvent[_] => Unit): Self = this.set("volumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteVolumeChange: Self = this.set("volumeChange", js.undefined)
  }
}
