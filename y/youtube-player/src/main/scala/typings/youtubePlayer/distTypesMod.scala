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
import typings.youtubePlayer.distConstantsPlayerStatesMod.PlayerStates
import typings.youtubePlayer.distEventNamesMod.EventType
import typings.youtubePlayer.youtubePlayerStrings.stateChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait EmitterType extends StObject {
    
    def trigger(eventName: String, event: js.Object): Unit
  }
  object EmitterType {
    
    inline def apply(trigger: (String, js.Object) => Unit): EmitterType = {
      val __obj = js.Dynamic.literal(trigger = js.Any.fromFunction2(trigger))
      __obj.asInstanceOf[EmitterType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmitterType] (val x: Self) extends AnyVal {
      
      inline def setTrigger(value: (String, js.Object) => Unit): Self = StObject.set(x, "trigger", js.Any.fromFunction2(value))
    }
  }
  
  trait IframeApiType extends StObject {
    
    var Player: Instantiable
  }
  object IframeApiType {
    
    inline def apply(Player: Instantiable): IframeApiType = {
      val __obj = js.Dynamic.literal(Player = Player.asInstanceOf[js.Any])
      __obj.asInstanceOf[IframeApiType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IframeApiType] (val x: Self) extends AnyVal {
      
      inline def setPlayer(value: Instantiable): Self = StObject.set(x, "Player", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var events: js.UndefOr[eventTypeinEventTypeevent] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var playerVars: js.UndefOr[Autoplay] = js.undefined
    
    var videoId: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setEvents(value: eventTypeinEventTypeevent): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPlayerVars(value: Autoplay): Self = StObject.set(x, "playerVars", value.asInstanceOf[js.Any])
      
      inline def setPlayerVarsUndefined: Self = StObject.set(x, "playerVars", js.undefined)
      
      inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
      
      inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PlayerSize extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object PlayerSize {
    
    inline def apply(height: Double, width: Double): PlayerSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlayerSize] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait YouTubePlayer extends StObject {
    
    def addEventListener(event: String, listener: js.Function1[/* event */ CustomEvent[Any], Unit]): js.Promise[Unit] = js.native
    
    def cuePlaylist(playlist: String): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: String, index: Double): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: String, index: Double, startSeconds: Double): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: String, index: Double, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: String, index: Double, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: String, index: Unit, startSeconds: Double): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: String, index: Unit, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: String, index: Unit, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: js.Array[String]): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: js.Array[String], index: Double): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: js.Array[String], index: Double, startSeconds: Double): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: js.Array[String], index: Double, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: js.Array[String], index: Double, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: js.Array[String], index: Unit, startSeconds: Double): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: js.Array[String], index: Unit, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: js.Array[String], index: Unit, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: Index): js.Promise[Unit] = js.native
    
    def cueVideoById(videoId: String): js.Promise[Unit] = js.native
    def cueVideoById(videoId: String, startSeconds: Double): js.Promise[Unit] = js.native
    def cueVideoById(videoId: String, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def cueVideoById(videoId: String, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def cueVideoById(video: EndSeconds): js.Promise[Unit] = js.native
    
    def cueVideoByUrl(mediaContentUrl: String): js.Promise[Unit] = js.native
    def cueVideoByUrl(mediaContentUrl: String, startSeconds: Double): js.Promise[Unit] = js.native
    def cueVideoByUrl(mediaContentUrl: String, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def cueVideoByUrl(mediaContentUrl: String, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def cueVideoByUrl(video: MediaContentUrl): js.Promise[Unit] = js.native
    
    def destroy(): js.Promise[Unit] = js.native
    
    def getAvailablePlaybackRates(): js.Promise[js.Array[Double]] = js.native
    
    def getAvailableQualityLevels(): js.Promise[js.Array[String]] = js.native
    
    def getCurrentTime(): js.Promise[Double] = js.native
    
    def getDuration(): js.Promise[Double] = js.native
    
    def getIframe(): js.Promise[HTMLIFrameElement] = js.native
    
    def getOption(module: String, option: String): js.Promise[Any] = js.native
    
    def getOptions(): js.Promise[js.Array[String]] = js.native
    def getOptions(module: String): js.Promise[js.Object] = js.native
    
    def getPlaybackQuality(): js.Promise[String] = js.native
    
    def getPlaybackRate(): js.Promise[Double] = js.native
    
    def getPlayerState(): js.Promise[PlayerStates] = js.native
    
    def getPlaylist(): js.Promise[js.Array[String]] = js.native
    
    def getPlaylistIndex(): js.Promise[Double] = js.native
    
    def getSize(): js.Promise[PlayerSize] = js.native
    
    def getVideoEmbedCode(): js.Promise[String] = js.native
    
    def getVideoLoadedFraction(): js.Promise[Double] = js.native
    
    def getVideoUrl(): js.Promise[String] = js.native
    
    def getVolume(): js.Promise[Double] = js.native
    
    def isMuted(): js.Promise[Boolean] = js.native
    
    def loadPlaylist(playlist: String): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: String, index: Double): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: String, index: Double, startSeconds: Double): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: String, index: Double, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: String, index: Double, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: String, index: Unit, startSeconds: Double): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: String, index: Unit, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: String, index: Unit, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: js.Array[String]): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: js.Array[String], index: Double): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: js.Array[String], index: Double, startSeconds: Double): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: js.Array[String], index: Double, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: js.Array[String], index: Double, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: js.Array[String], index: Unit, startSeconds: Double): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: js.Array[String], index: Unit, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: js.Array[String], index: Unit, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: Index): js.Promise[Unit] = js.native
    
    def loadVideoById(videoId: String): js.Promise[Unit] = js.native
    def loadVideoById(videoId: String, startSeconds: Double): js.Promise[Unit] = js.native
    def loadVideoById(videoId: String, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadVideoById(videoId: String, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadVideoById(video: EndSeconds): js.Promise[Unit] = js.native
    
    def loadVideoByUrl(mediaContentUrl: String): js.Promise[Unit] = js.native
    def loadVideoByUrl(mediaContentUrl: String, startSeconds: Double): js.Promise[Unit] = js.native
    def loadVideoByUrl(mediaContentUrl: String, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadVideoByUrl(mediaContentUrl: String, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadVideoByUrl(video: MediaContentUrl): js.Promise[Unit] = js.native
    
    def mute(): js.Promise[Unit] = js.native
    
    def nextVideo(): js.Promise[Unit] = js.native
    
    def on(eventType: EventType, listener: js.Function1[/* event */ CustomEvent[Any], Unit]): Unit = js.native
    @JSName("on")
    def on_stateChange(eventType: stateChange, listener: js.Function1[/* event */ CustomEventanydatanumber, Unit]): Unit = js.native
    
    def pauseVideo(): js.Promise[Unit] = js.native
    
    def playVideo(): js.Promise[Unit] = js.native
    
    def playVideoAt(index: Double): js.Promise[Unit] = js.native
    
    def previousVideo(): js.Promise[Unit] = js.native
    
    def removeEventListener(event: String, listener: js.Function1[/* event */ CustomEvent[Any], Unit]): js.Promise[Unit] = js.native
    
    def seekTo(seconds: Double, allowSeekAhead: Boolean): js.Promise[Unit] = js.native
    
    def setLoop(loopPlaylists: Boolean): js.Promise[Unit] = js.native
    
    def setOption(module: String, option: String, value: Any): js.Promise[Unit] = js.native
    
    def setOptions(): js.Promise[Unit] = js.native
    
    def setPlaybackQuality(suggestedQuality: String): js.Promise[Unit] = js.native
    
    def setPlaybackRate(suggestedRate: Double): js.Promise[Unit] = js.native
    
    def setShuffle(shufflePlaylist: Boolean): js.Promise[Unit] = js.native
    
    def setSize(width: Double, height: Double): js.Promise[js.Object] = js.native
    
    def setVolume(volume: Double): js.Promise[Unit] = js.native
    
    def stopVideo(): js.Promise[Unit] = js.native
    
    def unMute(): js.Promise[Unit] = js.native
  }
}
