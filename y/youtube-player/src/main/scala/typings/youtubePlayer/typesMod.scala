package typings.youtubePlayer

import typings.std.CustomEvent
import typings.std.HTMLIFrameElement
import typings.youtubePlayer.anon.Autoplay
import typings.youtubePlayer.anon.CustomEventanydatanumber
import typings.youtubePlayer.anon.EndSeconds
import typings.youtubePlayer.anon.Index
import typings.youtubePlayer.anon.Instantiable
import typings.youtubePlayer.anon.MediaContentUrl
import typings.youtubePlayer.anon.eventTypeinEventTypeevent
import typings.youtubePlayer.eventNamesMod.EventType
import typings.youtubePlayer.playerStatesMod.PlayerStates
import typings.youtubePlayer.youtubePlayerStrings.stateChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait EmitterType extends StObject {
    
    def trigger(eventName: String, event: js.Object): Unit
  }
  object EmitterType {
    
    @scala.inline
    def apply(trigger: (String, js.Object) => Unit): EmitterType = {
      val __obj = js.Dynamic.literal(trigger = js.Any.fromFunction2(trigger))
      __obj.asInstanceOf[EmitterType]
    }
    
    @scala.inline
    implicit class EmitterTypeMutableBuilder[Self <: EmitterType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTrigger(value: (String, js.Object) => Unit): Self = StObject.set(x, "trigger", js.Any.fromFunction2(value))
    }
  }
  
  trait IframeApiType extends StObject {
    
    var Player: Instantiable
  }
  object IframeApiType {
    
    @scala.inline
    def apply(Player: Instantiable): IframeApiType = {
      val __obj = js.Dynamic.literal(Player = Player.asInstanceOf[js.Any])
      __obj.asInstanceOf[IframeApiType]
    }
    
    @scala.inline
    implicit class IframeApiTypeMutableBuilder[Self <: IframeApiType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlayer(value: Instantiable): Self = StObject.set(x, "Player", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var events: js.UndefOr[eventTypeinEventTypeevent] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var playerVars: js.UndefOr[Autoplay] = js.undefined
    
    var videoId: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(value: eventTypeinEventTypeevent): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPlayerVars(value: Autoplay): Self = StObject.set(x, "playerVars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayerVarsUndefined: Self = StObject.set(x, "playerVars", js.undefined)
      
      @scala.inline
      def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait YouTubePlayer extends StObject {
    
    def addEventListener(event: String, listener: js.Function1[/* event */ CustomEvent[js.Any], Unit]): Unit = js.native
    
    def cuePlaylist(playlist: String): Unit = js.native
    def cuePlaylist(playlist: String, index: Double): Unit = js.native
    def cuePlaylist(playlist: String, index: Double, startSeconds: Double): Unit = js.native
    def cuePlaylist(playlist: String, index: Double, startSeconds: Double, suggestedQuality: String): Unit = js.native
    def cuePlaylist(playlist: String, index: Double, startSeconds: Unit, suggestedQuality: String): Unit = js.native
    def cuePlaylist(playlist: String, index: Unit, startSeconds: Double): Unit = js.native
    def cuePlaylist(playlist: String, index: Unit, startSeconds: Double, suggestedQuality: String): Unit = js.native
    def cuePlaylist(playlist: String, index: Unit, startSeconds: Unit, suggestedQuality: String): Unit = js.native
    def cuePlaylist(playlist: js.Array[String]): Unit = js.native
    def cuePlaylist(playlist: js.Array[String], index: Double): Unit = js.native
    def cuePlaylist(playlist: js.Array[String], index: Double, startSeconds: Double): Unit = js.native
    def cuePlaylist(playlist: js.Array[String], index: Double, startSeconds: Double, suggestedQuality: String): Unit = js.native
    def cuePlaylist(playlist: js.Array[String], index: Double, startSeconds: Unit, suggestedQuality: String): Unit = js.native
    def cuePlaylist(playlist: js.Array[String], index: Unit, startSeconds: Double): Unit = js.native
    def cuePlaylist(playlist: js.Array[String], index: Unit, startSeconds: Double, suggestedQuality: String): Unit = js.native
    def cuePlaylist(playlist: js.Array[String], index: Unit, startSeconds: Unit, suggestedQuality: String): Unit = js.native
    def cuePlaylist(playlist: Index): Unit = js.native
    
    def cueVideoById(videoId: String): Unit = js.native
    def cueVideoById(videoId: String, startSeconds: Double): Unit = js.native
    def cueVideoById(videoId: String, startSeconds: Double, suggestedQuality: String): Unit = js.native
    def cueVideoById(videoId: String, startSeconds: Unit, suggestedQuality: String): Unit = js.native
    def cueVideoById(video: EndSeconds): Unit = js.native
    
    def cueVideoByUrl(mediaContentUrl: String): Unit = js.native
    def cueVideoByUrl(mediaContentUrl: String, startSeconds: Double): Unit = js.native
    def cueVideoByUrl(mediaContentUrl: String, startSeconds: Double, suggestedQuality: String): Unit = js.native
    def cueVideoByUrl(mediaContentUrl: String, startSeconds: Unit, suggestedQuality: String): Unit = js.native
    def cueVideoByUrl(video: MediaContentUrl): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getAvailablePlaybackRates(): js.Array[Double] = js.native
    
    def getAvailableQualityLevels(): js.Array[String] = js.native
    
    def getCurrentTime(): Double = js.native
    
    def getDuration(): Double = js.native
    
    def getIframe(): HTMLIFrameElement = js.native
    
    def getOption(module: String, option: String): js.Any = js.native
    
    def getOptions(): js.Array[String] = js.native
    def getOptions(module: String): js.Object = js.native
    
    def getPlaybackQuality(): String = js.native
    
    def getPlaybackRate(): Double = js.native
    
    def getPlayerState(): PlayerStates = js.native
    
    def getPlaylist(): js.Array[String] = js.native
    
    def getPlaylistIndex(): Double = js.native
    
    def getVideoEmbedCode(): String = js.native
    
    def getVideoLoadedFraction(): Double = js.native
    
    def getVideoUrl(): String = js.native
    
    def getVolume(): Double = js.native
    
    def isMuted(): Boolean = js.native
    
    def loadPlaylist(playlist: String): Unit = js.native
    def loadPlaylist(playlist: String, index: Double): Unit = js.native
    def loadPlaylist(playlist: String, index: Double, startSeconds: Double): Unit = js.native
    def loadPlaylist(playlist: String, index: Double, startSeconds: Double, suggestedQuality: String): Unit = js.native
    def loadPlaylist(playlist: String, index: Double, startSeconds: Unit, suggestedQuality: String): Unit = js.native
    def loadPlaylist(playlist: String, index: Unit, startSeconds: Double): Unit = js.native
    def loadPlaylist(playlist: String, index: Unit, startSeconds: Double, suggestedQuality: String): Unit = js.native
    def loadPlaylist(playlist: String, index: Unit, startSeconds: Unit, suggestedQuality: String): Unit = js.native
    def loadPlaylist(playlist: js.Array[String]): Unit = js.native
    def loadPlaylist(playlist: js.Array[String], index: Double): Unit = js.native
    def loadPlaylist(playlist: js.Array[String], index: Double, startSeconds: Double): Unit = js.native
    def loadPlaylist(playlist: js.Array[String], index: Double, startSeconds: Double, suggestedQuality: String): Unit = js.native
    def loadPlaylist(playlist: js.Array[String], index: Double, startSeconds: Unit, suggestedQuality: String): Unit = js.native
    def loadPlaylist(playlist: js.Array[String], index: Unit, startSeconds: Double): Unit = js.native
    def loadPlaylist(playlist: js.Array[String], index: Unit, startSeconds: Double, suggestedQuality: String): Unit = js.native
    def loadPlaylist(playlist: js.Array[String], index: Unit, startSeconds: Unit, suggestedQuality: String): Unit = js.native
    def loadPlaylist(playlist: Index): Unit = js.native
    
    def loadVideoById(videoId: String): Unit = js.native
    def loadVideoById(videoId: String, startSeconds: Double): Unit = js.native
    def loadVideoById(videoId: String, startSeconds: Double, suggestedQuality: String): Unit = js.native
    def loadVideoById(videoId: String, startSeconds: Unit, suggestedQuality: String): Unit = js.native
    def loadVideoById(video: EndSeconds): Unit = js.native
    
    def loadVideoByUrl(mediaContentUrl: String): Unit = js.native
    def loadVideoByUrl(mediaContentUrl: String, startSeconds: Double): Unit = js.native
    def loadVideoByUrl(mediaContentUrl: String, startSeconds: Double, suggestedQuality: String): Unit = js.native
    def loadVideoByUrl(mediaContentUrl: String, startSeconds: Unit, suggestedQuality: String): Unit = js.native
    def loadVideoByUrl(video: MediaContentUrl): Unit = js.native
    
    def mute(): Unit = js.native
    
    def nextVideo(): Unit = js.native
    
    def on(eventType: EventType, listener: js.Function1[/* event */ CustomEvent[js.Any], Unit]): Unit = js.native
    @JSName("on")
    def on_stateChange(eventType: stateChange, listener: js.Function1[/* event */ CustomEventanydatanumber, Unit]): Unit = js.native
    
    def pauseVideo(): Unit = js.native
    
    def playVideo(): Unit = js.native
    
    def playVideoAt(index: Double): Unit = js.native
    
    def previousVideo(): Unit = js.native
    
    def removeEventListener(event: String, listener: js.Function1[/* event */ CustomEvent[js.Any], Unit]): Unit = js.native
    
    def seekTo(seconds: Double, allowSeekAhead: Boolean): Unit = js.native
    
    def setLoop(loopPlaylists: Boolean): Unit = js.native
    
    def setOption(module: String, option: String, value: js.Any): Unit = js.native
    
    def setOptions(): Unit = js.native
    
    def setPlaybackQuality(suggestedQuality: String): Unit = js.native
    
    def setPlaybackRate(suggestedRate: Double): Unit = js.native
    
    def setShuffle(shufflePlaylist: Boolean): Unit = js.native
    
    def setSize(width: Double, height: Double): js.Object = js.native
    
    def setVolume(volume: Double): Unit = js.native
    
    def stopVideo(): Unit = js.native
    
    def unMute(): Unit = js.native
  }
}
