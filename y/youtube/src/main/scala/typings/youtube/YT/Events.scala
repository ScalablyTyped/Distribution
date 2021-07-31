package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
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
  def apply(): Events = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Events]
  }
  
  @scala.inline
  implicit class EventsMutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnApiChange(value: PlayerEvent => Unit): Self = StObject.set(x, "onApiChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnApiChangeUndefined: Self = StObject.set(x, "onApiChange", js.undefined)
    
    @scala.inline
    def setOnError(value: OnErrorEvent => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnPlaybackQualityChange(value: OnPlaybackQualityChangeEvent => Unit): Self = StObject.set(x, "onPlaybackQualityChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlaybackQualityChangeUndefined: Self = StObject.set(x, "onPlaybackQualityChange", js.undefined)
    
    @scala.inline
    def setOnPlaybackRateChange(value: OnPlaybackRateChangeEvent => Unit): Self = StObject.set(x, "onPlaybackRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlaybackRateChangeUndefined: Self = StObject.set(x, "onPlaybackRateChange", js.undefined)
    
    @scala.inline
    def setOnReady(value: PlayerEvent => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    @scala.inline
    def setOnStateChange(value: OnStateChangeEvent => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
  }
}
